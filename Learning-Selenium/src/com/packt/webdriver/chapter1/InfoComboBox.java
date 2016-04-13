package com.packt.webdriver.chapter1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoComboBox {
	public void test(WebDriver driver){
		System.out.println("Testing ProgrammingComboBox");
		WebElement Navbar = driver.findElement(By.id("ul_main_menu"));
		WebElement Info = Navbar.findElement(By.linkText("Info"));
		Info.click();
		
		WebElement MediaRegistration = Navbar.findElement(By.partialLinkText("Media Registration"));
		Assert.assertTrue(MediaRegistration.isDisplayed());
		System.out.println("Found Media Registration");
		
		WebElement ProfessionalRegistration = Navbar.findElement(By.partialLinkText("Professional Registration"));
		Assert.assertTrue(ProfessionalRegistration.isDisplayed());
		System.out.println("Found Professional Registration");
		
		WebElement BadgeInfo = Navbar.findElement(By.partialLinkText("Badge Info"));
		Assert.assertTrue(BadgeInfo.isDisplayed());
		System.out.println("Found Badge Info");
		
		WebElement Comicon101 = Navbar.findElement(By.partialLinkText("Comicon 101"));
		Assert.assertTrue(Comicon101.isDisplayed());
		System.out.println("Found Comicon 101");
		
		WebElement ConventionPolicies = Navbar.findElement(By.partialLinkText("Convention Policies"));
		Assert.assertTrue(ConventionPolicies.isDisplayed());
		System.out.println("Found Convention Policies");
		
		WebElement CostumeWeaponsPolicy = Navbar.findElement(By.partialLinkText("Costume Weapons Policy"));
		Assert.assertTrue(CostumeWeaponsPolicy.isDisplayed());
		System.out.println("Found Costume Weapons Policy");
		
		WebElement Hotels = Navbar.findElement(By.partialLinkText("Hotels"));
		Assert.assertTrue(Hotels.isDisplayed());
		System.out.println("Found Hotels");
		
		WebElement ConventionPhotos = Navbar.findElement(By.partialLinkText("Convention Photos"));
		Assert.assertTrue(ConventionPhotos.isDisplayed());
		System.out.println("Found Convention Photos");
		
		WebElement ProgramGuidePDF = Navbar.findElement(By.partialLinkText("Program Guide PDF"));
		Assert.assertTrue(ProgramGuidePDF.isDisplayed());
		System.out.println("Found Program Guide PDF");
		
		WebElement MobilityServices = Navbar.findElement(By.partialLinkText("Mobility Services"));
		Assert.assertTrue(MobilityServices.isDisplayed());
		System.out.println("Found Mobility Services");
		
		WebElement ParkingTransportation = Navbar.findElement(By.partialLinkText("Parking & Transportation"));
		Assert.assertTrue(ParkingTransportation.isDisplayed());
		System.out.println("Found Parking & Transportation");
		
		WebElement Merchandise = Navbar.findElement(By.partialLinkText("Merchandise"));
		Assert.assertTrue(Merchandise.isDisplayed());
		System.out.println("Found Merchandise");
		
		WebElement ContactUs = Navbar.findElement(By.partialLinkText("Contact Us!"));
		Assert.assertTrue(ContactUs.isDisplayed());
		System.out.println("Found Contact Us");
	}
}