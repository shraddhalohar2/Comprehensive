package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReusableScreenshot {
	public static String CaptureScreenShot(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/" + getDatetime() + ".png");

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println("Unable to Capture the ScreenShot");
		}
		return dest.getAbsolutePath();
	}

	public static String getDatetime() {

		DateFormat cusFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

		Date date = new Date();

		return cusFormat.format(date);

	}
}
