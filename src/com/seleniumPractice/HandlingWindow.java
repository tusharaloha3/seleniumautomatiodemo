package com.seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		//�	WebDriver interface has two predefined methods getWindowHandles() and switchTo() , which helps us in handling multiple browser windows. 
		//�	getWindowHandles() - Used to retrieve all the ids of the currently opened windows (Windows can be popup-windows, windows opened in new tabs etc) - Demonstrate here
		//�	switchTo() - Used to switch between different windows when multiple windows are opened by using the ids of the currently opened windows which are returned by getWindowHandles() - Demonstrate here
		//o	Syntax: switchTo().window("Retrieved Window ID");

		WebDriver driver = new ChromeDriver(); 

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		
		/*while(itr.hasNext()) {
			String windowID = itr.next();
			System.out.println(windowID);
		}*/
		String mainwindowID = itr.next();
		String childwindowID = itr.next();
		
		driver.switchTo().window(childwindowID);
		String para = driver.findElement(By.id("para1")).getText();
		System.out.println(para);
		driver.close();
		
		driver.switchTo().window(mainwindowID);
		System.out.println("Tushar Updated the code for push into the github");
		Thread.sleep(3000);
		driver.quit();
	}

}
