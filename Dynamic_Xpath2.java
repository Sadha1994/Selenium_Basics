package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://demowebshop.tricentis.com/");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../..//input[@value='Add to cart']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.className("recipient-name")).sendKeys("sadha");
	     Thread.sleep(1000);
	     driver.findElement(By.className("recipient-email")).sendKeys("sadha@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.className("sender-name")).sendKeys("sivam");
	     Thread.sleep(1000);
	     driver.findElement(By.className("sender-email")).sendKeys("sivam@gmail.com");
	     Thread.sleep(1000);
	     driver.findElement(By.className("message")).sendKeys("Enjoy the offer");
	     Thread.sleep(1000);
	     driver.findElement(By.id("add-to-cart-button-2")).click();
	     Thread.sleep(2000);
	    // driver.findElement(By.linkText("Shopping cart")).click();
	     driver.findElement(By.partialLinkText("Shopping")).click();
	     Thread.sleep(2000);
	    	     
	     driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]/../..//input[@name='removefromcart']")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	     Thread.sleep(5000);
	     driver.quit();
  
  }
}
