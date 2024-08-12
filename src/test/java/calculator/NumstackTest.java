package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the NumStack class. This class contains test cases to verify
 * the functionality of the NumStack class's methods.
 */
class NumstackTest {
  // Instance of NumStack used in each test
  private NumStack numStack;

  /**
   * Set up a new NumStack instance before each test case.
   * This ensures that each test starts with a fresh instance of NumStack.
   */
  @BeforeEach
  void setUp() {
    numStack = new NumStack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   * Ensures that the pushed value is correctly returned by the top method.
   * 
   * @throws EmptyStackException if the stack is empty when top is called.
   * @throws BadTypeException if the stack contains an invalid type.
   */
  //Test1
  @Test
  void testPushAndTop() throws BadTypeException, EmptyStackException {
    // Push a value onto the stack
    numStack.push(42.0f);
    // Verify that the top value is as expected
    assertEquals(42.0f, numStack.top(), 0.001);
  }

  /**
   * Test the push method and verify the pop method's correctness.
   * Ensures that the pushed value is correctly removed and returned by the pop method.
   * 
   * @throws EmptyStackException if the stack is empty when pop is called.
   * @throws BadTypeException if the stack contains an invalid type.
   */
  //Test2
  @Test
  void testPushAndPop() throws BadTypeException, EmptyStackException {
    // Push a value onto the stack
    numStack.push(3.14f);
    // Verify that the popped value is as expected
    assertEquals(3.14f, numStack.pop(), 0.001);
    // Ensure the stack is empty after the pop operation
    assertTrue(numStack.size() == 0);
  }

  /**
   * Test the size method for the NumStack class.
   * Verifies that the size method accurately reflects the number of elements in the stack.
   * 
   * @throws EmptyStackException if the stack is empty when pop is called.
   * @throws BadTypeException if the stack contains an invalid type.
   */
  //Test3
  @Test
  void testSize() throws BadTypeException, EmptyStackException {
    // Push two values onto the stack
    numStack.push(1.0f);
    numStack.push(2.0f);
    // Verify the size is as expected
    assertEquals(2, numStack.size());
    // Pop a value from the stack
    numStack.pop();
    // Verify the size is as expected after the pop
    assertEquals(1, numStack.size());
  }

  /**
   * Test the isEmpty method for the NumStack class.
   * Verifies that isEmpty correctly identifies whether the stack is empty.
   */
  //Test4
  @Test
  void testIsEmpty() {
    // Initially, the stack should be empty
    assertTrue(numStack.size() == 0);
    // Push a value onto the stack
    numStack.push(2.0f);
    // After pushing, the stack should not be empty
    assertFalse(numStack.size() == 0);
  }

  /**
   * Test the pop method for an empty stack.
   * Verifies that pop throws an exception when called on an empty stack.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    // Attempt to pop from an empty stack and verify that it throws the correct exception
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      numStack.pop();
    });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test the top method for an empty stack.
   * Verifies that top throws an exception when called on an empty stack.
   */
  //Test6
  @Test
  void testTopEmptyStack() {
    // Attempt to retrieve the top value from an empty stack and verify that it throws the correct exception
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      numStack.top();
    });
    assertEquals("Stack is empty", thrown.getMessage());
  }
}
