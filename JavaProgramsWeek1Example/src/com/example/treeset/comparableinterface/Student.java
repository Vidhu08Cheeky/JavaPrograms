package com.example.treeset.comparableinterface;

public class Student implements Comparable<Student>{

	Integer marks;

    Student(Integer marks) {
        this.marks = marks;
    }
    
    // override toString method
    public String toString() {
        return (" " + this.marks);
    }  
    
	@Override
	public int compareTo(Student stu) {
		return this.marks.compareTo(stu.marks);
	}

}
