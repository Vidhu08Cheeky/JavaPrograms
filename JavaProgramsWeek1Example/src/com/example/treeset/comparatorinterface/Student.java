package com.example.treeset.comparatorinterface;

public class Student {
	
	private int marks;
    private String name;
   
    // constructor
    public Student(int value, String name) 
    {
        this.marks=value;
        this.name=name;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
     
    public int getMarks() 
    {
        return marks;
    }

}
