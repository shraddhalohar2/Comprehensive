package com.runner;

import org.testng.annotations.Test;
import com.pageobject.FooterIconPage;

public class FooterIcon extends BaseClass{

	@Test
	public void footericon() throws InterruptedException {

		logger = report.createTest("Footer - Tide Cleaners Icon Test");
		log.info("Extent Report test is created");
		
		String str = excel.getstringdata("Footer2", 2, 1);
		
		logger.info("Verifing Footer - Tide Cleaners Icon Activity").assignAuthor("Shraddha");
		
		FooterIconPage.footercontactpage(driver, str);
		
//		FooterCA fp = new FooterCA();
//		fp.footerca();
		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}
}
