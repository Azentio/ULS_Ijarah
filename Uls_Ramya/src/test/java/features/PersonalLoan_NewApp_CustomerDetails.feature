Feature: To verify Personal Loan-NewApp-Customer Details
@AT_PL_NEWAPP_CD_11
Scenario: To verify the fields in newapp-customer details screen

Given Navigate the IJARA URL
And User_6047 Login with valid credentials_PersonalLoan_NewApp_Customer Details
And User_6047 Get the test data for test case ID AT_PL_NEWAPP_CD_11 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Reference Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 Click edit icon
Then User_6047 To verify the field Remarks should be mandatory,editable,text
Then User_6047 To verify the field phone number should be number,editable
Then User_6047 To verify the field Mobile number(Primary) should be number,editable
Then User_6047 To verify the field Mobile number(Secondary) should be number,editable
Then User_6047 To verify the field Email should be email format,editable
Then User_6047 To verify the field Prefered Time for contact should be HH:MM format,editable
Then logout from the ULS Application

@AT_PL_NEWAPP_CD_12
Scenario: To verify the fields in newapp-customer details screen

Given Navigate the IJARA URL
And User_6047 Login with valid credentials_PersonalLoan_NewApp_Customer Details
And User_6047 Get the test data for test case ID AT_PL_NEWAPP_CD_11 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Reference Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 Click edit icon
#And User_6047 Click the Initiate Video KYC button
#And User_6047 verify the functionality of the Initiate Video KYC button
And User_6047 Click the back button 
And User_6047 verify the functionality of back button in customer detail
And User_6047 Click Add icon
And User_6047 to verify System should allow to add new record of Customer Information

