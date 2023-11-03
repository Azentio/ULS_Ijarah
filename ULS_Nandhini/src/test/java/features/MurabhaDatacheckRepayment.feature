Feature: To verify the functionality of repayment mode
@AT_MU_RM_001
Scenario: To verify the Repayment Mode screen should be open with all valid fields

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_RM_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref Id under inbox
And User click the Entitle button under inbox
And User_7180 click repayment mode section
And User_7180 click view button
Then user_7180 verify help button
Then user_7180 verify the repayment mode field
Then user_7180 verify the account holder name field
And user_7180 verify the account type field 
Then user_7180 verify the account number field 
And user_7180 verify the bank name field 
Then user_7180 verify the bank branch name field 
And user_7180 verify the ECS code field 

@AT_MU_RM_002
Scenario: To verify already added details at App data entry stage is visible at data check stage

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_RM_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref Id under inbox
And User click the Entitle button under inbox
And User_7180 click repayment mode section
And User_7180 click view button
Then user_7180 verify the repayment mode field data and check the value is displayed only or not  
Then user_7180 verify the account holder name field data and check the value is displayed only or not  
Then user_7180 verify the account type field data and check the value is displayed only or not  
Then user_7180 verify the account number field data and check the value is displayed only or not  
Then user_7180 verify the bank name field data and check the value is displayed only or not  
Then user_7180 verify the bank branch name field data and check the value is displayed only or not  
Then user_7180 verify the ECS code field data and check the value is displayed only or not  
Then user_7180 verify the account currency field data and check the value is displayed only or not 

 
@AT_MU_RM_003
Scenario: To verify already added details at App data entry stage is visible at data check stage

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_RM_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref Id under inbox
And User click the Entitle button under inbox
And User_7180 click repayment mode section
And User_7180 click view button
Then user_7180 verify the repayment mode field data and check the value is displayed only or not  
Then user_7180 verify the account holder name field data and check the value is displayed only or not  
Then user_7180 verify the account type field data and check the value is displayed only or not  
Then user_7180 verify the account number field data and check the value is displayed only or not  
Then user_7180 verify the bank name field data and check the value is displayed only or not  
Then user_7180 verify the bank branch name field data and check the value is displayed only or not  
Then user_7180 verify the ECS code field data and check the value is displayed only or not  
Then user_7180 verify the account currency field data and check the value is displayed only or not  
Then user_7180 verify the status bar whether it is disable or not
Then user_7180 verify the back button
