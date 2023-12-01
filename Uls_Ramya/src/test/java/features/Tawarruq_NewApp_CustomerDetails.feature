Feature: To verify the Customer Details screen in Tawarooq
@AT_TW_NewApp_CD_01

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 Click Add icon
Then User_6047 verify the Back button
Then User_6047 verify the Save button
Then User_6047 verify the Customer Type Field
Then User_6047 verify the Applicant Type Field
Then User_6047 verify the Title Field
Then User_6047 verify the First Name Field
Then User_6047 verify the Middle Name  Field
Then User_6047 verify the Third Name Field
Then User_6047 verify the Family Name Field
Then User_6047 verify the First Name (Arabic) Field
Then User_6047 verify the Middle Name (Arabic) Field
Then User_6047 verify the Third Name (Arabic) Field
Then User_6047 verify the Family Name (Arabic) Field
#Then User_6047 verify the Customer full name (Arabic) Field
Then User_6047 verify the Date Of Birth Field
Then User_6047 verify the Age Field
Then User_6047 verify the Gender Field
Then User_6047 verify the Marital Status Field
Then User_6047 verify the Education Level Field
Then User_6047 verify the Nationality Field
Then User_6047 verify the Residential Status Field
Then User_6047 verify the Language Field
Then User_6047 verify the No Of Dependents Field
Then User_6047 verify the Industry Segmentation Field
Then User_6047 verify the Blacklisted Field
Then User_6047 verify the Remarks Field

Then User_6047 verify the Customer Type Field should be mandatory,editable,dropdown
Then User_6047 verify the Applicant Type Field should be mandatory,editable,dropdown
Then User_6047 verify the Title Field should be mandatory,editable,dropdown
Then User_6047 verify the First Name Field should be mandatory,editable,textbox
Then User_6047 verify the Middle Name  Field should be nonmandatory,editable,textbox
Then User_6047 verify the Third Name Field should be mandatory,editable,textbox
Then User_6047 verify the Family Name Field should be mandatory,editable,textbox
Then User_6047 verify the First Name (Arabic) Field should be mandatory,editable,textbox
Then User_6047 verify the Middle Name (Arabic) Field should be mandatory,editable,textbox
Then User_6047 verify the Third Name (Arabic) Field should be mandatory,editable,textbox
Then User_6047 verify the Family Name Field should be mandatory,editable,textbox
Then User_6047 verify the Family Name (Arabic) Field should be mandatory,editable,textbox
Then User_6047 verify the Date Of Birth Field should be mandatory,editable,calendar
Then User_6047 verify the Age Field should be mandatory,editable,number
Then User_6047 verify the Gender Field should be mandatory,editable,dropdown
Then User_6047 verify the Marital Status Field should be mandatory,editable,dropdown
Then User_6047 verify the Education Level Field should be mandatory,editable,dropdown
Then User_6047 verify the Nationality Field should be mandatory,editable,dropdown
Then User_6047 verify the Residential Status Field should be mandatory,editable,dropdown
Then User_6047 verify the Language Field should be mandatory,editable,dropdown
Then User_6047 verify the No Of Dependents Field should be mandatory,editable,textbox
Then User_6047 verify the Industry Segmentation Field should be mandatory,editable,dropdown
Then User_6047 verify the Blacklisted Field should be Non-mandatory,editable,toggle 
Then User_6047 verify the Remarks Field should be mandatory,editable,text
Then logout from the ULS Application

