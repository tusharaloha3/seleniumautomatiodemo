package com.javaPractice;

public class O_Modifiers {
	
	//'class' is the keyword to use to create the class in java
	//'O_Modifiers' is the class name
	//'void' is the return type
	//'main()' is the method from where the program execution starts
	//'public','static' called Modifiers
		// Types of modifiers : access modifiers and Non-access modifiers
		// Modifiers can be applied to the Class, variables and method
		// when we apply the modifiers on the above then the behavior of the Class, variables and method get changed
	
	//Access Modifiers: public, private, protected, default
	//Non-access modifiers: static, final, abstract
	
	// in above modifiers all are the java keyword but 'default' is not java keyword, if we do not provide any modifiers to Class or method then it will become default.

	//public Access Modifier
	//•	Classes/variables/methods specified with 'public' access modifier can be accessed directly by the classes which are in the same package.
	//•	Classes/variables/methods specified with 'public' access modifier can be accessed by the classes outside the package after importing the classes.

	//private Access Modifier
	//•	Java classes cannot be specified with 'private' access modifier.
	//•	variables/methods specified with 'private' access modifier can be accessed only with in the same class.

	//default Access Modifier
	//•	When no modified is specified before classes/variables/methods, then we name it as default modifier.
	//•	default means public to all the classes inside the same package and private to the classes which are outside the package.


	//protected Access Modifier
	//•	protected means public to all the classes inside the same package and private to all the classes which are outside the package except child classes 
	//•	Java classes cannot be specified with 'protected' access modifier.
	//•	While accessing the protected variables/methods outside the packages using sub-classes, we don't have to create an object to access them as they are inherited variables and methods.

	//static Non-Access Modifier
	//•	Java classes cannot be specified with 'static' non-access modifier - Demonstrate
	//•	Variables declared directly inside the class but outside the methods and are specified with 'static' modifier are known as static variables
	//•	Memory allocated to the static variables is different from the memory allocated to the instance variables - view here
	//•	static variables needs to be accessed with the help of Class name, as they belong to the Class memory - View here 
	//•	static variables are generally used to store common data, where as Object variables/Instance variables are used to store Object specific data.
	//•	static can also be used with methods
	//•	static can only access static stuff
	//o	You have to create object to overcome this

	//final Non-Access Modifier
	//•	The value of the variable cannot be changed on specifying it with final non-access modifier.
	//•	final modifier specified classes cannot be inherited/extended by other classes.
	//•	final modifier specified methods in a class cannot be overridden by its sub-classes.

	//abstract Non-Access Modifier
	//•	variables cannot be specified with 'abstract' non-access modifier.
	//•	On specifying a method with abstract modifier, we can just declare the method without implementing it.
	//•	Classes having at-least one abstract specified method must be specified as abstract
	//•	Sub-Class inheriting the Super-Class needs to implement the abstract specified methods in Super-Class.
	//o	Purpose of abstract methods - Used when the super-class don't have to implement everything, and when the sub-classes inheriting the super-class needs to implement them. 
	//•	Objects can't be created for abstract classes, we have to create a Sub-Class and access its variables/methods using Sub-Class object reference.
	
	public static void main(String[] args) {

	}

}
