package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.Menu2UI;

public class Menu2Page extends BaseClass{
	

	public static void menu2page(WebDriver driver, String str) throws Exception {

		help.actionHover(Menu2UI.hover);
		
		help.clickm(Menu2UI.option);
		Thread.sleep(2000);
		help.clickm(Menu2UI.learnmore);
		
		String urltext = help.getTextm(Menu2UI.text);
		
		if(urltext.contains(str))
		{
			Assert.assertTrue(urltext.contains(str));
		}
		cs.CaptureScreenShot(driver);
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(Menu2UI.iframepop));
		//driver.findElement(Menu2UI.iframepop).click();
		Thread.sleep(3000);
		
		help.home();
	}

}
