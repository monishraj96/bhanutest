package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplebr {
	
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver()	;
			d.get("http://www.google.com/");
			d.findElement(By.name("q")).sendKeys("testing");
			d.findElement(By.name("btnK")).click();
			
	}

}
