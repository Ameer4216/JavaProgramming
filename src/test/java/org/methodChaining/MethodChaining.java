package org.methodChaining;

public class MethodChaining {
//driver.manage().window().maximize();
	
	public Windows manage() {
		return new Windows();
	}
	public static void main(String[] args) {
		MethodChaining driver = new MethodChaining();
		driver.manage().window().maximize();
	}
}
