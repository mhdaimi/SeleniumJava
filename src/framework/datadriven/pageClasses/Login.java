package framework.datadriven.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.datadriven.objectRepository.ObjectRepository;

public class Login {
	
	public static void enterUserId(WebDriver driver, String userId){
		System.out.println(userId);
		driver.findElement(By.name(ObjectRepository.userName)).sendKeys(userId);
	}

	public static void enterPassword(WebDriver driver, String password){
		System.out.println(password);
		driver.findElement(By.name(ObjectRepository.password)).sendKeys(password);
	}
	
	public static void clickLoginButton(WebDriver driver){
		driver.findElement(By.name(ObjectRepository.login)).click();
	}
}
