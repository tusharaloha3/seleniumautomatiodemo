package com.seleniumPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Take ScreenShots
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("ScreenShots\\Screenshot1.png"));
			
			Thread.sleep(2000);
			driver.quit();
			
	}

}
