package com.javaPractice;

public class M_Overloading {
	
	//Duplicate methods/constructor names are allowed inside the same class, as long as their parameters count or declaration or order of parameters are different. 
	//•	method overloading
		//o	Two or more methods having the same name can be created inside a single class as long as their parameters count or declaration are different. 
	//	In this case, the methods are said to be overloaded and the concept is knows as Method overloading
		//o	Compiler error will be displayed when more than one method has the same name - Demonstrate here
		//o	Demonstrate how method overloading concept can avoid compiler error - Demonstrate here
	//•	constructor overloading
		//o	The same concept of method overloading when applied to constructors is known as constructor overloading
	//	In this case, the constructors are said to be overloaded and the concept is known as Constructor overloading

	public void methodA() {
		System.out.println("Origional Method A");
	}
	
	public void methodA(int a) {
		System.out.println("Duplicate Method A overloading");
	}

	public static void main(String[] args) {
		M_Overloading m=new M_Overloading();
		m.methodA();
		m.methodA(1);
	}

}
