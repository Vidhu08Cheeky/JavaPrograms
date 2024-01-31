package com.collections.map.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingAMapUsingIterator {

	public static void main(String[] args) {
		// Creating an empty HashMap 
        Map<String, Integer> hm   = new HashMap<String, Integer>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", 100); 
        hm.put("b", 200); 
        hm.put("c", 300); 
        hm.put("d", 400); 
        
      //transform map to set
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        
        //Declare an Iterator
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        
        System.out.println("The map entries are:");
        System.out.println("        KEY     VALUE");
        
        //iterate and print key and value pairs.
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
        }

	}

}
