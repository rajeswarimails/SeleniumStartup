package com.oracle.qa.automation.tests;

import org.openqa.selenium.By;

import com.oracle.qa.automation.BaseTest;

public class HomePageSearchFunctionalityVerification extends BaseTest{
	Boolean actualSearchResult;
	Boolean expectedSearchResult = true;
	
	
	public void homePageSearchFunctionality() {
		
		//clicking on "country-select" light box. Here link-text locator is used 
		 driver.findElement(By.linkText("No thanks, I'll stay here")).click();
		 
		// clicking on search button. Following are ID locators is used 
		driver.findElement(By.id("u30searchBtn")).click(); 
		
		// Provide search criteria in search field
		driver.findElement(By.id("u30input")).sendKeys("Oracle Database");
		
		// Submit the search criteria.
		driver.findElement(By.id("u30input")).submit();
		
		// Search <BODY> element for search text.
		actualSearchResult = driver.getPageSource().contains("Oracle Database");
		
	}
	public void homePageSearchFunctionalityTest() {
		// Comparing the actual result with expected result
		if(actualSearchResult == expectedSearchResult) {
			System.out.println("Test Pass");
		}
		else System.out.println("Test Pass");
	}

	public static void main(String[] args) {
		// Instantiating the SearchFunctionalityVerificaiton
		HomePageSearchFunctionalityVerification instance1_SearchFunctionalityVerification = new HomePageSearchFunctionalityVerification();
		// Method call to launch the browser
		instance1_SearchFunctionalityVerification.launchBrowser();
		// Method call to launch the application
		instance1_SearchFunctionalityVerification.launchApplication();
		// Method call to find the web elements and their functionality 
		instance1_SearchFunctionalityVerification.homePageSearchFunctionality();
		// Method call to test the results 
		instance1_SearchFunctionalityVerification.homePageSearchFunctionalityTest();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// Print the exception message
			e.printStackTrace();
		}
		
		instance1_SearchFunctionalityVerification.exitBrowser();

	}

}
