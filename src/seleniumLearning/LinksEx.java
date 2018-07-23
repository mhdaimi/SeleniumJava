package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement link : allLinks) {
			String href = link.getAttribute("href");
			String text = link.getText();
			System.out.println(text + " ---------------------> " + href);
/*			if (text.contains("REGISTER")){
				link.click();
			}*/
		}
	}
}
