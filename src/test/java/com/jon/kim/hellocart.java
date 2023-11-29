package com.jon.kim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class hellocart {
@Test
public void prac() throws Exception {
	System.setProperty("webdriver.Edge.driver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\msedgedriver.exe");
	EdgeOptions edd=new EdgeOptions();
	edd.addArguments("--remote-allow-origins=*");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.walmart.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement t=driver.findElement(By.xpath("//input[contains(@class,'flex-auto lh-solid sans-serif br-pill f5 b--none')]"));
	t.sendKeys("bagpack for women");
	WebElement R=driver.findElement(By.xpath("//button[@class='absolute bn br-100 h3 w3 bg-gold']"));
	R.click();
	driver.get("https://www.walmart.com/ip/Michael-Kors-Phoebe-Medium-Backpack-Drawstring-School-Bag-Vanilla-MK-Signature/1255014694?from=/search");
	WebElement Z=driver.findElement(By.xpath("//span[text()='Add to cart']"));
	Z.click();
	WebElement B=driver.findElement(By.xpath("//span[@id='cart-badge']"));
	B.click();
	Thread.sleep(10000);
	driver.close();
}
}
