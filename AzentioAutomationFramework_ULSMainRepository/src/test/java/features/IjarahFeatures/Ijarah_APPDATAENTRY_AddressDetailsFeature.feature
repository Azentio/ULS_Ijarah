Feature: To test the address details screen in app data entry stage
@AT_AD_001
Scenario: to test the IJARA URL
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_AD_001
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click edit button of customer personal information record
And click on add button of address details
Then verify save buttton and back button should visible in address details screen
Then verify address type field should be mandatory and dropdown and editable
Then verify address status field should be mandatory and dropdown and editable
Then verify residential or occupancy status field should should be dropdown and editable
Then verify communication address should be non mandatory and editable
Then verify location address should be mandatory and editable lookup
Then verify location category should be mandatory and editable lookup
Then verify address line 1 should be mandatory editable text box
Then verify address line 2 should be mandatory editable text box
Then verify country should be editable mandatory text box
Then verify Neighbourhood/District name field should be mandatory editable text box
Then verify provience ID field should be mandatory editable text box
Then verify city field should be editable mandatory text box
Then verify zipcode field should be editable mandatory textbox
Then verify po box number field should be editable non mandatory text box
Then verify duration of stay should be non mandatory editable text numeric field
Then verify latitude details should be non mandatory editable text box
Then verify longitude details should be non mandatory editable text box
Then verify landmark details should be non mandatory editable text box
Then verify Occupancy date should be non mandatory editable calendar
Then verify land lord name should be non mandatory editable text box
Then verify land lord mobile number should be non mandatory editable numeric
Then verify rent amount should be non mandatory editable numeric
Then verify frequency rent should be non mandatory editable dropdown
And click on save button in address details screen
Then logout from the ULS Application
And user_076 invoke soft assert in address details in app data entry stage
@AT_AD_002
Scenario: to test the address details with invalid input
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_AD_002
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click edit button of customer personal information record
And click on add button of address details
And click on save button without enter mandatory data
Then verify system should show the validation for mandatory field
And enter the special character input in any of the field
Then verify system should show the validation for special character input
And enter the character inputs in numeric field
Then verify system should not accept the character input in numeric field
Then logout from the ULS Application


@AT_AD_003
Scenario: update scenario of address details with valid input
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_AD_003
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click edit button of customer personal information record
And click on edit button on created record of address details
And update the any of the field in address details record
And click on save button in address details screen
And click on edit button on created record of address details
Then verify record got approved with the updated record
Then verify the functionality of the back button in updated record screen
And click on edit button on created record of address details
And change the status active to inactive for address details record
And click on save button in address details screen
Then verify system should show the record status as inactive
And click on edit button on created record of address details
And change the status inactive to active for address details record
And click on save button in address details screen
Then verify system should show the record status as active
Then logout from the ULS Application

@AT_AD_005
Scenario: update scenario of address details with valid input
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_AD_005
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click edit button of customer personal information record
And click on edit button on created record of address details
And make the mandatiry field blank in address details screen
And click on save button without enter mandatory data
Then verify system should show the validation for mandatory field
And enter the special character input in any of the field
Then verify system should show the validation for special character input
Then logout from the ULS Application
@AT_AD_006
Scenario: update scenario of address details with valid input
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_AD_006
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click edit button of customer personal information record
Then verify list view fields are shown in address details list view
And search for the matched text in address details list view
Then verify system should show the result for the matched text
And search for the un matched text in address details list view
Then verify system should not show the reslut for the search
And click on pdf file download in address details list view
Then verify system should download the pdf file of addressdetails record
And click on xls file download in address details list view
Then verify system should download the xls file of addressdetails record
Then logout from the ULS Application