Feature: Login functionality

@valid
Scenario: Login with valid credentials
Given user is on homepage
When user clicks signup login
And user enters email and password
Then user login should be successful



@Invalid
Scenario: Login with valid credentials
Given user is on homepage
When user clicks signup login
And user enters email and password
Then user login should be successful