package seleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> tableBody = driver.findElements(By.xpath(".//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr"));
		System.out.println(tableBody.size());
		
		//String text = driver.findElement(By.xpath(".//table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[1]")).getText();
		
		String img = driver.findElement(By.xpath(".//table/tbody/tr/td[2]/table/tbody/tr/td/img")).getAttribute("src");
		System.out.println(img);
		
		String text = driver.findElement(By.xpath(".//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr/td")).getText();
		System.out.println(text);
		
		
		List<WebElement> tRows = driver.findElements(By.xpath(".//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr"));
		System.out.println(tRows.size());
		
		for (int i = 0; i < tRows.size(); i++){
			
			List<WebElement> tCols = tRows.get(i).findElements(By.tagName("td"));
			//System.out.println(tCols.size());
			
			for (int j = 0; j < tCols.size(); j++){
				
				if (tCols.get(j).getText().contains("New York")){
					
					System.out.println(tCols.get(j+1).getText());
					break;
				}
				//System.out.print(tCols.get(j).getText() + " ");
			}
			//System.out.println();
			
		}
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("findFlights")).click();
		
		WebElement tBody = driver.findElement(By.xpath(".//*[@name='results']/table/tbody"));
		
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		//System.out.println(rows.get(0).);
		
		for (int i = 0; i < rows.size(); i++){
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(tCols.size());
			
			for (int j = 0; j < cols.size(); j++){
				
				System.out.print(cols.get(j).getText() + " ");
				/*if (tCols.get(j).getText().contains("New York")){
					
					System.out.println(tCols.get(j+1).getText());
					break;
				}*/
				//System.out.print(tCols.get(j).getText() + " ");
			}
			System.out.println();
			
		}
		
		//driver.quit();
	}

}
