Feature: L1 Apporval
@AT_UNW_003
Scenario: 
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_UNW_003
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for underwriter
And User click the Entitle button under inbox
And Click On the edit button Below Faclity Info
And Click On the Recommendation in Offer Decision
And Click On the Add button in List of Condition
And select the value in Note Code Dropdown Below the Conditions
Then Enter Number in Sequence Number Field Below the Conditions
Then select not recommended in Note Sub Code Dropdown Below the Conditions
Then Enter Data in Condition Field Below the Conditions
Then Select the value in Date field Below the Conditions
Then select the value in fulfilled Dropdown Below the Conditions
#Then Turn on the Approval Status Below the Conditions
Then Fill The Remarks Field Below the Conditions
Then Click on the Save button To Save The Conditions Record



