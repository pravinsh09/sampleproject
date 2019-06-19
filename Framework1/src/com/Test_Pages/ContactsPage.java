package com.Test_Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Constants.Generic;
import com.Test_base.Testbase;
import com.Utilities.Generic_funtion;

public class ContactsPage extends Testbase {
	
	
	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	Generic_funtion function = new Generic_funtion();
	
	public void Addcontacts() throws InterruptedException {
		Thread.sleep(4000);
		/*Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Contacts']"));
		act.sendKeys(Keys.F5);
		act.moveToElement(ele);*/
		
		//driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//driver.findElement(By.xpath(OR.getProperty("ContactsUsLinkByxpath"))).click();
		function.clickOn("ContactsUsLinkByxpath", Generic.PropertyTypeXpath);
		
	}
	
	
	

}
