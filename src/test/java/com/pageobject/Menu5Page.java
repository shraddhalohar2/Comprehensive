package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.Menu5UI;


public class Menu5Page extends BaseClass{
	

	public static void menu5page(WebDriver driver, String str, String s1) throws InterruptedException {
		
		String parent=driver.getWindowHandle();
		driver.findElement(Menu5UI.clickmenu).click();
		driver.findElement(Menu5UI.option).click();
		
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
			String newwin = it.next();
			driver.switchTo().window(newwin);
			
			if(driver.getTitle().contains(str)) {
				String text  = driver.findElement(Menu5UI.text).getText();
				if(text.contains(s1))
				{
					Assert.assertTrue(text.contains(s1));
				}
				
			}
		}
		cs.CaptureScreenShot(driver);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.navigate().to("https://tide.com/en-us");
		
	}
	
}
