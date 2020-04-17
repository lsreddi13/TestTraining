package com.testng.listenersconcept;
/*
 * It will take screenshot when ever it fails
 * Here class level Listener is implemented.
 */
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;
import com.utils.CustomListener;
@Listeners(CustomListener.class)
public class ClassListenersDemo extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshotTest() {
		LoginPage lp = new LoginPage();
		lp.search();
		
		Assert.assertTrue(false);
	}
}
