package com.runner;

import org.testng.annotations.Test;

import com.pageobject.Menu5Page;

public class Menu5 extends BaseClass{
	@Test
	public void menu5() throws InterruptedException {

		logger = report.createTest("Menu 5 - Coupon and Rewards Test");
		log.info("Extent Report test is created");
		
		String str = excel.getstringdata("Signup", 2, 1);
		String s1 = excel.getstringdata("OptionMenu", 10, 1);
		
		logger.info("Verifing Menu Activity").assignAuthor("Shraddha");

		Menu5Page.menu5page(driver, str, s1);
		
//		Menu2 m = new Menu2();
//		m.menu2();
		
		//Thread.sleep(5000);
		log.info("Executed all test");
	}

}
