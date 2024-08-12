package calculator;

import java.util.Scanner;

/**
 * This class performs the calculations on the calculator application.
 * @author Fawaz 
 */
public class RevPolishCalc {
  private NumStack numStack;

  /**
   * constructor that initialises a new numstack for calculations.
   */
  public RevPolishCalc() {
    numStack = new NumStack();
  }

  /**
   * Used to calculate the answer for an expression as a String.
   * 
   * @param expr the string containing the calculation to be performed
   * @throws RuntimeException if the stack is empty
   * @throws BadTypeException if the stack is empty when an operation is done to it
   * @throws InvalidExpression whenever the expression passed is invalid
   */
  public float evaluate(String expr)
      throws RuntimeException, BadTypeException, InvalidExpression {
    Float num1;
    Float num2;
    Float result;

    Scanner scanner = new Scanner(expr);

    while (scanner.hasNext()) {
      if (scanner.hasNextFloat()) {
        numStack.push(scanner.nextFloat());
      } else {
        try {
          num2 = numStack.pop();
          num1 = numStack.pop();

        } catch (IndexOutOfBoundsException esException) {
          scanner.close();
          throw new InvalidExpression("Invalid Expression") ;
        }
        switch (scanner.next()) {
          case "+":
            result = num1 + num2;
            return result;
          case "-":
            result = num1 - num2;
            return result;
          case "*":
            result = num1 * num2;
            return result;
          case "/":
            if (num2 == 0) {
              throw new ArithmeticException("You cannot divide a number by 0.");
            }
            result = num1 / num2;
            return result;
          default:
            throw new InvalidExpression("Invalid Expression");
        }
      }
    }
    scanner.close();
    return numStack.top();
  }
}

