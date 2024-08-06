package calculator;

/**
 * The NumStack class wraps around a Stack to specifically handle float values.
 */
public class NumStack {
  private Stack stack;

  /**
   * Constructs a NumStack with an empty Stack.
   */
  public NumStack() {
    this.stack = new Stack();
    }

  /**
   * Pushes a float value onto the stack.
   *
   * @param The float value to be pushed onto the stack.
   */
  public void push(float value) {
    stack.push(new Entry(value));
    }

  /**
   * Removes and returns the float value at the top of the stack.
   *
   * @return The float value at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   */
  public float pop() throws RuntimeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
      }
    return stack.pop().getValue();
    }

  /**
   * Returns the float value at the top of the stack without removing it.
   *
   * @return The float value at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   */
  public float top() throws RuntimeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
      }
    return stack.top().getValue();
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
