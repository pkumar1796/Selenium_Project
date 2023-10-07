package com.indium.Selenium_Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_with_Input_box {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	   //WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	    
	    Alert alertwindow=driver.switchTo().alert();
	  
	    System.out.println(alertwindow.getText());
	     
	     alertwindow.sendKeys("Welcome");

        //alertwindow.accept();
       alertwindow.dismiss();
        
        //validation
        String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String exp_text="You entered: Welcome";
        
        if(act_text.equals(exp_text))
        {
        	System.out.println("Test passed");
        }
        else
        {
        	System.out.println("Test failed");
        }
     }
}
