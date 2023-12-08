Feature: To test the customer reference list view screen at new app stage(Ijarah)
@AT_IJ_NewApp_CR_01
Scenario: To verify user can able to create cutsomer reference record with valid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_01
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in customer reference list view in new app stage
Then user_076 verify customer reference screen should get open with save and back button at new app stage
And user_076 verify relation ship type field should be non mandatory editable dropdown at new app stage
And user_076 verify salutation field should be mandatory editable dropdown at new app stgae
And user_076 verify first name field should be non mandatory editable text box at new app stage
And user_076 verify middle name field should be non mandatory editable text box at new app stage
And user_076 verify last name field should be non mandatory editable text box at new app stage
And user_076 verify customer full name field should be non mandatory editable text box at new app stage
And user_076 verify identification type field should be editable dropdown at new app stage
And user_076 verify identification number field should be non mandatory editable textbox at new app stage
And user_076 verify residential address field should be non mandatory editable textbox at new app stage
And user_076 verify office address field should be non mandatory editable text box at new app stage
And user_076 verify contact number field should be editable textbox at new app stage
And user_076 verify office phone number field should be editable text box at new app stage
And user_076 verify primary mobile number field should be non mandatory text box at new app stage
And user_076 verify alternative mobile number field should be non mandatory editable text box at new app stage
And user_076 verify email id field should be non mandatory editable text box at new app stage
And user_076 verify no of years known field should be non mandatory editable text box at new app stage
And user_076 verify CIF number field should be non mandatory editable text box at new app stage
And user_076 click on save button in customer reference list view record
Then user_076 verify system should show the successfull validation for customer reference list view record
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage
@AT_IJ_NewApp_CR_02
Scenario: To verify user can able to create cutsomer reference record with invalid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_02
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in customer reference list view in new app stage
And user_076 click on save button without entering mandatory field in customer reference record at new app stage
Then user_076 should get the validation pop up on customer reference screen to enter the mandatory details at new app stage
And user_076 enter the special character input in first name text box in customer reference at new app stage
Then user_076 should get the special character validation on first name fiels in customer reference screen
And user_076 enter the invalid mail id in email id field in customer reference screen
Then user_076 should get the validation for invalid mail id in customer reference screen
And user_076 enter the character input in numeric firld in customer reference screen
Then user_076 numeric field wont allowed to enter the special character input in numeric field
And user_076 click on back button in customer reference screen at new app stage
When user_076 click on back button verify customer reference screen should get move backward at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage

@AT_IJ_NewApp_CR_03
Scenario: To verify user can able to update the cutsomer reference record with valid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_03
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on list view edit button in customer reference at new app stage
And user_076 update the first name in customer reference at new app stage
And user_076 click on save button in customer reference list view record
Then user_076 verify system should show the successful update pop up in customer reference at new app stage
Then user_076 verify list view record should show the updated first name in customer reference list view record
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage
@AT_IJ_NewApp_CR_04
Scenario: To verify user can able to update the cutsomer reference record with invalid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_04
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on list view edit button in customer reference at new app stage
And user_076 make salutation first as blank option at customer reference screen
And user_076 click on save button without entering mandatory field in customer reference record at new app stage
Then user_076 should get the validation pop up on customer reference screen to enter the mandatory details at new app stage
And user_076 make first name fild as blank field in customer reference screen
And user_076 enter the special character input in first name text box in customer reference at new app stage
Then user_076 should get the special character validation on first name fiels in customer reference screen
And user_076 make email id field as blank field in customer reference screen
And user_076 enter the invalid mail id in email id field in customer reference screen
Then user_076 should get the validation for invalid mail id in customer reference screen
And user_076 make no of years known field as blank in customer reference screen
And user_076 enter the character input in numeric firld in customer reference screen
Then user_076 numeric field wont allowed to enter the special character input in numeric field
And user_076 click on back button in customer reference screen at new app stage
When user_076 click on back button verify customer reference screen should get move backward at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage
@AT_IJ_NewApp_CR_05
Scenario: To verify user can able to change the customer reference record at new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_05
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on list view edit button in customer reference at new app stage
And user_076 click on status to change the record status of customer reference at new app stage
And user_076 click on save button in customer reference list view record
Then user_076 verify system should show the successful update pop up in customer reference at new app stage
Then user_076 get the customer reference list view record status at new app stage and verify with the inside record status
And user_076 again click on edit button in customer reference list view at new app stage
And user_076 click on status to change the record status of customer reference at new app stage
And user_076 click on save button in customer reference list view record
Then user_076 verify system should show the successful update pop up in customer reference at new app stage
Then user_076 get the customer reference list view record status at new app stage and verify with the inside record status
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage
@AT_IJ_NewApp_CR_06
Scenario: To verify user can able to search the customer reference list view record with valid and invalid search text
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_06
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 get the location for the customer reference screen in new app stage
And user_076 click on search button in customer reference list view at new app stage
And user_076 search the matched text in customer reference list view at new app stahe
Then user_076 verfy system should show the matched search result in customer reference list view
And user_076 search the unmatched text in customer reference list view at new app stahe
Then user_076 verfy system should not show the matched search result in customer reference list view
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage
@AT_IJ_NewApp_CR_07
Scenario: To verify user can able to download the customer reference list view record in pdf and excel format by using export functionality
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_CR_07
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 get the location for the customer reference screen in new app stage
And user_076 click on export button in customer reference screen at new app stage
And user_076 click on pdf export option in customer reference at new app stage
Then user_076 verify system should download the pdf format file for customer reference screen at new app stage
And user_076 click on export button in customer reference screen at new app stage
And user_076 click on xls export option in customer reference at new app stage
Then user_076 verify system should download the xls format file for customer reference screen at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in customer reference list view record in new app stage