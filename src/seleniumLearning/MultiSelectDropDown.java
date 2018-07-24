package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//driver.findElement(By.id("select-demo")).sendKeys("Wednesday");
		WebElement element = driver.findElement(By.id("select-demo"));
		Select obj = new Select(element);
		obj.selectByIndex(6);
//		
		WebElement element1 = driver.findElement(By.id("multi-select"));
		Select obj1 = new Select(element1);
		obj1.selectByIndex(1);
		obj1.selectByValue("Ohio");
		obj1.selectByVisibleText("Washington");
		
//		driver.close();
		driver.get("http://wenzhixin.net.cn/p/multiple-select/docs/");
		//driver.findElement(By.className("ms-choice")).click();
		driver.findElement(By.xpath(".//p[@id='e1_t']//div/button")).click();
		
		List<WebElement> checkBoxList = driver.findElements(By.xpath(".//p[@id='e1_t']//div/div/ul/li"));
		for(int i = 0; i < checkBoxList.size(); i++){
			System.out.println(checkBoxList.get(i).getText());
			if(checkBoxList.get(i).getText().contains("February") || checkBoxList.get(i).getText().contains("August")){
				checkBoxList.get(i).click();
			}
		}
//		WebElement element2 = driver.findElement(By.id("e1_f"));
//		select 
	}
}
