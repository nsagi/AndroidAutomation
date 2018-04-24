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
public class OmnisenseSettingsPage {
	AndroidDriver<WebElement> driver;
	
	By menu = By.xpath("//android.widget.ImageButton[@content-desc='The navigation drawer is opened']");
	By settings = By.id("com.medtronic.mitg.omnisense:id/navigation_drawer_items_textView_settings");
	By myprofile = By.id("com.medtronic.mitg.omnisense:id/iv_profile");
	By name = By.id("com.medtronic.mitg.omnisense:id/iv_profile_name");
	By firstname = By.id("com.medtronic.mitg.omnisense:id/et_name_first_value");
	By lastname = By.id("com.medtronic.mitg.omnisense:id/et_name_last_value");
	//By gobacktosettings = By.id("com.medtronic.mitg.omnisense:id/textView4");
	By backtomyprofilepage = By.xpath("//android.widget.TextView[@text='My Profile' and @index='1']");
	By gender = By.xpath("//android.widget.TextView[@text='Male' and @index='0']");
	By selectfemale = By.xpath("//android.widget.CheckedTextView[@text='Female' and @index='1']");
	By dob = By.id("com.medtronic.mitg.omnisense:id/et_dob");
	By clickonyear = By.id("android:id/date_picker_header_year");
	By selectyear = By.xpath("//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='1990']");
	//By yearok = By.id("android:id/button1");
	By previous = By.id("android:id/prev");
	By selectdate = By.xpath("//android.view.View[@text='15' and @index='14']");
	By ok = By.id("android:id/button1");
	By height = By.id("com.medtronic.mitg.omnisense:id/et_height");
	By heightunits = By.xpath("//android.widget.TextView[@text='cm']");
	By selectin = By.id("android:id/text1");
	By weight = By.id("com.medtronic.mitg.omnisense:id/et_weight");
	By weightunits = By.xpath("//android.widget.TextView[@text='kgs']");
	By selectlbs = By.id("//android.widget.CheckedTextView[contains(@resource-id,'android:id/text1') and @text='lbs']");
	By gobacktosettings = By.id("com.medtronic.mitg.omnisense:id/textView4");
	By yes = By.id("android:id/button1");
	
	public OmnisenseSettingsPage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		
	}
	public void selectMenu() throws InterruptedException {
		driver.findElement(menu).click();
		Utility.captureScreenShots(driver, "MenuBarPage");
		System.out.println("Menu page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonSettings() throws InterruptedException {
		driver.findElement(settings).click();
		Utility.captureScreenShots(driver, "SettingsPage");
		System.out.println("Settings page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonMyprofile() throws InterruptedException {
		driver.findElement(myprofile).click();
		Utility.captureScreenShots(driver, "MyprofilePage");
		System.out.println("MyProfile page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonName() throws InterruptedException {
		driver.findElement(name).click();
		Utility.captureScreenShots(driver, "NamePage");
		System.out.println("Name page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonFirstName() throws InterruptedException {
		WebElement first = driver.findElement(firstname);
		first.click();
		first.clear();
		first.sendKeys("Ben");
		Utility.captureScreenShots(driver, "FirstNamePage");
		System.out.println("First Name page screenshot has been taken");
		Thread.sleep(2000);
	}
	public void clickonLastName() throws InterruptedException {
		WebElement last= driver.findElement(lastname);
		last.click();
		last.clear();
		last.sendKeys("Morries");
		Utility.captureScreenShots(driver, "LastNamePage");
		System.out.println("Last Name page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void backtoMyProfilePage() throws InterruptedException {
		driver.findElement(backtomyprofilepage).click();
		Utility.captureScreenShots(driver, "BacktoMyProfilePage");
		System.out.println("My Profile page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void gender() throws InterruptedException {
		driver.findElement(gender).click();
		Utility.captureScreenShots(driver, "GenderPage");
		System.out.println("Gender page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void selectFemale() throws InterruptedException {
		driver.findElement(selectfemale).click();
		Utility.captureScreenShots(driver, "Female");
		System.out.println("Select Female screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void selectDob() throws InterruptedException {
		driver.findElement(dob).click();
		Utility.captureScreenShots(driver, "DobPage");
		System.out.println("Dob picker page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonYear() throws InterruptedException {
		driver.findElement(clickonyear).click();
		Utility.captureScreenShots(driver, "clickonYear");
		System.out.println("Year selection page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void selectYear() throws InterruptedException {
		driver.findElement(selectyear).click();
		Utility.captureScreenShots(driver, "YearPage");
		System.out.println("Year page screenshot has been taken");
		Thread.sleep(2000);
	}
	
	/*public void selectOk() throws InterruptedException {
		driver.findElement(yearok).click();
		Utility.captureScreenShots(driver, "OkPage");
		System.out.println(" ok Year page on year picker screenshot has been taken");
		Thread.sleep(2000);
	}*/
	
	public void clickPreviousButton() throws InterruptedException {
		for (int i = 0; i < 7; i++) {
			driver.findElement(previous).click();
		}
		System.out.println(" Prevoius button should be clicked");
		Thread.sleep(2000);
	}
	
	public void selectDate() throws InterruptedException {
		driver.findElement(selectdate).click();
		Utility.captureScreenShots(driver, "SelectDate");
		System.out.println(" Date page on Date picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickOk() throws InterruptedException {
		driver.findElement(ok).click();
		Utility.captureScreenShots(driver, "ClickOkButton");
		System.out.println(" Ok Year page on year picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonHeight() throws InterruptedException {
		WebElement hght = driver.findElement(height);
		hght.click();
		hght.clear();
		driver.hideKeyboard();
		hght.sendKeys("334.7");
		//driver.hideKeyboard();
		Utility.captureScreenShots(driver, "ChangeHeightPage");
		System.out.println("ChangeHeightPage on Height picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickHieghtUnit() throws InterruptedException {
		driver.findElement(heightunits).click();
		Utility.captureScreenShots(driver, "ClickonHeightUnit");
		System.out.println("Height units page on Hight picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickHieghtUnitIn() throws InterruptedException {
		driver.findElement(selectin).click();
		Utility.captureScreenShots(driver, "ClickonHeightUnitIn");
		System.out.println("Height units 'In' page on Hight picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void clickonWeight() throws InterruptedException {
		WebElement hght = driver.findElement(weight);
		hght.click();
		driver.hideKeyboard();
		hght.clear();
		driver.hideKeyboard();
		hght.sendKeys("94.4");
		driver.hideKeyboard();
		Utility.captureScreenShots(driver, "ChangeWeightPage");
		System.out.println("ChangeWeightPage on Weight picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickWieghtUnit() throws InterruptedException {
		driver.findElement(weightunits).click();
		Utility.captureScreenShots(driver, "ClickonWeightUnit");
		System.out.println("Weight units page on Weight picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickWieghtUnitLbs() throws InterruptedException {
		driver.findElement(selectlbs).click();
		Utility.captureScreenShots(driver, "ClickonWeightUnitLbs");
		System.out.println("Weight units 'In' page on Weight picker screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void backtoSettings() throws InterruptedException {
		driver.findElement(gobacktosettings).click();
		Utility.captureScreenShots(driver, "ClickonSettings");
		System.out.println("Settings page update pop screenshot has been taken");
		Thread.sleep(2000);
	}
	
	public void ClickonYes() throws InterruptedException {
		driver.findElement(yes).click();
		Utility.captureScreenShots(driver, "ClickonYes");
		System.out.println("After Yes button page screenshot has been taken");
		Thread.sleep(2000);
	}


}
