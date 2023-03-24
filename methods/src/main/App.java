package main;

public class App {

  /**
   * Methods named as a verb 'get', 'set', etc. They work like functions in
   * javascript, more specifically methods in javascript (functions inside
   * objects). A method needs to leave inside a class.
   * To use the method we have 2 options:
   * 1. create an instance of the class which holds the method, and then call the method:
   * 	MyClass myClass = new MyClass();
   * 	myClass.myMethod();
   * 2. Create a static method that can be called without class instantiation. Usefull for utility methods:
   * 	public static void myMethod() {}
   * 	myMethod();
   */
  public void sayHello() {
	System.out.println("Hello world");
  }

  public int add(int a, int b) {
	return a + b;
  }

  public char getInitial(String name) {
	return name.charAt(0);
  }
  
  /**
   * 
   * @param myArgs RESTish Operator to pass unknown arguments (varargs).
   */
  public static void getUnknownArgs(int... myArgs) {
	for(int i = 0; i < myArgs.length; i++) {	  
	  System.out.println("Index " + i + ": " + myArgs[i]);
	}
	System.out.println("Length: " + myArgs.length);
  }
  // Passing known and unknown args.
  public static void getKnownAndUnknownArgs(int a, int... myArgs) {
	System.out.println("a: " + a);
 	for(int i = 0; i < myArgs.length; i++) {	  
 	  System.out.println("Index " + i + ": " + myArgs[i]);
 	}
 	System.out.println("Length: " + myArgs.length);
   }
  public static void main(String[] args) {
	System.out.println("Getting unknown amount of arguments.");
	getUnknownArgs(1, 2, 3, 4, 5 );
	System.out.println("Getting a known argument and unknown amount of arguments.");
	getKnownAndUnknownArgs(1, 2, 3, 4, 5 );
  }

}
