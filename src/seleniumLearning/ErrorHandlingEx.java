package seleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedErrorExample uce = new UncheckedErrorExample();
		//uce.uncheckedErrorNoSuchElement();
		//uce.uncheckedErrorNoSuchFrame();
		uce.uncheckedErrorException();
	}
}

class UncheckedErrorExample {
	
	public void uncheckedErrorNoSuchElement(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		try {
			driver.findElement(By.name("r")).sendKeys("execptions in selenium");
		} catch (NoSuchElementException e) {
			//e.printStackTrace();
			System.out.print("In catch block, caught NoSuchElementException");
		}
	}
	
	public void uncheckedErrorNoSuchFrame(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		try {
			driver.switchTo().frame(1);
		} catch (NoSuchFrameException e) {
			//e.printStackTrace();
			System.out.print("In catch block, caught NoSuchFrameException");
		}
	}
	
	public void uncheckedErrorException(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			driver.get("www.google.co.in");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("In catch block, caught an Exception");
			System.out.println(e.getMessage());
		}
	}
}

