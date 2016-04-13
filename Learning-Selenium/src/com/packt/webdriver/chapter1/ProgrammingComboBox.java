package com.packt.webdriver.chapter1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgrammingComboBox {
		public void test(WebDriver driver){
			System.out.println("Testing ProgrammingComboBox");
			WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
			WebElement Programming = Navbar.findElement(By.linkText("Programming"));
			Programming.click();
			WebElement Proposals = Navbar.findElement(By.partialLinkText("Proposals"));
			Assert.assertTrue(Proposals.isDisplayed());
			System.out.println("Found Proposals");
		}
	}
