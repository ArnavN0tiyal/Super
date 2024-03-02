package Super;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TimeZone;

// Function language ig
//* Main function storage

public class main extends SuperShell{
  public void $startShell() throws IOException {
    executeStartShell();
  }
  public void $print(Object input) {
    System.out.print(input);
  }

  public void $while(int input, String operator, int input2, String output) {
    if (input > input2) {
      switch (operator) {
        case "=":
          while (input == input2) {
            System.out.println(output);
            input2++;
          }
          break;
        case "!=":
          while (input != input2) {
            System.out.println(output);
            input2++;
          }
          break;
        case ">":
          while (input > input2) {
            System.out.println(output);
            input2++;
          }
          break;
        case "<":
          while (input < input2) {
            System.out.println(output);
            input2++;
          }
          break;
        default:
          System.out.println(
              "ERROR! Operator not recognized, use [=, !=, >, <]");
          break;
      }
    } else if (input2 > input) {
      switch (operator) {
        case "=":
          while (input == input2) {
            System.out.println(output);
            input++;
          }
          break;
        case "!=":
          while (input != input2) {
            System.out.println(output);
            input++;
          }
          break;
        case ">":
          while (input > input2) {
            System.out.println(output);
            input++;
          }
          break;
        case "<":
          while (input < input2) {
            System.out.println(output);
            input++;
          }
          break;
        default:
          System.out.println(
              "ERROR! Operator not recognized, use [=, !=, >, <]");
      }
    }
  }

  public void $repeat(int times, String output) {
    for (int i = 0; i < times; i++) {
      System.out.println(output);
    }
  }

  public void $println(String input) {
    System.out.println(input);
  }

  public void $loop(String output) {
    while (true) {
      System.out.println(output);
    }
  }

  public void $if(String statement1, String operator, String statement2, String output) {
    switch (operator) {
      case "=":
        if (statement1.equals(statement2)) {
          System.out.println(output); // Customize this to your needs
        } else if (output.isBlank()) {
          System.out.println(statement1.equals(statement2));
        }
        break;
      case "=*":
        if (statement1.equalsIgnoreCase(statement2)) {
          System.out.println(output); // Customize this to your needs
        } else if (output.isBlank()) {
          System.out.println(statement1.equalsIgnoreCase(statement2));
        }
        break;
      case "!=":
        if (!statement1.equals(statement2)) {
          System.out.println(output); // Customize this to your needs
        } else if (output.isBlank()) {
          System.out.println(!statement1.equals(statement2));
        }
        break;
      case "!=*":
        if (!statement1.equalsIgnoreCase(statement2)) {
          System.out.println(output); // Customize this to your needs
        } else if (output.isBlank()) {
          System.out.println(!statement1.equalsIgnoreCase(statement2));
        }
        break;
    }
  }

  public String $append(String str1, String str2) {
    return str1.concat(str2);
  }

  public int $length(String input) {
    return input.length();
  }

  public boolean $blank(String input) {
    return input.isBlank();
  }

  public boolean $empty(String input) {
    return input.isEmpty();
  }

  public String $replace(String var, String word, String replacement) {
    return var.replace(word, replacement);
  }

  public String $trim(String input) {
    return input.trim();
  }

  public String $uppercase(String input) {
    return input.toUpperCase();
  }

  public String $lowercase(String input) {
    return input.toLowerCase();
  }

  public class math {

    public double $add(double addend, double addend2) {
      return addend + addend2;
    }

    public double $sub(double minuend, double subtrahend) {
      return minuend - subtrahend;
    }

    public double $mul(double multiplier, double multiplicand) {
      return multiplier * multiplicand;
    }

    public double $div(double dividend, double divisor) {
      return dividend / divisor;
    }

    public double $pow(double base, double exponent) {
      return Math.pow(base, exponent);
    }

    public double $abs(double abs) {
      return Math.abs(abs);
    }

    public double $acos(double acos) {
      return Math.acos(acos);
    }

    public double $asin(double asin) {
      return Math.asin(asin);
    }

    public double $atan(double atan) {
      return Math.atan(atan);
    }

    public double $cos(double cos) {
      return Math.cos(cos);
    }

    public double $sin(double sin) {
      return Math.sin(sin);
    }

    public double $tan(double tan) {
      return Math.tan(tan);
    }

