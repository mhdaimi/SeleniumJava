package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr1 = new ChromeDriver();
		dr1.manage().window().maximize();
		dr1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr1.get("http://demoqa.com/wp-content/themes/wp-knowledge-base/frame1.html");
		dr1.switchTo().frame("contentFrame");
		System.out.println(dr1.findElement(By.tagName("P")).getText());
		
		dr1.switchTo().parentFrame();
		dr1.switchTo().frame("topFrame");
	
		WebElement hd = dr1.findElement(By.tagName("h2"));
		System.out.println(hd.getText());
	}
}
