package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhanu\\eclipse-workspace\\bhanu\\BrowserLaunch\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver()	;
		d.get("https://www.amazon.in/");
		WebElement cat = d.findElement(By.xpath("//span[text()='Shop by']"));
		Actions a=new Actions(d);
		a.moveToElement(cat).perform();
		WebElement cat1 = d.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		a.moveToElement(cat1).perform();
		WebElement cat2 = d.findElement(By.xpath("//span[text()='Power Banks']"));
		cat2.click();
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
	}
	

}
