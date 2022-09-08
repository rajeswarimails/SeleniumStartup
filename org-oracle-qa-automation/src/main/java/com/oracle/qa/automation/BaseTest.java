package com.oracle.qa.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(63, TimeUnit.SECONDS);
		driver.manage().window().maximize();// Maximizing the window
		System.out.println("Browser launched");
	}

	public void launchApplication() {
		driver.get("https://www.oracle.com/");
		// driver.get("http://www.google.com/");
		System.out.println("Application launched");
	}

	public void exitBrowser() {
		driver.quit(); // driver.close();
		System.out.println("Browser closed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		BaseTest instance1_BaseTest = new BaseTest();
		instance1_BaseTest.launchBrowser();
		instance1_BaseTest.launchApplication();
		instance1_BaseTest.exitBrowser();

	}

}
