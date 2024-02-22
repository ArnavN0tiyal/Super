package Super;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Date;

// Function language ig
//* Main function storage
public class func {
    public void $print(Object input) {
        System.out.print(input);
    }
    public void $while(int input, String operator, int input2, String output) {
      if (input > input2) {
        if (operator == "=") {
          while (input == input2) {
            System.out.println(output);
            input2++;
          }
        } else if (operator == "!=") {
          while (input != input2) {
            System.out.println(output);
            input2++;
          }
        } else if (operator == ">") {
          while (input > input2) {
            System.out.println(output);
            input2++;
          }
        } else if (operator == "<") {
          while (input < input2) {
            System.out.println(output);
            input2++;
          }
      
        } else {
          System.out.println("ERROR! Operator not recognized, use [=, !=, >, <]");
        }
      } else if (input2 > input) {
        if (operator == "=") {
          while (input == input2) {
            System.out.println(output);
            input++;
          }
        } else if (operator == "!=") {
          while (input != input2) {
            System.out.println(output);
            input++;
          }
        } else if (operator == ">") {
          while (input > input2) {
            System.out.println(output);
            input++;
          }
        } else if (operator == "<") {
          while (input < input2) {
            System.out.println(output);
            input++;
          }
        } else {
          System.out.println("ERROR! Operator not recognized, use [=, !=, >, <]");
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
      while (1 != 0) {
        System.out.println(output);
      }
    }

    public void $if(String statement1, String operator, String statement2, String Output) {
         switch(operator) {
          case "=":
          if (statement1.equals(statement2)) {
            System.out.println(Output); // Customize this to your needs
          } else if (Output.isBlank()) {
            System.out.println(statement1.equals(statement2));
           }
          break;
          case "=?IgnoreCase":
          if (statement1.equalsIgnoreCase(statement2)) {
            System.out.println(Output); // Customize this to your needs
          } else if (Output.isBlank()) {
            System.out.println(statement1.equalsIgnoreCase(statement2));
           }
          break;
          case "!=":
          if (!statement1.equals(statement2)) {
            System.out.println(Output); // Customize this to your needs
          } else if (Output.isBlank()) {
            System.out.println(!statement1.equals(statement2));
           }
          break;
          case "!=?IgnoreCase":
          if (!statement1.equalsIgnoreCase(statement2)) {
            System.out.println(Output); // Customize this to your needs
          } else if (Output.isBlank()) {
            System.out.println(!statement1.equalsIgnoreCase(statement2));
           }
          break;
         }
        }

    public String $append(String str1, String str2) {
      return str1.concat(str2);
    }

      public int $length(String word) {
        return word.length();
      }

      public boolean $blank(String word) {
        return word.isBlank();
      }

      public boolean $empty(String word) {
        return word.isEmpty();
      }

      public String $replace(String var, String word,String replacement) {
        return var.replace(word, replacement);
      } 

      public String $trim(String word) {
        return word.trim();
      }

      public String $uppercase(String word) {
        return word.toUpperCase();
      }

      public String $lowercase(String word) {
        return word.toLowerCase();
      }
      class math {
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
          return dividend/divisor;
        }

      public double $pow(double base, double exponent) {
        return Math.pow(base,exponent);
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
      class input {
        Scanner sc = new Scanner(System.in);
        public Object $inputScanner(String Type, Object input) {
          if (Type.equalsIgnoreCase("string")) {
            input = String.valueOf(sc.nextLine());
          } else if (Type.equalsIgnoreCase("int")) {
            input = Integer.valueOf(sc.nextInt());
          } else if (Type.equalsIgnoreCase("boolean")) {
            input = Boolean.valueOf(sc.nextBoolean());
          } else if (Type.equalsIgnoreCase("float")) {
            input = Float.valueOf(sc.nextFloat());
          } else if (Type.equalsIgnoreCase("double")) {
            input = Double.valueOf(sc.nextDouble());
          }
          return input;
        }

      public void $Close() {
        sc.close();
      }
    }

    class set {
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
       System.out.println("superfunction.utilSet.invaildchoice");
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

    class map {
        HashMap<String,String> map = new HashMap<String,String>();
        public void $Put(String key, String value) {
          map.put(key, value);
        }

        public void $iterateKeys(boolean Horizontal, boolean Vertical) {
            if (Horizontal = true && Vertical == false) {
                 for (String i : map.keySet()) {
                  System.out.print("Key: " + i + " | ");
                 }
            } else if (Vertical == true) {
              for (String i : map.keySet()) {
                System.out.println("Key: " + i);
               }
            } else {
              System.out.println("superfunction.utilmap.invaildchoice");
            }
        }
        public void $iterateValues(boolean Horizontal, boolean Vertical) {
          if (Horizontal = true && Vertical == false) {
               for (String i : map.values()) {
                System.out.print("Key: " + i + " | ");
               }
          } else if (Vertical = true) {
            for (String i : map.values()) {
              System.out.println("Key: " + i);
             }
          } else {
            System.out.println("superfunction.utilmap.invaildchoice");
          }
      }

      public void $iterate(boolean Horizontal, boolean Vertical) {
        if (Horizontal = true && Vertical == false) {
             for (String i : map.keySet()) {
              System.out.print("Key: " + i + " " + "Value:" + map.get(i) + " | ");
             }
        } else if (Vertical = true) {
          for (String i : map.keySet()) {
            System.out.println("Key: " + i + " " + "Value: " + map.get(i));
           }
        } else {
          System.out.println("superfunction.utilmap.invaildchoice");
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

    class calender {
      Calendar c = Calendar.getInstance();
      public Date $date() {
        return c.getTime();
      }

      public TimeZone $timeZone() {
        return c.getTimeZone();
      }

      public Date $time() {
        return c.getTime();
      }

      public int $getFirstDayOfWeek() {
        return c.getFirstDayOfWeek();
      }

      public int $getWeeksInWeekYear() {
        return c.getWeeksInWeekYear();
      }

      public int $getWeekYear() {
        return c.getWeekYear();
      }
    } 
}