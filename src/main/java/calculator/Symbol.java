package calculator;

/**
 * Class representing symbols used in calculations.
 */
public class Symbol {

    /**
     * Enum representing various symbols.
     */
    public enum Symbols {
        LEFT_BRACKET("("),
        RIGHT_BRACKET(")"),
        TIME("*"),
        DIVIDE("/"),
        PLUS("+"),
        MINUS("-");

        private final String symbol;

        // Constructor
        Symbols(String symbol) {
            this.symbol = symbol;
        }

        // Overriding toString method to return the expected symbol string
        @Override
        public String toString() {
            return this.symbol;
        }
    }
}
