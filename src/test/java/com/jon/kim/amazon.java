package com.jon.kim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class amazon {
@Test
public void any() throws Exception {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\chrome.exe");
	ChromeOptions edd=new ChromeOptions();
	edd.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement t=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	t.sendKeys("bagpack for women");
	WebElement R=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	R.click();
	
	//driver.get("https://www.amazon.com/Classic-Backpack-Capacity-Backpacks-Resistant/dp/B094FWCJMQ/ref=sr_1_1_sspa?crid=6IR8WIJM50BW&keywords=backpack%2Bfor%2Bwomen&qid=1693370633&sprefix=%2Caps%2C141&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
WebElement C=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
       C.click();
	WebElement B=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	B.click();
	Thread.sleep(10000);
	driver.close();	
}
}
