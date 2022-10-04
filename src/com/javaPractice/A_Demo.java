package com.javaPractice;

// In Java programs, we have to enclose everything inside a Class.
// "Class" keyword use to define a Class in Java
public class A_Demo {
	//In Java programs, execution starts from the main method
	public static void main(String[] args) {
		// All the Java statements in Java should end with ';' symbol
		// All the Java statements should be written inside the methods
		// Complier Errors will be displayed when we make syntax mistakes in the Java Code
		// Print statements in Java are used to print the program output to the console
		System.out.println("Hello Tushar"); // This statement print every word on New line
		System.out.print("TUshar Prakash Patil"); // This statement print every word on same line
		System.out.println("QA Analyst");
// Comments provided in a Java program won't be executed and are generally used to explain the underlined code.
	
// Variables, Data Types, Operators and Literals
	// In order to store the data in Java programs, we need to use Variables, Data Types, operators and Literals.
	//These  are nothing but the Building blocks in JAVA
		int a = 5;
		// int= Data Type, a= Variable, '='= Assignment operator, 5= Literal
		// Variable is a name provided to a reserved memory location.
		// We can define the variables with different Data types, based on the type of data to be stored.
		// Data Types: byte, short, int, long, double, float, boolean, char
			//Data types are further divided in two types: Primitive and Non-Primitive
			// Primitive: byte, short, int, long, double, float, boolean, char
			// Non-Primitive: Array, String
		// String is not a data type in Java, String is a predefined class in Java
	// We can’t create a duplicate variable in java, but we can defined it again. 
		int b=10;
		b=11;
		System.out.println(a);
		System.out.println(b);
	}

}
