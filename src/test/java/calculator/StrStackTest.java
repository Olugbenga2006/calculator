package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the StrStack class. This class contains test cases to verify
 * the functionality of the StrStack class's methods.
 */
class StrStackTest {
  // Instance of StrStack used in each test
  private StrStack strStack;

  /**
   * Set up a new StrStack instance before each test case.
   * This method is called before each test to initialize a fresh instance of StrStack.
   */
  @BeforeEach
  void setUp() {
    strStack = new StrStack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   * This test ensures that after pushing a string onto the stack, the top method
   * returns the same string.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test1
  @Test
  void testPushAndTop() throws RuntimeException, BadTypeException {
    strStack.push("Test String");
    // Verify that the top of the stack is the pushed string
    assertEquals("Test String", strStack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   * This test ensures that after pushing a string onto the stack, the pop method
   * correctly removes and returns the string, and the stack is empty afterward.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test2
  @Test
  void testPushAndPop() throws RuntimeException, BadTypeException {
    strStack.push("Hello, World!");
    // Verify that popping returns the last pushed string
    assertEquals("Hello, World!", strStack.pop());
    // Verify that the stack is empty after popping
    assertEquals(0, strStack.size());
  }

  /**
   * Test the size method for the StrStack class.
   * This test verifies that the size of the stack is updated correctly after
   * pushing and popping elements.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test3
  @Test
  void testSize() throws RuntimeException, BadTypeException {
    strStack.push("First");
    strStack.push("Second");
    // Verify the size of the stack after pushing two elements
    assertEquals(2, strStack.size());
    strStack.pop();
    // Verify the size of the stack after popping one element
    assertEquals(1, strStack.size());
  }

  /**
   * Test the isEmpty method for the StrStack class.
   * This test verifies that the isEmpty method correctly identifies an empty stack
   * and a stack with one element.
   */
  //Test4
  @Test
  void testIsEmpty() {
    // Verify that the stack is initially empty
    assertEquals(0, strStack.size());
    strStack.push("Not Empty");
    // Verify that the stack is not empty after pushing an element
    assertEquals(1, strStack.size());
  }

  /**
   * Test the pop method for an empty stack.
   * This test ensures that popping from an empty stack throws a RuntimeException
   * with the message "Stack is empty".
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      strStack.pop();
    });
    // Verify that the expected exception is thrown with the correct message
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test the top method for an empty stack.
   * This test ensures that calling top on an empty stack throws a RuntimeException
   * with the message "Stack is empty".
   */
  //Test6
  @Test
  void testTopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      strStack.top();
    });
    // Verify that the expected exception is thrown with the correct message
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test pushing multiple Strings and then popping them to ensure LIFO behavior.
   * This test verifies that strings are popped in reverse order of pushing,
   * demonstrating the stack's Last-In-First-Out (LIFO) behavior.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test7
  @Test
  void testPushMultipleAndPop() throws RuntimeException, BadTypeException {
    strStack.push("First");
    strStack.push("Second");
    strStack.push("Third");

    // Verify that strings are popped in reverse order of pushing
    assertEquals("Third", strStack.pop());
    assertEquals("Second", strStack.pop());
    assertEquals("First", strStack.pop());
  }

  /**
   * Test interleaved push and pop operations.
   * This test verifies that interleaved push and pop operations work correctly
   * and maintain the correct stack order.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test8
  @Test
  void testInterleavedPushAndPop() throws RuntimeException, BadTypeException {
    strStack.push("First");
    // Verify that the first element is popped correctly
    assertEquals("First", strStack.pop());
    
    strStack.push("Second");
    strStack.push("Third");
    // Verify that the most recent element is popped first
    assertEquals("Third", strStack.pop());
    assertEquals("Second", strStack.pop());
  }

  /**
   * Test the behavior after pushing multiple elements and ensuring the size is correct at each step.
   * This test verifies that the size of the stack is correctly updated as elements are pushed and popped.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test9
  @Test
  void testPushMultipleAndCheckSize() throws RuntimeException, BadTypeException {
    strStack.push("First");
    // Verify size after pushing one element
    assertEquals(1, strStack.size());

    strStack.push("Second");
    // Verify size after pushing another element
    assertEquals(2, strStack.size());

    strStack.push("Third");
    // Verify size after pushing yet another element
    assertEquals(3, strStack.size());

    strStack.pop();
    // Verify size after popping one element
    assertEquals(2, strStack.size());

    strStack.pop();
    // Verify size after popping another element
    assertEquals(1, strStack.size());

    strStack.pop();
    // Verify size after popping the last element
    assertEquals(0, strStack.size());
  }

  /**
   * Test the robustness of the stack by pushing and popping a large number of elements.
   * This test verifies that the stack can handle a large number of elements and
   * correctly maintains size and order.
   * 
   * @throws BadTypeException if the type of the pushed element is incorrect.
   * @throws RuntimeException if an unexpected runtime error occurs.
   */
  //Test10
  @Test
  void testPushPopLargeNumberOfElements() throws RuntimeException, BadTypeException {
    int largeNumber = 1000;
    // Push a large number of elements onto the stack
    for (int i = 0; i < largeNumber; i++) {
      strStack.push("String " + i);
    }

    // Verify the size after pushing all elements
    assertEquals(1000, strStack.size());

    // Pop all elements and verify they are in the correct order
    for (int i = 0; i < largeNumber; i++) {
      assertEquals("String " + (999 - i), strStack.pop());
    }

    // Verify that the stack is empty after popping all elements
    assertEquals(0, strStack.size());
  }
}
