package com.runner;

import org.testng.annotations.Test;

import com.pageobject.Menu1Page;

public class Menu1 extends BaseClass{
	@Test
	public void menu1() throws InterruptedException {

		logger = report.createTest("Menu 1 - Shop Products Test");
		log.info("Extent Report test is created");
		
		String text = excel.getstringdata("OptionMenu", 2, 1);
		
		logger.info("Verifing Menu Activity").assignAuthor("Shraddha");

		Menu1Page.menu1page(driver, text);
		
//		Search sp = new Search();
//		sp.search();
		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}
}
