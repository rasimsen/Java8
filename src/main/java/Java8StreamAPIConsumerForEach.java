import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8StreamAPIConsumerForEach {

  public static void main(String args[]){
    List<String> list = Arrays.asList("Ali", "Veli", "Selami", "Cem","Veli", "Zeynel", "Can", "Veli","Hüseyin","Veli");

    Consumer<String> con = c->System.out.print(c);
    Consumer<String> xx = con.andThen(k->System.out.println("...."+k));
    list.stream().distinct().filter(a ->a.length()<4).forEach(xx);
  }

}
