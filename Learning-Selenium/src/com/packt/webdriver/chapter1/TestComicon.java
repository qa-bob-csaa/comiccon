package com.packt.webdriver.chapter1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.ie.*;

public class TestComicon {
	WebDriver driver;
	public TestComicon(){
		this.driver = NavigateToAUrl();
	}
	public static void main(String[] args) throws Exception {
		TestComicon test = new TestComicon();
		test.buynav();
		test.loginnav();
		test.homenav();
		GuestComboBox GuestcomboBox = new GuestComboBox();
		GuestcomboBox.test(test.driver);
		ProgrammingComboBox ProgrammingcomboBox = new ProgrammingComboBox();
		ProgrammingcomboBox.test(test.driver);
		EventComboBox EventcomboBox = new EventComboBox();
		EventcomboBox.test(test.driver);
		InfoComboBox InfocomboBox = new InfoComboBox();
		InfocomboBox.test(test.driver);
		test.login();
		test.logout();
		test.driver.close();

	}

	private WebDriver NavigateToAUrl() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.phoenixcomicon.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("phoenixcomicon"));
		System.out.println("Test NavigateToAUrl passed" );
		return driver;
	}

	public void loginnav() throws Exception {
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Loginlink = Navbar.findElement(By.linkText("Login"));
		Loginlink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		System.out.println("Test loginnav passed" );
	}

	public void homenav() throws Exception {
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Homelink = Navbar.findElement(By.linkText("Home"));
		Homelink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("page/1"));
		System.out.println("Test homenav passed" );
	}

	public void buynav() throws Exception {
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Buylink = Navbar.findElement(By.linkText("Buy"));
		Buylink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("transactions"));
		System.out.println("Test buynav passed" );
	}

	public void login() throws Exception {
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Loginlink = Navbar.findElement(By.linkText("Login"));
		Loginlink.click();
		WebElement login = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		login.sendKeys("rlsmall56");
		password.sendKeys("Levi56565656");
		WebElement loginbtn = driver.findElement(By.name("login-submit"));
		loginbtn.click();
		System.out.println("Test login passed" );
		// Need a handler here for invalid login
	}

	public void logout() throws Exception {
		WebElement UserbarRt = driver.findElement(By.id("userbar_right"));
		WebElement Logoutlink = UserbarRt.findElement(By.linkText("Logout"));
		Logoutlink.click();
		System.out.println("Test logout passed" );
	}
}