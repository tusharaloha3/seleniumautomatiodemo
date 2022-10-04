package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//•	Actions is a predefined Class of Selenium WebDriver
		//•	Actions class contain various predefined methods which can simulate Mouse and Keyboard Events.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("blogsmenu"))).perform();
		WebElement selenium123 = driver.findElement(By.xpath("//span[contains(text(),'Selenium143')]"));
		a.moveToElement(selenium123).click(selenium123).build().perform();

	}

}
