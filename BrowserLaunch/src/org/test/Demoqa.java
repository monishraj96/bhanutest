package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement btn = d.findElement(By.xpath("//a[text()='New User Activation']"));
		btn.click();
		String parent = d.getWindowHandle();
		System.out.println(parent);
		Set<String> all = d.getWindowHandles();
		System.out.println(all);
		for (String eachWindowId : all) {
			if (!parent.equals(eachWindowId)) {
				d.switchTo().window(eachWindowId);
				
			}
			
		}
		WebElement txt = d.findElement(By.id("fldUId"));
		txt.sendKeys("1234");
		
		d.quit();
		
		
	}
	

}
