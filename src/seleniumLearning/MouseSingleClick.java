package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSingleClick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//WebElement signInButton = driver.findElement(By.name("login"));
		WebElement signInButton = driver.findElement(By.linkText("REGISTER"));
		Actions mouse = new Actions(driver);
		
		mouse.click(signInButton).build().perform();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstName"));
		mouse.click(firstName).build().perform();
		Thread.sleep(2000);
		firstName.sendKeys("Mohammad");

	}

}
