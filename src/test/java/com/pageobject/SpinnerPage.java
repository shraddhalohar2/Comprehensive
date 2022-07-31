package com.pageobject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.SpinnerUI;

public class SpinnerPage extends BaseClass{
	
	public static void spinnerpage(WebDriver driver, String str) throws Exception {
		help.clickm(SpinnerUI.spinobj);
		help.clickm(SpinnerUI.spinobj);
		
		help.clickm(SpinnerUI.button);
		String txt = help.getTextm(SpinnerUI.text);
		if(txt.contains(str)) {
			//flag = true;
			Assert.assertTrue(txt.contains(str));
		}
		cs.CaptureScreenShot(driver);
		help.home();
		
	}
	
}
