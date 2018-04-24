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
import com.omnisense.mobilePages.OmnisenseSettingsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import library.OmniSenseAppLogin;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseSettingsPageTestCases {

	AndroidDriver<WebElement> driver ;
	ExtentReports extent;
	ExtentTest logger;
	@BeforeTest
	public void LoginPage() {

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
	public void Settingstest() throws InterruptedException {
		OmnisenseSettingsPage settings = new OmnisenseSettingsPage(driver);
								logger=extent.startTest("Settingstest");
								Assert.assertTrue(true);
								settings.selectMenu();
								logger.log(LogStatus.PASS, "Menu bar should be opened");
								settings.clickonSettings();
								 logger.log(LogStatus.PASS, "Settings button should be selected");
								settings.clickonMyprofile();
								 logger.log(LogStatus.PASS, "My profile should be selected");
								settings.clickonName();
								 logger.log(LogStatus.PASS, "Name buttton should be clicked");
								settings.clickonFirstName();
								 logger.log(LogStatus.PASS, "User should be entered first name in firstname field");
								settings.clickonLastName();
								 logger.log(LogStatus.PASS, "User should be entered last name in lastname field");
								settings.backtoMyProfilePage();
								 logger.log(LogStatus.PASS, "User back to my profile button should be clicked");
								settings.gender();
								 logger.log(LogStatus.PASS, "Gender should be Clicked");
								settings.selectFemale();
								 logger.log(LogStatus.PASS, "Female should be selected");
								settings.selectDob();
								 logger.log(LogStatus.PASS, "DateofBirth should be clicked");
								settings.clickonYear();
								 logger.log(LogStatus.PASS, "Menu bar should be opened");
								settings.selectYear();
								 logger.log(LogStatus.PASS, "Year should be selected");
								//settings.selectOk();
								 //logger.log(LogStatus.PASS, "Ok option should be clicked");
								settings.clickPreviousButton();
								 logger.log(LogStatus.PASS, "Menu bar should be opened");
								settings.selectDate();
								 logger.log(LogStatus.PASS, "Date should be selected");
								settings.ClickOk();
								 logger.log(LogStatus.PASS, "Ok option should be clicked");
								settings.clickonHeight();
								 logger.log(LogStatus.PASS, "Height should be entered successfully");
								settings.ClickHieghtUnit();
								 logger.log(LogStatus.PASS, "Height units option should be clicked");
								settings.ClickHieghtUnitIn();
								 logger.log(LogStatus.PASS, "Height units should be selected");
								/*settings.clickonWeight();
								 *  logger.log(LogStatus.PASS, "Weight should be entered successfully");
								settings.ClickWieghtUnit();
								 logger.log(LogStatus.PASS, "Weight units option should be clicked");
								settings.ClickWieghtUnitLbs();
								 logger.log(LogStatus.PASS, "Weight units should be selected");*/
								settings.backtoSettings();
								 logger.log(LogStatus.PASS, "user should be back to the settings page for updating user profile");
								settings.ClickonYes();
								 logger.log(LogStatus.PASS, "Confirmation popup Yes button should be clicked");
	}
	@AfterMethod
	public void getResults(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE ) {
			
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
