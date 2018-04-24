/**
 * 
 */
package com.omnisense.mobileTestcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.omnisense.mobilePages.OmnisenseSettingsPage;
import com.omnisense.mobilePages.OmnisenseWorkoutPage;

import io.appium.java_client.android.AndroidDriver;
import library.OmniSenseAppLogin;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseWorkoutTestCases {

	AndroidDriver<WebElement> driver;
	
	@Test
	public void Login() throws Exception {
		 
		driver = OmniSenseAppLogin.setUp();
	}
	
	@Test
	public void workoutTest() throws Exception {
		OmnisenseWorkoutPage workout = new OmnisenseWorkoutPage(driver);
		
		workout.clickMenu();
		workout.clickWorkoutButton();
		workout.locationAllow();
		workout.audioEnable();
		workout.ClickHR();
		workout.ClickHRAT();
		workout.ClickBR();
		workout.ClickHRMAX();
		workout.clickWorkoutTxt11();
		workout.ClickActivity();
		workout.clickWorkoutTxt21();
		workout.ClickAvgstepperiod();
		workout.clickWorkoutTxt22();
		workout.ClickBatteryPercentage();
		workout.clickWorkoutTxt32();
		workout.ClickBoundCount();
		workout.startWorkout();
		workout.pauseWorkout();
		workout.resumeWorkout();
		workout.endWorkout();
		workout.clickYes();
		workout.clickFinishiedButton();
		workout.clickMenu();
		workout.clickWorkoutButton();
		workout.userSettings();
		//updating user settings from free workout
OmnisenseSettingsPage settings = new OmnisenseSettingsPage(driver);
		settings.clickonMyprofile();
		settings.clickonName();
		settings.clickonFirstName();
		settings.clickonLastName();
		settings.backtoMyProfilePage();
		settings.gender();
		settings.selectFemale();
		settings.selectDob();
		settings.clickonYear();
		settings.selectYear();
		//settings.selectOk();
		settings.clickPreviousButton();
		settings.selectDate();
		settings.ClickOk();
		settings.clickonHeight();
		settings.ClickHieghtUnit();
		settings.ClickHieghtUnitIn();
		settings.clickonWeight();
		settings.ClickWieghtUnit();
		settings.ClickWieghtUnitLbs();
		settings.backtoSettings();
		settings.ClickonYes();
		
	}
}
