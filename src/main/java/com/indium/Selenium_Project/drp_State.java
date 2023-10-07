package com.indium.Selenium_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drp_State {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	    driver.manage().window().maximize();
	    WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
	    WebElement drpStateEle=driver.findElement(By.xpath("//select[@id='state-list']"));
	    Select drpCountry=new Select(drpCountryEle);
	    Select drpState=new Select(drpStateEle);
	    drpCountry.selectByVisibleText("India");
	    drpState.selectByVisibleText("Delhi");
	}
}
