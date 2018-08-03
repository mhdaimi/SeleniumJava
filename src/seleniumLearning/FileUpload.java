package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr1 = new ChromeDriver();
		dr1.manage().window().maximize();
		dr1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr1.get("http://demoqa.com/registration/");
		
		dr1.findElement(By.id("profile_pic_10")).sendKeys("C:\\Users\\mohammad.daimi\\Downloads\\Passport_pic.jpg");
	}

}
