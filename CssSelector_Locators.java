package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://www.instagram.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.cssSelector("[type='text']")).sendKeys("sadhaua94@gmail.com");
	     driver.findElement(By.cssSelector("[name='password']")).sendKeys("Sivam@1994");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}
