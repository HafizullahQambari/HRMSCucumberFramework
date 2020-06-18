package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class loginPageElements {
	
	@FindBy (id="txtUsername")
	public WebElement userName;
	
	@FindBy (id="txtPassword")
	public WebElement password;
	
	@FindBy (id="btnLogin")
	public WebElement loginBtn;
	
	
	
	public loginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
