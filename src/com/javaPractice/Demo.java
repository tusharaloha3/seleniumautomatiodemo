package com.javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushp\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://demo.automationtesting.in/");
		obj.manage().window().maximize();
		
		//Skip Signin
		obj.findElement(By.id("btn2")).click();
		
		WebElement FName = obj.findElement(By.xpath("//input[@ng-model='FirstName']"));
		FName.sendKeys("Tushar");
		
		WebElement LName = obj.findElement(By.xpath("//input[@ng-model='LastName']"));
		LName.sendKeys("Patil");
		
		WebElement Text = obj.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Text.sendKeys("8, Dattkrupa, Vikas Mitra Mandal Chauk, Karve Nagar, Pune, 411052");
		
		WebElement Email = obj.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		Email.sendKeys("tusharpatil@gmail.com");
		
		WebElement Phone = obj.findElement(By.xpath("//input[@ng-model='Phone']"));
		Phone.sendKeys("7519732334");
		
		WebElement Gender = obj.findElement(By.xpath("//input[@value='Male']"));
		Gender.click();
		
		//Hobbies
		obj.findElement(By.id("checkbox1")).click();
		obj.findElement(By.id("checkbox2")).click();
		obj.findElement(By.id("checkbox3")).click();
		
		/*WebElement Language = obj.findElement(By.xpath(""//ul/li[@class='ng-scope']""));
		Select sel = new Select(Language);
		sel.selectByVisibleText("Arabic");*/
		
		WebElement Skill = obj.findElement(By.id("Skills"));
		Select Sel1 = new Select(Skill);
		Sel1.selectByVisibleText("Python");
		
		WebElement Country = obj.findElement(By.id("countries"));
		Select Sel2 = new Select(Country);
		Sel2.selectByVisibleText("India");
		
		/*WebElement Country2 = obj.findElement(By.xpath("//span[@id='select2-country-container']"));
		Select Sel3 = new Select(Country2);
		Sel3.selectByVisibleText("India");*/
		
		WebElement Year = obj.findElement(By.id("yearbox"));
		Select Sel4 = new Select(Year);
		Sel4.selectByVisibleText("1996");
		
		WebElement Month = obj.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
		Select Sel5 = new Select(Month);
		Sel5.selectByValue("May");
		
		WebElement Day = obj.findElement(By.id("daybox"));
		Select Sel6 = new Select(Day);
		Sel6.selectByValue("2");
		
		WebElement Password = obj.findElement(By.id("firstpassword"));
		Password.sendKeys("Absd1234");
		
		WebElement Pass2 = obj.findElement(By.id("secondpassword"));
		Pass2.sendKeys("Absd1234");
			
		/*WebElement Img = obj.findElement(By.xpath("//input[@id='imagesrc']"));
		Img.click();*/
		
		WebElement Submit = obj.findElement(By.id("submitbtn"));
		Submit.click();
		
		Thread.sleep(3000);
		obj.close();
	}

}

