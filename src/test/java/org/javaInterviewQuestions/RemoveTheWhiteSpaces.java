package org.javaInterviewQuestions;

public class RemoveTheWhiteSpaces {

	public static void main(String[] args) {
		String s = "A    m  e    e   r";
		
		String ss = s.replaceAll("\\s","");
		System.out.println(ss);
	}
}
