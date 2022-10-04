package com.javaPractice;

public class F_TwoDimentionalArray {

	public static void main(String[] args) {

		int [][] a=new int[2][3];
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		for(int row=0;row<a.length; row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.println(a[row][col]);
			}
		}
		System.out.println("=================================");
		
		int [][] b= {{1,2,3},{4,5,6}};
		System.out.println("No of Rows in Array:"+b.length);
		System.out.println("No of Columns in Array:"+b[0].length);
		
		// Disadvantages of Array: 1. Fixed in Size, 2. Cannot store different types of literals into a single variable
		// To overcome the above, we have a array of object type, in which we can store different types of data.
		System.out.println("=================================");
		
		Object[] c= {1, 't', 1.23, "Tushar", true};
		for(int row=0;row<c.length; row++) {
				System.out.println(c[row]);
			}
	}

}
