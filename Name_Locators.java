package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.name("email")).sendKeys("ram@gmail.com");
	     driver.findElement(By.name("pass")).sendKeys("ram@12345");
	     Thread.sleep(2000);
	     driver.findElement(By.name("login")).click();
	     driver.quit();
	     
	     driver.get("https://www.instagram.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.name("username")).sendKeys("ram@gmail.com");
	     driver.findElement(By.name("pass")).sendKeys("ram@12345");
	     Thread.sleep(2000);
	     driver.findElement(By.name("login")).click();
	     

	}

}
