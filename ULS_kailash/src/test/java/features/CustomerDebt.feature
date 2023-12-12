Feature: Test the Customer Debt Module in IJARA URL
@AT_DC_CD_001
Scenario: To verify the Customer Debt record is available in the system 
#002 003 included
Given navigate the IJARA URL
And user_626 login with valid credentials
And User_626 get the test data for test case AT_DC_CD_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And user_626 click the Mail box in ULS application
And user_626 click the Search button under inbox
And user_626 click the Entitle button under inbox
And user_626 click the Customer Financials tab
And user_626 click On the Action button below Customer Financials
And user_626 click On the Action button below Financial Commitments
And user_626 verify the account number field below the Customer debt details
And user_626 verify the  Closed Date field below the Customer debt details
And user_626 verify the Status field below the Customer debt details
And user_626 verify the Frequency field below the Customer debt details
And user_626 verify the Installment Amount field below the Customer debt details
And user_626 verify the Last Payment Date field below the Customer debt details
And user_626 verify the Next Due Date field below the Customer debt details
And user_626 verify the Last Cycle field below the Customer debt details
And user_626 verify the Include in Eligibility field below the Customer debt details
# All Data Must be in Display Only
Then user_626 verify Closed Date field below the Customer debt should be display only 
Then user_626 verify Status field below the Customer debt should be display only 
Then user_626 verify Frequency field below the Customer debt should be display only 
Then user_626 verify Last Payment Date field below the Customer debt should be display only 
Then user_626 verify Next Due Date field below the Customer debt should be display only 
Then user_626 verify Last Cycle field below the Customer debt should be display only 
Then user_626 verify Include in Eligibility below the Customer debt should be display only
Then user_626 verify Installment Amount field below the Customer debt should be Same As AppDataCheck Stage
And user_626 click the Back button in Customer Debt screen navigate to the previous screen
Then User_626 logout from the ijaraApplication


