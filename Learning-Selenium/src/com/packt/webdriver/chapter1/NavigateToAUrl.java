package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;


public class NavigateToAUrl {
   public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phoenixcomicon.com");
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Loginlink = Navbar.findElement(By.linkText("Login"));
		System.out.println(Loginlink.getText());
		Loginlink.click();
		WebElement login = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		login.sendKeys("rlsmall56");
		password.sendKeys("Levi5656");
		WebElement loginbtn = driver.findElement(By.name("login-submit"));
		loginbtn.click();
		WebElement UserbarRt = driver.findElement(By.id("userbar_right"));
		WebElement Logoutlink = UserbarRt.findElement(By.linkText("Logout"));
		Logoutlink.click();
	}
}

//public class Login {
//	public Login(String[] args) {
//		WebDriver driver = new FirefoxDriver();
//		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
//		WebElement Loginlink = Navbar.findElement(By.linkText("Login"));
//		Loginlink.click();
//		System.out.println(Loginlink.getText());
//	}
//}

