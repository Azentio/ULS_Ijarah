Feature: To verify the functionality of repayment mode in Tawarooq
@AT_TW_AD_IRM_01

Scenario: To verify post clicking on Add asset button, the Repayment Mode screen should be open with all valid fields
Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_01 
#And User_6047 Click the module name dropdown in ULS application
#And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click Add icon
Then User_6047 verify the repayment mode field in Repayment mode
Then User_6047 verify the account holder name field Repayment mode
And User_6047 verify the account type field Repayment mode
Then User_6047 verify the account number field Repayment mode
And User_6047 verify the bank name field Repayment mode
Then User_6047 verify the bank branch name field Repayment mode
And User_6047 verify the ESC code field Repayment mode
Then User_6047 verify save button Repayment mode
Then User_6047 verify help button Repayment mode

@AT_TW_AD_IRM_02

Scenario: To verify the fields are mandatory, editable,lookup and numeric in repayment mode 

Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_01 
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click Add icon
Then User_6047 verify the Repayment mode field is mandatory,editable and lookup value
And User_6047 validate the Account holder name field is mandatory,editable and lookup value
And User_6047 verify the Account type field is mandatory,editable and lookup value
And User_6047 verify the Account number field is mandatory,editable and numeric
And User_6047 click the Account currency field is mandatory,editable and lookup value 
And User_6047 verify the Bank name field is mandatory,editable and lookup value 
And User_6047 verify the Branch name field is mandatory,editable and lookup value 
And User_6047 verify the Code field is mandatory,editable and numeric

@AT_TW_AD_IRM_03

Scenario: To verify the functionality of save,delete and help button

Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click Add icon
Then User_6047 verify the Repayment mode field is mandatory,editable and lookup value
And User_6047 validate the Account holder name field is mandatory,editable and lookup value
And User_6047 verify the Account type field is mandatory,editable and lookup value
And User_6047 verify the Account number field is mandatory,editable and numeric
And User_6047 click the Account currency field is mandatory,editable and lookup value 
And User_6047 verify the Bank name field is mandatory,editable and lookup value 
And User_6047 verify the Branch name field is mandatory,editable and lookup value 
And User_6047 verify the Code field is mandatory,editable and numeric
#And User_6047 click the Save button under repayment mode screen
Then User_6047 verify the successfully saved message popup in Repayment Mode
And User_6047 click edit icon in Repayment Mode
Then User_6047 To verify the same record should get saved in Repayment Mode
And User_6047 click help icon in Repayment Mode
Then User_6047 verify description of all the fields details in Repayment Mode

@AT_TW_AD_IRM_04

Scenario: To verify the impact when user keep any mandatory field blank ,negative numeric,characters,special characters and click on save button

Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_04
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click Add icon
Then User_6047 Give the input for repayment mode field in Repayment Mode
Then User_6047 Give the input for account holder name field in Repayment Mode
Then User_6047 Give the input for account type field in Repayment Mode 
Then User_6047 Give the input for account currency field in Repayment Mode
Then User_6047 Give the input for bank name field in Repayment Mode
Then User_6047 Give the input for branch name field in Repayment Mode
Then User_6047 Give the input for code field in Repayment Mode
And User_6047 click the Save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
Then User_6047 Give the negative number input for account number field in Repayment Mode
#And User_6047 click the Save button under repayment mode screen
#Then User_6047 Verify the popup of fill all field in Repayment Mode
Then User_6047 Give the character input for account number field in Repayment Mode
#And User_6047 click the Save button under repayment mode screen
#Then User_6047 Verify the popup of fill all field in Repayment Mode
Then User_6047 Enter the special character for account number field in Repayment Mode
And User_6047 click the Save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode

@AT_TW_AD_IRM_05

Scenario: To verify Modification of Repayment Mode record

Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_04
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click the Search button 
Then User_6047 search the Repayment list under Repayment mode
And User_6047 click edit icon in Repayment Mode
Then User_6047 verify the repayment mode field in Repayment mode
Then User_6047 verify the account holder name field Repayment mode
And User_6047 verify the account type field Repayment mode
Then User_6047 verify the account number field Repayment mode
And User_6047 verify the bank name field Repayment mode
Then User_6047 verify the bank branch name field Repayment mode
And User_6047 verify the ESC code field Repayment mode
Then User_6047 verify save button Repayment mode
Then User_6047 modify the ESC code field
And User_6047 click the save button under repayment mode screen
Then User_6047 verify the successfully saved message popup
And User_6047 Click the Search button 
Then User_6047 search the Repayment list under Repayment mode
And User_6047 click edit icon
Then User_6047 to verify the same record should get saved in Repayment mode


@AT_TW_AD_IRM_06

Scenario: To verify Modification of Repayment Mode record

Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_06
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
And User_6047 Click the Search button 
Then User_6047 search the Repayment list under Repayment mode
And User_6047 click edit icon in Repayment Mode
Then User_6047 Delete the account number Repayment mode screen
And User_6047 click the Save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
Then User_6047 Enter the special character for account number field in Repayment Mode
And User_6047 click the Save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
And User_6047 give the input for account number field in Repayment mode screen
And User_6047 click the Save button under repayment mode screen
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox
Then User_6047 Click the submit button
And User_6047 Click the ok button in action conform field
#And User_6047 Click the submit in action conform field
#And User_6047 verify the submit successfully popup and get reference number

@AT_TW_AD_IRM_07

 Scenario: To verify the list view
 Given Navigate the IJARA URL
Then User_6047 Login with valid credentials
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Get the test data for test case ID AT_TW_AD_IRM_06
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click repayment mode section
Then User_6047 to verify system should show the list view



#
#0305 -- user ID
#3208 -- Ref id

#0323-->user
#3208--ref id
#0181-------

#2068
#629
#0181-------
#3722