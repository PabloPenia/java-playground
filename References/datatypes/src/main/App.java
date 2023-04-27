package main;

public class App {

  public static void main(String[] args) {
	ArrayDemo arrays = new ArrayDemo();
	arrays.print();
  }

  public String bold(String str) {
	str = "\033[1m" + str + "\033[0m";
	return str;
  }
}
