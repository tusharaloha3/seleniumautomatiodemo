package com.javaPractice;

public class E_SignleDimentionalArray {

	public static void main(String[] args) {

		//•	Using Arrays, multiple values of same data type can be stored into a single variable.
	//•	Single Dimensional Array
		// Creation of array Method 1
		int a[] = new int[3]; // Declaration and creation of array
		a[0] = 2; // Assigning values to array
		a[1] = 3;
		a[2] = 4;
		
		System.out.println(a[0]); // Accessing the array element
		
		// Method 2		
		int b[] = {4,5,6,7,8,9,9}; //Declaration and creation of array and assigning values to array
		//'length' is predefined variable of Arrays 
		System.out.println("Size of array is :"+b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println("Array of index "+i+" value is :"+b[i]);
		}
		//for each loop
		// for each loop is specifically designed for array
		for(int i:b) {
			System.out.println(i);
		}
		
		// ArrayIndexOutOfBoundsException: it is a Runtime error not compile time error
		int c[] = new int[2];
		c[0]=1;
		c[1]=2;
		c[2]=3;
		c[3]=4; // when we exceeds the size of the array the we get ArrayIndexOutOfBoundsException error at runtime
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	}

}
