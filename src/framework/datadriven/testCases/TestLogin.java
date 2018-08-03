package framework.datadriven.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ExcelReadWrite.ExcelCommunication;
import framework.datadriven.pageClasses.Login;

public class TestLogin {
	
	WebDriver driver;
	SoftAssert softAssert;
	org.apache.logging.log4j.Logger log;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		softAssert = new SoftAssert();
		
		log = LogManager.getLogger(TestLogin.class.getName());
	}
	
	@BeforeMethod
	public void beforeMethod(){
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterMethod
	public void afterMethod(){
		log.info("Test completed ");
	}
	
	@AfterClass
	public void afterClass(){
		softAssert.assertAll();
		driver.quit();
	}
	
	@Test
	public void loginWithValidDetails() throws Throwable{
		Login.enterUserId(driver, ExcelCommunication.ReadExcel("Scenarios", 1, 1));
		Login.enterPassword(driver, ExcelCommunication.ReadExcel("Scenarios", 1, 2));
		Login.clickLoginButton(driver);
		log.info("Asserting....");
		log.debug("debug info");
		log.error("Error");
		softAssert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}
	
	@Test
	public void loginWithInvalidUserName() throws Throwable{
		Login.enterUserId(driver, ExcelCommunication.ReadExcel("Scenarios", 2, 1));
		Login.enterPassword(driver, ExcelCommunication.ReadExcel("Scenarios", 2, 2));
		Login.clickLoginButton(driver);
		log.info("Asserting....");
		softAssert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
		
	}

}
