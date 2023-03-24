package main;

import utils.Utils;

public class ArrayDemo {
  /**
   * DECLARING ARRAYS
   */
  private int[] nums = { 10, 20, 30 }; // declare and assign an Array of
									   // integers.
  /**
   * PRINTING ARRAY DATA
   */
  public void print() {
	System.out.println(Utils.bold("Edit ./src/main/ArrayDemo.java"));
	System.out.println(nums.length); // print number of positions in array.
	System.out.println(nums[0]); // print the first element in Array.
	System.out.println(nums[2]); // print the element at given position in
								 // Array.
	System.out.println(nums[nums.length - 1]); // print the element at last
											   // position in Array.
  }

}
