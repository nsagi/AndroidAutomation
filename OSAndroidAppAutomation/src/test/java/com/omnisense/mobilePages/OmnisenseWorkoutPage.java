/**
 * 
 */
package com.omnisense.mobilePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import library.Utility;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseWorkoutPage {
	
	AndroidDriver<WebElement> driver;
	
	By menu = By.xpath("//android.widget.ImageButton[@content-desc='The navigation drawer is opened']");
	By workoutbutton = By.id("com.medtronic.mitg.omnisense:id/navigation_drawer_items_textView_workout");
	By locationAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	By audioEnable = By.id("com.medtronic.mitg.omnisense:id/iv_workout_sound_indicator");
	By hr = By.id("com.medtronic.mitg.omnisense:id/tv_guage_1");
	By HRAT = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='%HRAT']");
	By br = By.id("com.medtronic.mitg.omnisense:id/tv_guage_2");
	By HRMAX = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='%HRMAX']");
	By WorkoutTxt11 = By.id("com.medtronic.mitg.omnisense:id/workouttxt11");
	By Activity = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='Activity']");
	By WorkoutTxt21 = By.id("com.medtronic.mitg.omnisense:id/workouttxt21");
	By Avgstepperiod = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='Avg Step Period']");
	By WorkoutTxt22 = By.id("com.medtronic.mitg.omnisense:id/workouttxt22");
	By batterypercentage = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='Battery Percentage']");
	By WorkoutTxt32 = By.id("com.medtronic.mitg.omnisense:id/workouttxt32");
	By boundcount = By.xpath("//android.widget.TextView[contains(@resource-id,'com.medtronic.mitg.omnisense:id/tv_inflate_measurement') and @text='Bound Count']");
    By startworkout = By.id("com.medtronic.mitg.omnisense:id/iv_workout_start");
    By pauseworkout = By.id("com.medtronic.mitg.omnisense:id/iv_workout_pause");
    By resumeworkout = By.id("com.medtronic.mitg.omnisense:id/iv_workout_resume");
    By endworkout = By.id("com.medtronic.mitg.omnisense:id/iv_workout_end");
    By Yes = By.id("android:id/button1");
    By finished = By.id("com.medtronic.mitg.omnisense:id/btn_free_workout_smry_finished");
    
    //Update user settings from workout page
    By settingsbutton = By.id("com.medtronic.mitg.omnisense:id/tb_settings");
    
	public OmnisenseWorkoutPage(AndroidDriver<WebElement> driver) {
		
		this.driver = driver;
		
	}
	
	public void clickMenu() throws Exception {
		driver.findElement(menu).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"MenuOptionBar");
		 System.out.println(" Omnisense Home page Screenshot has been taken ");
	} 
	
	public void clickWorkoutButton() throws Exception {
		driver.findElement(workoutbutton).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"Workoutbutton");
		 System.out.println(" Omnisense Free Workout page Screenshot has been taken ");
	} 
	
	public void locationAllow() throws Exception {
		driver.findElement(locationAllow).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"LocationAllow");
		 System.out.println(" Omnisense LocationAllow page Screenshot has been taken ");
	} 
	
	public void audioEnable() throws Exception {
		driver.findElement(audioEnable).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"AudioEnable");
		 System.out.println(" Omnisense AudioEnable page Screenshot has been taken ");
	} 
	
	public void ClickHR() throws Exception {
		driver.findElement(hr).click();
		Thread.sleep(2000);
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);*/
		Utility.captureScreenShots(driver,"HR");
		 System.out.println(" Omnisense HR page Screenshot has been taken ");
	} 
	
	public void ClickHRAT() throws Exception {
		driver.findElement(HRAT).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"HRAT");
		 System.out.println(" Omnisense %HRAT page Screenshot has been taken ");
	} 
	
	public void ClickBR() throws Exception {
		driver.findElement(br).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"BR");
		 System.out.println(" Omnisense BR page Screenshot has been taken ");
	} 
	
	public void ClickHRMAX() throws Exception {
		driver.findElement(HRMAX).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"HRMAX");
		 System.out.println(" Omnisense %HRMAX page Screenshot has been taken ");
	} 
	
	public void clickWorkoutTxt11() throws Exception {
		driver.findElement(WorkoutTxt11).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"WorkoutTxt11");
		 System.out.println(" Omnisense WorkoutTxt11 page Screenshot has been taken ");
	} 
	
	public void ClickActivity() throws Exception {
		driver.findElement(Activity).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"Activity");
		 System.out.println(" Omnisense Activity page Screenshot has been taken ");
	} 
	
	public void clickWorkoutTxt21() throws Exception {
		driver.findElement(WorkoutTxt21).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"WorkoutTxt21");
		 System.out.println(" Omnisense WorkoutTxt21 page Screenshot has been taken ");
	} 
	public void ClickAvgstepperiod() throws Exception {
		driver.findElement(Avgstepperiod).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"Avgstepperiod");
		 System.out.println(" Omnisense Avgstepperiod page Screenshot has been taken ");
	} 
	
	public void clickWorkoutTxt22() throws Exception {
		driver.findElement(WorkoutTxt22).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"WorkoutTxt22");
		 System.out.println(" Omnisense WorkoutTxt22 page Screenshot has been taken ");
	} 
	public void ClickBatteryPercentage() throws Exception {
		driver.findElement(batterypercentage).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"batterypercentage");
		 System.out.println(" Omnisense batterypercentage page Screenshot has been taken ");
	} 
	
	public void clickWorkoutTxt32() throws Exception {
		driver.findElement(WorkoutTxt32).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"WorkoutTxt32");
		 System.out.println(" Omnisense WorkoutTxt32 page Screenshot has been taken ");
	} 
	public void ClickBoundCount() throws Exception {
		driver.findElement(boundcount).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"boundcount");
		 System.out.println(" Omnisense boundcount page Screenshot has been taken ");
	} 
	public void startWorkout() throws Exception {
		driver.findElement(startworkout).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"startworkout");
		 System.out.println(" Omnisense startworkout page Screenshot has been taken ");
	} 
	public void pauseWorkout() throws Exception {
		driver.findElement(pauseworkout).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"pauseworkout");
		 System.out.println(" Omnisense pauseworkout page Screenshot has been taken ");
	} 
	public void resumeWorkout() throws Exception {
		driver.findElement(resumeworkout).click();
		Thread.sleep(2000);
		driver.findElement(pauseworkout).click();
		Utility.captureScreenShots(driver,"resumeworkout");
		Thread.sleep(2000);
		 System.out.println(" Omnisense resumeworkout page Screenshot has been taken ");
	} 
	public void endWorkout() throws Exception {
		driver.findElement(endworkout).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"endworkout");
		 System.out.println(" Omnisense endworkout page Screenshot has been taken ");
	}
	public void clickYes() throws Exception {
		driver.findElement(Yes).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"Yes");
		 System.out.println(" Omnisense workout Summary page Screenshot has been taken ");
	}
	
	public void clickFinishiedButton() throws Exception {
		driver.findElement(finished).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"finished");
		 System.out.println(" Omnisense Home page Screenshot has been taken ");
	}
	
	//Here we are updating the user settings in free workout page
	
	public void userSettings() throws Exception {
		driver.findElement(settingsbutton).click();
		Thread.sleep(2000);
		Utility.captureScreenShots(driver,"Settingspage");
		 System.out.println(" Omnisense Settingspage page Screenshot has been taken ");
	}
}
