package is.ru.stringcalculator;

public class Calculator {

      public static int add (String text) {
          if (text.equals("")) {
              return 0;
          }
          else if (text.contains("\n") || text.contains(",")) {
                String numbers[] = text.split("\n|,");
                String negative = "";
                for (String number : numbers) {
                    if (number.contains("-")) {
                        negative = negative + number +",";
                    }
                }

                if (negative.endsWith(", ")) {
                      negative = negative.substring(0, negative.length() - 2);
                }

                if (!negative.equals("")) {
                    throw new IllegalArgumentException("Negatives not allowed: " + negative);
                }
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
