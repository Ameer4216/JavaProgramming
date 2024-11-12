package org.javaInterviewQuestions;

import java.util.Arrays;

public class HowToSortTheString2 {

	public static void main(String[] args) {
		String[] s = {"Ball","Cat","Apple","Eagle","Dog"};
		
		Arrays.sort(s);
		
		for(String ss : s) {
			System.out.print(ss+",");
		}
	}
}
