package com.indium.Selenium_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handel_Inner_Frame {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://ui.vision/demo/webtest/frames/");
	     driver.manage().window().maximize();
	     
	     WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	     driver.switchTo().frame(frm1);
	     
	     driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
	     
	}

}
