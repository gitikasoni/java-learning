package tests;

import org.openqa.selenium.WebDriver;

import pages.LoginPageFactory;
import utilities.DriverFactory;

public class LoginFactory {
	
	String username = "tim@testemail,com";
	String password = "trpass";

	public void LoginTestPageFactory()
	{
		WebDriver driver = DriverFactory.open("firefox");
		driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.login(username, password);
	}
}
