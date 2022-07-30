package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.reusablecomponents.ReusableScreenshot;
import com.runner.BaseClass;
import com.uistore.FooterCAUI;
import com.uistore.FooterContactUsUI;

public class FooterContactUsPage extends BaseClass{
	public static void footercontactpage(WebDriver driver, String question, String str) throws InterruptedException {
		
		
		driver.findElement(FooterContactUsUI.contact).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(FooterContactUsUI.iframepop));
		driver.findElement(FooterContactUsUI.iframepop).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		driver.findElement(FooterContactUsUI.question).click();
		
		driver.findElement(FooterContactUsUI.question).sendKeys(question);
		driver.findElement(FooterContactUsUI.question).sendKeys(Keys.ENTER);
		driver.findElement(FooterContactUsUI.clickques).click();
		
		String txt = driver.findElement(FooterContactUsUI.text).getText();
		
		if(txt.contains(str))
		{
			Assert.assertTrue(txt.contains(str));
		}
		cs.CaptureScreenShot(driver);
		
		driver.navigate().to("https://tide.com/en-us");
	}
}

	


