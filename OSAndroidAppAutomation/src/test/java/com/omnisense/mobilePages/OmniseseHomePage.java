package com.omnisense.mobilePages;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import library.Utility;


public class OmniseseHomePage {
	
	AndroidDriver<WebElement> driver;
	
	By menubar = By.xpath("//android.widget.ImageButton[@content-desc='The navigation drawer is opened']");
	By home = By.id("com.medtronic.mitg.omnisense:id/navigation_drawer_items_textView_home");
	By workout = By.id("com.medtronic.mitg.omnisense:id/iv_workout");
	By locationAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	
	public OmniseseHomePage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		
	}

	public void clickMenu() throws Exception {
		driver.findElement(menubar).click();
		Thread.sleep(2000);
		// Utility.captureScreenShots(driver,"MenuOptionBar");
		 System.out.println(" Omnisense Home page Screenshot has been taken ");
	} 
	
	public void clickHomeButton() throws Exception {
		driver.findElement(home).click();
		Thread.sleep(2000);
		// Utility.captureScreenShots(driver,"HomeButtonClicked");
		 System.out.println(" Omnisense Home button should be clicked Screenshot has been taken ");
	}
	
	public void clickWorkoutButton() throws Exception {
		driver.findElement(workout).click();
		Thread.sleep(2000);
		// Utility.captureScreenShots(driver,"StartedWorkout");
		 System.out.println(" Omnisense free workout should be started Screenshot has been taken ");
		 
	}
	public void locationAllow() throws Exception {
		driver.findElement(locationAllow).click();
		Thread.sleep(2000);
		//Utility.captureScreenShots(driver,"LocationAllow");
		 //System.out.println(" Omnisense LocationAllow page Screenshot has been taken ");
	} 
	
	

}
