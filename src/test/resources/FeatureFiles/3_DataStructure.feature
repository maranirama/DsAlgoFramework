#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@DataStructure
Feature: DataStructure Module

 # Background: user is launcing home page
  #  Given user click on signin button
   # When user enter "Numpysdet84" and "sdet84batch"
    #And user clicks on loginbutton
    
   

  @positive
  Scenario: user navigates to DataStructure Module
    Given user is on DataStructure Module
    When user clicks DataStructure getstarted button
    Then user launches DataStructure page	
		When user clicks on time complexity link
    And  user clicks on Try here button
    Then user types python code in text box
    And user clicks on Run button
    
    