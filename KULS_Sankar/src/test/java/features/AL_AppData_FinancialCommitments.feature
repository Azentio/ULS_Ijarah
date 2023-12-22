Feature: To check the Auto Loan - App Data Entry stage -> Customer Financial tab -> Financial Commitments/Customer Debt screen

@AT_AL_CUD_01
Scenario: Creation of Customer Dept record - Customer Debt screen should get open with all valid fields in 
					proper format with below mention buttons

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_CUD_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Save button available in Customer Debt screen
And User_608 validate the Back button available in Customer Debt screen
And User_608 verify Finance Type field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Financial Institution field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Account Number field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Sanction Date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Sanction Amount field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Interest Rate % field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Current Principal balance field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Tenure field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Maturity Date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Installment Amount field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Amount considered field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Currency field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Remarks field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Next Due Date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Collateral Type is available under Customer Debt screen in Customer Financials tab
And User_608 verify Close Date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Frequency field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Last payment amount field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Last payment date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Product Name field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Last24 cycle field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Balance Transfer flag field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Facility Status field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Remaining Tenure field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Disbursement Date field is available under Customer Debt screen in Customer Financials tab
And User_608 verify Request for Balance Takeover field is available under Customer Debt screen in Customer Financials tab
And User_608 verify NPA Classification field is available under Customer Debt screen in Customer Financials tab
And User_608 click the Back button Under Customer Debt screen to navigate the previous screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Auto Loan App Data Entry stage


@AT_AL_CUD_02
Scenario: Creation of Customer Dept record - System allow user to save the record with valid data and
					System display the confirmation message

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_CUD_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 select the Finanace type value in Financial Commitments-Customer Debt screen
And User_608 select the Financial Institution value in Financial Commitments-Customer Debt screen
And User_608 enter the Account Number in Financial Commitments-Customer Debt screen
And User_608 enter the Sanction Amount in Financial Commitments-Customer Debt screen
And User_608 enter the Tenure in Financial Commitments-Customer Debt screen
And User_608 enter the Installment Amount in Financial Commitments-Customer Debt screen
And User_608 select the Currency value in Financial Commitments-Customer Debt screen
And User_608 enter the Remaining Tenure in Financial Commitments-Customer Debt screen
When User_608 click the Save button in Customer Debt screen
Then User_608 validate the confirm message in Customer Debt screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Auto Loan App Data Entry stage


@AT_AL_CUD_03
Scenario: Creation of Customer Dept record - To verfiy the below fields should be mandatory/Non-Mandatory and LOV/Textbox

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_CUD_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 verify Finance Type as Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to select any value from the LOV in Finance Type
And User_608 verify Financial Institution as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to select any value from the LOV in Financial Institution
And User_608 verify Account Number as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Account Number field
And User_608 verify Sanction Date as Non-Mandatory and Date under Customer Debt screen in Customer Financials tab
And User_608 verify Sanction Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Sanction Amount field
And User_608 verify Interest Rate % as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Interest Rate % field
And User_608 verify Current Principal balance as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Current Principal balance field
And User_608 verify Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Tenure field
And User_608 verify Maturity Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Installment Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Installment Amount field
And User_608 verify Amount considered as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Amount considered field
And User_608 verify Currency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to select any value from the LOV in Currency field
And User_608 verify Remarks as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Next Due Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Collateral Type as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to select any value from the LOV in Collateral Type field
And User_608 verify Close Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Frequency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to select any value from the LOV in Frequency field
And User_608 verify Last payment amount as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Last Payment Amount field
And User_608 verify Last payment date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Product Name as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Last24 cycle as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Balance Transfer flag as Non-Mandatory and toggle button under Customer Debt screen in Customer Financials tab
And User_608 verify Facility Status as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Remaining Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify system should allow user to enter only positive numeric value in Remaining Tenure field
And User_608 verify Disbursement Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Request for Balance Takeover as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify NPA Classification as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Auto Loan App Data Entry stage
