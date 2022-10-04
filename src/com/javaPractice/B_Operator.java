package com.javaPractice;

public class B_Operator {

	public static void main(String[] args) {

		// Operators are just symbols used to perform operations on the provided data.
		
		int a=9;
		int b=5;
		
	// Arithmetic Operator: +,-,*,/,%,++,--
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("");
		System.out.println(++a);
		System.out.println(--b);
		
	// Relational Operator: ==, !=, <, >, >=, <=
		System.out.println(a==b); //false
		System.out.println(a!=b); // true
		System.out.println(a<b); // false
		System.out.println(a>b); // true
		System.out.println(a<=b); // false
		System.out.println(a>=b); // true

	 // Logical Operator: &&, ||, !
		boolean m=true, n=false, o= true, p=false;
		System.out.println("Logical && (And) Operator");
		System.out.println(m&&n); // false
		System.out.println(m&&o); // true
		System.out.println(n&&o); // false
		System.out.println(n&&p); // false
		System.out.println("Logical || (Or)  Operator");
		System.out.println(m||n); // true
		System.out.println(m||o); // true
		System.out.println(n||o); // true
		System.out.println(n||p); // false
		System.out.println("Logical ! (Not) Operator");
		System.out.println(!m); //false
		System.out.println(!n); // true

	// Assignment Operator: =, +=, -=, *=, /=, %=
		int x=5;
		x+=4; // x=x+4
		System.out.println(x); //9
		
		int y=5;
		y-=4; //y=y-4
		System.out.println(y); //1
		
		int z=5;
		z*=4; // z=z*4
		System.out.println(z); //20
		
	// Conditional Operator: ?
		int j=5, k=4;
		String l= (j>k)? "Tushar":"Patil";
		System.out.println(l);
		
		String d= (j<k)? "Tushar":"Patil";
		System.out.println(d);
		
		boolean e= (j>k)? true:false;
		System.out.println(e);

	}

}
