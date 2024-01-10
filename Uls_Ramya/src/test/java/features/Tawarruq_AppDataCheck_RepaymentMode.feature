Feature: To verify the functionality of Tawarruq-AppDataCheck-Repayment mode
@AT_TW_RM_001

Scenario: To verify the Repayment Mode screen should be open with all valid fields
#todo -app data entry-repayment data-same
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataCheck-RepaymentMode
And User_6047 Get the test data for test case ID AT_TW_RM_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reference Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click Repaymentmode section
And User_6047 click EyeButton
Then User_6047 verify the repayment mode field in Repaymentmode
Then User_6047 verify the account holder name field Repaymentmode
And User_6047 verify the account type field Repaymentmode
Then User_6047 verify the account number field Repaymentmode
And User_6047 verify the bank name field Repaymentmode
Then User_6047 verify the bank branch name field Repaymentmode
And User_6047 verify the ESC code field Repaymentmode
Then User_6047 verify help button Repaymentmode
Then logout from the ijaraApplication

@AT_TW_RM_002

Scenario: To verify the Repayment Mode screen should be open with all valid fields
#todo -status
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataCheck-RepaymentMode
And User_6047 Get the test data for test case ID AT_TW_RM_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reference Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click Repaymentmode section
And User_6047 click EyeButton
Then User_6047 verify the repayment mode field in Repaymentmode
Then User_6047 verify the account holder name field Repaymentmode
And User_6047 verify the account type field Repaymentmode
Then User_6047 verify the account number field Repaymentmode
And User_6047 verify the bank name field Repaymentmode
Then User_6047 verify the bank branch name field Repaymentmode
And User_6047 verify the ESC code field Repaymentmode
#And User_6047 verify the Status field Repaymentmode
Then User_6047 verify help button Repaymentmode
And User_6047 click help icon in Repaymentmode
Then User_6047 verify description of all the fields details in Repaymentmode
Then logout from the ijaraApplication