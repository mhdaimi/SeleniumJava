package seleniumLearning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
/*		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime beforeTime = LocalDateTime.now();  
		System.out.println(dtf.format(beforeTime)); 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//Thread.sleep(11);
		try{
		wait.until(ExpectedConditions.titleContains("TATA"));
		} catch (Exception e){
		LocalDateTime afterTime = LocalDateTime.now();  
		System.out.println(dtf.format(afterTime));
		}*/
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("alert")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime beforeTime = LocalDateTime.now();  
		System.out.println(dtf.format(beforeTime)); 
		try{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e){
		
		LocalDateTime afterTime = LocalDateTime.now();  
		System.out.println(dtf.format(afterTime));
		}

	}

}
