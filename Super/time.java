package Super;
import java.time.*;
// Stores the time class
public class time {
        public LocalDate $CurrentDate() {
         LocalDate Date = LocalDate.now();
         return Date;
        }

    public static LocalTime $CurrentTime() {
        LocalTime Time = LocalTime.now();
        return Time;
    }

    public static LocalDateTime $CurrentDateTime() {
        LocalDateTime DateTime = LocalDateTime.now();
        return DateTime;
    }
  }

