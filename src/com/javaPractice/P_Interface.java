package com.javaPractice;

public interface P_Interface {
	//If we want to define only high level structure then we should go with the interface.
	//Interface keyword is use to create interface.
	//The purpose of an interface is to just to declare all the functionalities required before actually implementing them.
	//Interface is the No implementation at all.
	//•	Interfaces looks similar to Classes and are extensions of abstract classes
	//•	Create an interface say 'Bank' in Eclipse IDE and create variables & methods inside it as shown here
	//•	Variables in the interfaces are of static and final type
	//•	In abstract classes, we can have both methods (i.e. implemented and non-implemented), where as in interfaces, we cannot implement any methods. 
	//•	Classes use implements keyword to implement any interface.
	//•	Classes implementing an interface can have their own specific methods apart from methods which are acquired from an interface.
	//•	Objects cannot be created for an interface.
	//•	Object can be created for the Classes which are implementing the interfaces, for accessing interface defined methods and class specific methods.
	//•	Follow the below steps to provide the access the interface specific methods and not to access the class specific methods
	//o	Create an object for the Class which is implementing the interface
	//o	Assign the object of the class to the interface reference variable
	//o	Using the interface reference variables, we can now access only the methods which are declared in the interface.

	String ACCOUNTTYPEONE="Saving";	//by default variable inside the interface are 'static and final' type thats why we have to initialize them.
	String ACCOUNTTYPETWO="Current"; //we can't create variable without initializing them. we cannot create instance variables inside interface.
	int a=5; // it belongs to the interface memory
	
	public void viewAccountBalance(); //By defaults the method are abstract type inside the interface, we cannot specify body of the method.
	
	public void transferFuns();
	
	public void openFixDeposite();
	
	
}
