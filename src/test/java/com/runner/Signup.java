package com.runner;

import org.testng.annotations.Test;

import com.pageobject.SignupPage;


public class Signup extends BaseClass{
	
	@Test
	public void sign() throws InterruptedException {

		logger = report.createTest("Signup Test");
		log.info("Extent Report test is created");
		
		String exstr = excel.getstringdata("Signup", 2, 1);
		String name = excel.getstringdata("Signup", 3, 1);
		String mail = excel.getstringdata("Signup", 4, 1);
		String pass = excel.getstringdata("Signup", 5, 1);

		logger.info("Signup Activity").assignAuthor("Shraddha");

		SignupPage.signuppage(driver, exstr, name, mail, pass);

		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}
}
