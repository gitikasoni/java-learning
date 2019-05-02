package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class Expedia {

	WebDriver driver;
	WebElement originElement;
	WebDriverWait wait = new WebDriverWait(driver, 3);
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	@Test
	public void hotelReservation() {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(
				"Chicago, IL");
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(
				"05/02/2019");
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(
				"05/10/2019");
		driver.findElement(By.id("search-button-hp-package")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-button-hp-package")));
		/*WebElement element = driver.findElement(By.id("search-button-hp-package"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		//clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search-button-hp-package")));
*/
		
	//	driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[4]/div[3]/div/ul/li/div/div/div[1]/div[2]/div[3]/span")).sendKeys("5");
		
		//driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[4]/div[3]/div/ul/li/button")).click();

/*		List<WebElement> elementList = driver.findElements(By.className("uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized"));
		
		
		for(int i=0; i<elementList.size()  ;i++){
			
			WebElement el= elementList.get(i); 
			
			System.out.println("");
		}
		
*/
	}

	@Before
	public void setup() {
		driver = DriverFactory.open("firefox");
		driver.get("https://www.expedia.com/");
	}

	/*@After
	public void tearDown() {
		driver.close();
	}*/

}