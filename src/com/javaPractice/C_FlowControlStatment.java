package com.javaPractice;

public class C_FlowControlStatment {

	public static void main(String[] args) {
		// Flow Control describes the order in which statements will be executed at run time.
		// There are different types of flow control statements and can be categorized as:
		// 1. Selection Statements, 2. Iterative Statement, 3. Transfer Statement.

		// Selection Statement: 1)if, 2)if..else, 3)if..else if..else, 4)Switch.
		// Selection Statements have one or more conditions which return either true or false when evaluated.
		// Based on the returned value, the set of code will be executed.
		// • When condition is true, the set of code will be executed.
		// • When condition is false, the set of code won’t be executed.

		int a = 10, b = 9;
		if (a > b) {
			System.out.println("Inside the if block");
			int m = 10, n = 15;
			if (m > n) {
				System.out.println("Inside the if block");
			} else {
				System.out.println("Inside the else block");
				int x = 11, y = 12, c = 13, d = 14;
				if (x > y) {
					System.out.println("Inside if block");
				} else if (y > c) {
					System.out.println("Inside the first else if block");
				} else if (c > d) {
					System.out.println("Inside the Second else if block");
				} else {
					System.out.println("Inside the else block        ");
				}
			}
		}
		// Switch Statement
		// Based on result of a condition expression, switch case chooses one of many possibilities.

		int f = 2;
		switch (f) {
		case 0:
			System.out.println("Inside Case 0");
			break;
		case 1:
			System.out.println("Inside case 1");
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
		default:
			System.out.println("Inside default case");
		}
		// Iterative Statements
		// Iterative Statements helps us in executing the same block of code multiple times.
		// Iterative Statements executes the same set of code until the loop condition is satisfied.

		// 1.While loop
		// •while loop executes the same block of code multiple times i.e. until the Boolean condition turns false.
		// •while loop tests the condition before executing the code in loop body.

		int i = 0;
		{
			while (i < 5) {
				System.out.println("Inside the While loop value of i is: " + i);
				i++;
			}
		}
	}
}
