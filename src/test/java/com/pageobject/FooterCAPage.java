package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.reusablecomponents.ReusableHelper;
import com.runner.BaseClass;
import com.uistore.FooterCAUI;



public class FooterCAPage extends BaseClass{
	
	public static void footercapage(WebDriver driver, String link, String str) throws Exception {
		
		help.clickm(FooterCAUI.calink);
		
		String parent=driver.getWindowHandle();
		help.switchWindowm();
		
		if(help.getTitlem().contains(link)) {
			String text = help.getTextm(FooterCAUI.text);
			cs.CaptureScreenShot(driver);
				if(text.contains(str))
				{
					Assert.assertTrue(text.contains(str));
				}
				
			}
			
			driver.switchTo().window(parent);
			Thread.sleep(3000);
			help.home();
	}
		
}
		
	
	

