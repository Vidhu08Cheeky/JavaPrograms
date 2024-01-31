package com.example.arrays;

import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {5,6,7,8};
		
		Object[] mergedArray = Stream.of(array1, array2).flatMap(Stream::of).toArray();
		
		//Arrays.
	}

}
