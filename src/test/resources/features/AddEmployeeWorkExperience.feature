#Author: your.email@your.domain.com
Feature: Work Experience

  Scenario: Add Employees Work Experience
    Given user login to HRMS Application Page
    And user click on pim button
    When user Enter Employee id
    And user select the employee
    And User click on qualification button
    And user click on add Work Experience
    And user enter employee work experience
    Then Employee work experiece added successfully
