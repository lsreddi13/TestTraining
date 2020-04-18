package com.WebDriverListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ListenerMainClass {

	@Test
	public void test1() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//src//main//resources//Browser_Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		// Create an object for EventFiringWebDriver class.
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);

		// EventCapture is a class which we use this for implementing all unimplemented
		// methods in the WebDriverEventListener Interface.
		// Create an object to access all the methods from the EventCapture class.
		EventCapture eCapture = new EventCapture();
		// Registering with EventFiringWebDriver
		// Register method allows to register our implementation of
		// WebDriverEventListner to listen to the WebDriver events
		eventHandler.register(eCapture);
		// navigating to the webpage "www.edureka.co"
		eventHandler.navigate().to("https://www.google.com");
		// eventHandler.get("https://www.google.com");

		Thread.sleep(3000);
		WebElement ele1 = eventHandler.findElement(By.xpath("//input[@title='Search']"));
		ele1.sendKeys("Selenium Testing");
		ele1.sendKeys(Keys.ENTER);

		WebElement ele4 = eventHandler.findElement(By.xpath("//div[@id='result-stats']"));
		String results = ele4.getText();
//		System.out.println("results value :: " + results);

		eventHandler.navigate().back();
		eventHandler.navigate().refresh();
		eventHandler.navigate().forward();
		eventHandler.navigate().back();
		
		// eventHandler.quit();
		// Unregister allows to detach
		

		WebElement ele2 = eventHandler.findElement(By.xpath("//input[@title='Search']"));
		ele2.sendKeys("Testng Testing");
		ele2.sendKeys(Keys.ENTER);

		WebElement ele3 = eventHandler.findElement(By.xpath("//div[@id='result-stats']"));
		ele3.getText();
		
		eventHandler.navigate().back();
		eventHandler.navigate().refresh();
		eventHandler.navigate().forward();
		eventHandler.navigate().back();
		
		eventHandler.unregister(eCapture);
		
		
		System.out.println("End of Listners Class");
	}
}
