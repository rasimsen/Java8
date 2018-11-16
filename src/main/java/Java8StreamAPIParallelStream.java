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

public class Java8StreamAPIParallelStream {

  public static void main(String args[]){
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
  }

}
