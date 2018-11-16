import java.util.stream.IntStream;

public class Java8StreamAPIIntStream {

  public static void main(String args[]){
    int result = IntStream
        .of(1,3,5,23,2,9)
        .reduce(0,(once,sonra)->{
          System.out.format("%d - %d %n", once,sonra);
          return once + sonra;
        });
    System.out.println(result);
  }

}
