package com.example.collection.streams;

public class Student {

	private String name;
	private  int id;
	private String subject;
	private double percentage;

	public Student(String name, int id, String subject, double percentage) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return name + "-" + id + "-" + subject + "-" + percentage;
	}

}
