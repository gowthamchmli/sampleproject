package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowtham\\eclipse-workspace\\Selenium10AM\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
    driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	
	WebElement btnConfirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	btnConfirm.click();
	
	Thread.sleep(1000);
	
	Alert a = driver.switchTo().alert();
	a.dismiss();
	System.out.println("Done..");
	}
	
}
