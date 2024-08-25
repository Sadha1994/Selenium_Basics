package com.Learing_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Locators {
 public static void main (String []args)throws InterruptedException
 {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize(); 
     driver.get("https://www.facebook.com");
     Thread.sleep(2000);
     
     // it will find the location of webelement
     By by = By.id("email");
     WebElement emailTextField = driver.findElement(by);
     // it will enter the data into textfield
     emailTextField.sendKeys("ram@gmail.com");
     
     Thread.sleep(2000);
     //code optimizations
     driver.findElement(By.id("pass")).sendKeys("ram@12345");
     
     Thread.sleep(2000);
     driver.findElement(By.id("u_0_5_Rx")).click();
     
 }   
}
