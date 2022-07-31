package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;
import com.uistore.SignupUI;


public class SignupPage extends BaseClass{
	
public static void signuppage(WebDriver driver, String exstr, String name, String mail, String pass) throws Exception {
		
				
		help.clickm(SignupUI.registerbutton);
		
		Thread.sleep(3000);
		help.clickm(SignupUI.signupbutton);
		
		help.switchWindowm();
		
		String title = driver.getTitle();
		
		if(title.contains(exstr)) {
			help.clickm(SignupUI.entername);
			help.sendkeysm(SignupUI.entername, name);
			help.clickm(SignupUI.enteremail);
			help.sendkeysm(SignupUI.enteremail, mail);
			help.clickm(SignupUI.enterpassword);
			help.sendkeysm(SignupUI.enterpassword, pass);
			help.waitm(SignupUI.submit);
			help.clickm(SignupUI.submit);
			
			cs.CaptureScreenShot(driver);
			Thread.sleep(3000);
			help.home();
			
		}
	
	}
}
