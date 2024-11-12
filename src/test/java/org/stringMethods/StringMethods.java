package org.stringMethods;

public class StringMethods {

	public static void main(String[] args) {
		String s = "java";
		String s1 = "selEnium";
		
		int len = s.length();
		System.out.println(len);
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		String s2 = "java";
		String s3 = "Java";
		
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);
		
		boolean startsWith = s.startsWith("a");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("M");
		System.out.println(endsWith);
		
		String up = s.toUpperCase();
		System.out.println(up);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		int index = s.lastIndexOf("a");
		System.out.println(index);
		
		boolean contains = s.contains("V");
		System.out.println(contains);
		
		String s4 = "Maven";
		String s5 = "DataDrivenaTestNg";
		
		char charAt = s4.charAt(2);
		System.out.println(charAt);
		
		String concat = s4.concat(s5);
		System.out.println(concat);
		
		String replace = s5.replace("DataDriven","ExcelDataDriven");
		System.out.println(replace);
		
		String substring = s5.substring(10);
		System.out.println(substring);
		
		String[] split = s5.split("D");
		for(String ss : split) {
			System.out.println(ss);
		}
		
		
		String s6 = "         Git      ";
		boolean empty = s6.isEmpty();
		System.out.println(empty);
		
		String trim = s6.trim();
		System.out.println(trim);
		
		String s7 = "12345";
		int int1 = Integer.parseInt(s7);
		System.out.println(int1);
		
		int a = 12345;
		String value = String.valueOf(a);
		System.out.println(value);
		
		
		
	}
}
