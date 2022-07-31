package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.Menu5UI;


public class Menu5Page extends BaseClass{
	

	public static void menu5page(WebDriver driver, String str, String s1) throws Exception {
		
		String parent=driver.getWindowHandle();
		help.clickm(Menu5UI.clickmenu);
		help.clickm(Menu5UI.option);
		
		help.switchWindowm();
			
			
		if(help.getTitlem().contains(str)) {
				String text  = help.getTextm(Menu5UI.text);
				if(text.contains(s1))
				{
					Assert.assertTrue(text.contains(s1));
				}
				
			}
		
		cs.CaptureScreenShot(driver);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		help.home();
		
	}
	
}
