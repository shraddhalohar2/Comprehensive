package com.runner;

import org.testng.annotations.Test;

import com.pageobject.FooterCAPage;

public class FooterCA extends BaseClass{

		@Test
		public void footerca() throws InterruptedException {

			logger = report.createTest("Footer - CA Privacy Test");
			log.info("Extent Report test is created");
			
			String link = excel.getstringdata("Footer0", 3, 1);
			String str = excel.getstringdata("Footer0", 2, 1);
			
			logger.info("Verifing Footer CA Privacy Activity").assignAuthor("Shraddha");

			FooterCAPage.footercapage(driver, link, str);
			
//			Facebook fp = new Facebook();
//			fp.facebook();
			//Thread.sleep(5000);
			log.info("Executed all test");
			
		}
}
