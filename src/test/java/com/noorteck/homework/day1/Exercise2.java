package com.noorteck.homework.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) {
		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement registerLink = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));

		registerLink.click();

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle.equals("Mercury Tours"));

		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("John");

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Johnson");

		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys("5559995432");

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("dsfffrffs@gmail.com");

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("2222 Ocean ave");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("BROOKLYN");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("NY");

		WebElement postal = driver.findElement(By.name("postalCode"));
		postal.sendKeys("2022");

		WebElement country = driver.findElement(By.name("country"));

		Select countryDropdown = new Select(country);

		List<WebElement> countryList = countryDropdown.getOptions();

		for (WebElement we : countryList) {

			String countryStr = we.getText();

			if (countryStr.equals("UNITED STATES")) {
				we.click();
				System.out.println(countryStr);
				break;
			}

		}

		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("KjfjfLlldfv");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("fjknvjfkvnfdjkvn");

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("fjknvjfkvnfdjkvn");

		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();

		WebElement message = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String text = message.getText();

		System.out.println(text);

		tearDown();
	}
}
