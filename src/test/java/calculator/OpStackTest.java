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
   */
  //Test1
  @Test
  void testPushAndTop() {
    opStack.push(Symbol.Symbols.PLUS);
    assertEquals(Symbol.Symbols.PLUS, opStack.top());
    }

  /**
   * Test the push method and verify the pop method's correctness.
   */
  //Test2
  @Test
  void testPushAndPop() {
    opStack.push(Symbol.Symbols.MINUS);
    assertEquals(Symbol.Symbols.MINUS, opStack.pop());
    assertEquals(0, opStack.size());
    }

  /**
   * Test the size method for the OpStack class.
   */
  //Test3
  @Test
  void testSize() {
    opStack.push(Symbol.Symbols.TIME);
    opStack.push(Symbol.Symbols.DIVIDE);
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
    opStack.push(Symbol.Symbols.LEFT_BRACKET);
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
   */
  //Test7
  @Test
  void testPushMultipleAndPop() {
    opStack.push(Symbol.Symbols.PLUS);
    opStack.push(Symbol.Symbols.MINUS);
    opStack.push(Symbol.Symbols.DIVIDE);
    assertEquals(Symbol.Symbols.DIVIDE, opStack.pop());
    assertEquals(Symbol.Symbols.MINUS, opStack.pop());
    assertEquals(Symbol.Symbols.PLUS, opStack.pop());
    }

  /**
   * Test interleaved push and pop operations.
   */
  //Test8
  @Test
  void testInterleavedPushAndPop() {
    opStack.push(Symbol.Symbols.PLUS);
    assertEquals(Symbol.Symbols.PLUS, opStack.pop());
    opStack.push(Symbol.Symbols.MINUS);
    opStack.push(Symbol.Symbols.TIME);
    assertEquals(Symbol.Symbols.TIME, opStack.pop());
    assertEquals(Symbol.Symbols.MINUS, opStack.pop());
    }

  /**
   * Test the behaviour after pushing multiple elements and ensuring the size is correct at each step.
   */
  //Test9
  @Test
  void testPushMultipleAndCheckSize() {
    opStack.push(Symbol.Symbols.PLUS);
    assertEquals(1, opStack.size());

    opStack.push(Symbol.Symbols.MINUS);
    assertEquals(2, opStack.size());

    opStack.push(Symbol.Symbols.TIME);
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
   */
  //Test10
  @Test
  void testPushPopLargeNumberOfElements() {
    for (int i = 0; i < 1000; i++) {
        opStack.push(Symbol.Symbols.PLUS);
        }

    assertEquals(1000, opStack.size());

    for (int i = 0; i < 1000; i++) {
        assertEquals(Symbol.Symbols.PLUS, opStack.pop());
        }

    assertEquals(0, opStack.size());
    }
}
