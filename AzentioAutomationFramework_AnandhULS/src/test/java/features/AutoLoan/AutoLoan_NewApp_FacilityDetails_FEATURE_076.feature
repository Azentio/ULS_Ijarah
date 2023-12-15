Feature: To test the facility details screen with auto loan product
@AT_AL_FD_01
Scenario: To verify the fields in facility details screen and check user can able to create record with valid input
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
And user_076 click on add button in facility info screen at new app stage
And user_076 get the test data for the test case ID AT_AL_FD_01
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
@AT_AL_FD_02
Scenario: To verify user can not able to create facility details record with invalid input
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
And user_076 get the test data for the test case ID AT_AL_FD_02
And user_076 click on add button in facility info screen at new app stage
And user_076 click on save button without entering mandatory details at facility details screen
Then user_076 verify facility details screen should show the blank field validation at new app stage
And user_076 enter character input in tenure months input in facility details
Then user_076 verify tenure months field should not accept the facility details 
And user_076 enter special character input in amount requested in facility details
Then user_076 verify amount requested field should not accept special character in facility details
And user_076 click on back button in facility details screen at new app stage
Then user_076 verify facility details screen should get move previous screen at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen

@AT_AL_FD_03
Scenario: To verify user can able to update the facility list view record
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
And user_076 get the test data for the test case ID AT_AL_FD_03
And user_076 click on edit button in facility list view
And user_076 update the loan tenure field in facility details screen
And user_076 update the amount requested field in facility details screen
And user_076 click on update button in facility details screen
Then user_076 should get update validation while update the facility details record
Then user_076 verify facility tenure field should get updated at new app stage
Then user_076 verify facility requested amount field should get updated at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen