package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverFactory;

public class Login {
	
	@Test
	public void loginTestPOM()
	{
		
	WebDriver driver = DriverFactory.open("firefox");
	driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");

	LoginPage var = new LoginPage(driver);
	var.setUsername("tim@testemail.com");
	var.setPassword("trpass");
	var.submit();
	
	DashboardPage dashboard = new DashboardPage(driver);
	String conf= dashboard.getConfirmation();
	Assert.assertTrue(conf.contains("Logged in successfully"));
	
	//driver.quit();
	}
}
