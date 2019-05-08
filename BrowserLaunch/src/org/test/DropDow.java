package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class DropDow {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("https://www.google.com/");
		WebElement f = d.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(d);
		acc.contextClick(f).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parent = d.getWindowHandle();
	    Set<String> all = d.getWindowHandles();
		for (String winid : all) {
			
			if (!parent.equals(winid))
			{
				d.switchTo().window(winid);}
			
				
			}
			
		}
		
	
		
	
	
	}
	
	
	
	


