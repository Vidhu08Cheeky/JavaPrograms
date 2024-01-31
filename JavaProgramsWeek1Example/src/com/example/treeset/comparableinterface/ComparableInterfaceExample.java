package com.example.treeset.comparableinterface;

import java.util.TreeSet;

public class ComparableInterfaceExample {

	public static void main(String[] args) {
		// New TreeSet
        TreeSet<Student> set = new TreeSet<>();
 
        // Adding elements to the set
        set.add(new Student(500));
        set.add(new Student(300));
        set.add(new Student(400));
        set.add(new Student(100));
        set.add(new Student(200));
 
        // Print TreeSet sorted in ascending order
        System.out.println("Sort elements in ascending order : " + set);
	}

}
