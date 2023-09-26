Feature: To check the Customer debt details feature

# *************************** userType01 **************************

@AT_CUD_001
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_001
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 validate the Save button available in Customer Debt screen
And User_608 validate the Back button available in Customer Debt screen
And User_608 validate the Finance type field available in Customer Debt screen
And User_608 validate the Financial Institution field is available in Customer Debt screen
And User_608 validate the Account Number field is available in Customer Debt screen
And User_608 validate the Sanction Date field is available in Customer Debt screen
And User_608 validate the Sanction Amount field is available in Customer Debt screen
And User_608 validate the Interest Rate % field is available in Customer Debt screen
And User_608 validate the Current Principal balance field is available in Customer Debt screen
And User_608 validate the Tenure field is available in Customer Debt screen
And User_608 validate the Maturity Date field is available in Customer Debt screen
And User_608 validate the Installment Amount field is available in Customer Debt screen
And User_608 validate the Amount considered field is available in Customer Debt screen
And User_608 validate the Currency field is available in Customer Debt screen
And User_608 validate the Remarks field is available in Customer Debt screen
And User_608 validate the Next Due Date field is available in Customer Debt screen
And User_608 validate the Collateral Type is available in Customer Debt screen
And User_608 validate the Close Date field is available in Customer Debt screen
And User_608 validate the Frequency field is available in Customer Debt screen
And User_608 validate the Last payment amount field is available in Customer Debt screen
And User_608 validate the Last payment date field is available in Customer Debt screen
And User_608 validate the Product Name field is available in Customer Debt screen
And User_608 validate the Last24 cycle field is available in Customer Debt screen
And User_608 validate the Balance Transfer flag field is available in Customer Debt screen
And User_608 validate the Facility Status field is available in Customer Debt screen
And User_608 validate the Remaining Tenure field is available in Customer Debt screen
And User_608 validate the Disbursement Date field is available in Customer Debt screen
And User_608 validate the Request for Balance Takeover field is available in Customer Debt screen
And User_608 validate the NPA Classification field is available in Customer Debt screen
And User_608 click the Back button in Customer Debt screen navigate to the previous screen
Then logout from the ijaraApplication


@AT_CUD_002
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_002
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 select the Finanacy type in Customer Debt screen
And User_608 enter the Sanction Amount in Customer Debt screen
And User_608 enter the Tenure in Customer Debt screen
And User_608 enter the Installment Amount in Customer Debt screen
When User_608 click the Save button in Customer Debt screen
And User_608 validate the mandatory field blank message in Customer Debt screen
And User_608 enter the Text value in numeric field and validate the error message in Customer Debt screen
When User_608 click the Save button in Customer Debt screen
And User_608 validate the message for invalid data in Customer Debt screen
Then logout from the ijaraApplication


@AT_CUD_003
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_003
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the pencil button under Financial Commitments in Customer Financials tab
And User_608 modify the Sanction amount in Customer Debt screen
And User_608 enter the invalid data and verify in Installment field under Customer Debt screen
And User_608 clear the mandatory field value in Customer Debt screen
And User_608 Update the record with mandatory field blank in Customer Debt screen
And User_608 validate the mandatory field blank message in Customer Debt screen 
And User_608 enter the Installment Amount in Customer Debt screen
When User_608 click the Update button in Customer Debt screen
Then logout from the ijaraApplication


# CUD_04_04, CUD_04_05, CUD_04_06, CUD_04_07
@AT_CUD_004
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_004
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab

And User_608 verify the Financial Institution field is displayed in list view under Financial Commitments
And User_608 verify the Loan Amount field is displayed in list view under Financial Commitments
And User_608 verify the Installment Amount field is displayed in list view under Financial Commitments
And User_608 verify the Tenure field is displayed in list view under Financial Commitments
And User_608 verify the Next Due Date field is displayed in list view under Financial Commitments
And User_608 verify the Principal Balance field is displayed in list view under Financial Commitments
And User_608 verify the Currency field is displayed in list view under Financial Commitments

And User_608 verify list view values should be not editable under FInancial Commitments

And User_608 click Search button in Financial Commitments under Customer Financials tab
And User_608 search the matched record in Financial Commitments under Customer Financials tab
And User_608 search the mismatched record in Financial Commitments under Customer Financials tab
And User_608 click the Export button in Financial Commitments under Customer Financials tab
And User_608 click the PDF and verify under Export in Financial Commitments
And User_608 click the Export button in Financial Commitments under Customer Financials tab
And User_608 click the XLS and verify under Export in Financial Commitments

Then logout from the ijaraApplication


@AT_CUD_005
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_005
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 select the Finanacy type in Customer Debt screen
And User_608 enter the Sanction Amount in Customer Debt screen
And User_608 enter the Tenure in Customer Debt screen
And User_608 enter the Installment Amount in Customer Debt screen
And User_608 enter the Remaining Tenure in Customer Debt screen
When User_608 click the Save button in Customer Debt screen
Then User_608 validate the confirm message in Customer Debt screen
Then logout from the ijaraApplication



# CUD_04_08
@AT_CUD_006
@AT_CUD_006_01
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_005
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the first row pencil icon under Financial Commitments in Customer Financials tab
And User_608 click the Stats Radio button under Customer Debt screen
When User_608 click the Update button in Customer Debt screen
And User_608 verify the first row status as In-Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication



# CUD_04_09
@AT_CUD_006
@AT_CUD_006_02
Scenario: To verify user is able to Add Customer Debt record in the system
Given navigate the IJARA URL
And login with valid credentials-App Data Entry
And User_608 get the test data for test case AT_CUD_005
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the first row pencil icon under Financial Commitments in Customer Financials tab
And User_608 click the Stats Radio button under Customer Debt screen
When User_608 click the Update button in Customer Debt screen
And User_608 verify the first row status as Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication





