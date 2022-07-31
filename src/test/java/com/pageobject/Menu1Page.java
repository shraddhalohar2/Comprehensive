package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.Menu1UI;

public class Menu1Page extends BaseClass{

	public static void menu1page(WebDriver driver, String text) throws Exception {
		
		help.actionHover(Menu1UI.hover);
		
		help.clickm(Menu1UI.option);
		
		String fromurl = help.getTextm(Menu1UI.textselect);
		cs.CaptureScreenShot(driver);
		if(fromurl.contains(text))
		{
			Assert.assertTrue(fromurl.contains(text));
		}
		Thread.sleep(3000);
		help.home();
	}
}
