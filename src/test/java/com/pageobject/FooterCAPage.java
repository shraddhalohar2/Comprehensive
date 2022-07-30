package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.FooterCAUI;



public class FooterCAPage extends BaseClass{
	
	public static void footercapage(WebDriver driver, String link, String str) throws InterruptedException {
		driver.findElement(FooterCAUI.calink).click();
		
		String parent=driver.getWindowHandle();
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
			String newwin = it.next();
			driver.switchTo().window(newwin);
			if(driver.getTitle().contains(link)) {
				String text  = driver.findElement(FooterCAUI.text).getText();
				if(text.contains(str))
				{
					Assert.assertTrue(text.contains(str));
				}
				
			}
			cs.CaptureScreenShot(driver);
			driver.switchTo().window(parent);
			Thread.sleep(3000);
			driver.navigate().to("https://tide.com/en-us");
		}
		
	}
		
	
	
}
