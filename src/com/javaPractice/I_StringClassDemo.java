package com.javaPractice;

public class I_StringClassDemo {
	//String is not a data type, instead it is a predefined class in Java Class Library

	public static void main(String[] args) {
		//•	Actual Representation of String.
		String s = new String("Tushar patil");
		//•	Shortcut Representation of String.
		String t = " Qa Analyst";
		// Concatenation of string
		String info=s+t;
		System.out.println(info);
		System.out.println("=============================================");
		//=================================================================
		//We should not use == operator for string comparison instead we have predefined method for string comparison
		String FName="Tushar";
		String LName="Patil";
		String Job="DoingJobAsQAAnalyst";		
		//•	Using equals() method to compare two strings - Demonstrate here
		System.out.println("Tushar".equals(FName));//True
		System.out.println("Tushar".equals(LName));//False
		System.out.println(FName.equals(LName));// False

		//•	Using length() method to find the length of String literal text - Demonstrate here
		System.out.println(FName.length());
		
		//•	Using substring() method to retrieve the portion from the actual String text - Demonstrate here
		System.out.println(Job.substring(10)); //QAAnalyst
		System.out.println(Job.substring(5, 8)); //Job
		
		//•	Using trim() to remove the spaces before and after the string text - Demonstrate here
		String name="    Tushar    ";
		System.out.println(name.trim());//Tushar
		
		//•	Using indexOf() to check whether the provided text is in the provided paragraph. - Demonstrate here
		String para="Tushar Patil doing Job As QA Analyst";
		System.out.println(para.indexOf("P")); //7
		System.out.println(para.indexOf("Z")); //-1, If the string value not available then it return -1
		System.out.println(para.indexOf("Patil")); //7, Returns starting index of string
		
		//•	Using split() method to split the text into different parts based on the provided text, symbol or space. 
		String para2= "TusharPatildoingJobAsQAAnalyst";
		String[] a=para2.split(" ");
		
		for(String i:a) {
			System.out.println(i);
		}
	}

}
