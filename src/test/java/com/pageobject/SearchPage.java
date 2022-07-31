package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.SearchUI;

public class SearchPage extends BaseClass{

	public static void searchpage(WebDriver driver, String prod, String msg) throws Exception {
		
		
		help.clickm(SearchUI.searchbutton);
		help.sendkeysm(SearchUI.searchbutton, prod);
		help.keyboardm(SearchUI.searchbutton);
		
		help.scrollWindow(0, 150);
		help.clickm(SearchUI.closepopup);
		help.clickm(SearchUI.clicklist);
		
		help.clickm(SearchUI.productpreview);
		
		String str = help.getTextm(SearchUI.selectproduct);
		
		if(str.contains(msg))
		{
			Assert.assertTrue(str.contains(msg));
		}
		
		help.clickm(SearchUI.retailer);
		cs.CaptureScreenShot(driver);
		help.home();
	}
}
