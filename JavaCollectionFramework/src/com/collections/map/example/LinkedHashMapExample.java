package com.collections.map.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// LinkedHashMap is just like HashMap with the additional feature of maintaining an order of elements inserted into it. 
		//HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion 
		//which the LinkedHashMap provides where the elements can be accessed in their insertion order.
		
		 // Creating an empty LinkedHashMap 
        Map<String, Integer> map = new LinkedHashMap<>(); 
  
        // Inserting pair entries in above Map 
        // using put() method 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        // Iterating over Map 
        for (Map.Entry<String, Integer> e : map.entrySet()) 
  
            // Printing key-value pairs 
            System.out.println(e.getKey() + " "+ e.getValue()); 
    

	}

}
