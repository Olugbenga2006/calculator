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
   * @throws BadTypeException 
   */
  //Test 1
  // uses a constructor to pass test
  @Test
  void testEntryFloat() throws BadTypeException {
    Entry entry = new Entry(42.0f);
    assertEquals(Type.Types.NUMBER, entry.getType());
    assertEquals(42.0f, entry.getValue(), 0.001); // Use delta for float comparisons
  }

  /**
   * Test the constructor for creating an Entry with a symbol.
   * @throws BadTypeException 
   */
  //Test 2
  // uses a constructor to pass test
  @Test
  void testEntrySymbols() throws BadTypeException {
    Entry entry = new Entry(Symbol.PLUS);
    assertEquals(Type.Types.SYMBOL, entry.getType());
    assertEquals(Symbol.PLUS, entry.getSymbol());
  }

  /**
   * Test the constructor for creating an Entry with a string value.
   * @throws BadTypeException 
   */
  //Test 3
  // uses a constructor to pass test
  @Test
  void testEntryString() throws BadTypeException {
    Entry entry = new Entry("Test String");
    assertEquals(Type.Types.STRING, entry.getType());
    assertEquals("Test String", entry.getString());
  }

  /**
   * Test the getType method of the Entry class.
   */
  //Test 4
  // uses a getter function to pass test
  @Test
  void testGetType() {
    Entry entry = new Entry(42.0f);
    assertEquals(Type.Types.NUMBER, entry.getType());
  }

  /**
   * Test the getString method of the Entry class.
   * @throws BadTypeException 
   */
  //Test 5
  // uses a getter function to pass test
  @Test
  void testGetString() throws BadTypeException {
    Entry entry = new Entry("Test String");
    assertEquals("Test String", entry.getString());
  }

  /**
   * Test the getSymbol method of the Entry class.
   * @throws BadTypeException 
   */
  //Test 6
  // uses a getter function to pass test
  @Test
  void testGetSymbol() throws BadTypeException {
    Entry entry = new Entry(Symbol.MINUS);
    assertEquals(Symbol.MINUS, entry.getSymbol());
  }

  /**
   * Test the getValue method of the Entry class.
   * @throws BadTypeException 
   */
  //Test 7
  // uses a getter function to pass test
  @Test
  void testGetValue() throws BadTypeException {
    Entry entry = new Entry(3.14159f);
    assertEquals(3.14159f, entry.getValue(), 0.001);
  }

  /**
   * Test the equals method of the Entry class for comparing two Entry objects.
   */
  //Test 8
  // uses boolean function to pass test
  @Test
  void testEqualsObject() {
    Entry entry1 = new Entry(42.0f);
    Entry entry2 = new Entry(42.0f);
    Entry entry3 = new Entry(Symbol.PLUS);

    assertEquals(entry1, entry2);
    assertNotEquals(entry1, entry3);
  }
  
  /**
   * Test the getString method for an Entry not of type STRING.
   */
  //Test 9
  @Test
  public void testGetStringWithNonStringType() throws BadTypeException {
    // Create an Entry with a float value (NUMBER type)
    Entry entry = new Entry(3.14f);

    // Try to get the string value, which should throw a BadTypeException
    entry.getString();
  }
  
  /**
   * Test the getSymbol method for an Entry not of type Symbol.
   */
  //Test 10
  @Test
  public void testGetSymbolWithNonSymbolType() throws BadTypeException {
    // Create an Entry with a float value (NUMBER type)
    Entry entry = new Entry(42.0f);

    // Try to get the symbol, which should throw a BadTypeException
    entry.getSymbol();
  }
  /**
   * Test the getValue method for an Entry not of type float.
   */
  //Test 11
  @Test
  public void testGetValueWithNonNumberType() throws BadTypeException {
    // Create an Entry with a string value (STRING type)
    Entry entry = new Entry("Not a number");

    // Try to get the float value, which should throw a BadTypeException
    entry.getValue();
  }
  
  /**
   * Test ensures that equals method returns false when comparing two types
   */
  //Test 12
  //uses boolean function
  @Test
  void testEqualsWithDifferentTypes() {
    Entry entry1 = new Entry(42.0f);
    Entry entry2 = new Entry("42.0");
    assertNotEquals(entry1, entry2);
  }
  /**
   * Test the hash code to see if it keeps its consistency
   */
  //Test 13
  // uses hash code function
  @Test
  void testHashCodeConsistency() {
    Entry entry1 = new Entry(42.0f);
    Entry entry2 = new Entry(42.0f);
    assertEquals(entry1.hashCode(), entry2.hashCode());
  }
  /**
   * Test the hash code to see if it stores different entries with different codes
   */
  //Test 14
  // uses hash code function
  @Test
  void testHashCodeWithDifferentValues() {
    Entry entry1 = new Entry(42.0f);
    Entry entry2 = new Entry(43.0f);
    assertNotEquals(entry1.hashCode(), entry2.hashCode());
  }
}

