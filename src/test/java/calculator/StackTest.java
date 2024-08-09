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
  //Test1
  @Test
  void testPushAndTop() {
    Entry entry = new Entry(42.0f);
    stack.push(entry);
    assertEquals(entry, stack.top());
  }

  /**
   * Test the push method and verify the pop method's correctness.
   */
  //Test2
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
  //Test3
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
  //Test4
  @Test
  void testIsEmpty() {
    assertTrue(stack.isEmpty());

    Entry entry = new Entry("Test String");
    stack.push(entry);

    assertFalse(stack.isEmpty());

    stack.pop();

    assertTrue(stack.isEmpty());
  }
  /**
   * Test ensures that the pop method throws a RuntimeException when the stack is empty.
   */
  //Test5
  @Test
  void testPopEmptyStack() {
      RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
          stack.pop();
      });
      assertEquals("Stack is empty", thrown.getMessage());
  }
  /**
   * Test ensures that the top method throws a RuntimeException when the stack is empty.
   */
  //Test6
  @Test
  void testTopEmptyStack() {
      RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
          stack.top();
      });
      assertEquals("Stack is empty", thrown.getMessage());
  }
  /**
   * Test ensures that multiple entries can be pushed and popped in the correct order.
   */
  //Test7
  @Test
  void testPushAndPopMultipleEntries() {
      Entry entry1 = new Entry(1.0f);
      Entry entry2 = new Entry(2.0f);
      Entry entry3 = new Entry(3.0f);

      stack.push(entry1);
      stack.push(entry2);
      stack.push(entry3);

      assertEquals(entry3, stack.pop());
      assertEquals(entry2, stack.pop());
      assertEquals(entry1, stack.pop());
      assertTrue(stack.isEmpty());
  }
  /**
   * Test ensures that different types of entries can be pushed onto the stack.
   */
  //Test8
  @Test
  void testPushDifferentTypes() {
      Entry numberEntry = new Entry(1.0f);
      Entry stringEntry = new Entry("Test");
      Entry symbolEntry = new Entry(Symbol.PLUS);

      stack.push(numberEntry);
      stack.push(stringEntry);
      stack.push(symbolEntry);

      assertEquals(symbolEntry, stack.pop());
      assertEquals(stringEntry, stack.pop());
      assertEquals(numberEntry, stack.pop());
  }
  /**
   * Test ensures that the stack can handle a large number of entries.
   */
  //Test9
  @Test
  void testStackWithLargeNumberOfEntries() {
      int largeNumber = 1000;
      for (int i = 0; i < largeNumber; i++) {
          stack.push(new Entry((float) i));
      }

      assertEquals(largeNumber, stack.size());

      for (int i = largeNumber - 1; i >= 0; i--) {
          assertEquals(new Entry((float) i), stack.pop());
      }

      assertTrue(stack.isEmpty());
  }


}



