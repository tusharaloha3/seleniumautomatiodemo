package com.javaPractice;

public class N_Overriding extends Dog{
	// What is method overriding? -> Creating a duplicate method in child class same as the parent class mens overriding the method.
	// When a method in the Child class (i.e. sub-class) is duplicate of a method in Parent class (i.e. super-class), then the method in the sub-class is said to override the method in super-class.
	//•	When we create an Object for Sub-class and call the overridden method, the method in the sub-class will be called.
	//•	Even though the name of the method in the sub-class has the same name as a method in super-class, if the type of parameters or number of parameters, then the method in the sub-class will overload the method in super-class instead of overriding
	//•	Constructors cannot be overridden as the name of the constructor needs to be same as the name of the Class.

	// Overriding the Dog class method here
	public void eat() {
		System.out.println("Override Method Dog is Eating");
	}
	public void sleep() {
		System.out.println("Override Method Dog is Sleeping");
	}
	public void bark() {
		System.out.println("Override Method Dog is Barking");
	}

}

// Difference between Overloading and Overriding

// Overloading can be happen within the same class by creating duplicate method but providing different parameters, parameters type and their sequence.
// for Overriding we need to extend the parent class and we can override the same method of parent class in child class.

// Overloading method can be happen within the same class(Vertical Overloading) and we can also overload the method in child class(Horizontal Overloading).

//When the child class object assign to the parent class then only parent class variables and method can be access.
// Dog d = new Pug(); here Dog is the parent class and Pug is the child class.




