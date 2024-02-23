Feature: To test the murabha application details screen with murabha product
@AT_PL_NewApp_01
Scenario: To test user can able to create the application details record with valid
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 click on menu bar in uls transaction screen
And user_076 get the test data for test case id AT_PL_NewApp_01
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
Then user_076 verify save button and back buttons are visible in new application screen
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
#Then user_076 verify toupup type field should be visible in murabha product
#Then user_076 verify topup application number field should be visible in murabha product
Then user_076 verify sourcing type field should be mandatory editable lookup
Then user_076 verify sourcing office field should be mandatory editable lookup
Then user_076 verify sourcing entity field should be mandatory editable lookup
Then user_076 verify sourcing staff field should be non mandatory editable lookup
Then user_076 verify reference type field should be non mandatory editable lookup
Then user_076 verify reference entity field should be non mandatory editable lookup
Then user_076 verify reference code field should be non mandatory editable textbox
And user_076 click on save button in application details new app record
Then user_076 verify system should save the record of application details new app
And user_076 store the murabaha record reference number to test new app screens
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_PL_NewApp_02
Scenario: To test user can able to create the application details record with invalid data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 get the test data for test case id AT_PL_NewApp_02
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
And user_076 click on save button without entering mandatory details in creation screen
Then user_076 verify system should show the validation for fill the mandatory field in application details screen
And user_076 enter the negative input in numeric field in application details screen
Then user_076 verify system should not allow user to enter the negative input in numeric field in application details screen
And user_076 enter the special character input field in application details screen
Then user_076 verify system should not allow user to enter the special caharcter in input field in application details screen
And user_076 enter the character input in numerical input field of charcter in input field in application details screen
Then user_076 verify system wont allow user to enter the character input in applicationn details screen
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_PL_NewApp_03
Scenario: To test user can able to update the list application details list view record at new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 get the test data for test case id AT_PL_NewApp_03
And user_076 click on menu bar in uls transaction screen
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 click on list view edit button in application details record at new app stage
And user_076 update the application details record with valid input at new app stage
   #user_076 click on save button in application details new app record
And user_076 click on save button while open the application details record
Then user_076 verify system should show the message for updated record of application details at new app stage
And user_076 click on list view edit button in application details record at new app stage
Then user_076 verify application details record got updated at new app stage
Then logout from the ULS Application

@AT_PL_NewApp_04
Scenario: To test user can able to update the list view record of application details with invalid data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 click on menu bar in uls transaction screen
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 get the test data for test case id AT_PL_NewApp_04
And user_076 click on list view edit button in application details record at new app stage
And user_076 make any mandatory field blank in application details record in new app stage
And user_076 click on save button without enter the mandatory field in application details screen
#Then user_076 verify system should show the validation for fill the mandatory field in application details screen
Then user_076 verify system should show the validation for fill the mandatory field in application details screen in updation screen
And user_076 enter the negative input in numeric field in application details screen
Then user_076 verify system should not allow user to enter the negative input in numeric field in application details screen
And user_076 enter the special character input field in application details screen
Then user_076 verify system should not allow user to enter the special caharcter in input field in application details screen
And user_076 enter the character input in numerical input field of charcter in input field in application details screen
Then user_076 verify system wont allow user to enter the character input in applicationn details screen
#Then user_076 click on view summary button in application details screen in new app stage
#Then user_076 verify system should show the summary of the application details record at new app stage
And user_076 click on back button in list view record of application details record in new app stage
Then user_076 verify screen should get navigate to previous screen in new app stage of application details record
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen


@AT_PL_NewApp_05
Scenario: To test the submit functionality of application details in new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 get the test data for test case id AT_PL_NewApp_05
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
#Then user_076 verify toupup type field should be visible in murabha product
#Then user_076 verify topup application number field should be visible in murabha product
Then user_076 verify sourcing type field should be mandatory editable lookup
Then user_076 verify sourcing office field should be mandatory editable lookup
Then user_076 verify sourcing entity field should be mandatory editable lookup
Then user_076 verify sourcing staff field should be non mandatory editable lookup
Then user_076 verify reference type field should be non mandatory editable lookup
Then user_076 verify reference entity field should be non mandatory editable lookup
Then user_076 verify reference code field should be non mandatory editable textbox
And user_076 click on save button in application details new app record
Then user_076 verify system should save the record of application details new app
And user_076 extract the application details record reference number in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_05
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


