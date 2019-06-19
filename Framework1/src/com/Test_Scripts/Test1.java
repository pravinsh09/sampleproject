package com.Test_Scripts;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Test_Pages.ContactsPage;
import com.Test_Pages.LoginPage;
import com.Test_base.Testbase;

public class Test1 extends Testbase {
   

	

	LoginPage login;
	ContactsPage contact;
	
	public Test1() throws IOException {
		super();
		
	}


	@BeforeMethod
	public void setup() throws IOException{
		
		 login = new LoginPage();
		 contact= new ContactsPage();
	}
	
	@Parameters({ "browser","baseurl"})
	@Test
	public void testcase1(String browser,String baseurl){
		System.out.println("testcase1  "+browser+baseurl);
		Setup(browser,baseurl);
	}
    
	
	@Test
	public void login(){
		
		login.login();
	}
	
	
	@Test
	public void contacts() throws InterruptedException{
		
		contact.Addcontacts();
	}
	
}
