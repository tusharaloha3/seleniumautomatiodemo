package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\geckodriver.exe");

		//WebDriver driverF = new FirefoxDriver();
		WebDriver driver = new ChromeDriver(); //here created an object for ChromeDriver class where ChromeDriver() is constructor.
		//ChromeDriver is a predefined class of Selenium WebDriver Library.
		//'driver' is the object reference of WebDriver where WebDriver is an interface in Selenium.
		//ChromeDriver is the child class of WebDriver interface.

		//Selenium WebDriver is an API, which contains a set of predefined library of commands / methods.
		//•	get() - Used to open the specified URL's web page or we can aslo use 'navigate().to()' to navigate to the page.
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("confirm")).click();//•click() - Used to perform click operation on different UI elements like Button, link, checkbox option and radio option etc 
		//driver.findElement(By.name("q")).sendKeys("Tushar Patil");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("compendiumdev")).click();
		Thread.sleep(5000);
		String Curl = driver.getCurrentUrl();
		System.out.println(Curl);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
