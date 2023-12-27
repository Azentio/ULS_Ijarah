Feature: To test the customer identification details screen at new application stage
@AT_IJ_NewApp_IDA_01
Scenario: to test the customer identificatin details screen with valid input at new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_01
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in customer identification screen
Then user_076 verify id type field should be editable mandatory dropdown
Then user_076 verify id number field should be editable mandatory numeric field
Then user_076 verify id issue date field should be editable non mandatiry mandatory calendar field
Then user_076 verify id expairy date field should be editable non mandatiry mandatory calendar field
Then user_076 verify issuing authority field should be editable non mandatory dropdown
Then user_076 verify country of issue field should be editable non mandatory dropdown
Then user_076 verify primary ID flag field should be toggle buttton
And user_076 click on save button in customer identification details of new app stage
Then user_076 system should show the success pop up for identification details saved record in new app stage
Then logout from the ULS Application
And user_076 invoke soft asset in customer identification details screen at new app stage

@AT_IJ_NewApp_IDA_02
Scenario: to test the customer identificatin details screen with in valid input at new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_02
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in customer identification screen
And user_076 click on save button customer identification details screen without enter the mandatory details at new app stage
Then user_076 verify system should show the validation to fill the mandatory details in customer identification screen at new app stage
And user_076 enter the special character input in id number field
Then user_076 verify system should show the validation for the id number field at new app stage
Then logout from the ULS Application
And user_076 invoke soft asset in customer identification details screen at new app stage
@AT_IJ_NewApp_IDA_03
Scenario: to verify user can able to update the customer identification details record from list view
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_03
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer identification details list view record
And user_076 update the id number field in identification detais record at new app stage
And user_076 click on save button in customer identification details of new app stage
Then user_076 verify system should show the successful update pop up in identification details screen at new appp stage
And user_076 get the list view record of customer identification at new app stage
Then user_076 verify system should show the updated value in identification details at new app stage
Then logout from the ULS Application

@AT_IJ_NewApp_IDA_04
Scenario: to test the customer identificatin details screen with in valid input at new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_04
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer identification details list view record
And user_076 remove the mandatory details value from customer identification details of updated record at new app stage
And user_076 click on save button customer identification details screen without enter the mandatory details at new app stage
And user_076 enter the special character input in id number field
Then user_076 verify system should show the validation for the id number field at new app stage
Then logout from the ULS Application
And user_076 invoke soft asset in customer identification details screen at new app stage
@AT_IJ_NewApp_IDA_05
Scenario: To test the customer identification details screen in new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_05
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer identification details list view record
Then user_076 verify system should change the identification record status active and in active at new app stage
And user_076 click on edit button of the list view record of customer identification at new app stage
Then user_076 verify system should change the identification record status active and in active at new app stage
And user_076 click on edit button of the list view record of customer identification at new app stage
And user_076 click on view summary button in identification new app stage record
Then user_076 verify system should show the record summary of identification at new app stage
Then logout from the ULS Application
And user_076 invoke soft asset in customer identification details screen at new app stage
@AT_IJ_NewApp_IDA_06
Scenario: To test the customer identification details screen in new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NewApp_IDA_06
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 verify identification list view record should be read only not editable at new app stage
And user_076 click on search button in customer identification details list view at new app stage
And user_076 search for valid search text in customer identification details list view at new app stage
Then user_076 system should show the search result in customer identification details list view at new app stage
And user_076 search for in valid search text in customer identification details list view at new app stage
Then user_076 system should not show the search result in customer identification details list view at new app stage
And user_076 click on export button in customer identification details list view
And user_076 click on pdf export of customer identification details in new app stage
Then user_076 verify in new app stage system is downloading the customer identification pdf file
And user_076 click on export button in customer identification details list view
And user_076 click on xls export of customer identification details in new app stage
Then user_076 verify in new app stage system is downloading the customer identification xls file
And user_076 click on add button in customer identification screen
And user_076 click on back button in customer identification details in new app stage
Then user_076 verify identififcation details screen got move backward to previos screen at new app stage
And user_076 click on edit button of customer identification details list view record
And user_076 click on back button in customer identification details in new app stage
Then user_076 verify identififcation details screen got move backward to previos screen at new app stage
Then logout from the ULS Application
And user_076 invoke soft asset in customer identification details screen at new app stage