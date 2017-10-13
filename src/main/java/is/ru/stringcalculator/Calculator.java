package is.ru.stringcalculator;

public class Calculator {

      public static int add (String text) {
          if (text.equals("")) {
              return 0;
          }
          else if (text.contains("-")) {
            String negative = checkNegative(text);
            throw new IllegalArgumentException("Negatives not allowed: " + negative);

          }
          else if (text.contains("\n") || text.contains(",")) {
                String numbers[] = splitString(text);
                return addNumbers(numbers);
          }
          else return toInt(text);
      }

      public static String[] splitString(String text) {
          String numbers[] = text.split("\n|,");
          return numbers;
      }

      public static String checkNegative(String text) {
          String numbers[] = splitString(text);
          String negative = "";
          for (String number : numbers) {
              if (number.contains("-")) {
                  negative = negative + number +",";
              }
          }
          if (negative.endsWith(", ")) {
                negative = negative.substring(0, negative.length() - 2);
          }

          return negative;
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
