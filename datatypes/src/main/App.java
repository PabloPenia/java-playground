package main;

public class App {

  public static void main(String[] args) {
	/**
	 * PRIMITIVE DATA TYPES
	 */
	boolean myBool = true; // 1 bit.
	byte myByte = 99; // 1 byte. Integers from -128 to 127. Default=0.
	char myChar = 'C'; // 2 bytes. A single character from '\u0000' (0) to
					   // '\uFFFF' (65535). Default='\u0000'.
	short myShort = 564; // 2 bytes. Integers from -32,768 to 32,767. Default=0.
	int myInt = 2346546; // 4 bytes. Integers from -2^31 to 2^31. Default=0.
	long myLong = 567867646; // 8 bytes. Integers from -2^63 to -2^63-1.
							 // Default=0.
	float myFloat = 6546.2f; // 4 bytes. Single-precision Reals from ~1.4e^-45
							 // to ~3.4e^38. Default=0.0
	double myDouble = 6546.2; // 8 bytes. Double-precision Reals from ~4.9e^-324
							  // to ~1.8e^308. Default=0.0
	/**
	 * NON-PRIMTIVE DATA TYPES
	 */
	String myString = "some text"; // Stores an object that represents a
								   // sequence of characters.
	MyClass AnotherClass = new MyClass(); // Stores an object built from a
										  // predefined 'blueprint'. Refers to a
										  // memory location of the object
										  // itself.

	/**
	 * CONSTANTS
	 */
	final double PI_NUMBER = 3.14; // Constant
	System.out.println("print something");
  }
}
