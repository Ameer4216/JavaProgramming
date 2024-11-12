package org.javaInterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HowToRemoveTheDuplicateString {

	public static void main(String[] args) {
		String[] s = {"Ball","Apple","Apple","Cat","Ball"};
		
		List list = new ArrayList();
		list.add("Ball");
		list.add("Eat");
		list.add("Apple");
		list.add("Cat");
		list.add("Dog");
		
		Set set = new TreeSet(list);
		List list1 = new ArrayList(set);
		System.out.println(list1);
	}
}
