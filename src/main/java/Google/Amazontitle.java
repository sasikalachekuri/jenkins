package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazontitle {
    WebDriver driver ;
   @BeforeMethod
    public void setup(){
	   driver = new ChromeDriver();
	}
   @Test
   public void google(){
	   driver.get("https://www.Amazon.com/");
	   System.out.println(driver.getTitle());
    }
   
   @AfterMethod
   public void CloseBrowser(){
	   driver.close();
   }
}


