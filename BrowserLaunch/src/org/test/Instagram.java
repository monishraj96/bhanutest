package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.instagram.com/");
		WebElement login = wb.findElement(By.xpath("//button[@type='button']"));
		login.click();
		WebElement email = wb.findElement(By.id("email"));
		email.sendKeys("bhanuprasad75@gmail.com");
		WebElement password = wb.findElement(By.id("pass"));
		password.sendKeys("bhanupriyaa");
	WebElement loginto = wb.findElement(By.xpath("//button[@value='1']"));
	loginto.click();
	String title = wb.getTitle();
	System.out.println(title);
	String Url = wb.getCurrentUrl();
	System.out.println(Url);
	WebElement text = wb.findElement(By.xpath("//h1[contains(text(),'Instagram')]"));
	String t = text.getText();
			System.out.println(t);
	}
}