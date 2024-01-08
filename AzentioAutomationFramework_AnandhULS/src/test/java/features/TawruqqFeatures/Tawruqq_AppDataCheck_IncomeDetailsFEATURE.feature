Feature: To Test the income details screen in app data check with tawruqq product
@AT_TW_ADC_INCOME_01
Scenario: To verify income details fields should be read only mode
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
And user_076 find the income details screen location at app data check stage
And user_076 select the income details record at app data check stage
Then user_076 verify employment type field should be read only mode
Then user_076 verify income field should be read only mode
Then user_076 verify frequency field should be read only mode
Then user_076 verify amount field should be read only mode
Then user_076 verify defined percentage field should be read only mode
Then user_076 verify adjusted percentage field should be read only mode
Then user_076 verify amount considered field should be read only mode
Then user_076 verify total income field should be read only mode
Then user_076 verify total income considered field should be read only mode
Then user_076 verify salary credited to bank field should be read only mode
Then user_076 verify deduction field should be read only mode
Then user_076 verify deduction frequency field should be read only mode
Then user_076 verify deduction amount field should be read only mode
Then user_076 verify deduction def percentage field should be read only mode
Then user_076 verify deduction adjusted percentage field should be read only mode
Then user_076 verify deduction considered field should be read only mode
Then user_076 verify total deduction field should be read only mode
Then user_076 verify total deduction considered field should be read only mode
Then user_076 verify total deduction considered field should be read only mode
Then logout from the ULS Application
And invoke softAssert in income details app data screen
@AT_TW_ADC_INCOME_01
Scenario: To verify income details fields should be read only mode
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
And user_076 find the income details screen location at app data check stage
Then user_076 verify income details list view should be non editable