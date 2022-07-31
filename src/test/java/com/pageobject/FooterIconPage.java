package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.FooterIconUI;


public class FooterIconPage extends BaseClass{
	
	public static void footercontactpage(WebDriver driver, String str) throws Exception {
		help.clickm(FooterIconUI.icon);
		Thread.sleep(2000);
		
		help.clickm(FooterIconUI.clickOption);
		
		String txt = help.getTextm(FooterIconUI.text);
		
		cs.CaptureScreenShot(driver);
		
		if(txt.contains(str))
		{
			Assert.assertTrue(txt.contains(str));
		}
		
		help.home();
	}
	

}
