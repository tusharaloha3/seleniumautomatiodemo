package com.javaPractice;

public class G_MethodDemo {
	
	//In Java programming, programming logic needs to be written inside methods.
	//main() method is a method where the program execution starts and we can write programming logic inside the main() method 
	// Method name start with small letter

	public static void main(String[] args) {
		methodOne(); //Method Calling Statement
		methodTwo(1);
		methodThree(1, 2.6);
		int result = addMethod(5,6);
		System.out.println("Sum of addMethod is : "+result);

	}
	public static void methodOne() {
		System.out.println("Inside the Method One");
	}
	public static void methodTwo(int a) {
		System.out.println("Inside the Method Two Parameter Value is:"+a);
	}
	public static void methodThree(int a, double b) {
		System.out.println("Inside the Method Three Parameter Interger Value is:"+a);
		System.out.println("Inside the Method Three Parameter DoubleValue is:"+b);
	}

	//•	Demonstrate returning the values back to the calling methods 
	// Void means return nothing from method o/p.
	// If we specify return type of the method then method return the output
	
	public static int addMethod(int a, int b) {
		int sum= a+b;
		return sum;
	}
	
}
