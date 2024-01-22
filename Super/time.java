package Super;
import java.time.*;
// Stores the time class
public class time {
  class CurrentDate {
        public LocalDate $date() {
         LocalDate Date = LocalDate.now();
         return Date;
        }
      }

  class CurrentTime {
    public static LocalTime $SuperTime() {
        LocalTime Time = LocalTime.now();
        return Time;
    }
  }

  class CurrentDateTime {
    public static LocalDateTime $SuperDateTime() {
        LocalDateTime DateTime = LocalDateTime.now();
        return DateTime;
    }
  }
}
