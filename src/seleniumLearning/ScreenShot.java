package seleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");

		TakesScreenshot ss = ((TakesScreenshot)driver);
		File screenShot = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(".\\src\\seleniumLearning\\screenShot.jpg"));
		
		driver.get("https://indi.com/");

		TakesScreenshot tst = ((TakesScreenshot)driver);
		File screeshot1 = tst.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screeshot1, new File("C:\\Users\\mohammad.daimi\\testcopy.jpg"));

	}
}