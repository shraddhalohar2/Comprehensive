package com.runner;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.reusablecomponents.ReusableHelper;
import com.utility.Browsers;
import com.utility.ConfigProperties;
import com.utility.ExcelData;
import com.utility.ReusableScreenshot;

public class BaseClass {

	public static WebDriver driver;
	
	 public static ExcelData excel;
	 
	 public static ConfigProperties config;
	 public static ExtentReports report;
	 public static ExtentTest logger;
	 public static Logger log = LogManager.getLogger(BaseClass.class);
	 public static ReusableScreenshot cs = new ReusableScreenshot();
	 public static ReusableHelper help = new ReusableHelper();
	 
	 @BeforeSuite
	public void InitializeMethods() {
		excel=new ExcelData();
		config=new ConfigProperties();
		report=new ExtentReports();
		//loginPage = PageFactory.initElements(driver, LoginPage.class);
		ExtentSparkReporter spark=new ExtentSparkReporter(new File("./ExtentReports/"+com.utility.ReusableScreenshot.getDatetime()+".html"));
		report.attachReporter(spark);
		spark.config().setDocumentTitle("Mindtree");
		log.info("Initializing all the Methods");
	} 
	 	
	 
	@BeforeClass
	public void setUp() {
		String BrowserTaken = config.getKey("Browser");
		String UrlFromConfig =config.getKey("Url");
		
		driver = Browsers.visitWebBrowsers(driver, BrowserTaken, UrlFromConfig);
		log.info("Setting Up Browser");
	}
	
	
//	@AfterMethod
//	public void tearDownMethod(ITestResult result) {
//		if (result.getStatus()==ITestResult.SUCCESS) {
//			Reusable.CaptureScreenShot(driver);
//			logger.pass("Passs ").addScreenCaptureFromPath(Reusable.CaptureScreenShot(driver));
//			log.info("Passed the Test Case");
//			
//		}
//		else if (result.getStatus()==ITestResult.FAILURE) {
//			logger.fail("Failed ").addScreenCaptureFromPath(Reusable.CaptureScreenShot(driver));
//			log.warn("This is Failed");
//		}
//    	Browsers.closeBrowser(driver);
//		//report.flush();
//	}
	
	
	@AfterSuite
	public void Clear() {
		log.info("Finished Extent Report");
		report.flush();
		
		
	}
	
	@AfterClass
	public void exit() {
		Browsers.closeBrowser(driver);
	}
}
