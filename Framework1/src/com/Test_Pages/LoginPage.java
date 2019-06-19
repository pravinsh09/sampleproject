package com.Test_Pages;


import java.io.IOException;

import org.openqa.selenium.By;

import com.Constants.Generic;
import com.Test_base.Testbase;
import com.Utilities.Generic_funtion;

public class LoginPage extends Testbase {
	
	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	Generic_funtion generic = new Generic_funtion();
	
	
   public void login(){
	
	generic.clickOn("SignInLinkByXpath", Generic.PropertyTypeXpath);
	generic.TypeText("EmailAddrtxtbyXpath", Generic.PropertyTypeXpath, "pravin.sh9@gmail.com");
	generic.TypeText("PasswordtxtByXpath", Generic.PropertyTypeXpath, "password1");
	generic.clickOn("SubmitbtnByXpath", Generic.PropertyTypeXpath);
	//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
	  // generic.TypeText(); 
	System.out.println(OR.getProperty("Homelink"));
   }

}
