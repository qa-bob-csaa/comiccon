package com.b2c.seleniumtests;

import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTest {
	WebDriver driver;
	public SearchTest() {
		this.driver = NavigateToAUrl();
	}

	public static void main(String[] args) throws Exception {
		SearchTest test = new SearchTest();
		test.EZPay();
	}

	private WebDriver NavigateToAUrl() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://e3.pncie.com/selfservice/testHarness");
		Assert.assertTrue(driver.getTitle().contains("PERF"));
		System.out.println("Test NavigateToAUrl PERF environment passed");
		return driver;
	}

	public void EZPay() throws Exception {
		WebElement ezpayclub = driver.findElement(By.linkText("EzPay Link ClubSite"));
		String mainWindow = driver.getWindowHandle();
		ezpayclub.click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				TargetLocator tl = driver.switchTo();
				tl.window(handle);
				break;
			}
		}
		try {
			Assert.assertTrue(driver.getCurrentUrl().endsWith("ezpay"));
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Test EZPay page load passed");
	}
}
