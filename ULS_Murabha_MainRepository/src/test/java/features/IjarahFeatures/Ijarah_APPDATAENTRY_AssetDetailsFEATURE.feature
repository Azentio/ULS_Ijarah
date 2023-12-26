Feature: to test the asset details feature

@AT_IAD_001
Scenario: to test the asset details screen with valid inputs at app data entry
Given navigate the IJARA URL
And login with valid credentials
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_IAD_001
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box for asset details screen
And select the record form mail box for asset details screen
And click on asset details segment button
And click on add button in asset details tab
Then verify asset caregory field should be mandatory editable lookup
Then verify asset manufacture field should be mandatory editable lookup
Then verify asset model field should be mandatory editable lookup
Then verify asset model type field should be non mandatory editable textbox
Then verify year of manufacture field should be mandatory editable numeric
Then verify asset condition field should be mandatory and editable lookup
Then verify asset color field should be non mandatory editable lookup
Then verify drivetrain field should be non mandatory editable textbox
Then verify number of cylinder field should benon mandatory editable numeric
Then verify volume of engine field should be non mandatory editable numeric field
Then verfy no of units field should be non mandatory editable numeric field
Then verify chassis number field should be mandatory editable numeric field
Then verify plate number field should be mandatory editable numeric field
Then verify plate number arabic field should ve mandatory editable numeric field
Then verify asset dealer field should be mandatory editable lookup
Then verify agent name field should be non mandatory editable lookup
Then verify agent email ID field should be non mandatory editable textbox
Then verify agent mobile number field should be non mandatory editable textbox
Then verify asset price field should be non mandatory editable numeric
Then verify downpayment field should be non mandatory editable numeric field'
Then verify down payment percentage field should be non mandatory editable numeric field
Then verify green card issue date field should be non mandatory editable editable date field
Then verify residual value field should be non mandatory editable numeric
Then verify green card no field should be non mandatory editable numeric field
Then verify weight field should be non mandatory editable numeric field
Then verify mileage field should be non mandatory editable numeric field
Then verify country of manufacture field should be non mandatory editable lookup
Then verify asset agreed fulfilment location field should be mandatory editable lookup
Then verify location of assigning the agreement field should be editable lookup field
Then verify asset received location field should be non mandatory editable lookup field
Then verify remarks field should be mandatory editable text field
And click on save button in asset details record
Then verify system should show the validation message successfully saved record of asset details
Then logout from the ULS Application
And invoke softassert validation for asset details screen
@AT_IAD_002
Scenario: To test the asset details screen with negative inputs
Given navigate the IJARA URL
And login with valid credentials
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_IAD_002
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box for asset details screen
And select the record form mail box for asset details screen
And click on asset details segment button
And click on add button in asset details tab
And click on save button without enter any mandatory details
Then verify system should show the validation for mandatory field in aset details screen 
And enter the special character in plate number arabic field
Then verify plate number arabic field should show the validation for special character input
And enter the negative input in agent mobile number field
Then verify agent mobile number field should show the validation for negative input
And enter the character input in number of cylender input box
Then verify number of cylender input field wont accept the number of cylender input 
Then logout from the ULS Application