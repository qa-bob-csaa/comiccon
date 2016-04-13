package com.packt.webdriver.chapter1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestComboBox {
	public void test(WebDriver driver){
		System.out.println("Testing GuestComboBox");
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Guest = Navbar.findElement(By.linkText("Guests"));
		Guest.click();
		WebElement Author = Navbar.findElement(By.linkText("Authors"));
		WebElement Books = Navbar.findElement(By.linkText("Comic Books"));
		WebElement Horror = Navbar.findElement(By.linkText("Horror"));
		WebElement Movies = Navbar.findElement(By.linkText("Movies & TV"));
		WebElement GuestSuggestions = Navbar.findElement(By.linkText("Guest Suggestions"));
		Assert.assertTrue(Guest.isDisplayed());
		System.out.println("Found Guest");
		Assert.assertTrue(Author.isDisplayed());
		System.out.println("Found Author");
		Assert.assertTrue(Books.isDisplayed());
		System.out.println("Found Books");
		Assert.assertTrue(Horror.isDisplayed());
		System.out.println("Found Horror");
		Assert.assertTrue(Movies.isDisplayed());
		System.out.println("Found Movies");
		Assert.assertTrue(GuestSuggestions.isDisplayed());
		System.out.println("Found Guest Suggestions");
	}
}
