package com.collection.set.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main (String [] args) {
		
		Set<String> setExample = new LinkedHashSet<String>();
		
		setExample.add("Harsha");
		setExample.add("Vidya");
		setExample.add("Dhivya");
		setExample.add("Ravi");
		setExample.add("Sairam");
		
		for(String name : setExample) {
			System.out.println(name);
		}
		
	}

}
