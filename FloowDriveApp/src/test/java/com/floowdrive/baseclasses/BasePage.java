package com.floowdrive.baseclasses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	
	public AppiumDriver<WebElement> driver;

	public BasePage(AppiumDriver<WebElement> driver) {
		 PageFactory.initElements(driver, this); 
			}
	
	/***
	
	//to get current page title  and Page Title console view
	public String  page_Title() {
		
		  
		String page_Title= driver.getTitle();
		 System.out.println(page_Title+".....current page title....................................");
		 return page_Title;
		
}**/


}
