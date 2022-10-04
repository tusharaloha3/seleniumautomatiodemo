package com.javaPractice;

public class D_VariableDemo {
	//Type of the variable: Local, Instance, Static
	
	int b=11; //Variable outside method but inside the class is known as Instance variable.
	static int c=15;// Static variable defined with static keyword, it can be accessible anywhere inside the class

	public static void main(String[] args) {
		methodlocal();
		System.out.println(c);
	}
	
	public static void methodlocal() {
		int a=10; //Variable inside a method is known as Local variable
		// Local variable can not accessible outside the method
		System.out.println("Local variable inside the method: "+a);
	}

}
