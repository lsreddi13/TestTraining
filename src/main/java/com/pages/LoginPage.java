package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class LoginPage extends Base{

	public void search() {
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium Testing");
		//without clicking search button..we can use "Keys.ENTER" webdriver method sendkeys.
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		WebElement ele4 = driver.findElement(By.xpath("//div[@id='result-stats']"));
		String results = ele4.getText();
		
		driver.findElement(By.xpath("//h3dsadas[1]")).click();
		
		
		
	}
	
}
