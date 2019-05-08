package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver wb=new ChromeDriver();
		wb.get("https:www.facebook.com/");
		WebElement email = wb.findElement(By.id("email"));
		email.sendKeys("9087426646");
		WebElement password = wb.findElement(By.id("pass"));
		password.sendKeys("bhaupriyaa");
		WebElement btn = wb.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
	}
}
