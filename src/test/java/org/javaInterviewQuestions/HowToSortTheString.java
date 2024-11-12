package org.javaInterviewQuestions;

public class HowToSortTheString {

	public static void main(String[] args) {
		String[] s = {"Ball","Cat","Apple","Eagle","Dog"};
		String temp;
		for(int i=0; i<s.length-1; i++) {
			for(int j=0; j<s.length-1-i; j++) {
				if(s[j].compareTo(s[j+1])>0) {
					//s[j]=0
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(String ss : s) {
			System.out.print(ss+",");
		}
		
	}
}
