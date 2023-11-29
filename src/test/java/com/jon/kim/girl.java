package com.jon.kim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.annotations.Test;

public class girl {
@Test
public void practice() throws Exception {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\chrome.exe");
	ChromeOptions edd=new ChromeOptions();
	edd.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bankofamerica.com/");
	driver.manage().window().maximize();
	WebElement t=driver.findElement(By.id("onlineId1"));
	t.sendKeys("boy");
	WebElement R=driver.findElement(By.xpath("//span[text()='Log In']"));
	R.click();
	Thread.sleep(10000);
	driver.close();
}
}
