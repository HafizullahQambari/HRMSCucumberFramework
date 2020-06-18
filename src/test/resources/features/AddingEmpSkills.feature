#Author: Hafizullah
Feature: Add Employee different skills

  Scenario: user should be able to add different skill
    Given login to Hrms Application
    And user navigate to add Employee Page
    When user search employee id
    And user select the employee from table
    And user click on Qualification button
    And user click on addskill button
    And user add skill for employee
    Then employee skills added successfully
