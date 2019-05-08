package org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver wb=new ChromeDriver();
	wb.get("https://paytm.com/");
	wb.manage().window().maximize();
	
	
	
	WebElement login = wb.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
	login.click();
	Thread.sleep(3000);
WebElement fram = wb.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
	wb.switchTo().frame(fram);
	WebElement login2 = wb.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile')]"));
	login2.click();
	
	wb.findElement(By.name("username")).sendKeys("9087426646");
	wb.findElement(By.name("password")).sendKeys("Bhanu@1995");
	wb.findElement(By.xpath("//button[@type='submit']")).click();
	

		}
		
	
	
	


}
