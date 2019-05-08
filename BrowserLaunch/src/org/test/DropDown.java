package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.gettyimages.in/");
	WebElement enter= d.findElement(By.xpath("//div[@class='header-search-bar-media-filter__selected-label media-filter-label']"));
	enter.click();
	
	

	
	WebElement enter1 = d.findElement(By.xpath("//label[text()='Video']"));
	enter1.click();
	
}
}
