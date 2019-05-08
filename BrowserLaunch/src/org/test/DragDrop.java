package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("https://www.facebook.com/");
		WebElement s = d.findElement(By.id("email"));
		
		Actions acc=new Actions(d);
		acc.keyDown(s,Keys.SHIFT).sendKeys(s,"bhanu").keyUp(s,Keys.SHIFT).perform();
	}

}
