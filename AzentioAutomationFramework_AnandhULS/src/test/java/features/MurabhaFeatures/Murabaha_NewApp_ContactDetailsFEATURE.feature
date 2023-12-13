Feature: To Test the murabaha conntact details record at new app stagge
@AT_NewApp_M_CD_01
Scenario: To test user can able to create contact details record with valid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_01
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add butto in contact details screen in new app stage
Then user_076 verify contact details screen should get open with save buttton and back button
And user_076 phone type field should be editable dropdown in contact details screen at new app stage
And user_076 phone number field should be editable number field in contact details screen at new app stage
And user_076 consent for phone contact should be editable dropdown in contact details screen at new app stage
And user_076 prefered phone contact type field should be ditable dropdown in contact details screen at new app stage
And user_076 prefered time for contact field shoule be editable field type should be HH MM type in contact details screen at new app stage
And user_076 email type field should be editable dropdown in contact details screen at new app stage
And user_076 email ID field should be editable emial iD field in contact details screen at new app stage
And user_076 click on save button in contact details screen at new app stage
Then user_076 show the save successful pop up for contact details screen at new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage
@AT_NewApp_M_CD_02
Scenario: To test user can able to create contact details record with invalid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_02
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add butto in contact details screen in new app stage
And user_076 click on save button without enter the details in contact details screen in new app stage
Then user_076 verify contact details should show the mandatory field validation in new app stage
And user_076 enter the character input in phone numver field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for character input in new app stage
And user_076 enter the negative input in phone number field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for negative input in new app stage
And user_076 enter the special character input in phone numver field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for special character input in new app stage
And user_076 enter the invaid mail id input inemail id field in contact details screen in new app stage
Then user_076 verify email id field should show the validation for invalid mail id input in new app stage
And user_076 click on back button in contact details screen at new app stage
Then user_076 verify contact details screen should get moved to backward at new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage

@AT_NewApp_M_CD_03
Scenario: To verify user can able to update the contact details record with valid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_03
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button in list view record of contact details in new app stage
And user_076 update the phone number in contact details list view record in new app stage
And user_076 click on save button after update the contact details in new app stage
Then user_076 verify system should show the update successful popup while update the contact details record in new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage

@AT_NewApp_M_CD_04
Scenario: To verify user can able to update the contact details record with invalid input
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_04
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button in list view record of contact details in new app stage
And user_076 make phone number field as blank in contact details at new app stage
And user_076 click on save button without enter the details in contact details screen in new app stage
Then user_076 verify contact details should show the mandatory field validation in new app stage
And user_076 enter the character input in phone numver field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for character input in new app stage
And user_076 enter the negative input in phone number field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for negative input in new app stage
And user_076 enter the special character input in phone numver field in contact details screen in new app stage
Then user_076 verify phone number field should show the validation for special character input in new app stage
And user_076 clear the email id field in contact details at new app stage
And user_076 enter the invaid mail id input inemail id field in contact details screen in new app stage
Then user_076 verify email id field should show the validation for invalid mail id input in new app stage
And user_076 click on back button in contact details screen at new app stage
Then user_076 verify contact details screen should get moved to backward at new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage
@AT_NewApp_M_CD_05
Scenario: To verify user can able to activate and de activate the contact details list view record
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_05
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 verify contact details list view record should be read only not editable at new app stage
And user_076 click on edit button in list view record of contact details in new app stage
And user_076 click on toggle button and capture the status of cutact details record at new app stage
And user_076 click on save button after update the contact details in new app stage
Then user_076 verify system should show the update successful popup while update the contact details record in new app stage
Then user_076 verify contact details record status in list view at new app stage
And user_076 click on edit button in contact details list view at new app stage
And user_076 click on toggle button and capture the status of cutact details record at new app stage
And user_076 click on save button after update the contact details in new app stage
Then user_076 verify system should show the update successful popup while update the contact details record in new app stage
Then user_076 verify contact details record status in list view at new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage
@AT_NewApp_M_CD_06
Scenario: to test the record search functionality in customer details list view in new app stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_06
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 verify contact details list view record should be read only not editable at new app stage
And user_076 click on contact details list view search button at new app stage
And user_076 search the matched test in contact details list view at new app stage
Then user_076 verify contact details list view should show the matched results at new app stage
And user_076 search the unmatched test in contact details list view at new app stage
Then user_076 verify contact details list view should show the unmatched results at new app stage
Then logout from the ULS Application
And user_076 invoke softAssert in contac details new new app stage
@AT_NewApp_M_CD_07
Scenario: To verify user can able to activate and de activate the contact details list view record
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for the test case ID AT_NewApp_M_CD_07
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 verify contact details list view record should be read only not editable at new app stage
And user_076 click on export button in contact details list view at new app stage
And user_076 click on pdf options in contact details export option at new app stage
Then user_076 verify contact details pdf file should download in new app stage
And user_076 click on export button in contact details list view at new app stage
And user_076 click on xlsx options in contact details export option at new app stage
Then user_076 verify contact details xlsx file should download in new app stage
Then logout from the ULS Application
And user_076 invoke soft assert for customer details screen