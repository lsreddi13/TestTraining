package com.utils;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.Base;
import com.log4j.demo.Log4JClassDemo;

public class TestCutomListeners extends Base implements ITestListener {
	Logger log = Logger.getLogger(TestCutomListeners.class);
	public void onFinish(ITestContext resultContext) {
		System.out.println(" ITestContext - onFinish  == " + resultContext.getName());
		log.info("dafsdf" );

	}

	public void onStart(ITestContext result) {
		System.out.println(" ITestContext - onStart  == " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(" this is onTestFailedButWithinSuccessPercentage === " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure == " + result.getName());
		try {
			screenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped == " + result.getName());
		try {
			screenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://facebook.com");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart == " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess == " + result.getName());
		try {
			screenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
