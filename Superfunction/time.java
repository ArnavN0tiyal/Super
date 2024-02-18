package Superfunction;
import java.time.*;
// Stores the time class
public class time {
        public LocalDate $date() {
         LocalDate Date = LocalDate.now();
         return Date;
        }

    public static LocalTime $SuperTime() {
        LocalTime Time = LocalTime.now();
        return Time;
    }

    public static LocalDateTime $SuperDateTime() {
        LocalDateTime DateTime = LocalDateTime.now();
        return DateTime;
    }
  }

