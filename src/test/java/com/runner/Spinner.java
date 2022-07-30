package com.runner;

import org.testng.annotations.Test;

import com.pageobject.SpinnerPage;

public class Spinner extends BaseClass{

		@Test
		public void spinner() throws InterruptedException {

			logger = report.createTest("Spinner for Makeup Cleaner Test");
			log.info("Extent Report test is created");
			
			String str = excel.getstringdata("SpinnerBlock", 2, 1);
			
			logger.info("Verifing Spinner for Makeup Cleaner Activity").assignAuthor("Shraddha");
			
			SpinnerPage.spinnerpage(driver, str);
			
//			FooterIcon fp = new FooterIcon();
//			fp.footericon();
			//Thread.sleep(5000);
			log.info("Executed all test");
		}
}
