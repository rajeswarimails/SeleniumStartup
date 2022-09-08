package com.oracle.qa.automation.tests;

import java.util.concurrent.TimeUnit;

import com.oracle.qa.automation.BaseTest;

public class HomePageVerification extends BaseTest {

	
	String actualTitleResult = "null";
	String expectTitleResult = "Oracle | Cloud Applications and Cloud Platform";
	
	//method to view the title element
	public void homePageTitle() {
		actualTitleResult = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(63, TimeUnit.SECONDS);
		
	}
	public void homePageTitleTest() {
		if(actualTitleResult.equals(expectTitleResult)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
	}

	public static void main(String[] args) {
		//  instantiating the HomePageVerification
		HomePageVerification instance1_HomePageVerification = new HomePageVerification();
		instance1_HomePageVerification.launchBrowser();
		instance1_HomePageVerification.launchApplication();
		instance1_HomePageVerification.homePageTitle();
		instance1_HomePageVerification.homePageTitleTest();
		try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instance1_HomePageVerification.exitBrowser();

	}

}
