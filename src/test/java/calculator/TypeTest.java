package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the Type class. This class contains test cases to verify
 * the functionality of the Type class and its enum (Type.Types).
 */
class TypeTest {

  /**
   * Test the values() method for the Type.Types enum.
   */
  @Test
  void testEnumValues() {
    // Test that the enum contains the expected values
    assertEquals(4, Type.Types.values().length);
    assertTrue(Type.Types.valueOf("STRING") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("NUMBER") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("SYMBOL") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("INVALID") instanceof Type.Types);
  }

  /**
   * Test the toString method for each enum value in the Type.Types enum.
   */
  @Test
  void testEnumToString() {
    // Test the toString method for each enum value
    assertEquals("String", Type.Types.STRING.toString());
    assertEquals("Number", Type.Types.NUMBER.toString());
    assertEquals("Symbol", Type.Types.SYMBOL.toString());
    assertEquals("Invalid", Type.Types.INVALID.toString());
  }

  /**
   * Test the construction of Type.Types enum values.
   */
  @Test
  void testEnumConstruction() {
    // Test the construction of enum values
    Type.Types typeString = Type.Types.STRING;
    Type.Types typeNumber = Type.Types.NUMBER;
    Type.Types typeSymbol = Type.Types.SYMBOL;
    Type.Types typeInvalid = Type.Types.INVALID;

    assertEquals("String", typeString.toString());
    assertEquals("Number", typeNumber.toString());
    assertEquals("Symbol", typeSymbol.toString());
    assertEquals("Invalid", typeInvalid.toString());
  }
}

