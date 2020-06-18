package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeDifferentSkills extends CommonMethods {
	@Given("login to Hrms Application")
	public void login_to_Hrms_Application() {
	    sendText(login.userName, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    jsClick(login.loginBtn);
	}

	@Given("user navigate to add Employee Page")
	public void user_navigate_to_add_Employee_Page() {
	   jsClick(dash.pimBtn);
	   
	}

	@When("user search employee id")
	public void user_search_employee_id() {
		wait(2);
	    sendText(EmpSearch.empId, "12345");
	   jsClick(EmpSearch.EmpSearchBtn);
	    
	}

	@When("user select the employee from table")
	public void user_select_the_employee_from_table() {
		
		click(EmpSearch.pickEmployee);
	}

	@When("user click on Qualification button")
	public void user_click_on_Qualification_button() {
	   jsClick(EmpDetails.Qualificatons);
	}

	@When("user click on addskill button")
	public void user_click_on_addskill_button() {
	    jsClick(EmpDetails.addSkill);
	}

	@When("user add skill for employee")
	public void user_add_skill_for_employee() {
	    selectDdValue(EmpDetails.selectSkill, "TestNG");
	    sendText(EmpDetails.yearsOfExp, "3");
	    sendText(EmpDetails.comment, "I have been a supervisor for three years in this position");
	    jsClick(EmpDetails.btnSave);
	}

	@Then("employee skills added successfully")
	public void employee_skills_added_successfully() {
	    System.out.println("Employee skills added successfully");
	}

}
