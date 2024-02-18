package com.noorteck.homework.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.HooksChrome;

public class Exercice3 extends HooksChrome {

	public static void main(String[] args) {
		setUp();

		driver.get("https://demo.nopcommerce.com/");

		WebElement registerButton = driver.findElement(By.className("ico-register"));
		registerButton.click();

		String pageTitle = driver.getTitle();

		if (pageTitle.equals("nopCommerce demo store. Register")) {
			System.out.println("Page title is correct: " + pageTitle);
		} else {
			System.out.println("Page title is not correct: " + pageTitle);
		}

		WebElement genderRadio = driver.findElement(By.id("gender-male"));
		genderRadio.click();

		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Nick");

		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Tyler");

		WebElement DayOfBirth = driver.findElement(By.name("DateOfBirthDay"));
		Select select_DayOfBirth = new Select(DayOfBirth);
		List<WebElement> list_DoB = select_DayOfBirth.getOptions();

		for (WebElement we : list_DoB) {

			String str = we.getText();

			if (str.equals("15")) {
				we.click();
				break;
			}

		}

		WebElement monthOfBirth = driver.findElement(By.name("DateOfBirthMonth"));
		Select select_MoB = new Select(monthOfBirth);
		List<WebElement> list_MoB = select_MoB.getOptions();

		for (WebElement we : list_MoB) {

			String str = we.getText();

			if (str.equals("November")) {
				we.click();
				break;
			}

		}

		WebElement yearOfBirth = driver.findElement(By.name("DateOfBirthYear"));
		Select select_YoB = new Select(yearOfBirth);
		List<WebElement> list_YoB = select_YoB.getOptions();

		for (WebElement we : list_YoB) {
			String str = we.getText();

			if (str.equals("1999")) {
				we.click();
				break;
			}

		}

		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("apple1@gmail.com");

		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("Apple");

		WebElement newsletter = driver.findElement(By.id("Newsletter"));
		newsletter.click();

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123323212321");
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("123323212321");

		WebElement register = driver.findElement(By.id("register-button"));
		register.click();

		WebElement result = driver.findElement(By.className("result"));

		String confirmation = result.getText();
		System.out.println(confirmation);

		if (confirmation.equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();
	}

}
