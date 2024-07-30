package calculator;

/**
 * The Entry class represents an entry in a calculator that can be of various types:
 * a number, a symbol, or a string. It also provides methods to access and manipulate these entries.
 */
public class Entry {
  private Type.Types type;
  private String stringValue;
  private float floatValue;
  private Symbol.Symbols symbol;

  /**
   * Constructs an Entry with a float value.
   *
   * @param value The float value for the Entry.
   */
  public Entry(float value) {
    this.type = Type.Types.NUMBER;
    this.floatValue = value;
  }

  /**
   * Constructs an Entry with a symbol.
   *
   * @param theSymbol The symbol for the Entry.
   */
  public Entry(Symbol.Symbols theSymbol) {
    this.type = Type.Types.SYMBOL;
    this.symbol = theSymbol;
  }

  /**
   * Constructs an Entry with a string value.
   *
   * @param value The string value for the Entry.
   */
  public Entry(String value) {
    this.type = Type.Types.STRING;
    this.stringValue = value;
  }

  /**
   * Gets the type of the Entry.
   *
   * @return The Type of the Entry.
   */
  public Type.Types getType() {
    return type;
  }

  /**
   * Gets the string value of the Entry with exception handling.
   *
   * @return The string value of the Entry.
   * @throws RuntimeException if the Entry is not of type STRING.
   */
  public String getString() {
    if (type == Type.Types.STRING) {
      return stringValue;
    } else {
      throw new RuntimeException("bad type");
    }
  }

  /**
   * Gets the symbol of the Entry with exception handling.
   *
   * @return The symbol of the Entry.
   * @throws RuntimeException if the Entry is not of type SYMBOL.
   */
  public Symbol.Symbols getSymbol() {
    if (type == Type.Types.SYMBOL) {
      return symbol;
    } else {
      throw new RuntimeException("bad type");
    }
  }

  /**
   * Gets the float value of the Entry with exception handling.
   *
   * @return The float value of the Entry.
   * @throws RuntimeException if the Entry is not of type NUMBER.
   */
  public float getValue() {
    if (type == Type.Types.NUMBER) {
      return floatValue;
    } else {
      throw new RuntimeException("bad type");
    }
  }

  /**
   * Compares this Entry with another object for equality.
   *
   * @param obj The object to compare with this Entry.
   * @return {@code true} if the objects are equal, {@code false} otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Entry otherEntry = (Entry) obj;
    if (type != otherEntry.type) {
      return false;
    }

    // Compare values based on the type
    if (type == Type.Types.STRING) {
      return stringValue.equals(otherEntry.stringValue);
    } else if (type == Type.Types.NUMBER) {
      return Float.compare(otherEntry.floatValue, floatValue) == 0;
    } else if (type == Type.Types.SYMBOL) {
      return symbol == otherEntry.symbol;
    }

    return true;
  }
  @Override
  public int hashCode() {
      int result = type.hashCode();
      switch (type) {
          case STRING:
              result = 31 * result + stringValue.hashCode();
              break;
          case NUMBER:
              result = 31 * result + Float.hashCode(floatValue);
              break;
          case SYMBOL:
              result = 31 * result + symbol.hashCode();
              break;
      }
      return result;
  }
}
