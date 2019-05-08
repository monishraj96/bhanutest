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

public class ContactGreenTech {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("http://www.greenstechnologys.com/");
WebElement con = d.findElement(By.xpath("//a[text()='CONTACT US']"));
Actions acc=new Actions(d);
acc.contextClick(con).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

String single = d.getWindowHandle();
Set<String> all = d.getWindowHandles();
for (String each : all) {
	if(!single.equals(each));{
		d.switchTo().window(each);
	}
	
}
WebElement add = d.findElement(By.xpath("//div[@class='col-sm-3'][2]"));
String text = add.getText();
System.out.println(text);



	}

}
