package Super;
import java.util.Scanner;
import java.util.ArrayList;
// Function language ig
//* Main function storage
//TODO - Make a hashmap with functions and a linkedlist
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
          System.out.println("ERROR.SuperFunc.superOperator.operatorUnknown");
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
          System.out.println("ERROR.SuperFunc.superOperator.operatorUnknown");
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
      ArrayList<String> set = new ArrayList<String>();
      public void SetAdd(String Add) {
         set.add(Add);
      }

      public void SetRemove(String Remove) {
        set.remove(Remove);
      }

      public void IterateSetHorizontal(){
        for (String i : set) {
          System.out.print(i);
        }
      }
      public void IterateSetVertical() {
        for (String i : set) {
          System.out.println(i);
        }
      }
    }
}