import java.util.Arrays;
import java.util.List;

public class Java8StreamAPISorted {

  public static void main(String args[]){
    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    list.stream().sorted().forEach(System.out::println);
  }

}
