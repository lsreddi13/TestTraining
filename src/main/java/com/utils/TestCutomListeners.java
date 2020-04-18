package com.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.Base;

public class TestCutomListeners extends Base implements ITestListener {

	public void onFinish(ITestContext resultContext) {
		System.out.println(" ITestContext - onFinish  == " + resultContext.getName());

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
