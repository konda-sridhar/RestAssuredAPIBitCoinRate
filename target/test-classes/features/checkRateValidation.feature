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

Feature: Fetch Bitcoin value in GBP from Coinbase

  As a user
  I want to make a GET call to the Coinbase API
  To get the current price for Bitcoin and print the Bitcoin rate in GBP


  Scenario: Get Bitcoin value in GBP
    Given the Coinbase API endpoint for GBP value is available
    When I make a Get request for the Bitcoin value in GBP
    Then the response status code should be 200
    And the Bitcoin value should be fetched successfully and printed 
