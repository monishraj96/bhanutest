package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("bhanuprasad75@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("bhanupriya");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement cat = d.findElement(By.xpath("//span[@class=\"_1QZ6fC _3Lgyp8\"]"));
		Actions a=new Actions(d);
		a.moveToElement(cat).perform();
		WebElement cat1 = d.findElement(By.xpath("//a[text()='Fully Automatic Front Load']"));
		cat1.click();
		
	}

}
