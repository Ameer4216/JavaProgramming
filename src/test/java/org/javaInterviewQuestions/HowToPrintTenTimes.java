package org.javaInterviewQuestions;

public class HowToPrintTenTimes {

	public static void main() {
		String s = "Ameer";

		for (int i = 1; i <= 10; i++) {
			System.out.println(s);
		}
	}

	public static void mains() {

		for (int i = 1001; i <= 1020; i++) {
			System.out.println(i);
		}

	}

	public static void mainss() {
		for (int i = 1020; i >= 1000; i--) {
			System.out.println(i);
		}
	}

	public static void mains1() {
		// 1 2 3 4 5 1 1 1 1 1
		// 1 2 3 4 5 2 2 2 2 2
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void mains2() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void mains3() {

		//* * * * *
		//* * * *
		//* * *
		//* *
		//*
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void mains4() {

		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void mains5() {

		//A A A A A
		//B B B B
		//C C C
		//D D
		//E
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = i; j <= 'E'; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void mains6() {

		//A 
		//B B 
		//C C C
		//D D D D
		//E E E E E
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			//i=A,j=A A=A 		A
			//j=B,i<=A B<=A 
			//i=B,B<=E
			//j=A,A<=B			B	B
			//j=B,B<=B 
		}
	}

	public static void main(String[] args) {
		mains6();
	}
}