@AT_TW_NewApp_CD_02

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 Click Add icon
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field
Then User_6047 give the input for verify the Title Field
Then User_6047 give the input for First Name Field
Then User_6047 give the input for First Name (Arabic) Field
Then User_6047 give the input for Third Name (Arabic) Field
Then User_6047 give the input for Date Of Birth Field
Then User_6047 give the input for Gender Field
Then User_6047 give the input for Marital Status Field
Then User_6047 give the input for Education Level Field
Then User_6047 give the input for Nationality Field
Then User_6047 give the input for Residential Status Field
Then User_6047 give the input for Language Field
Then User_6047 give the input for No Of Dependents Field
Then User_6047 give the input for Industry Segmentation Field
#Then User_6047 verify the successfully saved message 
Then User_6047 give the characters value input for No Of Dependents Field
Then User_6047 verify the impact when user enter characters value in numeric field(No Of Dependents Field)
Then User_6047 give the input for No Of Dependents Field
Then User_6047 give the negative numeric input for third Name Field
Then User_6047 verify the impact when user enter the negative numeric input
Then User_6047 give the only special characters input for third Name Field
Then User_6047 verify the impact when user enters only special characters value in any field (first name)
Then User_6047 give the input for Third Name Field
#Then User_6047 click the Save button
#And User_6047 to click the back button
#And User_6047 verify the functionality of back button 
Then logout from the ULS Application

@AT_TW_NewApp_CD_03

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 click the Search button under customer details tab listview
And User_6047 click edit icon
Then User_6047 verify the Back button
Then User_6047 verify the Save button
Then User_6047 verify the Customer Type Field
Then User_6047 verify the Applicant Type Field
Then User_6047 verify the Title Field
Then User_6047 verify the First Name Field
Then User_6047 verify the Middle Name  Field
Then User_6047 verify the Third Name Field
Then User_6047 verify the Family Name Field
Then User_6047 verify the First Name (Arabic) Field
Then User_6047 verify the Middle Name (Arabic) Field
Then User_6047 verify the Third Name (Arabic) Field
Then User_6047 verify the Family Name (Arabic) Field
Then User_6047 verify the Date Of Birth Field
Then User_6047 verify the Age Field
Then User_6047 verify the Gender Field
Then User_6047 verify the Marital Status Field
Then User_6047 verify the Education Level Field
Then User_6047 verify the Nationality Field
Then User_6047 verify the Residential Status Field
Then User_6047 verify the Language Field
Then User_6047 verify the No Of Dependents Field
Then User_6047 verify the Industry Segmentation Field
Then User_6047 verify the Blacklisted Field
Then User_6047 verify the Remarks Field
Then User_6047 update the customer detail record with valid data
Then User_6047 click the Save button
Then User_6047 verify the successfully saved message
Then logout from the ULS Application


@AT_TW_NewApp_CD_04

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 click the Search button under customer details tab listview
And User_6047 click edit icon
Then User_6047 delete the data in customer detail record 
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field
Then User_6047 update the customer detail record with invalid data
Then User_6047 To verify modification of the invalid data is not allowed
And User_6047 to click the back button
And User_6047 verify the functionality of back button 
Then logout from the ULS Application



@AT_TW_NewApp_CD_05

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_06 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 click the Search button under customer details tab listview
And User_6047 click edit icon
And User_6047 change the address details Status to active to inactive or inactive to active
Then User_6047 click the Save button
And User_6047 click the Search button under customer details tab listview
Then User_6047 verify system should show the record Status as active or inactive based on toggle
And User_6047 click edit icon
And User_6047 change the address details Status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle

@AT_TW_NewApp_CD_06

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_06 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 To verify Customer Information list view fields
And User_6047 click the Search button under customer details tab listview
And User_6047 to verify the Values in list view should be in read only mode in customer details 
And User_6047 clear the search box in customer details
And User_6047 click the Search button under Customer details tab and search the matching data in listview
And User_6047 check the match result data in customer details list view
And User_6047 clear the search box in customer details
And User_6047 click the Search button under Customer details tab and search the mismatching data in listview
And User_6047 check the mismatch result in customer details list view
And User_6047 click the add button
Then User_6047 verify clicking on Add button allow user to create new record of Customer Information details
Then logout from the ULS Application

@AT_TW_NewApp_CD_07

Scenario: To verify the availability of Customer Information tab  under New App Stage

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_NewApp_CD_06 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search  the  Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 click the back button in customer details 
And User_6047 verify the back button functionality 


#4105


#3846===
#3829

#0215