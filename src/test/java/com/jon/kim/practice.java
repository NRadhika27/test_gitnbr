package com.jon.kim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class practice {
@ Test
public void nan() throws Exception {
System.setProperty("webdriver.Edgedriver", "C:\\Users\\debashis\\eclipse-workspace\\kim\\Drivers\\msedgedriver.exe");
EdgeOptions edd=new EdgeOptions();
edd.addArguments("--remote-allow-origins=*");
WebDriver driver=new EdgeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
WebElement t=driver.findElement(By.id("search_query"));
t.sendKeys("shark");
//Thread.sleep(10000);//
driver.close();


}

}

