package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");

	WebDriver wd=new ChromeDriver();
	wd.get("http://www.greenstechnologys.com/");
	WebElement btn = wd.findElement(By.xpath("//a[@href='contact.php']"));
	
	btn.click();
	
WebElement name = wd.findElement(By.id("InputName"));
name.sendKeys("Bhanu");
WebElement email = wd.findElement(By.id("InputEmail1"));
email.sendKeys("bhanuprasad.75@gmail.com");
WebElement phnum = wd.findElement(By.id("InputSubject"));
phnum.sendKeys("908426646");
WebElement message = wd.findElement(By.xpath("//textarea[@class='form-control input-message']"));
message.sendKeys("hai");
WebElement button = wd.findElement(By.xpath("//button[@value='Send']"));
button.click();
wd.quit();

}

}
