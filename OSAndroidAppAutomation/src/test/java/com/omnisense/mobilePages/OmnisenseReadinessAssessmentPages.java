/**
 * 
 */
package com.omnisense.mobilePages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseReadinessAssessmentPages {

	public AndroidDriver<WebElement> driver;
	
	By menubar = By.xpath("//android.widget.ImageButton[@content-desc='The navigation drawer is opened']");
	By fitnessAssessments = By.id("com.medtronic.mitg.omnisense:id/navigation_drawer_items_textView_fitness_assessment");
	By readinessbutton = By.id("com.medtronic.mitg.omnisense:id/btn_readiness_assessment");
	By audiobutton = By.id("com.medtronic.mitg.omnisense:id/iv_sound_indicator");
	By startAssessment = By.id("com.medtronic.mitg.omnisense:id/iv_assessment_workout_start");
	By pauseAssessment = By.id("com.medtronic.mitg.omnisense:id/iv_assessment_workout_pause");
	By endAssessment = By.id("com.medtronic.mitg.omnisense:id/iv_assessment_workout_end");
	public OmnisenseReadinessAssessmentPages(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		
	}
	
	public void openMenuBar()
	{
		driver.findElement(menubar).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	public void clickFitnessAssessments() throws InterruptedException
	{
		driver.findElement(fitnessAssessments).click();
		Thread.sleep(1000);
	}
	public void clickReadinessAssessment() throws InterruptedException
	{
		driver.findElement(readinessbutton).click();
		Thread.sleep(1000);
	}
	
	public void clickAudioButton() throws InterruptedException
	{
		driver.findElement(audiobutton).click();
		Thread.sleep(1000);
	}
	
	public void startAssessment() throws InterruptedException
	{
		driver.findElement(startAssessment).click();
		Thread.sleep(1000);

	}
	
	public void pauseAssessment() throws InterruptedException
	{
		driver.findElement(pauseAssessment).click();
		Thread.sleep(1000);
	}
	
	public void endAssessment() throws InterruptedException
	{
		driver.findElement(endAssessment).click();
		Thread.sleep(1000);
	}
}
