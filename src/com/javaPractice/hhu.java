package com.javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class hhu {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://sampleapp.tricentis.com/101/");
		obj.manage().window().maximize();
		
		WebElement Automobile = obj.findElement(By.id("nav_automobile"));
		Automobile.click();
		
		WebElement Make = obj.findElement(By.id("make"));
		Select sel = new Select(Make);
		sel.selectByValue("Audi");
		
		WebElement EngPerform = obj.findElement(By.id("engineperformance"));
		EngPerform.sendKeys("1350");
		
		WebElement ManufactureDate = obj.findElement(By.id("dateofmanufacture"));
		ManufactureDate.sendKeys("05/05/2015");
		
		WebElement NomSeat = obj.findElement(By.id("numberofseats"));
		Select sel2 = new Select(NomSeat);
		sel2.selectByValue("4");
		
		WebElement Fuel = obj.findElement(By.id("fuel"));
		Select sel3 = new Select(Fuel);
		sel3.selectByValue("Petrol");
		
		WebElement Price = obj.findElement(By.xpath("//input[@id='listprice']"));
		Price.sendKeys("52000");
		
		WebElement LicenceNo = obj.findElement(By.xpath("//input[@name='License Plate Number']"));
		LicenceNo.sendKeys("MH18GH5199");
		
		WebElement Milage = obj.findElement(By.id("annualmileage"));
		Milage.sendKeys("5000");

		Thread.sleep(5000);
		obj.close();

	}

}

