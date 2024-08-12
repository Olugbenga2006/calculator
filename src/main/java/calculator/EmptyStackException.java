package calculator;

/**
 * Exception class used to display an error message if something is pushed or popped from an empty
 * stack.
 * 
 */
public class EmptyStackException extends Exception {
  private static final long serialVersionUID = -1743343566172860617L;

  public EmptyStackException(String errorMessage) {
    super(errorMessage);
  }
}
