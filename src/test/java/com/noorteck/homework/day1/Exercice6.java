package com.noorteck.homework.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.HooksChrome;

public class Exercice6 extends HooksChrome {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("Alerts")) {
			System.out.println("Page title is correct: " + pageTitle);
		}else {
			System.out.println("Page title is not correct: " + pageTitle);
		}
		
		WebElement alertWithTextbox = driver.findElement(By.xpath( "//a[text() = 'Alert with Textbox ']"));
		alertWithTextbox.click();
		
		WebElement clickPromptBox = driver.findElement(By.cssSelector("button[class='btn btn-info']" ));
		clickPromptBox.click();
		
		Alert alertObj = driver.switchTo().alert();
		
		String text = alertObj.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		alertObj.sendKeys("Ivan");
		
		alertObj.accept();
		
		WebElement verifyText = driver.findElement(By.id("demo1"));
		String verifyStr = verifyText.getText();
		System.out.println("****************" + verifyStr + "****************");
		
		if(verifyStr.equals("How are you today")) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		//---------------------------
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		WebElement alertWithOk = driver.findElement(By.cssSelector("a[href^='#OKTab']"));
		alertWithOk.click();
		
		tearDown();
	}
	
}
