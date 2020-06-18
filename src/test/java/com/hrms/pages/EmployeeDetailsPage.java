package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeDetailsPage {

	@FindBy (xpath="//ul[@id='sidenav']/li[10]/a")
	public WebElement Qualificatons;
	
	@FindBy (id="addSkill")
	public WebElement addSkill;
	
	@FindBy (id="skill_code")
	public WebElement selectSkill;
	
	@FindBy (id="skill_years_of_exp")
	public WebElement yearsOfExp;
	
	@FindBy (id="skill_comments")
	public WebElement comment;
	
	@FindBy (id="btnSkillSave")
	public WebElement btnSave;
	
	@FindBy (id="addWorkExperience")
	public WebElement addExperienc;
	
	@FindBy (id="experience_employer")
	public WebElement empCompany;
	
	@FindBy (id="experience_jobtitle")
	public WebElement expJobTitle;
	
	@FindBy (id="experience_from_date")
	public WebElement expFromDate;
	
	@FindBy (xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[4]")
	public WebElement day;
	
	@FindBy (xpath="//select[@class='ui-datepicker-month']")
	public WebElement expMonth;

	@FindBy (xpath="//select[@class='ui-datepicker-year']")
	public WebElement expYear;
	
	@FindBy (id="experience_to_date")
	public WebElement expToDate;
	
	@FindBy (xpath="//select[@class='ui-datepicker-month']")
	public WebElement expToMonth;
	
	@FindBy (xpath="//div[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")
	public WebElement expToDay;
	
	@FindBy (xpath="//select[@class='ui-datepicker-year']")
	public WebElement expToYear;
	
	@FindBy (id="experience_comments")
	public WebElement expComment;
	
	
	@FindBy (xpath="//form[@id='frmDelSkill']/table/tbody/tr/td[2]/a")
	public WebElement skillDisplayed;
	
	@FindBy (id="btnWorkExpSave")
	public WebElement expSave;
	
	@FindBy (xpath="//table[@class='table hover']/tbody/tr[1]/td[2]")
	public WebElement xpDisplay;
	
	public EmployeeDetailsPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
