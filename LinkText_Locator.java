package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(5000);
	     
	     driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
