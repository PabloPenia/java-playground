package utils;

public class Utils {
  public static String  bold(String str) {
	str = "\033[1m" + str + "\033[0m";
	return str;
  }
}
