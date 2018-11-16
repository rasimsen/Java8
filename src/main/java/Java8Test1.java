import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Java8Test1 {

  public static void main(String args[]){
    List<String> names = Arrays.asList("Ali", "Veli", "Selami");

    names.forEach(System.out::print);
    names.forEach(System.out::println);
//
    Consumer<Integer> consumer = i-> System.out.print(" " +i);
    Consumer<Integer> consumerWithAndThen = consumer.andThen(i->System.out.print("(printed "+i+")"));
    List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10),new Integer(100), new Integer(200),new Integer(-10),new Integer(0));
    printList(integerList,consumerWithAndThen);

    Function<Integer, Double> function = t -> Math.pow(t,2);
    Double result = function.apply(5);
    System.out.println(result); // 25

    Supplier<List> supplier = () -> new ArrayList();
    List<String> liste = supplier.get();
    liste.add("ali");
    liste.add("vel");
    liste.add("selami");

    liste.forEach(System.out::println);
//
    List<Integer> numbers = Arrays.asList(5,10,23,90,46,82);
    Collections.sort(numbers,(s1,s2)->s1-s2);
    numbers.forEach(System.out::println);


  }


  private static void printList(List<Integer> integerList, Consumer<Integer> consumerWithAndThen) {
    for(Integer integer:integerList){
      consumerWithAndThen.accept(integer);
    }
  }

}
