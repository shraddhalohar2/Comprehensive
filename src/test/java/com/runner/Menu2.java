package com.runner;

import org.testng.annotations.Test;

import com.pageobject.Menu1Page;
import com.pageobject.Menu2Page;

public class Menu2 extends BaseClass{
	@Test
	public void menu2() throws Exception {

		logger = report.createTest("Menu 2 - Our Commitment Test");
		log.info("Extent Report test is created");
		
		String str = excel.getstringdata("OptionMenu", 6, 1);
		
		logger.info("Verifing Menu Activity").assignAuthor("Shraddha");

		Menu2Page.menu2page(driver, str);
		
//		Menu1 mp = new Menu1();
//		mp.menu1();
		//Thread.sleep(5000);
		log.info("Executed all test");
	}
}
