package com.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.SearchUI;

public class SearchPage extends BaseClass{

	public static void searchpage(WebDriver driver, String prod, String msg) throws InterruptedException {
		
		
		driver.findElement(SearchUI.searchbutton).click();
		driver.findElement(SearchUI.searchbutton).sendKeys(prod);
		driver.findElement(SearchUI.searchbutton).sendKeys(Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(SearchUI.iframepop));
		//driver.findElement(SearchUI.iframepop).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,150)", "");
	    driver.findElement(SearchUI.closepopup).click();
	    driver.findElement(SearchUI.clicklist).click();
		
		driver.findElement(SearchUI.productpreview).click();
		
		String str=driver.findElement(SearchUI.selectproduct).getText();
		
		if(str.contains(msg))
		{
			Assert.assertTrue(str.contains(msg));
		}
		
		driver.findElement(SearchUI.retailer).click();
		cs.CaptureScreenShot(driver);
		driver.navigate().to("https://tide.com/en-us");
	}
}
