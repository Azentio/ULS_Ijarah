Feature: To verify the functionality of Customer Details
@AT_TW_CD_03

Scenario: To verify the buttons available on screen while modify the Customer Information

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_CD_03 
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click Customer Details module
And User_6047 click edit icon
Then User_6047 verify the Date of Birth field
Then User_6047 verify the Education Level field
Then User_6047 verify the Customer Age field
Then User_6047 verify the No of Dependent field
Then User_6047 verify the Gender field
Then User_6047 verify the Customer Type field
Then User_6047 verify the Applicant Type field
Then User_6047 verify the Last Name or Family Name field
Then User_6047 verify the First Name field
Then User_6047 verify the Middle Name field
Then User_6047 verify the Black Listed field
Then User_6047 verify the Salutation or Title field
Then User_6047 verify the Language field
Then User_6047 verify the Category of Client field
Then User_6047 verify the Marital Status field
Then User_6047 verify the Resident Status field
Then User_6047 verify the Nationality field
Then User_6047 verify the Save button
Then User_6047 verify the back button
Then User_6047 verify the Activate/Deactivate 
Then User_6047 modify the nationality input
Then User_6047 click the Save button
Then User_6047 verify the successfully saved message 
And User_6047 click edit icon
And User_6047 Click the back Button in customer deyails

@AT_TW_CD_04
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button and invalid data

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_CD_03 
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click Customer Details module
And User_6047 click edit icon
Then User_6047 clear the last name 
Then User_6047 click the Save button
Then User_6047 verify customer details screen should show the validation for empty mandatory field
Then User_6047 enter the invalid data in last name 
Then User_6047 verify the invalid msg in last name
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field

@AT_TW_CD_05
Scenario: To verify the functionality of Activate/Deactivate button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_CD_05 
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click Customer Details module
And User_6047 click search button
And User_6047 search the record 
And User_6047 click edit icon
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
And User_6047 click search button
And User_6047 search the record 
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 click edit icon
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle

@AT_TW_CD_06
Scenario: To verify the Customer Information list view 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_CD_06 
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click Customer Details module
Then User_6047 to verify the fields on list view of Customer Personal Information 
And User_6047 click the add button
Then User_6047 verify clicking on Add button allow user to create new record of Customer Information details
And User_6047 click the back button in customer information
And User_6047 click the Search button under customer details tab and search the matching data in listview
And User_6047 check the match result data in customer details list view
And User_6047 clear the search box in customer details
And User_6047 click the Search button under customer details tab and search the mismatching data in listview
And User_6047 check the mismatch result in customer details list view
And User_6047 to verify the Values in list view should be in read only mode in customer details 
And User_6047 click the back button in customer details 
And User_6047 verify the back button functionality 



