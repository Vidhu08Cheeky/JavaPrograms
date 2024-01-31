package com.java8.map.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingMapUsingValues {

	public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>(); 
		
            map.put("HCL", 3);
            map.put("LTI", 7);
            map.put("Cogni", 6);
            map.put("TCS", 1);
            map.put("TechM", 5);
            map.put("Infy", 2);
            map.put("Wipro", 4);
 
        System.out.println("Before Sorting : ");
 
        map.forEach((key, value) -> System.out.println(
                "Key : " + key  + "\t\t"  + "Value : "  + value
                ));
 
        System.out.println("*******************");
        
        // 2. Sorting according to  Values in the reversed order
        System.out.println("Sorting according to "
                + "descemding order of values :");
 
			        map
			        .entrySet()
			        .stream()
			        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			        .forEach(entry -> System.out.println(
			                "Key : " + entry.getKey()  + "\t\t"  + "Value : "  + entry.getValue()
			                ));


	}

}
