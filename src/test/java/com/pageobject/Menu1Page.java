package com.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.runner.BaseClass;
import com.uistore.Menu1UI;

public class Menu1Page extends BaseClass{

	public static void menu1page(WebDriver driver, String text) throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement shop = driver.findElement(Menu1UI.hover);
		a.moveToElement(shop).perform();
		
		driver.findElement(Menu1UI.option).click();
		String fromurl = driver.findElement(Menu1UI.textselect).getText();
		cs.CaptureScreenShot(driver);
		if(fromurl.contains(text))
		{
			Assert.assertTrue(fromurl.contains(text));
		}
		Thread.sleep(3000);
		driver.navigate().to("https://tide.com/en-us");
	}
}
