package com.Utilities;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.openqa.selenium.By;

import com.Test_base.Testbase;

public class Generic_funtion extends Testbase{
	
	
	public Generic_funtion() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStackTrace(Throwable t) {
		String errorMessage = "";
		StringWriter writer = new StringWriter();
		t.printStackTrace(new PrintWriter(writer));
		writer.flush();
		String[] ary = writer.toString().split("\n");
		errorMessage += ary[0] + "<br>";
		int j = 0;
		for (int i = 0; i < ary.length; i++) {
			System.out.println("New line : " + ary[i]);
			if (ary[i].contains("at ")) {
				if (j == 6) {
					break;
				}
				errorMessage += ary[i] + "<br>";
				j = j + 1;
			}
		}
		return errorMessage;
	}
	
	public void clickOn(String property, String propertyType) {
		try{
		if (propertyType.equalsIgnoreCase("Xpath")) {
			driver.findElement(By.xpath(OR.getProperty(property))).click();
		} else if (propertyType.equalsIgnoreCase("Css")) {
			driver.findElement(By.cssSelector(OR.getProperty(property))).click();
		}
		}catch(Exception e){
			getStackTrace(e);
			//screenshot for failure and message
		}
	}
	
	public void TypeText(String property, String propertyType,String Text){
		try{
		if (propertyType.equalsIgnoreCase("Xpath")) {
			driver.findElement(By.xpath(OR.getProperty(property))).sendKeys(Text);
		} else if (propertyType.equalsIgnoreCase("Css")) {
			driver.findElement(By.cssSelector(OR.getProperty(property))).sendKeys(Text);
		}
		}catch(Exception e){
			getStackTrace(e);
			//screenshot for failure and message
		}
	}

}
