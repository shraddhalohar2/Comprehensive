package com.pageobject;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.runner.BaseClass;
import com.uistore.FooterCAUI;
import com.uistore.FooterContactUsUI;

public class FooterContactUsPage extends BaseClass{
	public static void footercontactpage(WebDriver driver, String q, String str) throws Exception {
		
		
		help.clickm(FooterContactUsUI.contact);
		
		help.waitm(FooterContactUsUI.iframepop);
		help.clickm(FooterContactUsUI.iframepop);
		
		Thread.sleep(3000);
		help.frame();
		
		help.clickm(FooterContactUsUI.question);
		
		help.sendkeysm(FooterContactUsUI.question, q);
		help.keyboardm(FooterContactUsUI.question);
		help.clickm(FooterContactUsUI.clickques);
		
		String txt = help.getTextm(FooterContactUsUI.text);
		cs.CaptureScreenShot(driver);
		if(txt.contains(str))
		{
			Assert.assertTrue(txt.contains(str));
		}
	
		help.home();
	}
}

	


