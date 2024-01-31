package com.example.treeset.comparatorinterface;

import java.util.TreeSet;

public class ComparatorInterfaceExample {

	public static void main(String[] args) {
		TreeSet<Student> marks = new TreeSet<Student>(new MarksComparator());
        
		marks.add(new Student(450,"Sam"));
		marks.add(new Student(341,"Ronaldo"));
		marks.add(new Student(134,"Daniel"));
		marks.add(new Student(590,"George"));
         
        System.out.println("increasing Order with the Marks");
        
     // Printing the TreeSet elements 
        for(Student mark: marks)
        {
            System.out.print(mark.getName()+" "+mark.getMarks());
            System.out.println();
        }
        
        TreeSet<Student> names = new TreeSet<Student>(new NameComparator());
        
        names.add(new Student(450,"Sam"));
        names.add(new Student(341,"Ronaldo"));
        names.add(new Student(134,"Daniel"));
        names.add(new Student(590,"George"));
         
        System.out.println();
        System.out.println("increasing Order with the names");
        
        for(Student name : names) 
        {
            System.out.print(name.getName() +" "+ name.getMarks());
            System.out.println();
        }

	}

}
