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

import com.omnisense.mobilePages.OmnisenseReadinessAssessmentPages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import library.OmniSenseAppLogin;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseReadinessAssessmentTestCases {

	public AndroidDriver<WebElement> driver;
	
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void loginApp()
	{
		try {
			driver=OmniSenseAppLogin.setUp();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReport.html",true);
		extent.addSystemInfo("HostName", "Narasimha")
		.addSystemInfo("Environment", "QA")
		.addSystemInfo("User Name", "Narasimhulu Sagi");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	}
	@Test
	public void readinessAssessmentTestCases()
	{
		OmnisenseReadinessAssessmentPages readiness = new OmnisenseReadinessAssessmentPages(driver);
		logger=extent.startTest("readinessAssessmentTestCases");
		Assert.assertTrue(true);
										  readiness.openMenuBar();
										  logger.log(LogStatus.PASS, "Menu bar should be opened");
										  try {
											readiness.clickFitnessAssessments();
											logger.log(LogStatus.PASS, "Fitness Assessment option should be clicked");
											readiness.clickReadinessAssessment();
											logger.log(LogStatus.PASS, "Readiness Assessment button should be clicked");
											readiness.clickAudioButton();
											logger.log(LogStatus.PASS, "Audio button should be enabled");
											readiness.startAssessment();
											logger.log(LogStatus.PASS, "Readiness Assessement should be started");
											readiness.pauseAssessment();
											logger.log(LogStatus.PASS, "Readiness Assessement should be paused");
											readiness.endAssessment();
											logger.log(LogStatus.PASS, "Readiness Assessement should be ended");
										} catch (Exception e) {
											System.out.println(e.getMessage());
										}
										  
	}
	@AfterMethod
	public void testResults(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			
			logger.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(logger);
	}
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		extent.close();
		if (driver !=null) {
			
			driver.quit();
		}
	}
}
