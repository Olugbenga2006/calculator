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
  //Test1
  @Test
  void testEnumValues() {
    assertEquals(4, Type.Types.values().length);
    assertTrue(Type.Types.valueOf("STRING") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("NUMBER") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("SYMBOL") instanceof Type.Types);
    assertTrue(Type.Types.valueOf("INVALID") instanceof Type.Types);
  }

  /**
   * Test the toString method for each enum value in the Type.Types enum.
   */
  //Test2
  @Test
  void testEnumToString() {
    assertEquals("String", Type.Types.STRING.toString());
    assertEquals("Number", Type.Types.NUMBER.toString());
    assertEquals("Symbol", Type.Types.SYMBOL.toString());
    assertEquals("Invalid", Type.Types.INVALID.toString());
  }

  /**
   * Test the construction of Type.Types enum values.
   */
  //Test3
  @Test
  void testEnumConstruction() {
    Type.Types typeString = Type.Types.STRING;
    Type.Types typeNumber = Type.Types.NUMBER;
    Type.Types typeSymbol = Type.Types.SYMBOL;
    Type.Types typeInvalid = Type.Types.INVALID;

    assertEquals("String", typeString.toString());
    assertEquals("Number", typeNumber.toString());
    assertEquals("Symbol", typeSymbol.toString());
    assertEquals("Invalid", typeInvalid.toString());
  }
  /**
   * Test ensures the name  method returns the correct name  
   */
  //Test4
  @Test
  void testEnumName() {
      assertEquals("STRING", Type.Types.STRING.name());
      assertEquals("NUMBER", Type.Types.NUMBER.name());
      assertEquals("SYMBOL", Type.Types.SYMBOL.name());
      assertEquals("INVALID", Type.Types.INVALID.name());
  }
  /**
   * Test ensures equals() method correvtly compares enum constants
   */
  //Test5
  @Test
  void testEnumEquals() {
      assertTrue(Type.Types.STRING.equals(Type.Types.STRING));
      assertFalse(Type.Types.STRING.equals(Type.Types.NUMBER));
  }


}

