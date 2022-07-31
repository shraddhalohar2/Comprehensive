package com.runner;

import org.testng.annotations.Test;

import com.pageobject.FooterContactUsPage;

public class Footer1ContactUs extends BaseClass{

	@Test
	public void footercontactus() throws Exception {

		logger = report.createTest("Footer - Contact Us Test");
		log.info("Extent Report test is created");
		
		String q = excel.getstringdata("Footer1", 2, 1);
		String str = excel.getstringdata("Footer1", 3, 1);
		
		logger.info("Verifing Footer Contact Us Activity").assignAuthor("Shraddha");

		FooterContactUsPage.footercontactpage(driver, q, str);
		
//		Spinner sp = new Spinner();
//		sp.spinner();
		//Thread.sleep(5000);
		log.info("Executed all test");
		
	}

}
