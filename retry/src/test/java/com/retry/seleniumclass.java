package com.retry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopik\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("gopikrishna18.gk@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Gopi@2996");
	driver.findElement(By.name("login")).click();
	
	}
}
