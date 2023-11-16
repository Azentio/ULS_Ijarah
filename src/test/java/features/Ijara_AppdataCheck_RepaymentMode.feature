Feature: To check the App data check_Repayment mode feature

@AT_RDC_001
Scenario: To verify that all fields are present in App data check_Repayment mode module
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_RDC_001
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for App data check_Repayment mode
And User click the Entitle button under inbox
And User navigate to Repayment mode module
And Click on view icon of existing record in repayment mode
And Validate that Repayment mode field is displayed in repayment mode page
And Validate that Account Holder Name field is displayed in repayment mode page
And Validate that Account Type field is displayed in repayment mode page
And Validate that Account Number field is displayed in repayment mode page
And Validate that Account Currency field is displayed in repayment mode page
And Validate that Bank Name field is displayed in repayment mode page
And Validate that Bank Branch field is displayed in repayment mode page
And Validate that ECS Code field is displayed in repayment mode page

@AT_RDC_002
Scenario: To verify that existing records are present in App data check_Repayment mode module
#This test case also cover the functionality of AT_RDC_003
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_RDC_002
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for App data check_Repayment mode
And User click the Entitle button under inbox
And User navigate to Repayment mode module
And Validate that existing records are present in repayment mode page

@AT_RDC_004
Scenario: To verify that all fields are present in App data check_Repayment mode module view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_RDC_004
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for App data check_Repayment mode
And User click the Entitle button under inbox
And User navigate to Repayment mode module
And Validate that Repayment mode field is displayed in repayment mode module view list
And Validate that Account holder name field is displayed in repayment mode module view list
And Validate that Account type field is displayed in repayment mode module view list
And Validate that Account Currency field is displayed in repayment mode module view list
And Validate that Bank Name field is displayed in repayment mode module view list
And Validate that Currency field is displayed in repayment mode module view list
