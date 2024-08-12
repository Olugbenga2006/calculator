package calculator;

/**
 * The OpStack class wraps around a Stack to specifically handle Symbol values.
 */
public class OpStack {
  private Stack stack;

  /**
   * Constructs an OpStack with an empty Stack.
   */
  public OpStack() {
    this.stack = new Stack();
  }

  /**
   * Pushes a Symbol onto the stack.
   *
   * @param symbol The Symbol to be pushed onto the stack.
   */
  public void push(Symbol symbol) {
    stack.push(new Entry(symbol));
  }

  /**
   * Removes and returns the Symbol at the top of the stack.
   *
   * @return The Symbol at the top of the stack.
   * @throws BadTypeException if the wrong data type is being removed
   * @throws Runtime if the stack is empty.
   */
  public Symbol pop() throws RuntimeException, BadTypeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.pop().getSymbol();
  }

  /**
   * Returns the Symbol at the top of the stack without removing it.
   *
   * @return The Symbol at the top of the stack.
   * @throws RuntimeException if the stack is empty.
   * @throws BadTypeException if the wrong data type is entered
   */
  public Symbol top() throws RuntimeException, BadTypeException {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack.top().getSymbol();
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
