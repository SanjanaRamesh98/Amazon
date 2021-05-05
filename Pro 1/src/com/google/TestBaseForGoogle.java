package com.google;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseForGoogle {
	WebDriver driver;
	Gp g;
@BeforeClass
public void setup() {
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	driver=new FirefoxDriver();
 g=new Gp(driver);
		
	    driver.get("https://www.google.com./");
}
@AfterClass
public void TearDown() {
	driver.close();
}

}