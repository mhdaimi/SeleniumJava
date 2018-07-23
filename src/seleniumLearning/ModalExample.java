package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		
		driver.findElement(By.xpath(".//a[@href='#myModal0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("myModal0")).findElement(By.xpath(".//*[@class='btn']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//a[@href='#myModal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[@href='#myModal2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("myModal2")).findElement(By.xpath(".//*[@class='btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("myModal")).findElement(By.xpath(".//*[@class='btn']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
