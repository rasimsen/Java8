import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Java8FunctionalInterfaceSupplier {

  public static void main(String args[]){

    Supplier<List> supplier = () -> new ArrayList();
    List<String> liste = supplier.get();
    liste.add("ali");
    liste.add("vel");
    liste.add("selami");

    liste.forEach(System.out::println);


  }
}
