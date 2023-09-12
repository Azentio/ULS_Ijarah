Feature: To check the Customer debt details feature

@AT_CUD_001
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_001
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click Add button in Financial Commitments under Customer Financials tab
And User validate the Customer Debt screen is available in Financial Commitments
And User validate the Save button available in Customer Debt screen
And User validate the Back button available in Customer Debt screen
And User validate the Finance type field available in Customer Debt screen
And User validate the Financial Institution field is available in Customer Debt screen
And User validate the Account Number field is available in Customer Debt screen
And User validate the Sanction Date field is available in Customer Debt screen
And User validate the Sanction Amount field is available in Customer Debt screen
And User validate the Interest Rate % field is available in Customer Debt screen
And User validate the Current Principal balance field is available in Customer Debt screen
And User validate the Tenure field is available in Customer Debt screen
And User validate the Maturity Date field is available in Customer Debt screen
And User validate the Installment Amount field is available in Customer Debt screen
And User validate the Amount considered field is available in Customer Debt screen
And User validate the Currency field is available in Customer Debt screen
And User validate the Remarks field is available in Customer Debt screen
And User validate the Next Due Date field is available in Customer Debt screen
And User validate the Collateral Type is available in Customer Debt screen
And User validate the Close Date field is available in Customer Debt screen
And User validate the Frequency field is available in Customer Debt screen
And User validate the Last payment amount field is available in Customer Debt screen
And User validate the Last payment date field is available in Customer Debt screen
And User validate the Product Name field is available in Customer Debt screen
And User validate the Last24 cycle field is available in Customer Debt screen
And User validate the Balance Transfer flag field is available in Customer Debt screen
And User validate the Facility Status field is available in Customer Debt screen
And User validate the Remaining Tenure field is available in Customer Debt screen
And User validate the Disbursement Date field is available in Customer Debt screen
And User validate the Request for Balance Takeover field is available in Customer Debt screen
And User validate the NPA Classification field is available in Customer Debt screen
And User click the Back button in Customer Debt screen navigate to the previous screen
Then logout from the ijaraApplication


@AT_CUD_002
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_002
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click Add button in Financial Commitments under Customer Financials tab
And User validate the Customer Debt screen is available in Financial Commitments
And User select the Finanacy type in Customer Debt screen
And User enter the Sanction Amount in Customer Debt screen
And User enter the Tenure in Customer Debt screen
And User enter the Installment Amount in Customer Debt screen
When User click the Save button in Customer Debt screen
And User validate the mandatory field blank message in Customer Debt screen
And User enter the Text value in numeric field and validate the error message in Customer Debt screen
When User click the Save button in Customer Debt screen
And User validate the message for invalid data in Customer Debt screen
Then logout from the ijaraApplication


@AT_CUD_003
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_003
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click the pencil button under Financial Commitments in Customer Financials tab
And User modify the Sanction amount in Customer Debt screen
And User enter the invalid data and verify in Installment field under Customer Debt screen
And User clear the mandatory field value in Customer Debt screen
And User Update the record with mandatory field blank in Customer Debt screen
And User validate the mandatory field blank message in Customer Debt screen 
And User enter the Installment Amount in Customer Debt screen
When User click the Update button in Customer Debt screen
And User click the Back button in Customer Debt screen navigate to the previous screen
Then logout from the ijaraApplication


# CUD_04_04, CUD_04_05, CUD_04_06, CUD_04_07
@AT_CUD_004
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_004
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab

And User verify the Financial Institution field is displayed in list view under Financial Commitments
And User verify the Loan Amount field is displayed in list view under Financial Commitments
And User verify the Installment Amount field is displayed in list view under Financial Commitments
And User verify the Tenure field is displayed in list view under Financial Commitments
And User verify the Next Due Date field is displayed in list view under Financial Commitments
And User verify the Principal Balance field is displayed in list view under Financial Commitments
And User verify the Currency field is displayed in list view under Financial Commitments

And User verify list view values should be not editable under FInancial Commitments

And User click Search button in Financial Commitments under Customer Financials tab
And User search the matched record in Financial Commitments under Customer Financials tab
And User search the mismatched record in Financial Commitments under Customer Financials tab
And User click the Export button in Financial Commitments under Customer Financials tab
And User click the PDF and verify under Export in Financial Commitments
And User click the Export button in Financial Commitments under Customer Financials tab
And User click the XLS and verify under Export in Financial Commitments

Then logout from the ijaraApplication




@AT_CUD_005
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_005
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click Add button in Financial Commitments under Customer Financials tab
And User validate the Customer Debt screen is available in Financial Commitments
And User select the Finanacy type in Customer Debt screen
And User enter the Sanction Amount in Customer Debt screen
And User enter the Tenure in Customer Debt screen
And User enter the Installment Amount in Customer Debt screen
And User enter the Remaining Tenure in Customer Debt screen
When User click the Save button in Customer Debt screen
Then User validate the confirm message in Customer Debt screen
Then logout from the ijaraApplication



# CUD_04_08
@AT_CUD_006
@AT_CUD_006_01
Scenario: To verify user is able to Add Customer Debt record in the system

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_005
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click the first row pencil icon under Financial Commitments in Customer Financials tab
And User click the Stats Radio button under Customer Debt screen
When User click the Update button in Customer Debt screen
And User verify the first row status as In-Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication



# CUD_04_09
@AT_CUD_006
@AT_CUD_006_02
Scenario: To verify user is able to Add Customer Debt record in the system
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CUD_005
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the pencil icon under Customer Financials tab
And User click the first row pencil icon under Financial Commitments in Customer Financials tab
And User click the Stats Radio button under Customer Debt screen
When User click the Update button in Customer Debt screen
And User verify the first row status as Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication





