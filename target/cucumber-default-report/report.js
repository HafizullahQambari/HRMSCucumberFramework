$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployeeWorkExperience.feature");
formatter.feature({
  "name": "Work Experience",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Employees Work Experience",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login to HRMS Application Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_login_to_HRMS_Application_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on pim button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_click_on_pim_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter Employee id",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_Enter_Employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the employee",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_select_the_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on qualification button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_click_on_qualification_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add Work Experience",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_click_on_add_Work_Experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter employee work experience",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.user_enter_employee_work_experience()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee work experiece added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeWorkExperienvce.employee_work_experiece_added_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});