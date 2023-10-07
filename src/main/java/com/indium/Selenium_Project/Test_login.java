package com.indium.Selenium_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
    //driver.findElement(By.id("name")).sendKeys("Prashant Kumar");
    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Kumar");
    driver.findElement(By.id("phone")).sendKeys("70044170xxx");
    driver.findElement(By.id("email")).sendKeys("prashantkumar1796@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwead1@32");
    driver.findElement(By.id("address")).sendKeys("pune");
    //submit
    driver.findElement(By.name("submit")).click();
    //Radio Button
    driver.findElement(By.id("male")).click();
    //Drop-down
    //check boxes total 7
    List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
    System.out.println("total number of checkboxes:"+checkboxes.size());
	
     //using for loop
    
    //select the all check boxes
	/*for(int i=0;i<checkboxes.size();i++)
	{ 
		checkboxes.get(i).click();
	}*/
	
   
    /*for(WebElement chkbox:checkboxes)
	  {
	     chkbox.click();
	  }*/
	
    
    //select last 2 checkboxes-how many checkboxes to be selected = starting index
    //7-3=4
   /* for(int i=4;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
    
   
    
    // select from start the checkboxes
    /* for(int i=0;i<3;i++)
    {
    	checkboxes.get(i).click();
    }*/
  
  
    //using if condtion
    /*for(int i=0;i<3;i++)
    {
    	if(i<2)
    	checkboxes.get(i).click();
    }*/
    
    
   // clear/uncheck checkboxes
    for(int i=0;i<3;i++)
	{ 
		checkboxes.get(i).click();
	}
    
    Thread.sleep(4000);
   
   /* for(int i=0;i<checkboxes.size();i++)
	{ 
    	if(checkboxes.get(i).isSelected())
		checkboxes.get(i).click();
	}*/
    for (WebElement chkbox:checkboxes)
    {
    	if(chkbox.isSelected())
    		chkbox.click();
    	 }
	}
}
	