Feature: To test the tawruqq commodity maker stage
@AT_TW_CSM_01
Scenario: To verify user can able to create commodity po record with valid input and verify the fields in commodity po screen at commodity maker stage
Given navigate the IJARA URL
And login with valid credentials for commodity maker stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq record reference number in new app stage
And user_076 select the tawruqq record in new app stage
And user_076 get the test data for test case id AT_TW_CSM_01
And user_076 click on commodity po tab in commodity maker stage
And user_076 click on add button in commodity po screen
And user_076 verify business partner field should be mandatory editable dropdown at commodity maker stage
And user_076 verify commodity type field should be mandatory editable dropdown at commodity maker stage
And user_076 verify commodity name field should be mandatory editable dropdown at commodity maker stage
And user_076 verify poposed amount field should be read only mandatory at commodity maker stage
And user_076 verify commodity amount field should be mandatory editable text box at commodity maker stage
And user_076 verify unit sales price field should be mandatory editable text box at commodity maker stage
And user_076 verify unit purchase price field should be mandatory non editable text box at commodity maker stage
And user_076 verify Unit Type field should be mandatory non editable text box at commodity maker stage
And user_076 verify Quantity field should be mandatory non editable text box at commodity maker stage
And user_076 verify remarks field should be non mandatory editable textbox at commodity maker stage
And user_076 click on save button in commodity po screen
Then user_076 verify system should show the successful vlidation while save the commodity po record
Then logout from the ULS Application
And user_076 invoke soft assert in commodity po screen

@AT_TW_CSM_02
Scenario: To verify user can able to create commodity po record with invalid input
Given navigate the IJARA URL
And login with valid credentials for commodity maker stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq record reference number in new app stage
And user_076 select the tawruqq record in new app stage
And user_076 get the test data for test case id AT_TW_CSM_02
And user_076 click on commodity po tab in commodity maker stage
And user_076 click on add button in commodity po screen
And user_076 click on save button without entering the mandatory details
Then user_076 verify commodity po screen should show the empty field validation
And user_076 enter the character value in numeric field in commodity po screen
And user_076 verify system wont allow user to enter character input in numeric field of commodity po screen
And user_076 click on back button in commodity po screen
Then user_076 verify commodity po screen should get move backward
Then logout from the ULS Application
And user_076 invoke soft assert in commodity po screen

@AT_TW_CSM_03
Scenario: To verify list view of commodity po screen
Given navigate the IJARA URL
And login with valid credentials for commodity maker stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq record reference number in new app stage
And user_076 select the tawruqq record in new app stage
And user_076 get the test data for test case id AT_TW_CSM_03
And user_076 click on commodity po tab in commodity maker stage
And user_076 verify commodity po screen fields are showing as per the configuration
And user_076 verify commodity po screen should have add button
And user_076 verify commodity po screen should have export button
And user_076 click on search button in commodity po screen
And user_076 search the invalid search text in commodity po screen
Then user_076 verify system wont show the search of invalid search text in commodity po screen
And user_076 search the valid search text in commodity po screen
Then user_076 verify system should show the search of valid search text in commodity po screen
And user_076 click on export button in commodity po screen
And user_076 click on pdf option in commodity po export dropdown
Then user_076 verify commodity po record should download as pdf format
And user_076 click on export button in commodity po screen
And user_076 click on xlsx option in commodity po export dropdown
Then user_076 verify commodity po record should download as xlsx format
Then logout from the ULS Application
And user_076 invoke soft assert in commodity po screen