package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the StandardCalc class. This class contains test cases to verify
 * the functionality of the StandardCalc class.
 */
class StandardCalcTest {
  private StandardCalc calculator;

  /**
   * Set up a new StandardCalc instance before each test case.
   */
  @BeforeEach
  void setUp() {
    calculator = new StandardCalc();
  }

  /**
   * Test evaluating a simple addition expression.
   */
  //Test1
  @Test
  void testEvaluateSimpleAddition() throws RuntimeException {
    assertEquals(7.0f, calculator.evaluate("3 + 4"), 0.001f);
  }

  /**
   * Test evaluating a simple subtraction expression.
   */
  //Test2
  @Test
  void testEvaluateSimpleSubtraction() throws RuntimeException {
    assertEquals(2.0f, calculator.evaluate("5 - 3"), 0.001f);
  }

  /**
   * Test evaluating a simple multiplication expression.
   */
  //Test3
  @Test
  void testEvaluateSimpleMultiplication() throws RuntimeException {
    assertEquals(15.0f, calculator.evaluate("3 * 5"), 0.001f);
  }

  /**
   * Test evaluating a simple division expression.
   */
  //Test4
  @Test
  void testEvaluateSimpleDivision() throws RuntimeException {
    assertEquals(2.0f, calculator.evaluate("10 / 5"), 0.001f);
  }
}

