package com.example.collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8InterviewQuestions {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Vidya",101,"English", 80));
		studentList.add(new Student("Anand",102,"Maths", 70));
		studentList.add(new Student("Ravi",103,"Social", 70));
		studentList.add(new Student("Teeja",105,"Science", 60));
		studentList.add(new Student("Malathi",107,"Maths", 60));
		studentList.add(new Student("Murugesan",106,"Social", 60));
		
		//1. Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t
		Map<Boolean, List<Student>> list = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage()>60));
		System.out.println(list);
		
		//2. Given a list of students, write a Java 8 code to get the names of top 3 performing students
		List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top3Students);
		
		//3. Given a list of students, how do you get the name and percentage of each student
		Map<String, Double> studentMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(studentMap);
		
		//4. Given a list of students, how do you get the subjects offered in the college
		Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(subjects);
		
		//5. Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students
		DoubleSummaryStatistics collect = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
		
		double minimumPercentage = collect.getMin();
		double maximumPercentage = collect.getMax();
		double average = collect.getAverage();
		
		//6.Get total number of students from the given list of students
		long countOfStudents = studentList.stream().count();
		
		System.out.println(countOfStudents);
		
		//7. Get the students grouped by subject from the given list of students
		Map<String, List<Student>> ListOfStudentsBasedOnSubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
		
		System.out.println(ListOfStudentsBasedOnSubject);
		
		//8. Program to illustrate the use case of flatMap() method in streams API
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		
		List<Integer> flattenedList = Stream.of(list1, list2).flatMap(listFlat -> listFlat.stream()).collect(Collectors.toList());
		
		System.out.println(flattenedList);
		
	}

}
