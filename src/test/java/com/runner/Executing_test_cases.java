package com.runner;

import org.testng.annotations.Test;

public class Executing_test_cases extends BaseClass{
	
	@Test(priority=1)
	public static void step1() throws Exception {
		Footer1ContactUs fc = new Footer1ContactUs();
		fc.footercontactus();
	}
	
	@Test(priority=2)
	public static void step2() throws Exception {
		Spinner sp = new Spinner();
		sp.spinner();
	}
	
	@Test(priority=3)
	public static void step3() throws Exception {
		FooterIcon fp = new FooterIcon();
		fp.footericon();
	}
	
	@Test(priority=4)
	public static void step4() throws Exception {
		FooterCA fp = new FooterCA();
		fp.footerca();
	}
	
	@Test(priority=5)
	public static void step5() throws Exception {
		Facebook fp = new Facebook();
		fp.facebook();
	}
	
	@Test(priority=6)
	public static void step6() throws Exception {
		Menu5 mp = new Menu5();
		mp.menu5();
	}
	
	@Test(priority=7)
	public static void step7() throws Exception {
		Menu2 m = new Menu2();
		m.menu2();
	}
	
	@Test(priority=8)
	public static void step8() throws Exception {
		Menu1 mp = new Menu1();
		mp.menu1();
	}
	
	@Test(priority=9)
	public static void step9() throws Exception {
		Search sp = new Search();
		sp.search();
	}
	
	@Test(priority=10)
	public static void step10() throws Exception {
		Signup sp = new Signup();
		sp.sign();
	}
}
