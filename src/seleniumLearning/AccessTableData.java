package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessTableData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		String text = driver.findElement(By.id("myTable")).findElement(By.xpath("tr/td[2]")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		String text1 = driver.findElement(By.id("task-table")).findElement(By.xpath("tbody/tr[2]/td[3]")).getText();
		System.out.println(text1);

		Thread.sleep(5000);
		driver.get("http://www.seleniumeasy.com/test/table-sort-search-demo.html");

		String name = driver.findElement(By.id("example")).findElement(By.xpath("tbody/tr[10]/td")).getText();
		System.out.println("10th row: " + name);
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.name("example_length"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("25");
		
		String name25 = driver.findElement(By.id("example")).findElement(By.xpath("tbody/tr[25]/td")).getText();
		System.out.println("25th row: " + name25);
		
		driver.findElement(By.xpath(".//input[@type='search']")).sendKeys("Tokyo");
		List<WebElement> list = driver.findElement(By.id("example")).findElements(By.xpath("tbody/tr"));
		System.out.println("Number of records for Tokyo: " + list.size());
	}

}
