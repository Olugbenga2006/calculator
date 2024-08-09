package calculator;

import java.util.Scanner;

/**
 * This class performs the calculations on the calculator application.
 * 
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
   */
  public float evaluate(String expr)
      throws RuntimeException {
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
          throw new RuntimeException("Invalid Expression");
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
            throw new RuntimeException("Invalid Expression");
        }
      }
    }
    scanner.close();
    return numStack.top();
  }
}

