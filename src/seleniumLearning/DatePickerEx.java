package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEx {

	static String monthYear;
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demoqa.com/datepicker/");
		
		System.out.println(monthYear);
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
			
		driver.findElement(By.id("datepicker1")).click();
		monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		while(! monthYear.contains("August 2018")){
			driver.findElement(By.xpath(".//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		if (monthYear.contains("August 2018")) {
			List<WebElement> tRows = driver.findElements(By.xpath(".//table[@class='ui-datepicker-calendar']/tbody/tr"));
			for(int i = 0; i < tRows.size(); i++){
				List<WebElement> tCols = tRows.get(i).findElements(By.tagName("td"));
				for(int j = 0; j < tCols.size(); j++){
					String date = tCols.get(j).getText();
					System.out.println(date);
					if(date.contains("15")){
						tCols.get(j).click();
						break;
					}
				}
			}
		}
		
		
		
	}

}
