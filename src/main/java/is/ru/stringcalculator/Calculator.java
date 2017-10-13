package is.ru.stringcalculator;

public class Calculator {

      public static int add (String text) {
          if(text.equals("")){
              return 0;
          }
          else {
              if (text.contains(",")) {
                String numbers[] = text.split(",");
                int sum = 0;
                for (String number : numbers) {
                    sum = sum + toInt(number);
                }
                return sum;
              }
              else {
                return toInt(text);
              }
          }
      }

      public static int toInt(String integer) {
          return Integer.parseInt(integer);
      }
}
