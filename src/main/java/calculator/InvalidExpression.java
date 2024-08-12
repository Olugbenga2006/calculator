package calculator;
/**
 * Exception class used to display an error message if an expression was passed to a method that could not be evaluated.
 */

public class InvalidExpression extends Exception {
  private static final long serialVersionUID = 2832031138996816565L;

  public InvalidExpression(String errorMessage) {
    super(errorMessage);
  }

}