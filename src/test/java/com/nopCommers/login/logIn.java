package com.nopCommers.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logIn {
 
  @org.testng.annotations.Test
	public void Test() {
	//System.setProperty("webdriver.chrome.driver","C:\\\\Testing\\\\drivers\\\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazonlogin.com/");
     driver.findElement(By.id("sowmyanadh"));
     driver.close();
	}
}