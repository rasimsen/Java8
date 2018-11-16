import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8StreamAPIFilter {

  public static void main(String args[]){

    List<String> names = Arrays.asList("Ali","Veli","Hasan","Huseyin", "Zubeyde");

    Stream<String> stream = names.stream();

    stream.forEach(System.out::println);

    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    Stream<String> stream1 = list.stream();

    Predicate<String> predicate = name -> name.length()<4;

    Stream<String> filtered = stream1.filter(predicate);

    list.stream().filter(x -> x.length()<4).forEach(System.out::println);

  }

}
