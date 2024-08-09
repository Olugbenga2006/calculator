package calculator;

import java.util.Scanner;

/**
 * Standard Calculator class to perform the calculations on the calculator as an infix expression.
 * 
 */
public class StandardCalc {
  private OpStack values;
  private NumStack numStack;
  private RevPolishCalc rpCalc;

  /**
   * constructor that initialises the stacks and RPN object for calculations.
   */
  public StandardCalc() {
    values = new OpStack();
    numStack = new NumStack();
    rpCalc = new RevPolishCalc();
  }

  /**
   * Used to calculate the answer for an infix expression as a String.
   * 
   * @param expr the string containing the calculation to be performed
   * @throws RuntimeException if stack is empty
   */
  public float evaluate(String expr)
      throws RuntimeException {
    Float num1;
    Float num2;

    Scanner scanner = new Scanner(expr);

    while (scanner.hasNext()) {
      if (scanner.hasNextFloat()) {
        numStack.push(scanner.nextFloat());
      } else if (scanner.hasNext("-")) {
        scanner.next("-");
        values.push(Symbol.MINUS);
      } else if (scanner.hasNext("/")) {
        scanner.next("/");
        values.push(Symbol.DIVIDE);
      } else if (scanner.hasNext("\\+")) {
        scanner.next("\\+");
        values.push(Symbol.PLUS);
      } else if (scanner.hasNext("\\*")) {
        scanner.next("\\*");
        values.push(Symbol.TIME);
      }
    }

    num2 = numStack.pop();
    num1 = numStack.pop();
    Symbol operator = values.pop();
    String calculation = num1.toString() + " " + num2.toString() + " " + operator;
    Float result = rpCalc.evaluate(calculation);

    scanner.close();
    return result;
  }
}
