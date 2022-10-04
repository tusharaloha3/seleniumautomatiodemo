package com.javaPractice;

public class J_WrapperClass {
	//In order to use primitive data types as Objects, we have to use Wrapper Classes which help us in converting the primitive data types into objects.
	// primitive data types: byte, short, int, long, double, float, boolean, char (These are not Object Oriented)
	// Wrapper Classes: Byte, Short, Integer, Long, Double, Float, Boolean, Character (These are Object Oriented)
	// Due to Primitive Data types Java is not 100% Object Oriented programming language.
	public static void main(String[] args) {
	
		//How to convert Primitive data types values into wrapper class objects
		int a=5;
		Integer aobj=a;
		System.out.println(a);
		System.out.println(aobj);
		
	//•	String and using Wrapper classes for conversion to appropriate data type.
		String b="100";
		int bnum=Integer.parseInt(b);
		 System.out.println(bnum+15); //115
		 
		String c="true";
		boolean d=Boolean.parseBoolean(c);
		System.out.println(d); //true
		System.out.println(!d); //false
		
		
	}

}