    public double $ceil(double ceil) {
      return Math.ceil(ceil);
    }

    public double $floor(double floor) {
      return Math.floor(floor);
    }
  }

  public class input {

    Scanner sc = new Scanner(System.in);

    public Object $inputScanner(String Type, Object input) {
      switch (Type) {
        case "$STRING":
          input = String.valueOf(sc.nextLine());
          break;
        case "$INT":
          input = Integer.valueOf(sc.nextInt());
          break;
        case "$BOOL":
          input = Boolean.valueOf(sc.nextBoolean());
          break;
        case "$FLOAT":
          input = Float.valueOf(sc.nextFloat());
          break;
        case "$DOUBLE":
          input = Double.valueOf(sc.nextDouble());
          break;
        default:
          System.out.println("ERROR! Type not recognized, use [$STRING, $INT, $BOOL, $FLOAT, $DOUBLE]");
          break;
      }
      return input;
    }

    public void $close() {
      sc.close();
    }
  }

  public class set {

    ArrayList<String> Set = new ArrayList<String>();

    public void $add(String Add) {
      Set.add(Add);
    }

    public void $remove(String Remove) {
      Set.remove(Remove);
    }

    public void $iterate(boolean Horizontal, boolean Vertical) {
      if (Horizontal = true && Vertical == false) {
        for (String i : Set) {
          System.out.print(i + " | ");
        }
      } else if (Vertical == true) {
        for (String i : Set) {
          System.out.println(i);
        }
      } else {
        System.out.println("Invaild choice");
      }
    }

    public void $clearSet() {
      Set.clear();
    }

    public int $setSize() {
      return Set.size();
    }

    public void $addFirst(String add) {
      Set.addFirst(add);
    }

    public void $addLast(String add) {
      Set.addLast(add);
    }

    public String $getFirst() {
      return Set.getFirst();
    }

    public String $getLast() {
      return Set.getLast();
    }

    public String $removeFirst() {
      return Set.removeFirst();
    }

    public String $removeLast() {
      return Set.removeLast();
    }

    public boolean $isEmpty() {
      return Set.isEmpty();
    }

    public boolean $contains(String word) {
      return Set.contains(word);
    }
  }

  public class map {

    HashMap<String, String> map = new HashMap<String, String>();

    public void $put(String key, String value) {
      map.put(key, value);
    }

    public void $iterateKeys(boolean Horizontal, boolean Vertical) {
      if (Horizontal) {
        for (String i : map.keySet()) {
          System.out.print(i + " ");
        }
      } else if (Vertical) {
        for (String i : map.keySet()) {
          System.out.println(i + " ");
        }
      } else {
        System.out.println("Invaild choice");
      }
    }

    public void $iterateValues(boolean Horizontal, boolean Vertical) {
      if (Horizontal) {
        for (String i : map.values()) {
          System.out.print(i + " ");
        }
      } else if (Vertical) {
        for (String i : map.values()) {
          System.out.println(i + " ");
        }
      } else {
        System.out.println("Invaild choice");
      }
    }

    public void $iterate(boolean Horizontal, boolean Vertical) {
      if (Horizontal) {
        for (String i : map.keySet()) {
          System.out.print(i + " " + map.get(i) + " ");
        }
      } else if (Vertical) {
        for (String i : map.keySet()) {
          System.out.println(i + " " + map.get(i) + " ");
        }
      } else {
        System.out.println("Invaild choice");
      }
    }

    public void $clearMap() {
      map.clear();
    }

    public int $mapSize() {
      return map.size();
    }

    public boolean $isEmpty() {
      return map.isEmpty();
    }

    public boolean $containsKey(String word) {
      return map.containsKey(word);
    }

    public boolean $containsValue(String word) {
      return map.containsValue(word);
    }
  }

  public class calender {

    Calendar calender = Calendar.getInstance();

    public Date $date() {
      return calender.getTime();
    }

    public TimeZone $timeZone() {
      return calender.getTimeZone();
    }

    public Date $time() {
      return calender.getTime();
    }

    public int $getFirstDayOfWeek() {
      return calender.getFirstDayOfWeek();
    }

    public int $getWeeksInWeekYear() {
      return calender.getWeeksInWeekYear();
    }

    public int $getWeekYear() {
      return calender.getWeekYear();
    }
  }
}