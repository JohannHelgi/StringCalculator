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

      @Test
      public void testNewLine() {
          assertEquals(13, Calculator.add("8\n2\n3"));
      }

      @Test
      public void testNewLineAndComma() {
          assertEquals(15, Calculator.add("8\n2,5"));
      }


      @Test(expected = IllegalArgumentException.class)
      public void testNegative() {
          Calculator.add("-2,2,-3");
      }





}
