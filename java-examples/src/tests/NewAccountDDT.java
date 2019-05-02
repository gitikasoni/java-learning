package tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.DriverFactory;

@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	String name;
	String email;
	String phone;
	String gender;
	String password;
	String verifyPassword;
	String country;
	boolean weeklyEmail;
	boolean monthlyEmail;
	boolean occasionalEmail;
	WebDriver driver;

	@Test
	public void newAccountTest() {
		System.out.println("NEW RECORD: " + name + "" + email + "" + phone + ""
				+ gender + "" + password + "" + country);

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
		phoneElement.sendKeys(phone);
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

	@Before
	public void setup() {
		driver = DriverFactory.open("firefox");

		driver.get("http://www.sdettraining.com/trguitransactions/NewAccount.aspx");

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("D:\\Testing Material\\TestCSV.csv");
	}

	public NewAccountDDT(String name, String email, String phone,
			String gender, String password, String country, String weeklyEmail,
			String monthlyEmail, String occasionalEmail) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.country = country;

		if (weeklyEmail.equals(true)) {
			this.weeklyEmail = true;
		} else {
			this.weeklyEmail = false;
		}

		if (monthlyEmail.equals(true)) {
			this.monthlyEmail = true;
		} else {
			this.monthlyEmail = false;
		}

		if (occasionalEmail.equals(true)) {
			this.occasionalEmail = true;
		} else {
			this.occasionalEmail = false;
		}

	}

}
