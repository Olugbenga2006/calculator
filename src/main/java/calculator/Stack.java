package calculator;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * The Stack class represents a stack of Entry objects. It provides methods to
 * push, pop, get the top entry, check the size, and check if the stack is empty.
 */
public class Stack {
  private ArrayList<Entry> stack;

  /**
   * Constructs a new empty stack.
   */
  public Stack() {
    stack = new ArrayList<>();
  }

  /**
   * Pushes an entry onto the stack.
   *
   * @param entry The Entry object to be pushed onto the stack.
   */
  public void push(Entry entry) {
    stack.add(entry);
  }

  /**
   * Pops and removes the top entry from the stack.
   *
   * @return The top Entry object from the stack.
   * @throws EmptyStackException if the stack is empty.
   */
  public Entry pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.remove(stack.size() - 1);
  }

  /**
   * Returns the top entry from the stack without removing it.
   *
   * @return The top Entry object from the stack.
   * @throws EmptyStackException if the stack is empty.
   */
  public Entry top() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack.get(stack.size() - 1);
  }

  /** 
   * Returns the size of the stack.
   *
   * @return The number of Entry objects in the stack.
   */
  public int size() {
    return stack.size();
  }

  /**
   * Checks if the stack is empty.
   *
   * @return true if the stack is empty, false otherwise.
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
