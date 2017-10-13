package is.ru.stringcalculator;

public class Calculator {

      public static int add (String text) {
          if(text.equals("")){
              return 0;
          }
          else if (text.contains("\n") || text.contains(",")){
                String numbers[] = text.split("\n|,");
                return addNumbers(numbers);
          }
          else return toInt(text);
      }

      public static int toInt(String integer) {
          return Integer.parseInt(integer);
      }

      public static int addNumbers(String [] numbers) {
          int sum = 0;

          for (String number : numbers) {
              sum = sum + toInt(number);
          }
          return sum;
      }
}
