package com.example.smoketest;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;

public class PageTitleJUnit {

	WebDriver driver;
	String webURL = "http://www.sdettraining.com/trguitransactions/AccountManagement.aspx";

	@Test
	public void pageTitleTest() {
		System.out.println("Running the test");
		driver.get(webURL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "SDET Training | Account Management";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Test
	public void abc() {
		System.out.println("Inside abc");
	}

	@Before
	public void setup() {
		System.out.println("Initializing the driver");
		driver = DriverFactory.open("firefox");

	}

	@After
	public void tearDown() {
		System.out.println("Closing the driver");
		driver.close();
	}
}