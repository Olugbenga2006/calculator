package calculator;

/**
 * The StrStack class wraps around a Stack to specifically handle String values.
 * @author Fawaz 
 */
public class StrStack {
  private Stack stack;

  /**
   * Constructs a StrStack with an empty Stack.
   */
  public StrStack() {
    this.stack = new Stack();
  }

  /**
   * Pushes a String onto the stack.
   *
   * @param The String to be pushed onto the stack.
   */
  public void push(String str) {
    stack.push(new Entry(str));
  }

  /**
   * Removes and returns the String at the top of the stack.
   *
   * @return The String at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   * @throws BadTypeException if wrong data type is popped
   */
  public String pop() throws RuntimeException, BadTypeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.pop().getString();
  }

  /**
   * Returns the String at the top of the stack without removing it.
   *
   * @return The String at the top of the stack.
   * @throws BadTypeException if wrong data type is removed
   * @throws EmptyStackException if the stack is empty.
   */
  public String top() throws RuntimeException, BadTypeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.top().getString();
  }

  /**
   * Returns the number of entries in the stack.
   *
   * @return The size of the stack.
   */
  public int size() {
    return stack.size();
  }
}
