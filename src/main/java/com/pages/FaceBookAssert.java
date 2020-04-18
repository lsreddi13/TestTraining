package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FaceBookAssert {
	WebDriver driver;

	


	public void testfbLogin() throws InterruptedException {

		String title = driver.getTitle(); // get the page title.
		System.out.println("Page title Print : " + title);
		Assert.assertEquals(title, "Facebook – log in or sign up", "Page title does not match."); 
		
		WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
		System.out.println("Verify link is displayed : "+createPageLink.isDisplayed());
		Assert.assertTrue(createPageLink.isDisplayed());
		Assert.assertFalse(createPageLink.isDisplayed());
		Assert.assertNotEquals("" , "", "");
//		Assert.assertSame(actual, expected);
//		Assert.assertNotSame(actual, expected);
//		Assert.assertNotNull(object);
//		Assert.assertThrows(runnable);
		
		if(createPageLink.isDisplayed()) {
			String createpageLink_url = createPageLink.getAttribute("href");
			String expected_url = "pages/create/?ref_type=registration_form";
			String failure_desc = "Create page Link does not match.";
			Assert.assertEquals(createpageLink_url, driver.getCurrentUrl()+expected_url, failure_desc);
			System.out.println("dfdafsd");
			createPageLink.click();
		}else
		{
			System.out.println("Create Page link is not available.");
		}
		
		
	}

	

	

	

}
