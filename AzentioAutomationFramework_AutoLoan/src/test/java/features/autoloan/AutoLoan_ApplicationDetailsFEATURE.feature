Feature: To Test the application details screen with auto loan product

@AT_AL_APPDETAILS_01
Scenario: To test user can able to create the application details record with valid valid
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 click on menu bar in uls transaction screen
And user_076 get the test data for test case id AT_AL_APPDETAILS_01
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 click on add button of application details record
And user_076 in customer search screen select the customer type
And user_076 in customer search screen enter customer name
And user_076 in custommer search screen select ID type
And user_076 in customer search screen enter id number
And user_076 in customer search screen enter date of birth of the customer
And user_076 in customer search screen enter customer mobile number
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
Then user_076 verify save button is visible in new application screen
Then user_076 verify product field should be mandatory editable dropdown
Then user_076 verify sub product field should be mandatory editable dropdown
Then user_076 verify total finance amount request field should be mantatory numeric
Then user_076 verify declared net monthly income field should be mandatory numeric
Then user_076 verify declared currrent obligation field should be non mandatory editable numeric
Then user_076 verify special promotional campaign field should be non mandatory editable dropdown
Then user_076 verify sourcing channel field should be mandatory editable dropdown
Then user_076 verify business center code field should be mandatory editable dropdown
Then user_076 verify service type field should be mandatory editable dropdown
Then user_076 verify region field should be mandatory editable dropdown
Then user_076 verify servicing branch field should be mandatory editable dropdown
Then user_076 verify spoke location field should be non mandatory editable dropdown
Then user_076 verify closing staff or servicing staff or RM field should be mandatory editable dropdown
Then user_076 verify topup type field should be non mandatory editable dropdown
Then user_076 verify topup application number field should be non mandatory editable input
Then user_076 verify sourcing type field should be mandatory editable lookup
Then user_076 verify sourcing office field should be mandatory editable lookup
Then user_076 verify sourcing entity field should be mandatory editable lookup
Then user_076 verify sourcing staff field should be non mandatory editable lookup
Then user_076 verify reference type field should be non mandatory editable lookup
Then user_076 verify reference entity field should be non mandatory editable lookup
Then user_076 verify reference code field should be non mandatory editable textbox
And user_076 click on save button in application details new app record
Then user_076 verify system should save the record of application details new app
And user_076 store the auto loan record reference number to test new app screens
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_AL_APPDETAILS_02
Scenario: To test user can able to create the application details record with in valid data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 get the test data for test case id AT_AL_APPDETAILS_02
And user_076 click on menu bar in uls transaction screen
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 click on add button of application details record
And user_076 in customer search screen select the customer type
And user_076 in customer search screen enter customer name
And user_076 in custommer search screen select ID type
And user_076 in customer search screen enter id number
And user_076 in customer search screen enter date of birth of the customer
And user_076 in customer search screen enter customer mobile number
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
And user_076 click on save button without enter the mandatory field in application details screen
Then user_076 verify system should show the validation for fill the mandatory field in application details screen
And user_076 enter the negative input in numeric field in application details screen
Then user_076 verify system should not allow user to enter the negative input in numeric field in application details screen
And user_076 enter the special character input field in application details screen
Then user_076 verify system should not allow user to enter the special caharcter in input field in application details screen
And user_076 enter the character input in numerical input field of charcter in input field in application details screen
Then user_076 verify system wont allow user to enter the character input in applicationn details screen
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_AL_APPDETAILS_03
Scenario: To test the submit functionality of application details in new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 get the test data for test case id AT_AL_APPDETAILS_03
And user_076 click on menu bar in uls transaction screen
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 click on add button of application details record
And user_076 in customer search screen select the customer type
And user_076 in customer search screen enter customer name
And user_076 in custommer search screen select ID type
And user_076 in customer search screen enter id number
And user_076 in customer search screen enter date of birth of the customer
And user_076 in customer search screen enter customer mobile number
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
Then user_076 verify product field should be mandatory editable dropdown
Then user_076 verify sub product field should be mandatory editable dropdown
Then user_076 verify total finance amount request field should be mantatory numeric
Then user_076 verify declared net monthly income field should be mandatory numeric
Then user_076 verify declared currrent obligation field should be non mandatory editable numeric
Then user_076 verify special promotional campaign field should be non mandatory editable dropdown
Then user_076 verify sourcing channel field should be mandatory editable dropdown
Then user_076 verify business center code field should be mandatory editable dropdown
Then user_076 verify service type field should be mandatory editable dropdown
Then user_076 verify region field should be mandatory editable dropdown
Then user_076 verify servicing branch field should be mandatory editable dropdown
Then user_076 verify spoke location field should be non mandatory editable dropdown
Then user_076 verify closing staff or servicing staff or RM field should be mandatory editable dropdown
Then user_076 verify topup type field should be non mandatory editable dropdown
Then user_076 verify topup application number field should be non mandatory editable input
Then user_076 verify sourcing type field should be mandatory editable lookup
Then user_076 verify sourcing office field should be mandatory editable lookup
Then user_076 verify sourcing entity field should be mandatory editable lookup
Then user_076 verify sourcing staff field should be non mandatory editable lookup
Then user_076 verify reference type field should be non mandatory editable lookup
Then user_076 verify reference entity field should be non mandatory editable lookup
Then user_076 verify reference code field should be non mandatory editable textbox
And user_076 click on save button in application details new app record
Then user_076 verify system should save the record of application details new app
And user_076 extract the application details record reference number in new app stage for auto loan
And user_076 get the test data for test case id AT_AL_APPDETAILS_03
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the new application stage record reference number for application details record
And user_076 select the new application stage record from mail box for application details record
And user_076 click on submit button in application details record at new app stage
And user_076 enter the alert remark for application details record in new app stage
And user_076 click on alert submit button in application details at new app stage
Then user_076 verify applicatio details record should get submitted from new app stage
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen