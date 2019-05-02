package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	@FindBy(id = "MainContent_txtUserName")
	WebElement userName;

	@FindBy(id = "MainContent_txtPassword")
	WebElement passwordBox;

	@FindBy(id = "MainContent_btnLogin")
	WebElement loginButton;

	public void setUsername(String username) {
		userName.sendKeys(username);
	}

	public void setPassword(String password) {
		passwordBox.sendKeys(password);

	}

	public void submit() {

		loginButton.click();
	}

	
	public void login(String username, String password){
	setUsername(username);
	setPassword(password);
	submit();
	}

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
