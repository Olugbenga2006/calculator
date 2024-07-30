package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for the Entry class. This class contains test cases to verify
 * the functionality of the Entry class constructors and methods.
 */
class EntryTest {

  /**
   * Test the constructor for creating an Entry with a float value.
   */
  @Test
  void testEntryFloat() {
    Entry entry = new Entry(42.0f);
    assertEquals(Type.Types.NUMBER, entry.getType());
    assertEquals(42.0f, entry.getValue(), 0.001); // Use delta for float comparisons
  }

  /**
   * Test the constructor for creating an Entry with a symbol.
   */
  @Test
  void testEntrySymbols() {
    Entry entry = new Entry(Symbol.PLUS);
    assertEquals(Type.Types.SYMBOL, entry.getType());
    assertEquals(Symbol.PLUS, entry.getSymbol());
  }

  /**
   * Test the constructor for creating an Entry with a string value.
   */
  @Test
  void testEntryString() {
    Entry entry = new Entry("Test String");
    assertEquals(Type.Types.STRING, entry.getType());
    assertEquals("Test String", entry.getString());
  }

  /**
   * Test the getType method of the Entry class.
   */
  @Test
  void testGetType() {
    Entry entry = new Entry(42.0f);
    assertEquals(Type.Types.NUMBER, entry.getType());
  }

  /**
   * Test the getString method of the Entry class.
   */
  @Test
  void testGetString() {
    Entry entry = new Entry("Test String");
    assertEquals("Test String", entry.getString());
  }

  /**
   * Test the getSymbol method of the Entry class.
   */
  @Test
  void testGetSymbol() {
    Entry entry = new Entry(Symbol.MINUS);
    assertEquals(Symbol.MINUS, entry.getSymbol());
  }

  /**
   * Test the getValue method of the Entry class.
   */
  @Test
  void testGetValue() {
    Entry entry = new Entry(3.14159f);
    assertEquals(3.14159f, entry.getValue(), 0.001);
  }

  /**
   * Test the equals method of the Entry class for comparing two Entry objects.
   */
  @Test
  void testEqualsObject() {
    Entry entry1 = new Entry(42.0f);
    Entry entry2 = new Entry(42.0f);
    Entry entry3 = new Entry(Symbol.PLUS);

    assertEquals(entry1, entry2);
    assertNotEquals(entry1, entry3);
  }
  void testBadTypeException() {
    Entry entryNumber = new Entry(42.0f);
    Entry entrySymbol = new Entry(Symbol.PLUS);
    Entry entryString = new Entry("Test String");

    assertThrows(BadTypeException.class, () -> {
        entryNumber.getSymbol();
    });

    assertThrows(BadTypeException.class, () -> {
        entryNumber.getString();
    });

    assertThrows(BadTypeException.class, () -> {
        entrySymbol.getValue();
    });

    assertThrows(BadTypeException.class, () -> {
        entrySymbol.getString();
    });

    assertThrows(BadTypeException.class, () -> {
        entryString.getValue();
    });

    assertThrows(BadTypeException.class, () -> {
        entryString.getSymbol();
    });
}
}
}


