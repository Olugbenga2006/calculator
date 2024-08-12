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
   * This test verifies that the Type.Types enum contains the correct number of values
   * and that each enum constant can be retrieved using valueOf().
   */
  //Test1
  @Test
  void testEnumValues() {
    // Verify the enum has exactly 4 values
    assertEquals(4, Type.Types.values().length);
    // Verify that each enum constant can be retrieved and is an instance of Type.Types
    assertTrue(Type.Types.valueOf("STRING") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("NUMBER") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("SYMBOL") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("INVALID") instanceof Type.Types);
  }

  /**
   * Test the toString method for each enum value in the Type.Types enum.
   * This test ensures that the toString() method of each enum constant returns the
   * correct string representation.
   */
  //Test2
  @Test
  void testEnumToString() {
    // Verify that the toString() method returns the expected string for each enum constant
    assertEquals("String", Type.Types.STRING.toString());
    assertEquals("Number", Type.Types.NUMBER.toString());
    assertEquals("Symbol", Type.Types.SYMBOL.toString());
    assertEquals("Invalid", Type.Types.INVALID.toString());
  }

  /**
   * Test the construction of Type.Types enum values.
   * This test checks that enum constants are correctly initialized and have the correct
   * string representation when using the toString() method.
   */
  //Test3
  @Test
  void testEnumConstruction() {
    // Create references to each enum constant
    Type.Types typeString = Type.Types.STRING;
    Type.Types typeNumber = Type.Types.NUMBER;
    Type.Types typeSymbol = Type.Types.SYMBOL;
    Type.Types typeInvalid = Type.Types.INVALID;

    // Verify that each enum constant has the correct string representation
    assertEquals("String", typeString.toString());
    assertEquals("Number", typeNumber.toString());
    assertEquals("Symbol", typeSymbol.toString());
    assertEquals("Invalid", typeInvalid.toString());
  }
  
  /**
   * Test ensures the name method returns the correct name for each enum constant.
   * This test checks that the name() method returns the exact name used in the enum declaration.
   */
  //Test4
  @Test
  void testEnumName() {
    // Verify that the name() method returns the expected name for each enum constant
    assertEquals("STRING", Type.Types.STRING.name());
    assertEquals("NUMBER", Type.Types.NUMBER.name());
    assertEquals("SYMBOL", Type.Types.SYMBOL.name());
    assertEquals("INVALID", Type.Types.INVALID.name());
  }

  /**
   * Test ensures the equals() method correctly compares enum constants.
   * This test verifies that the equals() method returns true for the same enum constants
   * and false for different enum constants.
   */
  //Test5
  @Test
  void testEnumEquals() {
    // Verify that the equals() method returns true when comparing the same enum constants
    assertTrue(Type.Types.STRING.equals(Type.Types.STRING));
    // Verify that the equals() method returns false when comparing different enum constants
    assertFalse(Type.Types.STRING.equals(Type.Types.NUMBER));
  }
}
