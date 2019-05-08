package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("https://www.amazon.in/");
		WebElement over = d.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions acc=new Actions(d);
		acc.moveToElement(over).perform();
		d.findElement(By.xpath("//a[@class='nav-action-button']")).click();
		WebElement username = d.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("9087426646");
		acc.doubleClick(username).perform();
		d.findElement(By.id("continue")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	WebElement pass = d.findElement(By.id("ap_password"));
	pass.click();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	}

}
