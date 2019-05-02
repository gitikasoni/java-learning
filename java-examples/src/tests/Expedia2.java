package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;

public class Expedia2 {
	WebDriver driver;
	WebElement originElement;

	@Test
	public void hotelReservation() {

		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(
				"Chicago, IL");
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(
				"05/02/2019");
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(
				"05/10/2019");
		
		
		
		WebElement element = driver.findElement(By.className("traveler-selector-room-data"));
		System.out.println(""+element);
		System.out.println(""+element);
		
		System.out.println(""+element);
		
		System.out.println("");

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
