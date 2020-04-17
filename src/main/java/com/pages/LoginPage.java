package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Base;

public class LoginPage extends Base{

	public void search() {
		//search Pramati technologies in google.
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Pramati Technologies");
		//without clicking search button..we can use "Keys.ENTER" webdriver method sendkeys.
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		
	}
	
}
