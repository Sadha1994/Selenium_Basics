package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Axes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("q")).sendKeys("Samsung s24");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     WebElement name = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24+ 5G (Cobalt Violet, 256 GB)']"));
	     System.out.println(name.getText());
	    		 
	     WebElement price = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24+ 5G (Cobalt Violet, 256 GB)']/../..//div[@class='Nx9bqj _4b5DiR']"));		 
	     System.out.println(price.getText()); 
	     
	     Thread.sleep(2000);
	     driver.quit();

	}

}
