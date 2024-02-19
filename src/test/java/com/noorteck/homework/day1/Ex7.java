package com.noorteck.homework.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.HooksChrome;

public class Ex7 extends HooksChrome {

	public static void main(String[] args) {

		setUp();

		try {

			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

			WebElement openqa = driver
					.findElement(By.cssSelector("a[href='org/openqa/selenium/package-summary.html']"));

			openqa.click();
			Thread.sleep(2000);

			WebElement alertElement = driver.findElement(By.cssSelector("a[href=\"Alert.html\"]"));
			alertElement.click();
			Thread.sleep(2000);
			
			String alertTitle = driver.getTitle();
			System.out.println(alertTitle);
			if(alertTitle.equals("Interface Alert")) {
				System.out.println("Testcase passed");
			}else {
				System.out.println("Testcase failed");
			}
			
			
			WebElement overview = driver.findElement(By.cssSelector("a[href='../../../index.html']"));
			overview.click();
			Thread.sleep(2000);
			
			WebElement seleniumChrome = driver.findElement(By.cssSelector("a[href='org/openqa/selenium/chrome/package-summary.html']"));
			seleniumChrome.click();
			Thread.sleep(2000);
			
			WebElement chromeDriver = driver.findElement(By.xpath("//a[text()='ChromeDriver']"));
			chromeDriver.click();
			Thread.sleep(2000);
			
			String chromeDriverTitle = driver.getTitle();
			System.out.println(chromeDriverTitle);
			if(chromeDriverTitle.equals("Class ChromeDriver")) {
				System.out.println("TestCase Passed");
			}else {
				System.out.println("TestCase failed");
			}
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			tearDown();
		}

	}

}
