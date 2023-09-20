Feature: Test the Customer Debt Module in IJARA URL
@AT_DC_CD_001
Scenario: To verify the Customer Debt record is available in the system 
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_DC_CD_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click On the Action button below Customer Financials
And User click On the Action button below Financial Commitments
And user verify the account number field below the Customber debt details
And user verify the  Closed Date field below the Customber debt details
And user verify the Status field below the Customber debt details
And user verify the Frequency field below the Customber debt details
And user verify the Installment Amount field below the Customber debt details
And user verify the Last Payment Date field below the Customber debt details
And user verify the Next Due Date field below the Customber debt details
And user verify the Last Cycle field below the Customber debt details
And user verify the Include in Eligibility field below the Customber debt details
And User click the Back button in Customer Debt screen navigate to the previous screen
Then logout from the ijaraApplication
