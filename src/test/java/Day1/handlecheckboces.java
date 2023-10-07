package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlecheckboces {

	public static void main(String[] args) throws Throwable 
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://itera-qa.azurewebsites.net/home/automation");
       
     List<WebElement> rlist= driver.findElements(By.xpath("//input[@type='checkbox' and @class='custom-control-input']"));
     System.out.println("total days" +rlist.size());
     
     for(int i=0;i<rlist.size();i++)
     {
    	 rlist.get(i).click();
     }
     
     }
	}
	