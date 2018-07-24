package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("isAgeSelected")).click();
		Thread.sleep(3000);
		
		//List<WebElement> checkBoxList = driver.findElements(By.className("cb1-element"));
		List<WebElement> checkBoxList = driver.findElements(By.xpath(".//input[@type='checkbox']"));
		for (WebElement checkBox : checkBoxList) {
			Thread.sleep(2000);
			String text = checkBox.getText();
			System.out.println("Clicking checkbox: " + text);
			checkBox.click();
		}
	}

}
