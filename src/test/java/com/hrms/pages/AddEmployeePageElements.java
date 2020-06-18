package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements {

	
	@FindBy (id="firstName")
	public WebElement empFirstName;
	
	@FindBy (id="middleName")
	public WebElement empMiddleName;
	
	@FindBy (id="lastName")
	public WebElement lastName;
	
	@FindBy (id="btnSave")
	public WebElement saveBtn;
	
	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
