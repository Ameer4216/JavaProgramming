package org.javaInterviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class HowToSortTheNumber {

	public static void main(String[] args) {
		int a[] = {34,54,12,45,87,54,65,76,83,94};
		
		Set set = new TreeSet();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}
}
