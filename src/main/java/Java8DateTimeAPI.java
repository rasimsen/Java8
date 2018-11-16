import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Java8DateTimeAPI {

   public static void main(String args[]) {

      LocalDate.of(1988, 07, 16); // 1988-07-16
      LocalDate.of(1988, Month.JULY, 16); // 1988-07-16 (Month enum)

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
	
}