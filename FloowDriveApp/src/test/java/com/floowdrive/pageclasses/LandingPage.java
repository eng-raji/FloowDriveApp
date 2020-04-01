package com.floowdrive.pageclasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.floowdrive.baseclasses.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LandingPage extends BasePage {
	
	
	
	public LandingPage(AppiumDriver<WebElement> driver){ 
	      super(driver);
	      this.driver=driver; 
	      PageFactory.initElements(driver, this);  
	      
	      //get landing page title
	     // page_Title();
	}

	public void click_Allready_Regitered () throws InterruptedException  {
		
        scrollDown();
	
        Allready_Regitered_Button.click();
		System.out.println("clicked Allready_Regitered Button "+"...................................");
		
	}
	
	public  void scrollDown() throws InterruptedException

	{
		System.out.println("test starts .............................");

		int x = 90;
		int y = 90;
		Thread.sleep(3000);

		TouchAction action = new TouchAction (driver);
		Dimension size = driver.manage().window().getSize();
		int endX = (size.width * x) / 100;
		int endY = (size.height * y) / 100;

		action.press(PointOption.point(endX, size.height - 10));

		action.moveTo(PointOption.point(0, 0));

		action.release();

		action.perform();

		Thread.sleep(3000);
	}
	
	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using="com.thefloow.thefloowltd.floowdrive.app:id/btn_already_registered") WebElement Allready_Regitered_Button;

}
