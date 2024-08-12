package calculator;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the StrStack class. This class contains test cases to verify
 * the functionality of the StrStack class's methods.
 */
class StrStackTest {
  private StrStack strStack;

  /**
   * Set up a new StrStack instance before each test case.
   */
  @BeforeEach
  void setUp() {
    strStack = new StrStack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test1
  @Test
  void testPushAndTop() throws RuntimeException, BadTypeException {
    strStack.push("Test String");
    assertEquals("Test String", strStack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test2
  @Test
  void testPushAndPop() throws RuntimeException, BadTypeException {
    strStack.push("Hello, World!");
    assertEquals("Hello, World!", strStack.pop());
    assertEquals(0, strStack.size());
  }

  /**
   * Test the size method for the StrStack class.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test3
  @Test
  void testSize() throws RuntimeException, BadTypeException {
    strStack.push("First");
    strStack.push("Second");
    assertEquals(2, strStack.size());
    strStack.pop();
    assertEquals(1, strStack.size());
  }

  /**
   * Test the isEmpty method for the StrStack class.
   */
  //Test4
  @Test
  void testIsEmpty() {
    assertEquals(0, strStack.size());
    strStack.push("Not Empty");
    assertEquals(1, strStack.size());
  }

  /**
   * Test the pop method for an empty stack.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      strStack.pop();
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
      strStack.top();
    });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test pushing multiple Strings and then popping them to ensure LIFO behavior.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test7
  @Test
  void testPushMultipleAndPop() throws RuntimeException, BadTypeException {
    strStack.push("First");
    strStack.push("Second");
    strStack.push("Third");

    assertEquals("Third", strStack.pop());
    assertEquals("Second", strStack.pop());
    assertEquals("First", strStack.pop());
  }

  /**
   * Test interleaved push and pop operations.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test8
  @Test
  void testInterleavedPushAndPop() throws RuntimeException, BadTypeException {
    strStack.push("First");
    assertEquals("First", strStack.pop());
    
    strStack.push("Second");
    strStack.push("Third");
    assertEquals("Third", strStack.pop());
    assertEquals("Second", strStack.pop());
  }

  /**
   * Test the behavior after pushing multiple elements and ensuring the size is correct at each step.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test9
  @Test
  void testPushMultipleAndCheckSize() throws RuntimeException, BadTypeException {
    strStack.push("First");
    assertEquals(1, strStack.size());

    strStack.push("Second");
    assertEquals(2, strStack.size());

    strStack.push("Third");
    assertEquals(3, strStack.size());

    strStack.pop();
    assertEquals(2, strStack.size());

    strStack.pop();
    assertEquals(1, strStack.size());

    strStack.pop();
    assertEquals(0, strStack.size());
  }

  /**
   * Test the robustness of the stack by pushing and popping a large number of elements.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test10
  @Test
  void testPushPopLargeNumberOfElements() throws RuntimeException, BadTypeException {
    for (int i = 0; i < 1000; i++) {
      strStack.push("String " + i);
    }

    assertEquals(1000, strStack.size());

    for (int i = 0; i < 1000; i++) {
      assertEquals("String " + (999 - i), strStack.pop());
    }

    assertEquals(0, strStack.size());
  }
}
