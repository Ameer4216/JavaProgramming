package org.javaInterviewQuestions;

public class RemoveTheSpecialCharacter {

	public static void main(String[] args) {
		String s = "@A#m$e5443%e^r&";
		
		String ss = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(ss);
	}
}
