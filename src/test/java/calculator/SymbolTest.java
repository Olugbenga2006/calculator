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
    assertTrue(Symbol.Symbols.valueOf("LEFT_BRACKET") instanceof Symbol.Symbols);
    assertTrue(Symbol.Symbols.valueOf("RIGHT_BRACKET") instanceof Symbol.Symbols);
    assertTrue(Symbol.Symbols.valueOf("TIME") instanceof Symbol.Symbols);
    assertTrue(Symbol.Symbols.valueOf("DIVIDE") instanceof Symbol.Symbols);
    assertTrue(Symbol.Symbols.valueOf("PLUS") instanceof Symbol.Symbols);
    assertTrue(Symbol.Symbols.valueOf("MINUS") instanceof Symbol.Symbols);
  }

  /**
   * Test the toString method for each enum value in the Symbol.Symbols enum.
   */
  //Test2
  @Test
  void testEnumToString() {
    // Test the toString method for each enum value
    assertEquals("(", Symbol.Symbols.LEFT_BRACKET.toString());
    assertEquals(")", Symbol.Symbols.RIGHT_BRACKET.toString());
    assertEquals("*", Symbol.Symbols.TIME.toString());
    assertEquals("/", Symbol.Symbols.DIVIDE.toString());
    assertEquals("+", Symbol.Symbols.PLUS.toString());
    assertEquals("-", Symbol.Symbols.MINUS.toString());
  }
}
