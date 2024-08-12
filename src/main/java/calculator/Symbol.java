package calculator;

/**
 * Enum representing symbols used in calculations.
 * @author Fawaz 
 */
public enum Symbol {
  LEFT_BRACKET("("),
  RIGHT_BRACKET(")"),
  TIME("*"),
  DIVIDE("/"),
  PLUS("+"),
  MINUS("-");

  private String symbol;

  // Constructor
  private Symbol(String symbol) {
    this.symbol = symbol;
  }

  // Overriding toString method to return the expected symbol string
  @Override
  public String toString() {
    return this.symbol;
  }
}

