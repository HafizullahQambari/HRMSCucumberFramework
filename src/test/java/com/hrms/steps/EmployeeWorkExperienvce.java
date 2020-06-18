package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeWorkExperienvce extends CommonMethods {

	@Given("user login to HRMS Application Page")
	public void user_login_to_HRMS_Application_Page() {
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		login.loginBtn.click();
	}

	@Given("user click on pim button")
	public void user_click_on_pim_button() {
		jsClick(dash.pimBtn);
	}

	@When("user Enter Employee id")
	public void user_Enter_Employee() {
		wait(2);
		sendText(EmpSearch.empId, "12345");
		click(EmpSearch.EmpSearchBtn);
		
	}

	@When("user select the employee")
	public void user_select_the_employee() {
		wait(2);
		jsClick(EmpSearch.pickEmployee);
	}

	@When("User click on qualification button")
	public void user_click_on_qualification_button() {
		jsClick(EmpDetails.Qualificatons);
	}

	@When("user click on add Work Experience")
	public void user_click_on_add_Work_Experience() {
		jsClick(EmpDetails.addExperienc);
	}

	@When("user enter employee work experience")
	public void user_enter_employee_work_experience() {
		sendText(EmpDetails.empCompany, "INOVA");
		sendText(EmpDetails.expJobTitle, "Logistic Specialist");
		jsClick(EmpDetails.expFromDate);
		
		selectDdValue(EmpDetails.expYear,"2016");
		
		selectDdValue(EmpDetails.expMonth, "Mar");
		click(EmpDetails.day);
		
		jsClick(EmpDetails.expToDate);
		selectDdValue(EmpDetails.expToYear, "2020");
		selectDdValue(EmpDetails.expToMonth, "jun");
		click(EmpDetails.expToDay);
		
		wait(3);
		sendText(EmpDetails.expComment, "I got too much experience work as logistic Specialist in INOVA Hospital");
		
		jsClick(EmpDetails.expSave);
	}

	@Then("Employee work experiece added successfully")
	public void employee_work_experiece_added_successfully() {
//		System.out.println("Employee work experience added");
		boolean dispay=EmpDetails.xpDisplay.isDisplayed();
		Assert.assertTrue(dispay);
	}
}
