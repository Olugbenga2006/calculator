package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the OpStack class. This class contains test cases to verify
 * the functionality of the OpStack class's methods.
 */
class OpStackTest {
  // Instance of OpStack used in each test
  private OpStack opStack;

  /**
   * Set up a new OpStack instance before each test case.
   * This ensures that each test starts with a fresh instance of OpStack.
   */
  @BeforeEach
  void setUp() {
    opStack = new OpStack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   * Ensures that the symbol pushed onto the stack is correctly returned by the top method.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test1
  @Test
  void testPushAndTop() throws RuntimeException, BadTypeException {
    // Push a symbol onto the stack
    opStack.push(Symbol.PLUS);
    // Verify that the top value is as expected
    assertEquals(Symbol.PLUS, opStack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   * Ensures that the symbol pushed onto the stack is correctly removed and returned by the pop method.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test2
  @Test
  void testPushAndPop() throws RuntimeException, BadTypeException {
    // Push a symbol onto the stack
    opStack.push(Symbol.MINUS);
    // Verify that the popped symbol is as expected
    assertEquals(Symbol.MINUS, opStack.pop());
    // Ensure the stack is empty after the pop operation
    assertEquals(0, opStack.size());
  }

  /**
   * Test the size method for the OpStack class.
   * Verifies that the size method accurately reflects the number of elements in the stack.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test3
  @Test
  void testSize() throws RuntimeException, BadTypeException {
    // Push two symbols onto the stack
    opStack.push(Symbol.TIME);
    opStack.push(Symbol.DIVIDE);
    // Verify the size is as expected
    assertEquals(2, opStack.size());
    // Pop a symbol from the stack
    opStack.pop();
    // Verify the size is as expected after the pop
    assertEquals(1, opStack.size());
  }

  /**
   * Test the isEmpty method for the OpStack class.
   * Verifies that isEmpty correctly identifies whether the stack is empty.
   */
  //Test4
  @Test
  void testIsEmpty() {
    // Initially, the stack should be empty
    assertEquals(0, opStack.size());
    // Push a symbol onto the stack
    opStack.push(Symbol.LEFT_BRACKET);
    // After pushing, the stack should not be empty
    assertEquals(1, opStack.size());
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
      opStack.pop();
    });
    // Check the exception message to ensure it's the expected error
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test the top method for an empty stack.
   * Verifies that top throws an exception when called on an empty stack.
   */
  //Test6
  @Test
  void testTopEmptyStack() {
    // Attempt to retrieve the top symbol from an empty stack and verify that it throws the correct exception
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      opStack.top();
    });
    // Check the exception message to ensure it's the expected error
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test pushing multiple Symbols and then popping them to ensure LIFO behavior.
   * Verifies that symbols are returned in the reverse order of their addition.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test7
  @Test
  void testPushMultipleAndPop() throws RuntimeException, BadTypeException {
    // Push multiple symbols onto the stack
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.MINUS);
    opStack.push(Symbol.DIVIDE);
    // Verify that symbols are popped in reverse order of their addition
    assertEquals(Symbol.DIVIDE, opStack.pop());
    assertEquals(Symbol.MINUS, opStack.pop());
    assertEquals(Symbol.PLUS, opStack.pop());
  }

  /**
   * Test interleaved push and pop operations.
   * Verifies that the stack handles push and pop operations correctly in an interleaved manner.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test8
  @Test
  void testInterleavedPushAndPop() throws RuntimeException, BadTypeException {
    // Push and immediately pop a symbol
    opStack.push(Symbol.PLUS);
    assertEquals(Symbol.PLUS, opStack.pop());
    // Push additional symbols and verify their order is preserved
    opStack.push(Symbol.MINUS);
    opStack.push(Symbol.TIME);
    assertEquals(Symbol.TIME, opStack.pop());
    assertEquals(Symbol.MINUS, opStack.pop());
  }

  /**
   * Test the behaviour after pushing multiple elements and ensuring the size is correct at each step.
   * Verifies that the size method correctly reflects changes after each push and pop operation.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test9
  @Test
  void testPushMultipleAndCheckSize() throws RuntimeException, BadTypeException {
    // Push symbols and verify the size after each operation
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
   * Ensures that the stack can handle a high volume of operations without errors.
   * 
   * @throws BadTypeException if the stack contains an invalid type.
   * @throws RuntimeException if there is an unexpected runtime error.
   */
  //Test10
  @Test
  void testPushPopLargeNumberOfElements() throws RuntimeException, BadTypeException {
    // Push a large number of symbols onto the stack
    for (int i = 0; i < 1000; i++) {
        opStack.push(Symbol.PLUS);
    }

    // Verify that the size of the stack matches the number of pushed elements
    assertEquals(1000, opStack.size());

    // Pop all symbols and verify they are returned as expected
    for (int i = 0; i < 1000; i++) {
        assertEquals(Symbol.PLUS, opStack.pop());
    }

    // Ensure the stack is empty after all pops
    assertEquals(0, opStack.size());
  }
}
