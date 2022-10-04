package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	/*
	 	•	Demonstrate the problem statement 
			o	'NoSuchElementException' will be displayed on trying to find the web element which is displayed in an iframe 
			o	Enter text into a text field inside the iframe page
		•	Frame is a web page which is embedded in another web page, and is used to display multiple pages inside a single web page. 
			o	Developers can also embedded a document to be scrolled inside a frame
		•	In HTML, <iframe> is the tag used by the Web Developers to display any Frame on the Page. 
		•	View the iframes in www.omayo.blogspot.com page - Right click on the frames and observe that 'This Frame' option will be displayed
		•	Switch to the required frame and perform operations (View code here)
			o	First switch to a frame and enter text into text field inside frame - Using switchTo().frame(WebElementOfFrame)
			o	Switch back to the main page using switchTo().defaultContent()  and type text into the 'Search' text box field
		•	Finding the number of frames available on the page
			o	System.out.println(driver.findElements(By.tagName("iframe")).size());
	 */

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To know how many frames available on the page.
		System.out.println(driver.findElements(By.tagName("Iframe")).size());
		
		
		//How to Handle frame
		WebElement ifrme2 = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(ifrme2);
		
		driver.findElement(By.id("q")).sendKeys("Tushar Patil");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);

		driver.quit();
	}

}
