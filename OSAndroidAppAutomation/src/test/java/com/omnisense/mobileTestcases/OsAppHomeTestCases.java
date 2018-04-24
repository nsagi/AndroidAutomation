/**
 * 
 */
package com.omnisense.mobileTestcases;

import java.io.File; 

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.omnisense.mobilePages.OmniseseHomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import library.OmniSenseAppLogin;
import library.Utility;

/**
 * @author narasimhulu.sagi
 *
 */
public class OsAppHomeTestCases { 

	public AndroidDriver<WebElement> driver;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeTest
	 public void setUp() throws Exception{
		try {
			driver = OmniSenseAppLogin.setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReport.html",true);
		extent.addSystemInfo("HostName", "Narasimha")
		.addSystemInfo("Environment", "QA")
		.addSystemInfo("User Name", "Narasimhulu Sagi");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
}

	@Test
	public void testHome() throws Exception {
		OmniseseHomePage home = new OmniseseHomePage(driver);
		logger=extent.startTest("testHome");
		Assert.assertTrue(true);
		home.clickMenu();
		logger.log(LogStatus.PASS, "Menu bar should be opened");
		home.clickHomeButton();
		logger.log(LogStatus.PASS, "Home button should be clicked");
		home.clickWorkoutButton();
		logger.log(LogStatus.PASS, "Start workout button should be clicked");
		home.locationAllow();
		logger.log(LogStatus.PASS, "Google location alert should be allowed");
		
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(logger);
	}
	
	@AfterTest
	public void teatDown()
	{
		extent.flush();
		extent.close();
		if (driver !=null) {
			driver.quit();
			
		}
	}
	

}
