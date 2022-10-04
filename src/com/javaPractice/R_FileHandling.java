package com.javaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class R_FileHandling {
	//Handling Files
	//The purpose of handling files in Selenium is to read the text from the Files.

	//•	File is a predefined Class in Java
	//o	Absolute Path
	//o	Shortcut Path
	//o	Finding the absolute path

	public static void main(String[] args) throws IOException {
		//Representation of File
		File file=new File("Files\\Introduction.txt");//Path is hard coded here i.e. Absolute Path
		//File file=new File("Introduction.txt");//Path is Shortcut Path here if the file available directly inside the project.

		if(file.exists()) {
			System.out.println("File is exist at the given location");
			System.out.println(file.getAbsolutePath());
		}
		else {
			System.out.println("File is not available at the given location");
		}
		//•	Read a File in Java and print every line in the file to the output console
			//o	FileReader 
			//o	BufferedReader
				//	readLine() method is available inside the BufferedReader class
		//•	Optimize the reading and printing from a File using while loop

		FileReader fr = new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());//This will read only first line
		//To read all the line from text file.
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();//the br file was open so need to close that else it will show yellow alert.
		
	}

}
