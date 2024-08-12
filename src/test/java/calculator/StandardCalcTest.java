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
   * @throws InvalidExpression 
   * @throws BadTypeException 
   */
  //Test1
  @Test
  void testEvaluateSimpleAddition() throws RuntimeException, BadTypeException, InvalidExpression {
    assertEquals(7.0f, calculator.evaluate("3 + 4"), 0.001f);
  }

  /**
   * Test evaluating a simple subtraction expression.
   * @throws InvalidExpression 
   * @throws BadTypeException 
   */
  //Test2
  @Test
  void testEvaluateSimpleSubtraction() throws RuntimeException, BadTypeException, InvalidExpression {
    assertEquals(2.0f, calculator.evaluate("5 - 3"), 0.001f);
  }

  /**
   * Test evaluating a simple multiplication expression.
   * @throws InvalidExpression 
   * @throws BadTypeException 
   */
  //Test3
  @Test
  void testEvaluateSimpleMultiplication() throws RuntimeException, BadTypeException, InvalidExpression {
    assertEquals(15.0f, calculator.evaluate("3 * 5"), 0.001f);
  }

  /**
   * Test evaluating a simple division expression.
   * @throws InvalidExpression 
   * @throws BadTypeException 
   */
  //Test4
  @Test
  void testEvaluateSimpleDivision() throws RuntimeException, BadTypeException, InvalidExpression {
    assertEquals(2.0f, calculator.evaluate("10 / 5"), 0.001f);
  }
}

