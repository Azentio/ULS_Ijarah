Feature: to test the customerdetails screen at new app stage
@AT_IJ_NEWAPP_01
Scenario: to create the customer details screen with vaid input data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NEWAPP_01
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
Then user_076 verify application type field should be editable mandatory dropdown
Then user_076 verify customer type field should be mandatory editable dropdown
Then user_076 verify title field should be editable mandatory dropdown
Then user_076 verify first name field should be editable mandatory text box
Then user_076 verify middle name field should be non mandatory text box
Then user_076 verify last name field should be mandatory editable text box
Then user_076 verify first name arabic field should be mandatory editable text box
Then user_076 verify middle name arabic field should be editable non mandatory text box
Then user_076 verify last name arabic field should be mandatory editable text box
Then user_076 verify date of birth field should be mandatory editable calendar field
Then user_076 verify age field should be mandatory editable calendar
Then user_076 verify gender field should be manadtory editable dropdown
Then user_076 verify education level field should be mandatory editable dropdown
Then user_076 verify maritail status field should be mandatory editable dropdown
Then user_076 verify nationality field should be mandatory editable dropdown
Then user_076 verify residential status field should be mandatory editable dropdown
Then user_076 verify language field should be mandatory editable dropdown
Then user_076 verify no of dependents field should be mandatory editable dropdown
Then user_076 verify client category field should be editablee dropdown
Then user_076 verify blacklisted field should be non mandatory editable toggle button
Then user_076 verify remarks field should be mandatory editable textbox
And user_076 click on save button in customer details screen
Then user_076 verify customer details record got saved
Then logout from the ULS Application
And user_076 invoke soft assert for customer details screen
@AT_IJ_NEWAPP_02
Scenario: to create the customer details screen with in vaid input data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NEWAPP_02
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
And user_076 click on save button without enter the mandatory details 
Then user_076 verify customer details screen should show the validation for empty mandatory field
And user_076 enter the numeric input in text input of customer details screen
Then user_076 verify system should show the validation for numeric input of customer details screen
And user_076 enter the special caharcter input in text box in customer details screen
Then user_076 verify system should show the validation for special character in customer details screen
And user_076 enter the alphabets in numeric field of customer address screen
Then user_076 verify system should not accept the alphabets in numeric field of customer address screen
Then logout from the ULS Application
And user_076 invoke soft assert for customer details screen
@AT_IJ_NEWAPP_03
Scenario: to Test user can able to update the customer details record (Ijarah)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NEWAPP_03
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on customer details tab in new app stage
And user_076 click on list view edit button of customer details record
And user_076 update the customer details record with valid data
And user_076 click on save button in customer details screen
Then user_076 verify system should show the pop up for updation of the cutomer details record
Then user_076 verify list view customer details record got updated with the new data
Then logout from the ULS Application
@AT_IJ_NEWAPP_05
Scenario: to test the user can able to update the customer details record with invalid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NEWAPP_05
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on customer details tab in new app stage
And user_076 click on list view edit button of customer details record
And user_076 make any one mandatory field blank in customer details screen
And user_076 click on save button without enter the mandatory details 
Then user_076 verify customer details screen should show the validation for empty mandatory field
And user_076 enter the numeric input in text input of customer details screen
Then user_076 verify system should show the validation for numeric input of customer details screen
And user_076 enter the special caharcter input in text box in customer details screen
Then user_076 verify system should show the validation for special character in customer details screen
And user_076 enter the alphabets in numeric field of customer address screen
Then user_076 verify system should not accept the alphabets in numeric field of customer address screen
Then logout from the ULS Application
And user_076 invoke soft assert for customer details screen

@AT_IJ_NEWAPP_06
Scenario: To test the list view search functionality and export fucntionality of customer details record
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case id AT_IJ_NEWAPP_06
And user_076 search the Ijarah new app record reference number
And user_076 select the Ijarah new app record at mail box
And user_076 click on customer details tab in new app stage
And user_076 click on list view edit button of customer details record
And user_076 click on back button of customer details record
Then user_076 verify system should navigate to previos screen of customer details
And user_076 click on add button in customer details screen
And user_076 click on back button of customer details record
Then user_076 verify customer details list view record should be read only not editable
Then user_076 verify system should navigate to previos screen of customer details
And user_076 search with matched text in customer details list view search
Then user_076 verify system should show the matched result in customer details list view
And user_076 search with un matched text in customer details search grid
Then user_076 verify system should not show the search result of customer details list view
And user_076 click on export button in customer details list view
And user_076 click on pdf export button in customer details list view
Then user_076 verify system should download the customer details record in PDF format
And user_076 click on export button in customer details list view
And user_076 click on xls export button in customer details list view
Then user_076 verify system should download the customer details record in xls format
Then logout from the ULS Application
And user_076 invoke soft assert for customer details screen