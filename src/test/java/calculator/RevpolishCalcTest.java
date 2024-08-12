package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the RevPolishCalc class. This class contains test cases to verify
 * the functionality of the RevPolishCalc class.
 */
class RevpolishCalcTest {
  // Instance of RevPolishCalc used in each test
  private RevPolishCalc calculator;

  /**
   * Set up a new RevPolishCalc instance before each test case.
   * This ensures that each test starts with a fresh instance of RevPolishCalc.
   */
  //Test1
  @BeforeEach
  void setUp() {
    calculator = new RevPolishCalc();
  }

  /**
   * Test evaluating a simple addition expression.
   * Verifies that the expression "2 3 +" correctly evaluates to 5.0.
   * 
   * @throws RuntimeException if there is an unexpected runtime error.
   * @throws BadTypeException if the expression contains an invalid type.
   * @throws InvalidExpression if the expression is invalid.
   */
  //Test2
  @Test
  void testEvaluateAddition() throws RuntimeException, BadTypeException, InvalidExpression {
    // Evaluate the expression "2 3 +" and check if the result is 5.0
    assertEquals(5.0f, calculator.evaluate("2 3 +"), 0.001f);
  }

  /**
   * Test evaluating a simple subtraction expression.
   * Verifies that the expression "4 3 -" correctly evaluates to 1.0.
   * 
   * @throws RuntimeException if there is an unexpected runtime error.
   * @throws BadTypeException if the expression contains an invalid type.
   * @throws InvalidExpression if the expression is invalid.
   */
  //Test3
  @Test
  void testEvaluateSubtraction() throws RuntimeException, BadTypeException, InvalidExpression {
    // Evaluate the expression "4 3 -" and check if the result is 1.0
    assertEquals(1.0f, calculator.evaluate("4 3 -"), 0.001f);
  }

  /**
   * Test evaluating a simple multiplication expression.
   * Verifies that the expression "4 3 *" correctly evaluates to 12.0.
   * 
   * @throws RuntimeException if there is an unexpected runtime error.
   * @throws BadTypeException if the expression contains an invalid type.
   * @throws InvalidExpression if the expression is invalid.
   */
  //Test4
  @Test
  void testEvaluateMultiplication() throws RuntimeException, BadTypeException, InvalidExpression {
    // Evaluate the expression "4 3 *" and check if the result is 12.0
    assertEquals(12.0f, calculator.evaluate("4 3 *"), 0.001f);
  }

  /**
   * Test evaluating a simple division expression.
   * Verifies that the expression "8 4 /" correctly evaluates to 2.0.
   * 
   * @throws RuntimeException if there is an unexpected runtime error.
   * @throws BadTypeException if the expression contains an invalid type.
   * @throws InvalidExpression if the expression is invalid.
   */
  //Test5
  @Test
  void testEvaluateDivision() throws RuntimeException, BadTypeException, InvalidExpression {
    // Evaluate the expression "8 4 /" and check if the result is 2.0
    assertEquals(2.0f, calculator.evaluate("8 4 /"), 0.001f);
  }

  /**
   * Test evaluating an expression with insufficient operands.
   * Verifies that an expression with too few operands (e.g., "2 +") throws an exception.
   */
  //Test6
  @Test
  void testEvaluateInsufficientOperands() {
    // Attempt to evaluate an expression with insufficient operands and verify that it throws an exception
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("2 +");
    });
  }

  /**
   * Test evaluating an expression with non-numeric tokens.
   * Verifies that an expression containing non-numeric tokens (e.g., "2 a +") throws an exception.
   */
  //Test7
  @Test
  void testEvaluateNonNumericTokens() {
    // Attempt to evaluate an expression with non-numeric tokens and verify that it throws an exception
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("2 a +");
    });
  }

  /**
   * Test evaluating an empty expression.
   * Verifies that an empty expression (e.g., "") throws an exception.
   */
  //Test8
  @Test
  void testEvaluateEmptyExpression() {
    // Attempt to evaluate an empty expression and verify that it throws an exception
    assertThrows(RuntimeException.class, () -> {
      calculator.evaluate("");
    });
  }
}
