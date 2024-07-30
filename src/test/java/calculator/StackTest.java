package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * JUnit test class for the Stack class. This class contains test cases to verify
 * the functionality of the Stack class's methods.
 */
class StackTest {
  private Stack stack;

  /**
   * Set up a new Stack instance before each test case.
   */
  @BeforeEach
  void setUp() {
    stack = new Stack();
  }

  /**
   * Test the push method and verify the top method's correctness.
   */
  @Test
  void testPushAndTop() {
    Entry entry = new Entry(42.0f);
    stack.push(entry);
    assertEquals(entry, stack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   */
  @Test
  void testPushAndPop() {
    Entry entry = new Entry(3.14f);
    stack.push(entry);
    Entry popped = stack.pop();
    assertEquals(entry, popped);
    assertTrue(stack.isEmpty());
  }

  /**
   * Test the size method for the Stack class.
   */
  @Test
  void testSize() {
    Entry entry1 = new Entry(1.0f);
    Entry entry2 = new Entry(2.0f);

    stack.push(entry1);
    stack.push(entry2);

    assertEquals(2, stack.size());

    stack.pop();

    assertEquals(1, stack.size());
  }

  /**
   * Test the isEmpty method for the Stack class.
   */
  @Test
  void testIsEmpty() {
    assertTrue(stack.isEmpty());

    Entry entry = new Entry("Test String");
    stack.push(entry);

    assertFalse(stack.isEmpty());

    stack.pop();

    assertTrue(stack.isEmpty());
  }
}



