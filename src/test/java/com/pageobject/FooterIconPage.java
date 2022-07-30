package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.FooterIconUI;


public class FooterIconPage extends BaseClass{
	
	public static void footercontactpage(WebDriver driver, String str) throws InterruptedException {
		driver.findElement(FooterIconUI.icon).click();
		Thread.sleep(2000);
		
		driver.findElement(FooterIconUI.clickOption).click();
		
		String txt=driver.findElement(FooterIconUI.text).getText();
		
		cs.CaptureScreenShot(driver);
		
		if(txt.contains(str))
		{
			Assert.assertTrue(txt.contains(str));
		}
		
		driver.navigate().to("https://tide.com/en-us");
	}
	

}
