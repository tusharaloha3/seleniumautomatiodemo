package com.javaPractice;

public class L_Inheritance extends Dog {

	//• Inheritance is a mechanism in which one class acquires the properties(i.e. variables and methods) of another class
	//•	The purpose of this Inheritance is to use the properties (i.e. methods and variables) inside a class instead of recreating the same properties again in new class.
	//•	Child class acquires the properties (i.e. variables and methods) of Parent Class. 
	//•	Child class uses 'extends' keyword to inherit the properties from parent class
	
	String cutenesslevel;
	
	public void bite() {
		System.out.println("Inherited Dog Class bites");
		eat();
		sleep();
		bark();
	}
	
	public static void main(String args[]) {
		L_Inheritance i=new L_Inheritance();
		i.breed="Sheapord";
		i.color="Black";
		i.size="Big";
		i.bite();
	}
}
