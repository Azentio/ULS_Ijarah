Feature: To Test the customer details in consumer details product
@AT_CD_DATAENTRY_CUSTDETAILS_01
Scenario: To Test the field level functionality and field is editable in customer details tab
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_01
And user_076 click on customer details screen at app data entry stage
And user_076 click on add button in customer details screen at app data entry stage
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
Then user_076 verify customer details field should have save button
Then user_076 verify customer type field should be mandatory editable dropdown
Then user_076 verify applicant type field should be mandatory editable dropdown
Then user_076 verify salutation field should be mandatory editable dropdown
Then user_076 verify first name field should be mandatory editable textbox
Then user_076 verify middle name field should be non mandatory editable textbox
Then user_076 verify last name field should be mandatory editable textbox
Then user_076 verify father first name field should be mandatory editable textbox
Then user_076 verify father middle name field should be non mandatory editable textbox
Then user_076 verify father last name field should be mandatory editable textbox
Then user_076 verify spouse first name field should be non mandatory editable textbox
Then user_076 verify spouse middle name field should be non mandatory editable textbox
Then user_076 verify spouse last name field should be non mandatory editable textbox
Then user_076 verify no of children field should be non mandatory editable textbox
Then user_076 verify spouse status field should be non mandatory editable dropdown
Then user_076 verify date of birth field should be mandatory editable calendar
Then user_076 verify gender field should be mandatory editable dropdown
Then user_076 verify education level field should be mandatory editable dropdown
Then user_076 verify maritail status field should be mandatory editable dropdown
Then user_076 verify nationality field should be mandatory editable dropdown
Then user_076 verify category field should be mandatory editable dropdown
Then user_076 verify religion field should be mandatory editable dropdown
Then user_076 verify residential status field should be mandatory editable dropdown
Then user_076 verify language field should be mandatory editable dropdown
Then user_076 verify no of dependents field should be mandatory editable textbox
Then user_076 verify mothers maiden name field should be mandatory editable textbox
Then user_076 verify residence field should be mandatory editable textbox
Then user_076 verify industry segmentation field should be mandatory editable textbox
Then user_076 verify income considered field should be non mandatory editable dropdown
Then user_076 verify costomer profile field should be non mandatory editable dropdown
Then user_076 verify relationship field should be mandatory editable dropdown
Then user_076 verify existing bank relationship field should be non mandatory editable toggle
Then user_076 verify blacklisted field should be non mandatory editable toggle
Then user_076 verify politically exposed field should be non mandatory editable dropdown
Then user_076 verify remarks field should be mandatory editable textbox
Then user_076 verify phone number field should be mandatory editable textbox
Then user_076 verify phone number primary field should be mandatory editable textbox
Then user_076 verify phone number secondary field should be editable number
Then user_076 verify email id field should be editable number
Then user_076 verify prefered contact method field should be editable number
Then user_076 verify prefered time for contact field should be editable HH MM format
And user_076 click on save button in customer details screen
Then user_076 verify customer details record got saved
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_02
Scenario: To Test the customer details field in invalid inputs at app data entry stage
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_02
And user_076 click on customer details screen at app data entry stage
And user_076 click on add button in customer details screen at app data entry stage
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
And user_076 click on save button in customer details with blank fields
Then user_076 verify system should show the validation for blank field in customer details screen stage
And user_076 enter special character in first name in customer details screen
Then user_076 verify first name field should show the validation for special character input in customer details screen
And user_076 enter numeric input in first name in customer details screen
Then user_076 verify first name field should show the validation for numeric input in customer details screen
And user_076 enter character input in no of children in customer details screen
Then user_076 verify no of children field dont accept the character input in customer details screen
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_03
Scenario: To test the update functionality in customer details screen
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_03
And user_076 click on customer details screen at app data entry stage
And user_076 click on list view edit button in customer details screen
And user_076 update the first name in customer details screen
And user_076 update the middle name in customer details screen
And user_076 update the last name in customer details screen
And user_076 click on update button in customer details screen
Then user_076 verify application should show the successfull update popup in customer details screen
Then user_076 verify customer details list view first name should be matched with updated data
Then user_076 verify customer details list view middle name should be matched with updated data
Then user_076 verify customer details list view last name should be matched with updated data
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_04
Scenario: To test the update functionality in customer details screen
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_04
And user_076 click on customer details screen at app data entry stage
And user_076 click on list view edit button in customer details screen
And user_076 clear the customer first name field value at customer details updation screen
And user_076 clear the customer no of children field value at customer details updation screen
And user_076 click on save button in customer details with blank fields
Then user_076 verify system should show the validation for blank field in customer details screen stage
And user_076 enter special character in first name in customer details screen
Then user_076 verify first name field should show the validation for special character input in customer details screen
And user_076 enter numeric input in first name in customer details screen
Then user_076 verify first name field should show the validation for numeric input in customer details screen
And user_076 enter character input in no of children in customer details screen
Then user_076 verify no of children field dont accept the character input in customer details screen
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_05
Scenario: To Test the customer details record activation and deactivation functionality
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on customer details screen at app data entry stage
And user_076 click on list view edit button in customer details screen
And user_076 verify status button should be visible in customer details screen
And user_076 change record status by clicking on toggle button in customer details screen
And user_076 click on save button in customer details screen
Then user_076 verify customer details list view record status should be changed as per the user change
And user_076 click on list view edit button in customer details screen
And user_076 change record status by clicking on toggle button in customer details screen
And user_076 click on save button in customer details screen
Then user_076 verify customer details list view record status should be changed as per the user change
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_06
Scenario: To test customer details list view should have configured fields and data should be read only mode
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on customer details screen at app data entry stage
And user_076 extract the customer details field
Then user_076 verify customer details list view should have CIF ID field
Then user_076 verify customer details list view should have first name field
Then user_076 verify customer details list view should have middle name field
Then user_076 verify customer details list view should have last name field
Then user_076 verify customer details list view should have customer type field
Then user_076 verify customer details list view should have application type field
Then user_076 verify customer details list view should have customer rating field
Then user_076 verify customer details list view should have status field
Then user_076 verify customer details list view should have export button
Then user_076 verify customer details list view should have search button
Then user_076 verify customer details list view should have add button
Then user_076 verify customer details list view record should be readonly mode
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen

@AT_CD_DATAENTRY_CUSTDETAILS_07
Scenario: To test customer details list view should have configured fields and data should be read only mode
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on customer details screen at app data entry stage
And user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_07
And user_076 click on search button in customer details list view
And user_076 search with valid search text in customer details list view
Then user_076 verify system should show the valid search result in customer details list view
And user_076 search with invalid search text in customer details list view
Then user_076 verify system should not show the search result in customer details list view
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen
@AT_CD_DATAENTRY_CUSTDETAILS_08
Scenario: To test customer details list view should have configured fields and data should be read only mode
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on customer details screen at app data entry stage
And user_076 click on export button in customer details list view
And user_076 click on pdf option in customer details export option
Then user_076 verify customer details export functionality allow user to download the pdf file
And user_076 click on export button in customer details list view
And user_076 click on xlsx option in customer details export button
Then user_076 verify customer details export functionality allow user to download the xlsx file 
Then logout from the ULS Application
And user_076 invoke softAssert in customer details screen