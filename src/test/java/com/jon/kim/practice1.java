package com.jon.kim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class practice1 {
@Test
public void boy() throws Exception {
	System.setProperty("webDriver.Chrome.driver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\chrome.exe");
	ChromeOptions edd=new ChromeOptions();
	edd.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
//	WebElement R=driver.findElement(By.className("yt-spec-touch-feedback-shape__fill"));
	//R.sendKeys("value");
	
	WebElement t=driver.findElement(By.xpath("//input[@id='search']"));
	t.sendKeys("Shark");
	WebElement Z=driver.findElement(By.linkText("Help"));
	Z.click();
	Thread.sleep(10000);
     driver.close();
}
}
