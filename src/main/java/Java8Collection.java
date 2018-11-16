import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Collection {

  public static void main(String args[]){
    List<String> names = Arrays.asList("Ali", "Veli", "Selami");

    names.forEach(System.out::print);
    names.forEach(System.out::println);
//
    List<Integer> numbers = Arrays.asList(5,10,23,90,46,82);
    Collections.sort(numbers,(s1,s2)->s1-s2);
    numbers.forEach(System.out::println);


  }

}
