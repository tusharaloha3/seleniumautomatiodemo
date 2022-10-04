package com.javaPractice;

import java.io.File;
import java.io.FileReader;



public class Q_ExceptionHandling {

	//Exception is nothing but an error which is occurred during runtime i.e. during program execution
	//•	If an exception has occurred during program execution at any step, the steps which are after the exception wont be executed.

	//try catch blocks 
	//•	We can handle the exceptions using the try catch blocks 
	//o	Handling the exceptions is known as Exception Handling
	//o	In the below Syntax 'Exception' is the Class name and 'e' is the object reference which can catch the exception (i.e. object) thrown from try block


	public static void main(String[] args) {

		try {
			int a=10/0; //Unchecked Exceptions
		}catch(Exception e){
			System.out.println("Reason for the excepation is:" +e.getMessage());
			e.printStackTrace();
		}
	}
	//•	Exception class is the parent class of all the Exception Classes like ArithmeticException and ArrayIndexOutOfBoundsException classes and can handle them.
	//•	Throwable class is the grant parent class of all the Exception Classes like ArithmeticException and ArrayIndexOutOfBoundsException classes and can handle them.

	//Exceptions have twi types i.e. Checked Exceptions and Unchecked Exceptions.
	//•	Unchecked exceptions are the exceptions that are not checked by compiler and will occur only during execution - Demonstrate AirthmeticException
	//•	Checked Exceptions are the exceptions that are checked by the compiler - Demonstrate FileNotFoundException
	//•	Handling Checked Exceptions using try .. catch block 
	//•	Ignoring Checked Exceptions using throws keyword 
	
	//Checked Exception
	File file=new File("C:\\Users\\tushp\\OneDrive\\Introduction.txt"); //Representation of File in Java
	
	

}

