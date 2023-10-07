package com.indium.Selenium_Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handel_Alert_with_ok {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	   WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
       // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
      //  driver.switchTo().alert().accept();
       // Alert alertwindow=driver.switchTo().alert();
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        
        System.out.println(alertwindow.getText());
        Thread.sleep(3000);
        alertwindow.accept();//this will close alert window using ok button
      //alertwindow.dismiss();// close alert window by using cancel button
       
        
	}

}
