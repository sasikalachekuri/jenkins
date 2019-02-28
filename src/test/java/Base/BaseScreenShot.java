package Base;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class BaseScreenShot{
	public static WebDriver driver;
	
	public static void BrowserOpen(){
		driver = new ChromeDriver();
			
		}

	protected void FailedMethod(String result){
        try{
        	String path = System.getProperty("user.dir");//Gives current Directory
    		System.out.println(path);
        		TakesScreenshot ts = (TakesScreenshot)driver;
        		File Srcfile = ts.getScreenshotAs(OutputType.FILE);
        	//FileUtils.copyFile(Srcfile, new File("C:/Users/amrit/Documents/workSpace_RS/Jenkins_Testng/FailedScreenShots/"+result+".jpg"));
        		FileUtils.copyFile(Srcfile, new File(path+"\\FailedScreenShots\\"+result+".jpg"));
        		System.out.println("Screenshot Taken");
        		
        }catch(Exception e){
        		System.out.println("Exeption message while taking screen shot " +e.getMessage());
        }
    }	
   
     protected void BrowserClose() {
			driver.quit();
	}
		
	
}
