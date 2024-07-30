package calculator;

/**
 * The Type class represents the types that can be associated with entries in a calculator.
 * These types include STRING, NUMBER, SYMBOL, and INVALID.
 */
public class Type {
  /**
   * The Types enum defines the possible types that an entry can have in a calculator.
   */
  public enum Types {
    /**
     * Represents a STRING type for a calculator entry.
     */
    STRING("String"),

    /**
     * Represents a NUMBER type for a calculator entry.
     */
    NUMBER("Number"),

    /**
     * Represents a SYMBOL type for a calculator entry.
     */
    SYMBOL("Symbol"),

    /**
     * Represents an INVALID type for a calculator entry.
     */
    INVALID("Invalid");

    private String typeName;

    /**
     * Constructs a Types enum value with the specified type name.
     *
     * @param typeName The name associated with the type.
     */
    Types(String typeName) {
      this.typeName = typeName;
    }

    /**
     * Returns a string representation of the type.
     *
     * @return The type name as a string.
     */
    @Override
    public String toString() {
      return typeName;
    }
  }
}
