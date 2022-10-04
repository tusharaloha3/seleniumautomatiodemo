package com.javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class S_Collection {
	// Collections Framework
	// Collection is a group of individual Objects.
	// • Array's are fixed in sized, where as Collections are grow-able in size
	// • Though Collections Framework is a vast subject, we have to only learn the
	// below for Selenium:

	public static void main(String[] args) {

		// • ArrayList
		// o ArrayList is nothing but a re-sizable array and is not of fixed size
		// o Demonstrate an ArrayList which stores integer values and uses for loop to
		// print those values.
		// o Demonstrate an ArrayList which stores different types of values and uses
		// for each loop to print those values.
		// o Assigning the object of ArrayList class to Collection / List Interface.
		// Objects stored in the order in the ArrayList and also printed in the order.
		// Indexing concept is applicable in ArrayList
		
		ArrayList<Integer> alist = new ArrayList<Integer>();

		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);

		System.out.println(alist.get(0));
		System.out.println(alist.size()); // size() is the predefined method of finding the size of ArrayList
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		for (Integer i : alist) {
			System.out.println(i);
		}
		System.out.println("===========================");

		// • HashSet
		// o Unlike ArrayList, HashSet won't have index values and hence we cannot use for loop with HashSet
		// o Unlike ArrayList, HashSet stores the values in a random order
		// o Demonstrate HashSet which stores integer type of values and uses for each loop to print those values.
		// o Assigning the object of HashSet class to Collection / Set Interface.
		// Objects will stored in the random order in the HashSet and will printed random.
		// Indexing concept is not applicable since for loop will not useful

		HashSet<String> hset = new HashSet<String>();

		hset.add("My");
		hset.add("Name");
		hset.add("is");
		hset.add("Tushar");

		for (String i : hset) {
			System.out.println(i);
		}
		System.out.println("==========================");
		
		//•	Iterator interface and iterator() method
		//o	iterator() is a predefined method of Collection interface, who's return type is Iterator interface and doesn't belong to Iterator interface, it belongs to Collection Interface.
		//o	hasNext() and next() are the predefined methods of the Iterator interface
		//o	Demonstrate using Iterator and iterator() with ArrayList.

		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); //hasNext() method check if object is available and next() method iterate to next object.
		}
		
		//o	Demonstrate using Iterator and iterator() with HashSet.
		
		Iterator<String> hst = hset.iterator();
		while(hst.hasNext()) {
			System.out.println(hst.next()); //hasNext() method check if object is available and next() method iterate to next object.
		}
		System.out.println("==========================");
		
		//•	HashMap
		//o	Instead of storing the objects as a group of Objects, HashMap stores the objects in the form of key value pairs.
		//o	Demonstrate a HashMap which stores different key value pairs and uses get() method to retrieve a value based on the provided key.
		//o	Demonstrate a HashMap which stores different key value pairs and uses for each loop to print those values.
		//put() method is use to add the values in the HashMap
		// Indexing concept is not applicable in HashMap.
		
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		
		hmap.put(101, "Tushar");
		hmap.put(102, "Prakash");
		hmap.put(103, "Patil");
		hmap.put(104, "Amrale");

		System.out.println(hmap.get(101));
		
		for(Integer i:hmap.keySet()) {
			System.out.println(hmap.get(i));
		}

	}

}
