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
public class ClassLevelListener2 extends Base {

	

	@Test(enabled=true)
	public void facebookLogin() throws InterruptedException {
		initialization();
		driver.get("http://www.facebook.com");
		FaceBookAssert fb = new FaceBookAssert();
		fb.testfbLogin();

	}


}
