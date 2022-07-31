package com.runner;

import org.testng.annotations.Test;

import com.pageobject.FacebookPage;
import com.pageobject.Menu1Page;

public class Facebook extends BaseClass{
	@Test
	public void facebook() throws Exception {

		logger = report.createTest("Facebook Test");
		log.info("Extent Report test is created");
		
		String txt = excel.getstringdata("Facebook", 2, 1);
		
		logger.info("Facebook Activity").assignAuthor("Shraddha");

		FacebookPage.facebookpage(driver, txt);
		
//		Menu5 mp = new Menu5();
//		mp.menu5();
		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}

}
