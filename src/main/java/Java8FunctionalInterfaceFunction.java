import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Java8FunctionalInterfaceFunction {

  public static void main(String args[]){
    List<String> names = Arrays.asList("Ali", "Veli", "Selami");

    names.forEach(System.out::print);
    names.forEach(System.out::println);
//

    Function<Integer, Double> function = t -> Math.pow(t,2);
    Double result = function.apply(5);
    System.out.println(result); // 25

  }

}
