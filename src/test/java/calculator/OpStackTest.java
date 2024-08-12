package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the OpStack class. This class contains test cases to verify
 * the functionality of the OpStack class's methods.
 */
class OpStackTest {
  private OpStack opStack;

  /**
   * Set up a new OpStack instance before each test case.
   */
  @BeforeEach
  void setUp() {
    opStack = new OpStack();
    }

  /**
   * Test the push method and verify the top method's correctness.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test1
  @Test
  void testPushAndTop() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.PLUS);
    assertEquals(Symbol.PLUS, opStack.top());
    }

  /**
   * Test the push method and verify the pop method's correctness.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test2
  @Test
  void testPushAndPop() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.MINUS);
    assertEquals(Symbol.MINUS, opStack.pop());
    assertEquals(0, opStack.size());
    }

  /**
   * Test the size method for the OpStack class.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test3
  @Test
  void testSize() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.TIME);
    opStack.push(Symbol.DIVIDE);
    assertEquals(2, opStack.size());
    opStack.pop();
    assertEquals(1, opStack.size());
    }

  /**
   * Test the isEmpty method for the OpStack class.
   */
  //Test4
  @Test
  void testIsEmpty() {
    assertEquals(0, opStack.size());
    opStack.push(Symbol.LEFT_BRACKET);
    assertEquals(1, opStack.size());
    }

  /**
   * Test the pop method for an empty stack.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      opStack.pop();
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
      opStack.top();
      });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test pushing multiple Symbols and then popping them to ensure LIFO behavior.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test7
  @Test
  void testPushMultipleAndPop() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.MINUS);
    opStack.push(Symbol.DIVIDE);
    assertEquals(Symbol.DIVIDE, opStack.pop());
    assertEquals(Symbol.MINUS, opStack.pop());
    assertEquals(Symbol.PLUS, opStack.pop());
    }

  /**
   * Test interleaved push and pop operations.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test8
  @Test
  void testInterleavedPushAndPop() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.PLUS);
    assertEquals(Symbol.PLUS, opStack.pop());
    opStack.push(Symbol.MINUS);
    opStack.push(Symbol.TIME);
    assertEquals(Symbol.TIME, opStack.pop());
    assertEquals(Symbol.MINUS, opStack.pop());
    }

  /**
   * Test the behaviour after pushing multiple elements and ensuring the size is correct at each step.
   * @throws BadTypeException 
   * @throws RuntimeException 
   */
  //Test9
  @Test
  void testPushMultipleAndCheckSize() throws RuntimeException, BadTypeException {
    opStack.push(Symbol.PLUS);
    assertEquals(1, opStack.size());

    opStack.push(Symbol.MINUS);
    assertEquals(2, opStack.size());

    opStack.push(Symbol.TIME);
    assertEquals(3, opStack.size());

    opStack.pop();
    assertEquals(2, opStack.size());

    opStack.pop();
    assertEquals(1, opStack.size());

    opStack.pop();
    assertEquals(0, opStack.size());
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
        opStack.push(Symbol.PLUS);
        }

    assertEquals(1000, opStack.size());

    for (int i = 0; i < 1000; i++) {
        assertEquals(Symbol.PLUS, opStack.pop());
        }

    assertEquals(0, opStack.size());
    }
}
