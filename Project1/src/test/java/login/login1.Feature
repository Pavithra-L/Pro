
Feature: TestMeApp

Scenario: Login

    Given I open the browser
    And I enter the URL
    And I Click on the SignInButton
    And Enter the credentials
    
    |Username|Password   |
    |AlexUser|Alex@123   |
    
    Then I click on Login 