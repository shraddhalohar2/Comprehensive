package com.runner;

import org.testng.annotations.Test;

import com.pageobject.SearchPage;

public class Search extends BaseClass{
	
	@Test
	public void search() throws InterruptedException {

		logger = report.createTest("Search Test");
		log.info("Extent Report test is created");
		
		String prod = excel.getstringdata("Search", 2, 1);
		String msg = excel.getstringdata("Search", 3, 1);
		
		logger.info("Search Activity").assignAuthor("Shraddha");

		SearchPage.searchpage(driver, prod, msg);;
//		Signup sp = new Signup();
//		sp.sign();
		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}
}
