package calculator;

/**
 * Interface for a calculator that can parse and evaluate arithmetic expressions provided as strings.
 */
public interface Calculator {

  /**
   * Evaluates the given expression based on its format. The `infix` parameter determines the type of
   * expression to evaluate. If `infix` is `true`, the expression is treated as an infix expression with
   * standard arithmetic operations, including parentheses. If `infix` is `false`, the expression is
   * treated as a postfix (Reverse Polish Notation) expression. An exception is thrown if the expression is
   * malformed or cannot be evaluated.
   * 
   * @param expression the arithmetic expression to evaluate
   * @param infix whether the expression is in infix format (`true`) or postfix format (`false`)
   * @return the result of the evaluation
   * @throws InvalidExpression  if the expression is invalid or cannot be evaluated

   */
  public float evaluate(String expression, Boolean infix) throws InvalidExpression;
}
