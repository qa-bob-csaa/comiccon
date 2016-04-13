package com.packt.webdriver.chapter1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExhibitorsComboBox {
	public void test(WebDriver driver){
		System.out.println("Testing ProgrammingComboBox");
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Event = Navbar.findElement(By.linkText("Event"));
		Event.click();
		WebElement EventMap = Navbar.findElement(By.partialLinkText("Event Map"));
		Assert.assertTrue(EventMap.isDisplayed());
		System.out.println("Found Event Map");
		WebElement StreetTeam = Navbar.findElement(By.partialLinkText("Street Team"));
		Assert.assertTrue(StreetTeam.isDisplayed());
		System.out.println("Found Street Team");
		WebElement FilmFestival = Navbar.findElement(By.partialLinkText("Film Festival"));
		Assert.assertTrue(FilmFestival.isDisplayed());
		System.out.println("Found Film Festival");
	}
}

/*
Exhibitors/Artists
Exclusives
Exhibitor FAQ
New Exhibitor Application
Current Exhibitor Info
Exhibitor Map
*/