package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.ReusableHelper;
import com.runner.BaseClass;
import com.uistore.FacebookUI;

public class FacebookPage extends BaseClass{
	
public static void facebookpage(WebDriver driver, String txt) throws Exception {

		//String parent=driver.getWindowHandle();
		help.clickm(FacebookUI.icon);
		cs.CaptureScreenShot(driver);
		
		String url = help.getUrl();
		if(url.equals(txt))
		{
			Assert.assertEquals(url, txt);
			
		}
		
		Thread.sleep(2000);
		help.home();
	}
	
	
}
