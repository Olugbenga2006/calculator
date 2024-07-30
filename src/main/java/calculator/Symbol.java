package calculator;

/**
 * The Symbol class represents symbols that can be used in a calculator.
 * It defines an enum (Symbols) for various symbols.
 */
public class Symbol {
  /**
   * The Symbols enum defines the possible symbols that can be used in a calculator.
   */
  public enum Symbols {
    /**
     * Represents a left parenthesis symbol: "(".
     */
    LEFT_BRACKET("("),

    /**
     * Represents a right parenthesis symbol: ")".
     */
    RIGHT_BRACKET(")"),

    /**
     * Represents a multiplication symbol: "*".
     */
    TIME("*"),

    /**
     * Represents a division symbol: "/".
     */
    DIVIDE("/"),

    /**
     * Represents an addition symbol: "+".
     */
    PLUS("+"),

    /**
     * Represents a subtraction symbol: "-".
     */
    MINUS("-"),

    /**
     * Represents an INVALID symbol for an invalid or unrecognized input.
     */
    INVALID("INVALID");

    private String symbol;

    /**
     * Constructs a Symbols enum value with the specified symbol string.
     *
     * @param symbol The symbol associated with the enum value.
     */
    Symbols(String symbol) {
      this.symbol = symbol;
    }

    /**
     * Returns a string representation of the symbol.
     *
     * @return The symbol string.
     */
    @Override
    public String toString() {
      return symbol;
    }
  }
}

