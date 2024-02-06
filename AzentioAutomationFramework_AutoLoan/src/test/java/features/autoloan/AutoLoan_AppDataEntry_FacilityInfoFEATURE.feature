Feature: To Test the facility info screen in app data entry stage (Auto Loan)
@AT_AL_FD_APPDATAENTRY_01
Scenario: To verify user can able to create facility info record with valid input and field level verification
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on facility details tab in app data entry stage
And user_076 click on add button in facility info screen at app data entry stage
And user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_01
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
@AT_AL_FD_APPDATAENTRY_02
Scenario: To test the facility info screen with invalid inputs at app data entry stage
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on facility details tab in app data entry stage
And user_076 click on add button in facility info screen at app data entry stage
And user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_02
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
@AT_AL_FD_APPDATAENTRY_03
Scenario: To test the facility info screen with invalid inputs at app data entry stage
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on facility details tab in app data entry stage
And user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_03
Then user_076 verify facility info list view should be read only mode
Then user_076 facility info list view should have configured list view fields
Then user_076 verify facility info screen should have add button
Then user_076 verify facility info screen should have export button
Then user_076 verify facility info screen should have edit button
When user_076 click on edit button in facility info screen
Then user_076 verify facility info screen should get opened
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen
@AT_AL_FD_APPDATAENTRY_04
Scenario: To verify facility info search functionality is working as expected
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on facility details tab in app data entry stage
And user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_04
And user_076 click on search button in facility list view in new app stage
And user_076 search the valid search text in facility details list view
Then user_076 verify facility list view search result should be visible
And user_076 search the invalid search text in facility details list view
Then user_076 verify facility list view search result should not be visible
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen
@AT_AL_FD_APPDATAENTRY_05
Scenario: To verify the export functionality in facility details list view screen
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on facility details tab in app data entry stage
And user_076 click on export button in faciliy details list view
And user_076 click on pdf option export the facility details content
Then user_076 verify pdf file is downloaded for facility details
And user_076 click on export button in faciliy details list view
And user_076 click on xlsx option export the facility details content
Then user_076 verify xlsx file is downloaded for facility details
Then logout from the ULS Application
And user_076 invoke soft assert in facility info screen