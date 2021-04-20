package com.qa.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.qa.pages.*;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.pages.TaskPage;

public class PageObjectManager {
	
	private WebDriver driver;
	 
	 private LoginPage loginPage;
	 
	 private RegistrationPage regPage;
	 
	 private contactPage contactPage;
	 
	 private TaskPage checkoutPage;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
		 
		 
		 
		 public LoginPage getLoginPage(){
		 
		 return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
		 
		 }
		 
		 
		 
		 public contactPage getRegistrationPage() {
		 
		 return (contactPage == null) ? contactPage = new contactPage(driver) : contactPage;
		 
		 }
		 
		 
		 
		 

}
