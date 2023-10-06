Feature: To check the Ijara_Repayment mode feature

@AT_IRM_007
Scenario: To verify that user can able to update repayment mode record
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_IRM_007
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Ijara repayment mode
And User click the Entitle button under inbox
And Navigate to Repayment mode section
And Validate Repayment mode field is present in repayment mode view list
And Validate Account holder name field is present in repayment mode view list
And Validate Account type field is present in repayment mode view list
And Validate Account currency field is present in repayment mode view list
And Validate Bank name field is present in repayment mode view list
And Validate Status field is present in repayment mode view list