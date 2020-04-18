package com.testng.listenerDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.FaceBookAssert;
import com.pages.FrameTest1;
import com.pages.LoginPage;
import com.utils.TestCutomListeners;

//@Listeners(TestCutomListeners.class)
public class ClassLevelListener extends Base {

	@Test(priority=1)
	public void testLogin1() {
		initialization();
		LoginPage pp = new LoginPage();
		pp.search();
		
		Assert.assertEquals(true, true);

	}
	
	@Test(priority=2)
	public void testLogin2() {
		System.out.println("this is just simple method with failure case ::: ");
		Assert.assertEquals(true, false);
		

	}
	
	@Test( priority=3, dependsOnMethods="testLogin2")
	public void testLogin3() {
		System.out.println("this is depending on testLogin2  ================");
		Assert.assertEquals(true, true);

	}

	@Test(enabled=false)
	public void facebookLogin() throws InterruptedException {
		initialization();
		driver.get("http://www.facebook.com");
		FaceBookAssert fb = new FaceBookAssert();
		fb.testfbLogin();

	}

	@Test(enabled=false)
	public void payTM() throws InterruptedException {
		initialization();
		FrameTest1 tm = new FrameTest1();
		tm.testframe();

	}
}
