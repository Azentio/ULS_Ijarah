Feature: To verify the functionality of repayment mode
@AT_IRM_001
Scenario: To verify post clicking on Add asset button, the Repayment Mode screen should be open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
#And user_615 select the module name
#And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 update test data set id for AT_IRM_001 
And user_615 click search icon
And user_615 enter the existing app data entry record
And user_615 click entitle button
And user_615 click repayment mode section
And user_615 click edit icon
Then user_615 verify the repayment mode field
Then user_615 verify the account holder name field
And user_615 verify the account type field 
Then user_615 verify the account number field 
And user_615 verify the bank name field 
Then user_615 verify the bank branch name field 
And user_615 verify the ECS code field 
Then user_615 verify save button
Then user_615 verify help button

#IRM_01_02,#IRM_01_03,#IRM_01_04,#IRM_01_05,#IRM_01_06,IRM_01_07,IRM_01_08,IRM_01_09,IRM_01_10
@AT_IRM_002
Scenario: To verify all the fields are mandatory and editable in repayment mode 
Given navigate the IJARA URL
And login with valid credentials
And user_615 click inbox button 
And user_615 update test data set id for AT_IRM_002 
And user_615 click search icon
And user_615 click entitle button
And user_615 click repayment mode section
And user_615 click edit icon
Then user_615 verify the repayment mode field is mandatory and editable
And user_615 verify the account holder name field is mandatory
Then user_615 validate the account holder name field is editable
And user_615 verify the account type field is mandatory
Then user_615 validate the account type field is editable
And user_615 verify the account number field is mandatory 
Then user_615 verify the account number field is editable
And user_615 click the account currency field
And user_615 select the value from dropdown in account currency field
And user_615 verify the bank name field is mandatory 
Then user_615 verify the bank name field is editable
And user_615 verify the branch name field is mandatory 
Then user_615 validate the branch name field is editable 
And user_615 verify the code field is mandatory 
Then user_615 verify the code field is editable
And user_615 click the save button under repayment mode screen
Then user_615 validate the success message popup with close button

#IRM_02_01,IRM_02_02,IRM_02_03,IRM_02_04
@AT_IRM_004
Scenario: Creation of Repayment Mode record with invalid data
Given navigate the IJARA URL
And login with valid credentials
And user_615 click inbox button 
And user_615 update test data set id for AT_IRM_002 
And user_615 click search icon
And user_615 click entitle button
And user_615 click repayment mode section
And user_615 click edit icon
And user_615 click account number field
And user_615 click save button
Then user_615 verify the error popup required field is mandatory
And user_615 click account number field
And user_615 enter the negative numeric value in account number field
Then user_615 verify the error popup special character not allowed
And user_615 click account number field 
And user_615 enter the character value in account number numeric field
Then user_615 verify the error popup
And user_615 click code field
And user_615 enter the special characters in code field
And user_615 click save button
Then user_615 verify the validation message for invalid data entry


