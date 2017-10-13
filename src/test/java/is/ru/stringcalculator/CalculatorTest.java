package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

      @Test
     public void testEmptyString() {
          assertEquals(0, Calculator.add(""));
      }

      @Test
      public void testOneNumber() {
          assertEquals(8, Calculator.add("8"));
      }

      @Test
      public void testAddNumbers() {
          assertEquals(8, Calculator.add("4,4"));
      }

      @Test
      public void testAddMoreNumbers() {
          assertEquals(12, Calculator.add("4,4,4"));
      }




}
