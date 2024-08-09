package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the Symbol class. This class contains test cases to verify
 * the functionality of the Symbol class and its enum (Symbol.Symbols).
 */
class SymbolTest {

  /**
   * Test the values() method for the Symbol.Symbols enum.
   */
  //Test1
  @Test
  void testEnumValues() {
    // Test that the enum contains the expected values
    assertTrue(Symbol.valueOf("LEFT_BRACKET") instanceof Symbol);
    assertTrue(Symbol.valueOf("RIGHT_BRACKET") instanceof Symbol);
    assertTrue(Symbol.valueOf("TIME") instanceof Symbol);
    assertTrue(Symbol.valueOf("DIVIDE") instanceof Symbol);
    assertTrue(Symbol.valueOf("PLUS") instanceof Symbol);
    assertTrue(Symbol.valueOf("MINUS") instanceof Symbol);
  }

  /**
   * Test the toString method for each enum value in the Symbol.Symbols enum.
   */
  //Test2
  @Test
  void testEnumToString() {
    // Test the toString method for each enum value
    assertEquals("(", Symbol.LEFT_BRACKET.toString());
    assertEquals(")", Symbol.RIGHT_BRACKET.toString());
    assertEquals("*", Symbol.TIME.toString());
    assertEquals("/", Symbol.DIVIDE.toString());
    assertEquals("+", Symbol.PLUS.toString());
    assertEquals("-", Symbol.MINUS.toString());
  }
}
