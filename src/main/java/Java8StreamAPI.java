import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamAPI {

  public static void main(String args[]){

    List<String> names = Arrays.asList("Ali","Veli","Hasan","Huseyin", "Zubeyde");

    Stream<String> stream = names.stream();

    stream.forEach(System.out::println);

    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    Stream<String> stream1 = list.stream();

    Predicate<String> predicate = name -> name.length()<4;

    Stream<String> filtered = stream1.filter(predicate);

//    filtered.forEach(System.out::println);
//
    list.stream().filter(x -> x.length()<4).forEach(System.out::println);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");

    Predicate<String> pre = x -> x.length()<4;
    list.stream().distinct().filter(a ->a.length()<4).forEach(System.out::println);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");

    Consumer<String> con = c->System.out.print(c);
    Consumer<String> xx = con.andThen(k->System.out.println("...."+k));
    list.stream().distinct().filter(a ->a.length()<4).forEach(xx);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");

    list.stream().sorted().forEach(System.out::println);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");


    List<String> isim = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");
    List<String> liste = isim.stream().collect(Collectors.toList());
    Set<String> set = isim.stream().collect(Collectors.toSet());
    Long count = isim.stream().collect(Collectors.counting());
    String collect = isim.stream().collect(Collectors.joining(" - "));

    Map<Integer,List<String>> map = isim.stream().collect(Collectors.groupingBy(o->o.length()));
    System.out.println(map);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");

    isim.stream().map(a -> a.toUpperCase()).forEach(System.out::println);

    System.out.println("::::::::::::::::::::::::::::::::::::::::");

    int result = IntStream
        .of(1,3,5,23,2,9)
        .reduce(0,(once,sonra)->{
          System.out.format("%d - %d %n", once,sonra);
          return once + sonra;
        });
    System.out.println(result);

    System.out.println(":::::::::::::::::::::::::::::::::::::::: paralel stream ::::::::::::::::::::::::::::::::::::::::");

    List<Integer> ints = Arrays.asList(2,3,1,4,6,3,null,9,1,null);
    Stream<Integer> s = ints.stream();
    Stream<Integer> s2 = ints.parallelStream();

    ints
        .parallelStream()
        .filter(Objects::nonNull)
        .filter(x -> x>0)
        .map(aa ->aa*aa)
        .sorted()
        .forEach(System.out::println);

    System.out.println(":::::::::::::::::::::::::::::::::::::::: rooster - predicate ::::::::::::::::::::::::::::::::::::::::");

    String  payload = ACK_MSG;
    Message ack = new Message(payload, "XML", "ACK");
    ack.setCorrelationId("RSETT00000000392");

    ackReceived(ack);

  }


  private static Predicate<Message> ackAction;


  public static void ackReceived(Message message) {
    if (ackAction != null) {
      ackAction.test(message);
    }
  }

  private static final String ACK_MSG = "<AckNack><PseudoAckNack>{1:F21RSETFRPPAXXX000016000000004}{4:{177:1804171510}{451:0}{311:ACK}{108:RSETT00000000392"
      + "}}</PseudoAckNack></AckNack>";

}
