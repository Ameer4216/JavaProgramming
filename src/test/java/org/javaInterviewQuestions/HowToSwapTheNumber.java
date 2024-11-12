package org.javaInterviewQuestions;

public class HowToSwapTheNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//output : a=20,b=10
		int t;
		t=b;
		b=a;
		a=t;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
