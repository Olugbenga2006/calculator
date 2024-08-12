package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the Stack class. This class contains test cases to verify
 * the functionality of the Stack class's methods.
 */
class StackTest {
  // Instance of Stack used in each test
  private Stack stack;

  /**
   * Set up a new Stack instance before each test case.
   * This ensures that each test starts with a fresh instance of Stack.
   */
  @BeforeEach
  void setUp() {
    stack = new Stack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   * Ensures that after pushing an entry onto the stack, the top method returns the correct entry.
   * 
   * @throws EmptyStackException if an operation is attempted on an empty stack.
   */
  //Test1
  @Test
  void testPushAndTop() throws EmptyStackException {
    // Create an Entry object and push it onto the stack
    Entry entry = new Entry(42.0f);
    stack.push(entry);

    // Verify that the top of the stack is the entry just pushed
    assertEquals(entry, stack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   * Ensures that after pushing an entry onto the stack, popping it returns the correct entry
   * and the stack is empty after popping.
   */
  //Test2
  @Test
  void testPushAndPop() {
    // Create an Entry object and push it onto the stack
    Entry entry = new Entry(3.14f);
    stack.push(entry);

    // Pop the entry and verify it is the same as the one pushed
    Entry popped = stack.pop();
    assertEquals(entry, popped);

    // Verify that the stack is empty after popping
    assertTrue(stack.isEmpty());
  }

  /**
   * Test the size method for the Stack class.
   * Verifies that the size of the stack reflects the number of elements correctly
   * after pushing and popping entries.
   */
  //Test3
  @Test
  void testSize() {
    // Create two Entry objects
    Entry entry1 = new Entry(1.0f);
    Entry entry2 = new Entry(2.0f);

    // Push entries onto the stack
    stack.push(entry1);
    stack.push(entry2);

    // Verify that the size of the stack is 2
    assertEquals(2, stack.size());

    // Pop one entry and verify that the size is 1
    stack.pop();
    assertEquals(1, stack.size());
  }

  /**
   * Test the isEmpty method for the Stack class.
   * Verifies that the isEmpty method correctly reflects whether the stack is empty.
   * 
   * @throws EmptyStackException if an operation is attempted on an empty stack.
   */
  //Test4
  @Test
  void testIsEmpty() throws EmptyStackException {
    // Verify that the stack is empty initially
    assertTrue(stack.isEmpty());

    // Create an Entry object and push it onto the stack
    Entry entry = new Entry("Test String");
    stack.push(entry);

    // Verify that the stack is not empty after pushing an entry
    assertFalse(stack.isEmpty());

    // Pop the entry and verify that the stack is empty again
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  /**
   * Test ensures that the pop method throws a RuntimeException when the stack is empty.
   * Verifies that popping from an empty stack results in an appropriate exception.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
    // Verify that popping from an empty stack throws a RuntimeException with the expected message
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      stack.pop();
    });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test ensures that the top method throws a RuntimeException when the stack is empty.
   * Verifies that retrieving the top element from an empty stack results in an appropriate exception.
   */
  //Test6
  @Test
  void testTopEmptyStack() {
    // Verify that calling top on an empty stack throws a RuntimeException with the expected message
    RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
      stack.top();
    });
    assertEquals("Stack is empty", thrown.getMessage());
  }

  /**
   * Test ensures that multiple entries can be pushed and popped in the correct order.
   * Verifies that entries are popped in the reverse order they were pushed (LIFO behavior).
   * 
   * @throws EmptyStackException if an operation is attempted on an empty stack.
   */
  //Test7
  @Test
  void testPushAndPopMultipleEntries() throws EmptyStackException {
    // Create multiple Entry objects
    Entry entry1 = new Entry(1.0f);
    Entry entry2 = new Entry(2.0f);
    Entry entry3 = new Entry(3.0f);

    // Push entries onto the stack
    stack.push(entry1);
    stack.push(entry2);
    stack.push(entry3);

    // Pop entries and verify they are in the reverse order of pushing
    assertEquals(entry3, stack.pop());
    assertEquals(entry2, stack.pop());
    assertEquals(entry1, stack.pop());

    // Verify that the stack is empty after popping all entries
    assertTrue(stack.isEmpty());
  }

  /**
   * Test ensures that different types of entries can be pushed onto the stack.
   * Verifies that the stack can handle and correctly pop entries of different types.
   * 
   * @throws EmptyStackException if an operation is attempted on an empty stack.
   */
  //Test8
  @Test
  void testPushDifferentTypes() throws EmptyStackException {
    // Create entries of different types
    Entry numberEntry = new Entry(1.0f);
    Entry stringEntry = new Entry("Test");
    Entry symbolEntry = new Entry(Symbol.PLUS);

    // Push entries onto the stack
    stack.push(numberEntry);
    stack.push(stringEntry);
    stack.push(symbolEntry);

    // Pop entries and verify they are in the reverse order of pushing
    assertEquals(symbolEntry, stack.pop());
    assertEquals(stringEntry, stack.pop());
    assertEquals(numberEntry, stack.pop());
  }

  /**
   * Test ensures that the stack can handle a large number of entries.
   * Verifies that the stack maintains correct size and order with many entries.
   * 
   * @throws EmptyStackException if an operation is attempted on an empty stack.
   */
  //Test9
  @Test
  void testStackWithLargeNumberOfEntries() throws EmptyStackException {
    int largeNumber = 1000;

    // Push a large number of entries onto the stack
    for (int i = 0; i < largeNumber; i++) {
      stack.push(new Entry((float) i));
    }

    // Verify that the size of the stack is as expected
    assertEquals(largeNumber, stack.size());

    // Pop entries and verify they are in the reverse order of pushing
    for (int i = largeNumber - 1; i >= 0; i--) {
      assertEquals(new Entry((float) i), stack.pop());
    }

    // Verify that the stack is empty after popping all entries
    assertTrue(stack.isEmpty());
  }
}
