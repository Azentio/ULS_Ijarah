Feature: To verify the functionality of repayment mode
@AT_MU_IRM_001

Scenario: To verify post clicking on Add asset button, the Repayment Mode screen should be open with all valid fields

Given Navigate the IJARA URL
#And User_6047 Login with valid credentials
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click Add icon
Then User_6047 verify the repayment mode field
Then User_6047 verify the account holder name field
And User_6047 verify the account type field 
Then User_6047 verify the account number field 
And User_6047 verify the bank name field 
Then User_6047 verify the bank branch name field 
And User_6047 verify the ESC code field 
Then User_6047 verify save button
Then User_6047 verify help button
Then logout from the ijaraApplication 
@AT_MU_IRM_002

Scenario: To verify the fields are mandatory, editable,lookup and numeric in repayment mode 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click Add icon
Then User_6047 verify the repayment mode field is mandatory,editable and lookup value
And User_6047 validate the account holder name field is mandatory,editable and lookup value
And User_6047 verify the account type field is mandatory,editable and lookup value
And User_6047 verify the account number field is mandatory,editable and numeric
And User_6047 click the account currency field is mandatory,editable and lookup value 
And User_6047 verify the bank name field is mandatory,editable and lookup value 
And User_6047 verify the branch name field is mandatory,editable and lookup value 
And User_6047 verify the code field is mandatory,editable and numeric
And User_6047 click the save button under repayment mode screen
#Then User_6047 verify the successfully saved message popup

#for check
Then User_6047 verify the successfully saved message under the repaymentmode
Then User_6047 Extract the application details record reference number in repaymentmode
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list under RepaymentMode

And User_6047 click edit icon
Then User_6047 to verify the same record should get saved in Repayment mode
Then logout from the ijaraApplication 
@AT_MU_IRM_003
Scenario: To verify the functionality of Help button in repayment mode 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click edit icon
And User_6047 click help icon 
Then User_6047 verify description of all the fields details
Then logout from the ijaraApplication 
#IRM_02_01,IRM_02_03,IRM_02_04
@AT_MU_IRM_004
Scenario: Creation of Repayment Mode record with invalid data

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click Add icon
Then User_6047 give the input for repayment mode field
And User_6047 give the input for account holder name field 
And User_6047 give the input for account type field  
And User_6047 give the input for account currency field 
And User_6047 give the input for bank name field 
And User_6047 give the input for branch name field 
And User_6047 give the input for code field 
And User_6047 click the save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
And User_6047 give the character input for account number field
And User_6047 click the save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
And User_6047 enter the special character for account number field
And User_6047 click the save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
Then logout from the ijaraApplication 

#IRM_03_01,IRM_03_02,IRM_03_03
@AT_MU_IRM_005 
Scenario: To verify the buttons available on screen and allow user to modify the Repayment Mode-modify

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click edit icon
Then User_6047 verify the repayment mode field
Then User_6047 verify the account holder name field
And User_6047 verify the account type field 
Then User_6047 verify the account number field 
And User_6047 verify the bank name field 
Then User_6047 verify the bank branch name field 
And User_6047 verify the ESC code field 
Then User_6047 verify save button
Then User_6047 modify the ESC code field
And User_6047 click the save button under repayment mode screen
Then User_6047 Verify the popup of fill all field in Repayment Mode
And User_6047 click edit icon
And User_6047 to verify the modified record should get saved in Repayment mode
Then logout from the ijaraApplication 

#IRM_03_04,#IRM_03_06,
@AT_MU_IRM_006
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_001
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click repayment mode section
And User_6047 click edit icon
Then User_6047 delete the account number 
And User_6047 click the save button under repayment mode screen
And User_6047 give the input for account number field 
And User_6047 click the save button under repayment mode screen
Then logout from the ijaraApplication 

#IRM_03_07,#IRM_03_08

@AT_MU_IRM_007
Scenario: To verify the functionality of save and submit button
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode
And User_6047 Get the test data for test case ID AT_MU_IRM_007
#And User_6047 click the module name dropdown in ULS application
#And User_6047 select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox 
#Then User_6047 click the submit button
And User_6047 click the ok button in action conform field
#And User_6047 click the submit in action conform field
And User_6047 verify the submit successfully popup
Then logout from the ijaraApplication 
#v0169

 @AT_DC_MU_ID_001
 Scenario: To verify the availability of Customer Information tab is getting open with all valid button under Data check stage
 
Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify the Help button
Then User_6047 verify the Back button
Then logout from the ijaraApplication 