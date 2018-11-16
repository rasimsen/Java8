import java.util.Arrays;
import java.util.List;

public class Java8StreamAPIDistinctFilter {

  public static void main(String args[]){
    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    list.stream().distinct().filter(a ->a.length()<4).forEach(System.out::println);

  }

}
