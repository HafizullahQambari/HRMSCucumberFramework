package com.hrms.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class SearchEmployee {
	
	@FindBy (xpath="//div[@id='tableWrapper']/table/tbody/tr")
	public List<WebElement> searchEmp;

	@FindBy (id="empsearch_id")
	public WebElement empId;
	
	@FindBy (id="searchBtn")
	public WebElement EmpSearchBtn;
	
	@FindBy (xpath="//table[@id=\"resultTable\"]/tbody/tr/td[3]/a")
	public WebElement pickEmployee;
	
	public SearchEmployee() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void searchEmployee() {
		
		List<WebElement> search=new LinkedList<>();
		
		for(WebElement employeeSearch:search) {
			
		String employees=employeeSearch.getText();
		
		if(employees.equals("Rafia")) {
			
			employeeSearch.click();
		}
			
		}
		
	}
}
