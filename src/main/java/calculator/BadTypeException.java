package calculator;
/**
 * Exception class used to display an error message if incorrect type is used.
 * @author Fawaz
 */
public class BadTypeException extends Exception {
  private static final long serialVersionUID = 8103455150489603354L;

  public BadTypeException(String errorMessage) {
    super(errorMessage);
  }

}
