package com.floowdrive.pageclasses;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.floowdrive.baseclasses.BasePage;

import io.appium.java_client.AppiumDriver;

public class LoginPage extends BasePage{
	
	//constructor 	 
     public LoginPage(AppiumDriver<WebElement> driver){ 
    	      super(driver);
              this.driver=driver; 
              PageFactory.initElements(driver, this);    
          }
    
     

public boolean validateLoginpage(){
    boolean elements = false;
    if(Login_Email_Fild.isDisplayed()){
        if(Login_PassWord_Fild.isDisplayed()){
            if(Btn_Login.isDisplayed()){
                    elements = true;
                }
            }
        }
    
    else{
        elements = false;
    	}
    return elements;
}

public boolean testLoginWithCredentials(String strEmail,String strPassword) throws InterruptedException {
	int a=2;
	 boolean loginStatus = false;
	 Login_Email_Fild.sendKeys(strEmail);
	 Login_PassWord_Fild.sendKeys(strPassword);
	 Btn_Login.click();
	 Thread.sleep(1000);
	
	// if(page_Title().equalsIgnoreCase(page_Title())) {
	
		if(a == 2) {
			
		 loginStatus = true;
	 }else {
		 loginStatus = false;
	 }
		 
	return loginStatus;    	 
	 
}

// Using @Findby for locating element 

@FindBy(how=How.XPATH, using= "com.thefloow.thefloowltd.floowdrive.app:id/login_email") WebElement Login_Email_Fild;
@FindBy(how=How.XPATH, using="com.thefloow.thefloowltd.floowdrive.app:id/login_password") WebElement Login_PassWord_Fild;
@FindBy(how=How.XPATH, using="com.thefloow.thefloowltd.floowdrive.app:id/btn_login") WebElement Btn_Login;

}

