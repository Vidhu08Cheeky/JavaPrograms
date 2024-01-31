package com.collection.set.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<Integer> treeSetExample = new TreeSet<Integer>();
		
		treeSetExample.add(101);
		treeSetExample.add(501);
		treeSetExample.add(202);
		treeSetExample.add(400);
		treeSetExample.add(200);
		
		for(Integer numbers : treeSetExample) {
			System.out.println(numbers);
		}

	}

}
