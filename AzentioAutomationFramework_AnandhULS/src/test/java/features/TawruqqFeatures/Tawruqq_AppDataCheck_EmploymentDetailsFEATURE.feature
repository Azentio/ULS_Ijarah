Feature: To test the employment details at app data check stage with tawruqq product
Scenario: To verify emloyment details screen have mentioned fields and  primary employment field should have default value as yes
Given navigate the IJARA URL
And user_076 login with valid app data check stage userID for tawruqq product
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data check tawruqq record in mail box
And user_076 select the app data check tawruqq record from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the employment details screen location at app data check stage
And user_076 click on eye icon in employment details at app data check stage
Then user_076 verify primary employment field should have default value as yes in app data check stage
Then logout from the ULS Application