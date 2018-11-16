import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamAPICollect {

  public static void main(String args[]){
    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    List<String> isim = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");
    List<String> liste = isim.stream().collect(Collectors.toList());
    Set<String> set = isim.stream().collect(Collectors.toSet());
    Long count = isim.stream().collect(Collectors.counting());
    String collect = isim.stream().collect(Collectors.joining(" - "));

    Map<Integer,List<String>> map = isim.stream().collect(Collectors.groupingBy(o->o.length()));
    System.out.println(map);
  }

}