@AT_PL_NewApp_06
Scenario: Verify that user can able to update status of new application record
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And user_076 click on menu bar in uls transaction screen
And user_076 click on transactions module
And user_076 click on applicationn manager feature
And user_076 click on application details screen temp view
And user_076 get the test data for test case id AT_PL_NewApp_04
And user_076 click on list view edit button in application details record at new app stage
And Update the status to Inactive in Personal loan_New Application
And Click on Save icon in Personal loan_New Application
And user_076 click on list view edit button in application details record at new app stage
And Update the status to Active in Personal loan_New Application
And Click on Save icon in Personal loan_New Application
And user_076 click on list view edit button in application details record at new app stage
And Validate View summary functionality in Autoloan_Manual bank

@AT_PL_NewApp_07
Scenario: Verify that user can able to create customer details record in new application
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
And user_076 get the test data for test case id AT_PL_NewApp_07
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
Then user_076 verify customer details field should have save and back button
Then user_076 verify customer type field should be mandatory editable dropdown at new app
Then user_076 verify applicant type field should be mandatory editable dropdown at new app
Then user_076 verify salutation field should be mandatory editable dropdown at new app
Then user_076 verify first name field should be mandatory editable textbox at new app
Then user_076 verify middle name field should be non mandatory editable textbox at new app
Then user_076 verify last name field should be mandatory editable textbox at new app
Then user_076 verify father first name field should be mandatory editable textbox at new app
Then user_076 verify father middle name field should be non mandatory editable textbox at new app
Then user_076 verify father last name field should be mandatory editable textbox at new app
Then user_076 verify spouse first name field should be non mandatory editable textbox at new app
Then user_076 verify spouse middle name field should be non mandatory editable textbox at new app
Then user_076 verify spouse last name field should be non mandatory editable textbox at new app
Then user_076 verify no of children field should be non mandatory editable textbox
Then user_076 verify spouse status field should be non mandatory editable dropdown at new app
Then user_076 verify date of birth field should be mandatory editable calendar at new app
Then user_076 verify gender field should be mandatory editable dropdown at new app
Then user_076 verify education level field should be mandatory editable dropdown at new app
Then user_076 verify maritail status field should be mandatory editable dropdown at new app
Then user_076 verify nationality field should be mandatory editable dropdown at new app
Then user_076 verify category field should be mandatory editable dropdown at new app
Then user_076 verify religion field should be mandatory editable dropdown at new app
Then user_076 verify residential status field should be mandatory editable dropdown at new app
Then user_076 verify language field should be mandatory editable dropdown at new app
Then user_076 verify no of dependents field should be mandatory editable textbox at new app
Then user_076 verify mothers maiden name field should be mandatory editable textbox at new app
Then user_076 verify residence field should be mandatory editable textbox at new app
Then user_076 verify industry segmentation field should be mandatory editable textbox at new app
Then user_076 verify income considered field should be non mandatory editable dropdown at new app
Then user_076 verify costomer profile field should be non mandatory editable dropdown at new app
Then user_076 verify relationship field should be mandatory editable dropdown at new app
Then user_076 verify existing bank relationship field should be non mandatory editable toggle at new app
Then user_076 verify blacklisted field should be non mandatory editable toggle at new app
Then user_076 verify politically exposed field should be non mandatory editable dropdown at new app
Then user_076 verify remarks field should be mandatory editable textbox at new app
Then user_076 verify phone number field should be mandatory editable textbox at new app
Then user_076 verify phone number primary field should be mandatory editable textbox at new app
Then user_076 verify phone number secondary field should be editable number at new app
Then user_076 verify email id field should be editable number at new app
Then user_076 verify prefered contact method field should be editable number at new app
Then user_076 verify prefered time for contact field should be editable HH MM format at new app
And user_076 click on save button in customer details screen
Then user_076 verify customer details record got saved
Then logout from the ULS Application
And user_076 invoke softAssert in auto loan new app customer details screen

@AT_PL_NewApp_08
Scenario: Verify that user can able to create customer details record with negative validation in new application
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
And user_076 get the test data for test case id AT_PL_NewApp_08
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
And user_076 click on save button in customer details with blank fields
Then user_076 verify system should show the validation for blank field in customer details screen at new app stage
And user_076 enter special character in first name in customer details screen at new app
Then user_076 verify first name field should show the validation for special character input in customer details screen at new app
And user_076 enter numeric input in first name in customer details screen at new app
Then user_076 verify first name field should show the validation for numeric input in customer details screen at new app
And user_076 enter character input in no of children in customer details screen at new app
Then user_076 verify no of children field dont accept the character input in customer details screen at new app
Then logout from the ULS Application
And user_076 invoke softAssert in auto loan new app customer details screen

