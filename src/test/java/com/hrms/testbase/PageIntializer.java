package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeDetailsPage;
import com.hrms.pages.SearchEmployee;
import com.hrms.pages.loginPageElements;

public class PageIntializer extends BaseClass{
	
	public static loginPageElements login;
	public static DashboardPageElements dash;
	public static AddEmployeePageElements addEmpPage;
	public static EmployeeDetailsPage EmpDetails;
	public static SearchEmployee EmpSearch;
	public static void initialize() {
		
		
		login=new loginPageElements();
		dash= new DashboardPageElements();
		addEmpPage=new AddEmployeePageElements();
		EmpDetails=new EmployeeDetailsPage();
		
		EmpSearch=new SearchEmployee();
		
	}
	

}
