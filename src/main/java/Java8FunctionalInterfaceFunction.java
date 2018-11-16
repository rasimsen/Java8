import java.util.function.Function;

public class Java8FunctionalInterfaceFunction {

  public static void main(String args[]) {
    Function<Integer, Double> function = t -> Math.pow(t, 2);
    Double result = function.apply(5);
    System.out.println(result); // 25

  }

}
