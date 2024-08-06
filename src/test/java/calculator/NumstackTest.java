package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the NumStack class. This class contains test cases to verify
 * the functionality of the NumStack class's methods.
 */
//ensure class name matches test file name even capitalisation
class NumstackTest {
  private NumStack numStack;
  /**
   * Set up a new NumStack instance before each test case.
   */
  @BeforeEach
  void setUp() {
    numStack = new NumStack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   */
  //Test1
  @Test
  void testPushAndTop() {
    numStack.push(42.0f);
    assertEquals(42.0f, numStack.top(), 0.001);
  }

  /**
   * Test the push method and verify the pop method's correctness.
   */
  //Test2
  @Test
  void testPushAndPop() {
    numStack.push(3.14f);
    assertEquals(3.14f, numStack.pop(), 0.001);
    assertTrue(numStack.size() == 0);
  }

  /**
   * Test the size method for the NumStack class.
   */
  //Test3
  @Test
  void testSize() {
    numStack.push(1.0f);
    numStack.push(2.0f);
    assertEquals(2, numStack.size());
    numStack.pop();
    assertEquals(1, numStack.size());
  }

  /**
   * Test the isEmpty method for the NumStack class.
   */
  //Test4
  @Test
  void testIsEmpty() {
    assertTrue(numStack.size() == 0);
    numStack.push(2.0f);
    assertFalse(numStack.size() == 0);
  }
  
  /**
   * Test the pop method for an empty stack.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      numStack.pop();
      });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test the top method for an empty stack.
   */
  //Test6
  @Test
  void testTopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      numStack.top();
      });
    assertEquals("Stack is empty", thrown.getMessage());
  }
}
