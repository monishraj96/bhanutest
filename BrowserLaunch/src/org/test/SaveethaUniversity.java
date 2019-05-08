package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SaveethaUniversity {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.saveetha.com/");
		WebElement para = wb.findElement(By.xpath("//*[@id=\"wsite-content\"]/div/div/div/div/div/div[1]/font/text()[1]"));
		para.getText();
		System.out.println(para);
		
				
				
	}

}
