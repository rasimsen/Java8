import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Java8Tester {

   public static void main(String args[]) {
      Java8Tester tester = new Java8Tester();
		
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
		
      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
      //without parenthesis
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
      //with parenthesis
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);
		
      greetService1.sayMessage("Mahesh");
      greetService2.sayMessage("Suresh");

      Foo foo = (a,b)->(2*a + b);
      System.out.println(foo.apply(7, 8));

      Foo foo1 = (a,b)-> (int) Math.pow(a,b);
      System.out.println(foo1.apply(2, 3));

      LocalDate.of(1988, 07, 16); // 1988-07-16
      LocalDate.of(1988, Month.JULY, 16); // 1988-07-16 (Month enum)


      // ------------------

      LocalTime now= LocalTime.now();
      LocalTime time= LocalTime.of(18, 20, 55); // 18:20:55
      time.getHour(); // 18
      time.getMinute(); // 20
      time.getSecond(); // 55
      LocalTime noon = LocalTime.NOON;// 12:00
      LocalTime midnight = LocalTime.MIDNIGHT;// 00:00
      LocalTime.parse("10:05"); // 10:05
      time
          .plusSeconds(45)
          .minusSeconds(5)
          .minus(5, ChronoUnit.SECONDS); // 18:20:35

      Set<String> zones = ZoneId.getAvailableZoneIds();
      zones.stream().sorted().forEach(System.out::println);
   }
	
   interface MathOperation {
      int operation(int a, int b);
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
	
   private int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }

   interface Foo{
      int apply(int a,int b);
   }
}