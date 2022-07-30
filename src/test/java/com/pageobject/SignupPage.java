package com.pageobject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;
import com.uistore.SignupUI;


public class SignupPage extends BaseClass{
	
public static void signuppage(WebDriver driver, String exstr, String name, String mail, String pass) throws InterruptedException {
		
				
		driver.findElement(SignupUI.registerbutton).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(SignupUI.iframepop));
		//driver.findElement(SignupUI.iframepop).click();
		Thread.sleep(3000);
		driver.findElement(SignupUI.signupbutton).click();
		
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
			String newwin = it.next();
			driver.switchTo().window(newwin);
		}
		
		
		String title = driver.getTitle();
		
		if(title.contains(exstr)) {
			driver.findElement(SignupUI.entername).click();
			driver.findElement(SignupUI.entername).sendKeys(name);
			
			driver.findElement(SignupUI.enteremail).click();
			driver.findElement(SignupUI.enteremail).sendKeys(mail);
			
			driver.findElement(SignupUI.enterpassword).click();
			driver.findElement(SignupUI.enterpassword).sendKeys(pass);
			
			//WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(SignupUI.submit));
			driver.findElement(SignupUI.submit).click();
			cs.CaptureScreenShot(driver);
			Thread.sleep(3000);
			driver.navigate().to("https://tide.com/en-us");
			
		}
	
	}
}
