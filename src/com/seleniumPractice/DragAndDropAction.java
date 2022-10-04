package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// • Actions is a predefined Class of Selenium WebDriver
		// • Actions class contain various predefined methods which can simulate Mouse
		// and Keyboard Events.

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement minprice = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		WebElement ReadThisText = driver.findElement(By.xpath("//input[@id='rotb']"));
		
		WebElement SeleniumTutorial = driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(minprice, 100, 0).perform();
		Thread.sleep(2000);
		a.dragAndDropBy(minprice, -200, 0).perform();
		Thread.sleep(2000);		
		a.contextClick(minprice).perform();//right click operation on element
		Thread.sleep(2000);		
		a.doubleClick(ReadThisText).perform();
		Thread.sleep(2000);		
		a.keyDown(Keys.CONTROL).click(SeleniumTutorial).keyUp(Keys.CONTROL).build().perform();
		
		
		Thread.sleep(2000);
		driver.quit(); 

	}

}
