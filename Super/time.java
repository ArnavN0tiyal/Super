package Super;
import java.time.*;
// Stores the time class
public class time {
        public LocalDate $currentDate() {
         LocalDate Date = LocalDate.now();
         return Date;
        }

    public static LocalTime $currentTime() {
        LocalTime Time = LocalTime.now();
        return Time;
    }

    public static LocalDateTime $currentDateTime() {
        LocalDateTime DateTime = LocalDateTime.now();
        return DateTime;
    }
  }

