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
public class OmnisenseHelpPage {

	AndroidDriver<WebElement> driver;
	
	By menu = By.xpath("//android.widget.ImageButton[@content-desc='The navigation drawer is opened']");
	By HelpButton = By.id("com.medtronic.mitg.omnisense:id/navigation_drawer_items_list_linearLayout_help");
	
	public OmnisenseHelpPage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	public void clickMenu() {
		driver.findElement(menu).click();
	}
	public void clickonHelpButton() {
		driver.findElement(HelpButton).click();
	}
}
