package is.ru.stringcalculator;

public class Calculator {


      public static int add (String text) {
          if (text.equals("")) {
              return 0;
          }
          else if (text.contains("//")) {
              int index = text.indexOf("\n");
              String delimeter = text.substring(2,index);
              String substring = text.substring(index + 1);

              checkNegative(substring,delimeter);

              return addNumbers(splitString(substring, delimeter));
          }
          else if (text.contains("\n") || text.contains(",")) {
                checkNegative(text, "\n|,");
                return addNumbers(splitString(text, "\n|,"));
          }
          else{
            checkNegative(text," ");
            return toInt(text);
          }
      }

      public static String[] splitString(String text, String delimeter) {
          String numbers[] = text.split(delimeter);
          return numbers;
      }

      public static void checkNegative(String text, String delimeter) {

          if (text.contains("-")) {
            String numbers[] = splitString(text, delimeter);
            String negative = "";
            for (String number : numbers) {
                if (number.contains("-")) {
                    negative = negative + number +", ";
                }
            }
            if (negative.endsWith(", ")) {
                negative = negative.substring(0, negative.length() - 2);
            }
            System.out.println(negative);
            throw new IllegalArgumentException("Negatives not allowed: " + negative);

          }

      }

      public static int toInt(String integer) {

          int num = Integer.parseInt(integer);
          if (num > 1000) {
              return 0;
          }

          return num;

      }

      public static int addNumbers(String [] numbers) {
          int sum = 0;

          for (String number : numbers) {
              sum = sum + toInt(number);
          }
          return sum;
      }
}
