Feature: To check the Tawarraq_Customer Reference feature
@AT_TW_CR_01
Scenario: To verify that user can able to create Customer reference record
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And User get the test data for test case AT_TW_CR_01
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_074 select the tawruqq record in new app stage
And user_076 click on additional customer info tab in new application stage
And Click on Pencil icon in customer personal information
And Click on Add button in Reference List view section
And Select the value in Relationship type field in Customer reference page
And Select the value in Salutation field in Customer reference page
And Enter the value in First name field in Customer reference page
And Enter the value in Middle name field in Customer reference page
And Enter the value in Last name field in Customer reference page
And Enter the value in Customer Full Name field in Customer reference page
And Select the value in Identification type field in Customer reference page
And Enter the value in Identification number field in Customer reference page
And Enter the value in Residence Address field in Customer reference page
And Enter the value in Office Address field in Customer reference page
And Enter the value in Contact Number field in Customer reference page
And Enter the value in Office phone number field in Customer reference page
And Enter the value in Primary mobile number field in Customer reference page
And Enter the value in Alternative mobile number field in Customer reference page
And Enter the value in Email id field in Customer reference page
And Enter the value in No of Years known field in Customer reference page
And Enter the value in CIF Number field in Customer reference page
And Click on Save button in Customer reference page

@AT_TW_CR_02
Scenario: To verify that user can able to create Customer reference record with negative validation
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And User get the test data for test case AT_TW_CR_02
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_076 select the tawruqq record in new app stage
And user_076 click on additional customer info tab in new application stage
And Click on Pencil icon in customer personal information
And Click on Add button in Reference List view section
And Click on Save button in Customer reference page
And Validate Please fill all the details popup is displayed
And Enter special characters in text field in Customer reference page
And Validate Alphanumeric characters allowed popup is displayed customer reference page

@AT_TW_CR_03
Scenario: To verify that user can able to update Customer reference record
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And User get the test data for test case AT_TW_CR_03
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_076 select the tawruqq record in new app stage
And user_076 click on additional customer info tab in new application stage
And Click on Pencil icon in customer personal information
And Click on Pencil icon in Reference list view
And Update the value in Relationship type field in Customer reference page
And Update the value in Salutation field in Customer reference page
And Update the value in First name field in Customer reference page
And Update the value in Middle name field in Customer reference page
And Update the value in Last name field in Customer reference page
And Update the value in Customer Full Name field in Customer reference page
And Update the value in Identification number field in Customer reference page
And Update the value in Residence Address field in Customer reference page
And Update the value in Office Address field in Customer reference page
And Update the value in Contact Number field in Customer reference page
And Update the value in Office phone number field in Customer reference page
And Update the value in Primary mobile number field in Customer reference page
And Update the value in Alternative mobile number field in Customer reference page
And Update the value in Email id field in Customer reference page
And Update the value in No of Years known field in Customer reference page
And Update the value in CIF Number field in Customer reference page
And Click on Save button in Customer reference page

@AT_TW_CR_04
Scenario: To verify that user can able to update Customer reference record with negative validation
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And User get the test data for test case AT_TW_CR_04
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_076 select the tawruqq record in new app stage
And user_076 click on additional customer info tab in new application stage
And Click on Pencil icon in customer personal information
And Click on Pencil icon in Reference list view
And Remove the value in required fields in Customer reference page
And Click on Save icon and validate field is required popup in customer reference page
And Update special characters in text field in Customer reference page
And Validate Alphanumeric characters allowed popup is displayed customer reference page
And Validate the Help button is present in Customer reference page

@AT_TW_CR_05
Scenario: To verify that user can able to update Customer reference record status 
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And User get the test data for test case AT_TW_CR_05
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_076 select the tawruqq record in new app stage
And user_076 click on additional customer info tab in new application stage
And Click on Pencil icon in customer personal information
And Click on Pencil icon in Reference list view
And Update status to Inactive in Customer reference page
And Click on Save button in Customer reference page
And Click on Pencil icon in Reference list view
And Update status to Active in Customer reference page
And Click on Save button in Customer reference page
And Click on Pencil icon in Reference list view
And Click on back icon in Customer reference page
And Click on Pencil icon in Reference list view
And Click on View summary button in identification section
And Validate that user can navigate to View summary page

@AT_TW_CR_06
Scenario: To verify the fields are present in Customer reference view list
Given navigate the Tawarruq URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And User get the test data for test case AT_TW_CR_06
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And User search the Ref id under inbox for Tawarraq_Customer Reference
And user_076 select the tawruqq record in new app stage
And Navigate to Additional customer info tab
And Click on Pencil icon in customer personal information
And Validate Salutation field is present in Reference list view page
And Validate Name field is present in Reference list view page
And Validate Mobile number field is present in Reference list view page
And Validate Years known field is present in Reference list view page
And Validate Status field is present in Reference list view page
And find the position of customer reference list view at new app stage for tawruqq
And Search the Tawarraq_Customer reference record with valid data
And Search the Tawarraq_Customer reference record with invalid data



