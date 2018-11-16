import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureAsync {

  public static void main(String args[]){
    CompletableFuture<List<Path>> future = CompletableFuture.supplyAsync(()->{
      Stream<Path> list = Stream.of();
      try{
        list = Files.list(Paths.get("/var/log"));
      }catch(IOException e){
        e.printStackTrace();
      }
      return list.collect(Collectors.toList());
    });

    List<Path> liste = future.join();
    liste.forEach(System.out::println);
  }

}
