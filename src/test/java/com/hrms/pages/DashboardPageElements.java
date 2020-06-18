package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements {
	
	@FindBy (id="menu_pim_viewPimModule")
	public WebElement pimBtn;
	
	@FindBy (id="btnAdd")
	public WebElement addBtn;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
