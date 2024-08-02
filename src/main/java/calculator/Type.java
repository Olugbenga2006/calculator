package calculator;

/**
 * Class representing different types for the calculator.
 */
public class Type {

    /**
     * Enum representing various types.
     */
    public enum Types {
        STRING("String"),
        NUMBER("Number"),
        SYMBOL("Symbol"),
        INVALID("Invalid");
        /**
         * Constructs a Types enum value with the specified type name.
         *
         * @param typeName The name associated with the type.
         */
        private final String typeName;

        // Constructor
        Types(String typeName) {
            this.typeName = typeName;
        }
        /**
         * Returns a string representation of the type.
         *
         * @return The type name as a string.
         */
        // Overriding toString method to return the expected string
        @Override
        public String toString() {
            return this.typeName;
        }
    }
}
