package com.javaPractice;

public class Car_Demo {
	//•	Class is a template used for creating Objects
	// Declaration of variable
	String color;
	String model;
	int cost;
	double milage;
	static int wheel=4; //common variable for all car's so we can make it static
	
	//Constructor Creation
	//Constructor Simplifying the process of Initialization
	// color, model, cost are the parameterized variable.
	public Car_Demo(String color, String model, int cost) {
	//The purpose of the this keyword is to differentiate the instance variable with the parameterized variables of methods/constructors. 
	//Generally required for constructors, as constructors are automatically called when objects are created and there by all the required variables will be initialized automatically.
		this.color=color;
		this.model=model;
		this.cost=cost;
	}


	public void startCar() {
		System.out.println(model + " car started");
	}

	public void stopCar() {
		System.out.println(model + " car stopped");
	}

	public void carDetails() {
		System.out.println("Car model " + model);
		System.out.println("Car cost " + cost);
		System.out.println("Car color " + color);
		System.out.println("--------------");
	}

}
