/**
 * 
 */
package com.omnisense.mobilePages;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmniSenseLoginPage {
	
	AndroidDriver<WebElement> driver;

	
	By username = By.id("com.medtronic.mitg.omnisense:id/input_name");
	By password = By.id("com.medtronic.mitg.omnisense:id/input_password");
	By signin = By.id("com.medtronic.mitg.omnisense:id/btn_login");
	
	
	public OmniSenseLoginPage(	AndroidDriver<WebElement> driver) {
		this.driver = driver;
		
	}
		 public void enterUsername() throws InterruptedException {
			WebElement un = driver.findElement(username);
				       un.sendKeys("sean");
				       driver.hideKeyboard();
				       Thread.sleep(2000);
				       //Utility.captureScreenShots(driver,"AfterEnterUsername");
				       System.out.println("Omnisense user login username should be entered successfully");
		 }
		 
		 public void enterPassword() throws InterruptedException {
			 WebElement pass = driver.findElement(password);
				 		pass.sendKeys("Password1");
				 		driver.hideKeyboard();
				 		Thread.sleep(2000);
				 		//Utility.captureScreenShots(driver,"AfterEnterPassword");
				 		System.out.println(" Omnisense user login Password should be entered successfully ");
		 }
		  
		  public void clickSignin() throws InterruptedException {
			  driver.findElement(signin).click();
			 // Utility.captureScreenShots(driver,"BeforeLogin");
			  Thread.sleep(10000);
			  System.out.println(" Omnisense login button should be clicked successfully");
			
			
		  }
		 
}
