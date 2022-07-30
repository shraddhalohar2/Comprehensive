package com.pageobject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.SpinnerUI;

public class SpinnerPage extends BaseClass{
	
	public static void spinnerpage(WebDriver driver, String str) throws InterruptedException {
		driver.findElement(SpinnerUI.spinobj).click();
		driver.findElement(SpinnerUI.spinobj).click();
		
		driver.findElement(SpinnerUI.button).click();
		
		String txt=driver.findElement(SpinnerUI.text).getText();
		if(txt.contains(str)) {
			//flag = true;
			Assert.assertTrue(txt.contains(str));
		}
		cs.CaptureScreenShot(driver);
		driver.navigate().to("https://tide.com/en-us");
		
	}
	
}
