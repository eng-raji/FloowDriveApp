package com.floowdrive.testclasses;



import org.testng.annotations.Test;

import com.floowdrive.baseclasses.BaseTest;



public class LoginTest extends BaseTest{
	
	@Test
	public void login_Test() throws InterruptedException  {
		
		landingPage.click_Allready_Regitered();
		
		if (loginPage.validateLoginpage()== true)
		{
				System.out.println("LoginPage  is  Valid....................................");
		
			if ( loginPage.testLoginWithCredentials("abcdef@gmail.com", "asd1234") == true) {
				
				System.out.println("login pass .....................");
			}else {
			
				System.out.println("Login filed ........................");
			}
		}else {
				System.out.println("LoginPage  Not Valid....................................");
			  }
		}	
	}


