Feature: login scenario


#Scenario: to validate practice automation login functionality
#Given The user launch the application url "https://practicetestautomation.com/practice-test-login/"
#When The user enter username "student"
#When The user enter password "Password123"
#When The user submit login
#Then The user validate login successfully
#
#
#Scenario: to validate practice automation login functionality
#Given The user launch the application url "https://practicetestautomation.com/practice-test-login/"
#When The user enter username "student"
#When The user enter password "Password123"
#When The user submit login
#Then The user validate login successfully


# parameterize in cucumber

Scenario Outline: to validate practice automation login functionality
Given The user launch the application url "<URL>"
When The user enter username "<username>"
When The user enter password "<password>"
When The user submit login
Then The user validate login successfully

Examples: 
 |URL|username|password|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|
 |https://practicetestautomation.com/practice-test-login/|student|Password123|