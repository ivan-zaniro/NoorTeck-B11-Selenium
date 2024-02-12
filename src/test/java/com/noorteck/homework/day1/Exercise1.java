package com.noorteck.homework.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import utils.Hooks;
import utils.Hooks;




public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

 		WebElement usernameField = driver.findElement(By.name("username"));
		WebElement passwordField = driver.findElement(By.name("password"));

 		usernameField.click();
		Thread.sleep(1000);

		usernameField.sendKeys("ntk-admin");
		Thread.sleep(1000);

		passwordField.click();

		passwordField.sendKeys("Ntk-orange!admin.123");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		login.click();

		String headerText = driver.getTitle();
		
		System.out.println(headerText);
		
		tearDown();
	}

}
