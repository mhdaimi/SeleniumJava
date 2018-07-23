package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		
		WebElement dropDown = driver.findElement(By.xpath(".//*[@class='form-control pickListSelect pickData']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Julia");
		select.selectByVisibleText("Helena");
		
		driver.findElement(By.xpath(".//*[@class='pAdd btn btn-primary btn-sm']")).click();
		
	}

}
