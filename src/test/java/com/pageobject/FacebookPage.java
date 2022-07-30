package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.ReusableScreenshot;
import com.runner.BaseClass;
import com.uistore.FacebookUI;

public class FacebookPage extends BaseClass{
	
public static void facebookpage(WebDriver driver, String txt) throws InterruptedException {

		
		//String parent=driver.getWindowHandle();
		driver.findElement(FacebookUI.icon).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals(txt))
		{
			Assert.assertEquals(url, txt);
			
		}
		cs.CaptureScreenShot(driver);
		Thread.sleep(2000);
		driver.navigate().to("https://tide.com/en-us");
	}
	
	
}
