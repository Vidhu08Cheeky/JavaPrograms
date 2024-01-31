package com.java8.map.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingMapUsingKeys {

	public static void main(String[] args) {
		
		Map<String, Integer> mnc = new HashMap<>(); 
		
        mnc.put("HCL", 3);
        mnc.put("LTI", 7);
        mnc.put("Cogni", 6);
        mnc.put("TCS", 1);
        mnc.put("TechM", 5);
        mnc.put("Infy", 2);
        mnc.put("Wipro", 4);
 
        System.out.println("Before Sorting : ");
 
        mnc.forEach((key, value) -> System.out.println(
                "Key : " + key  + "\t\t"  + "Value : "  + value
                ));
 
         System.out.println("*******************");
        // 2. Sorting according to alphabetical order of Keys
        System.out.println("Sorting according to "
                + "reverse alphabetical order of Keys :");
 
        mnc
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        .forEach(entry -> System.out.println(
                "Key : " + entry.getKey()  + "\t\t"  + "Value : "  + entry.getValue()
                ));

	}

}
