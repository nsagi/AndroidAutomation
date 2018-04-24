/**
 * 
 */
package com.omnisense.mobileTestcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.omnisense.mobilePages.OmnisenseHelpPage;

import io.appium.java_client.android.AndroidDriver;
import library.OmniSenseAppLogin;

/**
 * @author narasimhulu.sagi
 *
 */
public class OmnisenseHelpPageTestCases {
	
	public AndroidDriver<WebElement> driver;
	
	@Test
	public void excuteHelpTestcases() throws Exception {
		
		driver = OmniSenseAppLogin.setUp();
		OmnisenseHelpPage help = new OmnisenseHelpPage(driver);
		help.clickMenu();
		help.clickonHelpButton();
		
	}

}
