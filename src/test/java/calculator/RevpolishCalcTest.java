package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the RevPolishCalc class. This class contains test cases to verify
 * the functionality of the RevPolishCalc class.
 */
class RevPolishCalcTest {
  private RevPolishCalc calculator;

  /**
   * Set up a new RevPolishCalc instance before each test case.
   */
  //Test1
  @BeforeEach
  void setUp() {
    calculator = new RevPolishCalc();
  }

  /**
   * Test evaluating a simple addition expression.
   */
  //Test2
  @Test
  void testEvaluateAddition() throws RuntimeException {
    assertEquals(5.0f, calculator.evaluate("2 3 +"), 0.001f);
  }

  /**
   * Test evaluating a simple subtraction expression.
   */
  //Test3
  @Test
  void testEvaluateSubtraction() throws RuntimeException {
    assertEquals(1.0f, calculator.evaluate("4 3 -"), 0.001f);
  }

  /**
   * Test evaluating a simple multiplication expression.
   */
  //Test4
  @Test
  void testEvaluateMultiplication() throws RuntimeException {
    assertEquals(12.0f, calculator.evaluate("4 3 *"), 0.001f);
  }

  /**
   * Test evaluating a simple division expression.
   */
  //Test5
  @Test
  void testEvaluateDivision() throws RuntimeException {
    assertEquals(2.0f, calculator.evaluate("8 4 /"), 0.001f);
  }

  /**
   * Test evaluating a complex expression.
   */
  //Test6
  @Test
  void testEvaluateComplexExpression() throws RuntimeException {
    assertEquals(14.0f, calculator.evaluate("5 1 2 + 4 * + 3 -"), 0.001f);
  }

  /**
   * Test evaluating an expression with insufficient operands.
   */
  //Test7
  @Test
  void testEvaluateInsufficientOperands() {
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("2 +");
    });
  }

  /**
   * Test evaluating an expression with excess operands.
   */
  //Test8
  @Test
  void testEvaluateExcessOperands() {
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("2 3 4 +");
    });
  }

  /**
   * Test evaluating an expression with non-numeric tokens.
   */
  //Test9
  @Test
  void testEvaluateNonNumericTokens() {
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("2 a +");
    });
  }

  /**
   * Test evaluating an empty expression.
   */
  //Test10
  @Test
  void testEvaluateEmptyExpression() {
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("");
    });
  }
}
