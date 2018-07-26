package framework.datadriven.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ExcelReadWrite.ExcelCommunication;
import framework.datadriven.pageClasses.Login;

public class TestLogin {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod(){
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterMethod
	public void afterMethod(){
		//driver.close();
	}
	
	@Test
	public void loginWithValidDetails() throws Throwable{
		
		Login.enterUserId(driver, ExcelCommunication.ReadExcel("Scenarios", 1, 1));
		Login.enterPassword(driver, ExcelCommunication.ReadExcel("Scenarios", 1, 2));
		Login.clickLoginButton(driver);
	}
	
	@Test
	public void loginWithInvalidUserName() throws Throwable{
		
		Login.enterUserId(driver, ExcelCommunication.ReadExcel("Scenarios", 2, 1));
		Login.enterPassword(driver, ExcelCommunication.ReadExcel("Scenarios", 2, 2));
		Login.clickLoginButton(driver);
		
	}

}
