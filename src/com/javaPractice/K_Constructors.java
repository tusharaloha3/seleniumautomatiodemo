package com.javaPractice;

public class K_Constructors {
	// Method and constructors looks similar
	//•	Constructors have the same name as Class name
	//•	Constructors are automatically called when an object is created for the Class
	//•	Constructors won't have any return type - Return types like void, int etc won't be available for constructors
	//•	Empty hidden Constructor will be called, when an object is created for the Class not specified with explicit constructors

	//•	Constructors simplify the initialization of variables 
	//Constructor
	public K_Constructors() {
		System.out.println("Inside the Constructors");
	}
	public static void main(String[] args) {
		K_Constructors a=new K_Constructors();
		Car_Demo bmw = new Car_Demo("SmartModel","Yellow",25000);		
		
		/*Initializing the bmw variable
		bmw.model="A Class";
		bmw.color="Red";
		bmw.cost=1000;*/
		
		//Call the Car_Demo class method using object reference
		bmw.startCar();
		bmw.stopCar();
		bmw.carDetails();
		

	}

}
