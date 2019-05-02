package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import utilities.DriverFactory;

public class NewAccount {

	public static void main(String[] args) {

		String name = "Robert";
		String email = "robert@example.com";
		String password = "1234567";
		String verifyPassword = "1234567";
		String phoneNumber = "5677754323";
		String country = "Brazil";
		String gender = "Male";
		boolean weeklyEmail = true;
		String monthlyEmail;
		String occasionalUpdates;

		String browserType = "firefox";
		WebDriver driver = DriverFactory.open(browserType);

		driver.get("http://www.sdettraining.com/trguitransactions/NewAccount.aspx");

		WebElement nameElement = driver.findElement(By
				.id("MainContent_txtFirstName"));
		WebElement emailElement = driver.findElement(By
				.name("ctl00$MainContent$txtEmail"));
		WebElement phoneElement = driver.findElement(By
				.id("MainContent_txtHomePhone"));
		WebElement passwordElement = driver.findElement(By
				.id("MainContent_txtPassword"));
		WebElement verifyPasswordElement = driver.findElement(By
				.id("MainContent_txtVerifyPassword"));
		WebElement countryElement = driver.findElement(By
				.id("MainContent_menuCountry"));
		WebElement maleElement = driver.findElement(By.id("MainContent_Male"));
		WebElement femaleElement = driver.findElement(By
				.id("MainContent_Female"));
		WebElement weeklyEmailElement = driver.findElement(By
				.id("MainContent_checkWeeklyEmail"));

		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phoneNumber);
		if (gender.equalsIgnoreCase("Male")) {
			maleElement.click();
		} else {
			femaleElement.click();

		}
		passwordElement.sendKeys(password);
		verifyPasswordElement.sendKeys(verifyPassword);
		Select dropdown = new Select(countryElement);
		dropdown.selectByVisibleText(country);
		// driver.findElement(By.cssSelector("input[id='MainContent_checkWeeklyEmail'][name='ctl00$MainContent$checkWeeklyEmail']")).click();
		if (weeklyEmail) {
			if (!weeklyEmailElement.isSelected()) {
				weeklyEmailElement.click();
			}
		} else {
			if (weeklyEmailElement.isSelected()) {
				weeklyEmailElement.click();
			}
		}

		driver.findElement(By.id("MainContent_btnSubmit")).click();

		String message = driver.findElement(
				By.id("MainContent_lblTransactionResult")).getText();
		String expectedMessage = "Customer information added successfully";

		if (message.equals(expectedMessage)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

	}

}