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

#Block - functionality of the Initiate Video KYC button
#@AT_PL_NEWAPP_CD_12
Scenario: To verify the functionality of add,back button,Initiate Video KYC button in newapp-customer details screen

Given Navigate the IJARA URL
And User_6047 Login with valid credentials_PersonalLoan_NewApp_Customer Details
And User_6047 Get the test data for test case ID AT_PL_NEWAPP_CD_12 
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

@AT_PL_NEWAPP_CD_13
Scenario: To verify the customer details field with invalid data

Given Navigate the IJARA URL
And User_6047 Login with valid credentials_PersonalLoan_NewApp_Customer Details
And User_6047 Get the test data for test case ID AT_PL_NEWAPP_CD_13
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Reference Id Under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Customer Details tab
And User_6047 Click edit icon
Then User_6047 Delete the First name 
And User_6047 click the Save Button
Then User_6047 verify the popup of fill all field
Then User_6047 Enter the negative numeric value in customer details field
Then User_6047 Verify the error msg of negative numeric value
Then User_6047 Enter the charater value in numeric field
Then User_6047 Verify the error msg of charater numeric value
Then User_6047 Enter the special charater value in any field
Then User_6047 Verify the error msg of special charater value


  



