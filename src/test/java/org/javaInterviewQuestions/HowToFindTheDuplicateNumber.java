package org.javaInterviewQuestions;

public class HowToFindTheDuplicateNumber {

	public static void main(String[] args) {
		int a[] = {34,54,12,45,87,54,45,76,87,94};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
				//i=0,0<10=true
				//j=1,i<10
				//a[0]=34,a[1]=54=34>54
				//j=2,i<10
				//a[0]=34,a[2]=54=34>54
			}
		}
		
	}
}
