package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		/*
		•	Unlike alerts, frames or windows, we need not switch to Lightbox for performing operations.
			o	http://omayo.blogspot.com/p/lightbox.html
		•	Light boxes are part of the same HTML web page only.
		•	Demonstrate a program which handles the light box - Demonstrate here
			o	Hence it is not required to switch to the lightbox for performing operations on it.
		•	Real time examples for Light-box 
			o	https://www.flipkart.com/
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lightbox1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		Thread.sleep(3000);

		driver.quit();
		
	}

}
