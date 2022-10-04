package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// • Actions is a predefined Class of Selenium WebDriver
		// • Actions class contain various predefined methods which can simulate Mouse
		// and Keyboard Events.

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		
		a.dragAndDrop(madrid, norway).perform();
		

		Thread.sleep(2000);
		driver.quit(); 

	}

}
