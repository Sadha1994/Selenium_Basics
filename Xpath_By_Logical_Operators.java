package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Logical_Operators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://www.flipkart.com/");
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@class='Pke_EE' and @type='text' or @name='q']")).sendKeys("mobile");
	     
	     driver.findElement(By.xpath("//*name()='svg' and @viewBox='0 0 24 24'")).click();

	}

}
