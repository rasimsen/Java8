import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamAPIMap {

  public static void main(String args[]){
    List<String> isim = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");
    Map<Integer,List<String>> map = isim.stream().collect(Collectors.groupingBy(o->o.length()));
    System.out.println(map);
    isim.stream().map(a -> a.toUpperCase()).forEach(System.out::println);

  }

}
