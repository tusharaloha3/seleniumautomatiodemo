package com.javaPractice;

public class H_ClassDemo {
	//•	Class encloses variables and methods. Class means real word entity
	//•	Class is a template used for creating Objects
	// Instance and Static Variable which are outside the method can be called as Global variable.
	// Global variable can be access thorough the class
	// Static method can be access only statics stuff, Non-static method can access static and non-static stuff.
	// Object should not be created outside the method.
	public static void main(String[] args) {
		Car_Demo bmw=new Car_Demo("SmartModel","Yellow",25000); //Object creation statement. bmw = Object reference/ Car_Demo class type
		Car_Demo maruti=new Car_Demo("SmartModel","Yellow",25000);
		Car_Demo benz=new Car_Demo("SmartModel","Yellow",25000);
		
		//In above Object creation statement
		// Car_Demo = Class
		// bmw = Reference Variable (Refers to the Car class object created by new operator)
		// new = it is operator used for creating object by allocating memory
		// Car_Demo() = Constructor.
		
		//Initializing the Object variable	
		maruti.model="Swift VDI";
		maruti.cost=800000;
		maruti.color="Red";
		//Call the Car_Demo class method using object reference
		maruti.startCar();
		maruti.stopCar();
		maruti.carDetails();
		
		benz.model="A Class";
		benz.cost=3500000;
		benz.color="Black";
		benz.startCar();
		benz.stopCar();
		benz.carDetails();
		
		bmw.model="Classic";
		bmw.cost=4000000;
		bmw.color="Blue";
		bmw.startCar();
		bmw.stopCar();
		bmw.carDetails();

	}

}