@AT_PL_NewApp_09
Scenario: Verify that user can able to create Facility info record in new application
Given navigate the IJARA URL
And  login with valid credentials for new application stage
And  click on module dropdown in IJRARAH
And  click on LOS option in module dropdown
And  click on mail box
And  click on search box upon click on the mail box
And  click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 click on add button in facility info screen at new app stage
And user_076 get the test data for test case id AT_PL_NewApp_09
Then user_076 verify facility info screen should have save and back button at new app stage
Then user_076 verify clasification field should be editable dropdown at in facility info screen
Then user_076 verify product field should be editable dropdown at in facility info screen
Then user_076 verify scheme field should be editable dropdown at in facility info screen
Then user_076 verify program code field should be editable dropdown at in facility info screen
Then user_076 verify facility type field should be editable dropdown at in facility info screen
Then user_076 verify servicing branch field should be editable dropdown at in facility info screen
Then user_076 verify pricing or interest indector field should be editable dropdown at in facility info screen
Then user_076 verify declared downpayment amount field should be editable dropdown at in facility info screen
Then user_076 verify requested amount field should be editable dropdown at in facility info screen
Then user_076 verify currency field should be editable dropdown at in facility info screen
Then user_076 verify loan tenure field should be editable dropdown at in facility info screen
And user_076 click on save button in facility info screen at new app
Then user_076 verify system should show the save success message for facility info screen
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_PL_NewApp_10
Scenario: Verify that user can able to create Facility info record with negative validation in new application
Given navigate the IJARA URL
And  login with valid credentials for new application stage
And  click on module dropdown in IJRARAH
And  click on LOS option in module dropdown
And  click on mail box
And  click on search box upon click on the mail box
And  click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_10
And user_076 click on add button in facility info screen at new app stage
And user_076 click on save button without entering mandatory details at facility details screen
Then user_076 verify facility details screen should show the blank field validation at new app stage
And user_076 enter character input in tenure months input in facility details
Then user_076 verify tenure months field should not accept the facility details 
And user_076 enter special character input in amount requested in facility details
Then user_076 verify amount requested field should not accept special character in facility details
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_PL_NewApp_11
Scenario: Verify that user can able to update Facility info record
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_11
And user_076 click on edit button in facility list view
And user_076 update the loan tenure field in facility details screen
And user_076 update the amount requested field in facility details screen
And user_076 click on update button in facility details screen
Then user_076 should get update validation while update the facility details record
Then user_076 verify facility tenure field should get updated at new app stage
Then user_076 verify facility requested amount field should get updated at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_PL_NewApp_12
Scenario: Verify that user can able to update Facility info record with negative validation
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_12
And user_076 click on edit button in facility list view
And Remove the values in any required field in facility details screen
And user_076 click on save button without entering mandatory details at facility details screen
Then user_076 verify facility details screen should show the blank field validation at new app stage
And Update character input in tenure months input in facility details
Then user_076 verify tenure months field should not accept the facility details 
And Update special character input in amount requested in facility details
Then user_076 verify amount requested field should not accept special character in facility details
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_PL_NewApp_13
Scenario: Verify that user can able to update Facility info record status
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_13
And user_076 click on edit button in facility list view
And update the status to Inactive in Facility Info page
And user_076 click on save button in facility info screen at new app 
And user_076 click on edit button in facility list view
And update the status to Inactive in Facility Info page
And user_076 click on save button in facility info screen at new app 


@AT_PL_NewApp_14
Scenario: Validate the fields are present in Facility info view list
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_14
And Validate that Classification field is present in Facility Info view list
And Validate that Product field is present in Facility Info view list
And Validate that Tenure field is present in Facility Info view list
And Validate that Requested Amount field is present in Facility Info view list
And Validate that Status field is present in Facility Info view list

@AT_PL_NewApp_15
Scenario: Validate the search critria functionality in Facility info view list
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_15
And user_076 click on search button in facility list view in new app stage
And user_076 search the valid search text in facility details list view
Then user_076 verify facility list view search result should be visible
And user_076 search the invalid search text in facility details list view
Then user_076 verify facility list view search result should not be visible
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_PL_NewApp_16
Scenario: Validate the export functionality in Facility info view list
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on facility info tab in new app stage
And user_076 get the test data for test case id AT_PL_NewApp_16
And user_076 click on export button in faciliy details list view
And user_076 click on pdf option export the facility details content
Then user_076 verify pdf file is downloaded for facility details
And user_076 click on export button in faciliy details list view
And user_076 click on xlsx option export the facility details content
Then user_076 verify xlsx file is downloaded for facility details
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen





