package org.javaInterviewQuestions;

public class HowManyWordsAvailableInThisString {

	public static void main(String[] args) {
		String s = "Hi Kumaran How are You?";
		int count = 0;
		String[] split = s.split(" ");
		
		for(String ss : split) {
			count++;
			System.out.println(ss);
		}
		System.out.println(count);
	}
}
