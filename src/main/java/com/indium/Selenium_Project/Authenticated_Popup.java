package com.indium.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticated_Popup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	    driver.manage().window().maximize();
	    
	  String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
	    
	    if(text.contains("Congratulations"))
	    {
	    	System.out.println("successful Login");
	    }
	    else
	    {
	    	System.out.println("Login Faild"); 
	    }
	}
}
