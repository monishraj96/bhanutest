package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver wb=new ChromeDriver();
	wb.get("http://www.greenstechnologys.com/");
	WebElement text = wb.findElement(By.xpath("//p[contains(text(),'working')]"));
	String t = text.getText();
	System.out.println(t);
	
	
	
	}

}
