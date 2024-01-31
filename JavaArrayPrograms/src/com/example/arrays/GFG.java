package com.example.arrays;

import java.util.HashSet;

/*Program to find the duplicates from the given array using recursive function*/
public class GFG {

	public static void main(String[] args) {
		Object[] arr = { 1, 2, "'", "1", 'c',
				new Object[] { 1, "john", "4", new Object[] { "1", "2", "John", 'd', 4 } }, "John",
				new Object[] { "1", "2" } };
		System.out.println(removeDuplicates(arr, new HashSet<String>()));
		System.out.println(getFactorial(5));
	}

	public static HashSet removeDuplicates(Object[] arr, HashSet set) {
		for (Object obj : arr) {
			if (obj instanceof Object[]) {
				removeDuplicates((Object[]) obj, set);
			} else {
				set.add(obj.toString());
			}
		}
		return set;
	}

	public static int getFactorial(int number) {
		if (number == 0 || number == 1)
			return 1;
		return number * getFactorial(number - 1);
	}

}
