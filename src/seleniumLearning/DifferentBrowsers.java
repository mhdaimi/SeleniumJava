package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowsers {

	static String browser = "all";
	static WebDriver driver;	
	static WebDriver Idriver;
	static WebDriver CDriver;
	static WebDriver FDriver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (browser.contains("InternetExplorer")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.contains("firefox")){
			System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.contains("all")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			Idriver = new InternetExplorerDriver();
			Idriver.get("http://www.google.co.in");
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			CDriver = new ChromeDriver();
			CDriver.get("http://www.google.co.in");
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			FDriver = new FirefoxDriver();
			FDriver.get("http://www.google.co.in");
		}
		
		if (! browser.contains("all")){
			driver.manage().window().maximize();
			driver.get("http://www.google.co.in");
		}
	}

}
