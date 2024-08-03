package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * The Stack class represents a stack data structure for storing Entry objects.
 */
public class Stack {
  private List<Entry> stack;

  /**
   * Constructs an empty Stack.
   */
  public Stack() {
    stack = new ArrayList<>();
    }

  /**
   * Pushes an Entry onto the top of the stack.
   *
   * @param entry The Entry to be pushed onto the stack.
   */
  public void push(Entry entry) {
    stack.add(entry);
    }

  /**
   * Removes and returns the Entry at the top of the stack.
   *
   * @return The Entry at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   */
  public Entry pop() {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
      }
    return stack.remove(stack.size() - 1);
    }

  /**
   * Returns the Entry at the top of the stack without removing it.
   *
   * @return The Entry at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   */
  public Entry top() {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
      }
    return stack.get(stack.size() - 1);
    }
  /**
   * Returns the number of entries in the stack.
   *
   * @return The size of the stack.
   */
  public int size() {
    return stack.size();
    }

  /**
   * Checks if the stack is empty.
   *
   * @return  true if the stack is empty,false otherwise.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
    }
  }
