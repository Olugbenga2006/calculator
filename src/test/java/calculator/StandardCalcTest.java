package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the StandardCalc class. This class contains test cases to verify
 * the functionality of the StandardCalc class.
 */
class StandardCalcTest {
  // Instance of StandardCalc used in each test
  private StandardCalc calculator;

  /**
   * Set up a new StandardCalc instance before each test case.
   * This method is called before each test to initialize a fresh instance of StandardCalc.
   */
  @BeforeEach
  void setUp() {
    calculator = new StandardCalc();
  }

  /**
   * Test evaluating a simple addition expression.
   * This test verifies that the evaluate method correctly computes the result of a simple addition.
   * 
   * @throws RuntimeException if an unexpected runtime error occurs.
   * @throws BadTypeException if there is a type mismatch during evaluation.
   * @throws InvalidExpression if the expression provided is invalid.
   */
  //Test1
  @Test
  void testEvaluateSimpleAddition() throws RuntimeException, BadTypeException, InvalidExpression {
    // Verify that the expression "3 + 4" evaluates to 7.0
    assertEquals(7.0f, calculator.evaluate("3 + 4"), 0.001f);
  }

  /**
   * Test evaluating a simple subtraction expression.
   * This test verifies that the evaluate method correctly computes the result of a simple subtraction.
   * 
   * @throws RuntimeException if an unexpected runtime error occurs.
   * @throws BadTypeException if there is a type mismatch during evaluation.
   * @throws InvalidExpression if the expression provided is invalid.
   */
  //Test2
  @Test
  void testEvaluateSimpleSubtraction() throws RuntimeException, BadTypeException, InvalidExpression {
    // Verify that the expression "5 - 3" evaluates to 2.0
    assertEquals(2.0f, calculator.evaluate("5 - 3"), 0.001f);
  }

  /**
   * Test evaluating a simple multiplication expression.
   * This test verifies that the evaluate method correctly computes the result of a simple multiplication.
   * 
   * @throws RuntimeException if an unexpected runtime error occurs.
   * @throws BadTypeException if there is a type mismatch during evaluation.
   * @throws InvalidExpression if the expression provided is invalid.
   */
  //Test3
  @Test
  void testEvaluateSimpleMultiplication() throws RuntimeException, BadTypeException, InvalidExpression {
    // Verify that the expression "3 * 5" evaluates to 15.0
    assertEquals(15.0f, calculator.evaluate("3 * 5"), 0.001f);
  }

  /**
   * Test evaluating a simple division expression.
   * This test verifies that the evaluate method correctly computes the result of a simple division.
   * 
   * @throws RuntimeException if an unexpected runtime error occurs.
   * @throws BadTypeException if there is a type mismatch during evaluation.
   * @throws InvalidExpression if the expression provided is invalid.
   */
  //Test4
  @Test
  void testEvaluateSimpleDivision() throws RuntimeException, BadTypeException, InvalidExpression {
    // Verify that the expression "10 / 5" evaluates to 2.0
    assertEquals(2.0f, calculator.evaluate("10 / 5"), 0.001f);
  }
}
