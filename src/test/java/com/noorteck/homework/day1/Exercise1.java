package com.noorteck.homework.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import utils.Hooks;
//import utils.Hooks;
import utils.HooksChrome;




public class Exercise1 extends HooksChrome  {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
 		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
 		
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

 		usernameField.click();
		

		usernameField.sendKeys("ntk-admin");
		Thread.sleep(2000);

		passwordField.click();

		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		login.click();
		Thread.sleep(2000);
		String headerText = driver.getTitle();
		
		System.out.println(headerText);
		
		tearDown();
	}
 
}
