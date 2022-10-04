package com.javaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebtestingFacebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		obj.findElement(By.xpath("//a[@id='u_0_0_0e']")).click();
		Thread.sleep(8000);
		
		WebElement FName = obj.findElement(By.xpath("//input[@name='firstname']"));
		FName.sendKeys("Tushar");
		
		WebElement SName = obj.findElement(By.xpath("//input[@name='lastname']"));
		SName.sendKeys("Patil");
		
		WebElement Mobile = obj.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobile.sendKeys("7219732334");
		
		WebElement Pass = obj.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Pass.sendKeys("Abcd@123");
		
		
		WebElement day = obj.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("2");
		
		WebElement Month = obj.findElement(By.id("month"));
		Select sel2 = new Select(Month);
		sel2.selectByIndex(5);
		
		WebElement Year = obj.findElement(By.id("year"));
		Select sel3 = new Select(Year);
		sel3.selectByVisibleText("1996");
		
		WebElement Gender = obj.findElement(By.xpath("//input[@id='u_1_5']"));
		Gender.click();
		
		
		Thread.sleep(3000);
		obj.close();
	}
	

}

