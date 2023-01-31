package com.indium.Selenium_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_with_Select_Tag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //  driver.get("https://www.opencart.com/index.php?route=account/register");
	    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	    driver.manage().window().maximize();
	   // WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
	    WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
	    //WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='state-list']"));
	    Select drpCountry=new Select(drpCountryEle);
	
	    //1) Selecting an option from the Drop_down
	    Thread.sleep(4000);
	    //drpCountry.selectByValue("1");
	    //drpCountry.selectByVisibleText("USA");
	   // drpCountry.selectByIndex(4);
	    List<WebElement> Options=drpCountry.getOptions();
	    System.out.println("total number of options:"+Options.size());
	    
	    //print options in console window
	    
	    /*for(int i=0;i<Options.size();i++)
	    
	    {
	      System.out.println(Options.get(i).getText());
	    }
       */
	    // using enhanced loop
	    
	    for(WebElement op:Options)
	    {
	      System.out.println(op.getText());
	    }
	    
	    
     }
}
 