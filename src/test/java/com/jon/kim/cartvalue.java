package com.jon.kim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class cartvalue {
@Test
public void hello() throws Exception {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\chrome.exe");
	ChromeOptions edd=new ChromeOptions();
	edd.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.walmart.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();	
	driver.manage().deleteAllCookies();
	WebElement t=driver.findElement(By.xpath("//input[@class='flex-auto lh-solid sans-serif br-pill f5 b--none']"));
	t.sendKeys("bagpack for women");
	WebElement R=driver.findElement(By.xpath("//button[@class='absolute bn br-100 h3 w3 bg-gold']"));
	R.click();
	driver.get("https://www.walmart.com/ip/Michael-Kors-Phoebe-Medium-Backpack-Drawstring-School-Bag-Vanilla-MK-Signature/1255014694?from=/search");
	WebElement Z= driver.findElement(By.className("//button[@class='w_hhLG w_8nsR w_jDfj']"));
	Z.click();	
	Thread.sleep(10000);
	driver.close();

}
}
