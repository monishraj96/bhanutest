package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver wb=new ChromeDriver();
	wb.get("https://www.youtube.com/?gl=IN");

String title = wb.getTitle();
System.out.println(title);
String Url = wb.getCurrentUrl();
System.out.println(Url);
WebElement text = wb.findElement(By.xpath("//h2[contains(text(),'music')]"));
String t = text.getText();
System.out.println(t);


}
}
	
	