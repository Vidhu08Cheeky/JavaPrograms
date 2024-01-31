package com.example.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProgram {

	public static void main(String[] args) {
		
		Object[] arr = {1, 2, "'", "1", 'c', new Object[]{1, "john", "4", new Object[]{"1", "2", "John", 'd', 4}}, "John", new Object[]{"1", "2"}};
        System.out.println("Original array: " + Arrays.deepToString(arr));
        
        Set<Object> set = new HashSet<>();
        Object[] newArr = new Object[arr.length];
        int index = 0;
        for (Object o : arr) {
            if (o instanceof Object[]) {
                Object[] innerArr = (Object[]) o;
                innerArr = removeDuplicates(innerArr);
                newArr[index++] = innerArr;
            } else {
                if (set.add(o)) {
                    newArr[index++] = o;
                }
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.deepToString(Arrays.copyOf(newArr, index)));
    }

    private static Object[] removeDuplicates(Object[] arr) {
        Set<Object> set = new HashSet<>();
        Object[] newArr = new Object[arr.length];
        int index = 0;
        for (Object o : arr) {
            if (o instanceof Object[]) {
                Object[] innerArr = (Object[]) o;
                innerArr = removeDuplicates(innerArr);
                newArr[index++] = innerArr;
            } else {
                if (set.add(o)) {
                    newArr[index++] = o;
                }
            }
        }
        return Arrays.copyOf(newArr, index);
    }

}
