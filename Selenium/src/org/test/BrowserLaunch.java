package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	//set property
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
// launch browser
WebDriver sc=new ChromeDriver();
sc.get("https://www.green technologies.com/");
//to quit
sc.quit();
}
}
