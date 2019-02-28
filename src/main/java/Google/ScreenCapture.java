package Google;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseScreenShot;
import Base.CustomITestListener;

@Listeners(CustomITestListener.class)

public class ScreenCapture extends BaseScreenShot{
	@BeforeTest
	public void Setup(){
		BrowserOpen();
	}
	@Test
public void method1(){
		driver.get("https:/www.Amazon.com");
		Assert.assertEquals(true,false);	
	}
	@Test
public void method2(){
		driver.get("https:/www.google.com");
			Assert.assertEquals(true, true);	
	
	}
	@AfterTest
	public void TearDown(){
		BrowserClose();
	}
    
} 