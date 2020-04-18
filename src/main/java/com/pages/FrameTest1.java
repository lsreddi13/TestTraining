package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class FrameTest1 extends Base {

	public void testframe() throws InterruptedException {
		FrameTest1 ft = new FrameTest1();
		driver.get("http://www.paytm.com");
		Thread.sleep(3000);
		// find how many iframes in the page

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("number of iframes in the page : " + size);
		String xpath_login = "//div[contains(text(), 'Log In/Sign Up')]";
		WebElement login = driver.findElement(By.xpath(xpath_login));
		login.click();
		Thread.sleep(3000);
		// find how many iframes in the page

		driver.switchTo().frame(0);
		int size2 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("now number of iframes in the page : " + size2);
		Thread.sleep(1000);
		
		
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("Login/Signup")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Login/Signup')]")).click();
		Thread.sleep(2000);
		
		int size3 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("now number of iframes in the page : " + size3);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//ul/li[contains(text(), 'Sign Up')]")).click();
		Thread.sleep(2000);
	
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("//iframe/../a[@title='Close']")).click();
		Thread.sleep(2000);
		login.click();
		
	}
}
