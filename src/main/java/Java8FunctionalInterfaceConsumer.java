import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8FunctionalInterfaceConsumer {

  public static void main(String args[]) {
    Consumer<Integer> consumer = i -> System.out.print(" " + i);
    Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.print("(printed " + i + ")"));
    List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(100), new Integer(200), new Integer(-10), new Integer(0));
    printList(integerList, consumerWithAndThen);
  }


  private static void printList(List<Integer> integerList, Consumer<Integer> consumerWithAndThen) {
    for (Integer integer : integerList) {
      consumerWithAndThen.accept(integer);
    }
  }

}
