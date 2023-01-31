package com.indium.Selenium_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chech_img {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     //  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	       driver.get("http://google.com");
	       //driver.get("http://google.com");
	       driver.get("http://facebook.com");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int count =  links.size();
			
			System.out.println(count);
	}
}
  