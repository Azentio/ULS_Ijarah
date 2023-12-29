Feature: To check the Murabaha --> App Data Entry stage, Customer Debt screen

#CUD_01_01, CUD_01_04
@AT_MCUD_01
Scenario: Customer Debt screen should get open with all valid fields in proper format with below mention buttons and all valid fields

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Customer Debt screen is available in Financial Commitments
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
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage


#CUD_01_02, CUD_01_03
@AT_MCUD_02
Scenario: To verify while creating customer debt, system allow user to save the record with valid data & confirmation popup

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
#And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 select the Finanace type under Customer Debt screen in Customer Financials tab
And User_608 select the Financial Institution value under Customer Debt screen in Customer Financials tab
And User_608 enter the Account Number under Customer Debt screen in Customer Financials tab
And User_608 enter the Sanction Amount under Customer Debt screen in Customer Financials tab
And User_608 enter the Tenure under Customer Debt screen in Customer Financials tab
And User_608 enter the Installment Amount under Customer Debt screen in Customer Financials tab
And User_608 select the Currency value under Customer Debt screen in Customer Financials tab
And User_608 enter the Remaining Tenure under Customer Debt screen in Customer Financials tab
When User_608 click the Save button in Customer Debt screen
Then User_608 validate the confirm message in Customer Debt screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage


#CUD_01_05 -->  CUD_01_30
@AT_MCUD_03
Scenario: To verify the below fields are mantatory/non-mandatory and LOV in Customer Debt screen

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
#And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 verify Finance Type as Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Financial Institution as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Account Number as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Sanction Date as Non-Mandatory and Date under Customer Debt screen in Customer Financials tab
And User_608 verify Sanction Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Interest Rate % as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Current Principal balance as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Maturity Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Installment Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Amount considered as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Currency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Remarks as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Next Due Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Collateral Type as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Close Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Frequency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Last payment amount as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Last payment date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Product Name as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Last24 cycle as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Balance Transfer flag as Non-Mandatory and toggle button under Customer Debt screen in Customer Financials tab
And User_608 verify Facility Status as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify Remaining Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab
And User_608 verify Disbursement Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab
And User_608 verify Request for Balance Takeover as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
And User_608 verify NPA Classification as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage


#CUD_02_01, CUD_02_02, CUD_02_03
@AT_MCUD_05
Scenario: To verify the impact when user keep any mandatory field blank, enter character value in numeric filed and click on save button

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button in Financial Commitments under Customer Financials tab
#And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 select the Finanace type under Customer Debt screen in Customer Financials tab
And User_608 select the Financial Institution value under Customer Debt screen in Customer Financials tab
And User_608 enter the Account Number under Customer Debt screen in Customer Financials tab
And User_608 enter the Sanction Amount under Customer Debt screen in Customer Financials tab
And User_608 enter the Tenure under Customer Debt screen in Customer Financials tab
And User_608 enter the Installment Amount under Customer Debt screen in Customer Financials tab
When User_608 click the Save button in Customer Debt screen
And User_608 validate the mandatory field blank message in Customer Debt screen
And User_608 enter the Text value in Remaining Tenure field and validate the error message in Customer Debt screen
When User_608 click the Save button in Customer Debt screen
And User_608 validate the message for invalid data in Customer Debt screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage


#CUD_03_01 --> CUD_03_07
@AT_MCUD_06
Scenario: To verify while modification system allow user to save the record with valid data

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the pencil button under Financial Commitments in Customer Financials tab
#And User_608 validate the Customer Debt screen is available in Financial Commitments
And User_608 validate the Update button available in Customer Debt screen
And User_608 validate the Back button available in Customer Debt screen
And User_608 clear the mandatory field value in Customer Debt screen
And User_608 Update the record with mandatory field blank in Customer Debt screen
And User_608 validate the mandatory field blank message in Customer Debt screen
And User_608 enter the invalid data in any one field under Customer Debt screen in Customer Financials tab
When User_608 click the Update button with invalid data in Customer Debt screen
And User_608 validate the invalid data error message in Customer Debt screen
And User_608 enter the Installment Amount under Customer Debt screen in Customer Financials tab
And User_608 modify the Sanction Amount under Customer Debt screen in Customer Financials tab
When User_608 click the Update button with valid data in Customer Debt screen
And User_608 to verify system display the confirmation message post clicking on update button in Customer Debt screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage

#CUD_04_01, CUD_04_02, CUD_04_03
@AT_MCUD_07
Scenario: To verify the Customer Debt details List view

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 scroll into view the financial commitments section under Customer Financials tab
And User_608 verify the Financial Institution field is displayed in list view under Financial Commitments
And User_608 verify the Loan Amount field is displayed in list view under Financial Commitments
And User_608 verify the Installment Amount field is displayed in list view under Financial Commitments
And User_608 verify the Tenure field is displayed in list view under Financial Commitments
And User_608 verify the Next Due Date field is displayed in list view under Financial Commitments
And User_608 verify the Principal Balance field is displayed in list view under Financial Commitments
And User_608 verify the Currency field is displayed in list view under Financial Commitments
And User_608 verify the Status field is displayed in list view under Financial Commitments
And User_608 verify list view values should be not editable under Financial Commitments
And User_608 click Add button in Financial Commitments under Customer Financials tab
And User_608 validate the Customer Debt screen is available in Financial Commitments
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage

# CUD_04_04, CUD_04_05
@AT_MCUD_08
Scenario: To verify the functionality of Search box with matching and mismatch data

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Search button in Financial Commitments under Customer Financials tab
And User_608 search matching value system should display all the possible matching records under Financial Commitments section
And User_608 verify the all the possible matching records are displayed under Financial Commitments section
And User_608 search mismatch value system should not display any records under Financial Commitments section
And User_608 verify the system is should not displayed any records under Financial Commitments section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Customer Debt screen at Murabaha App Data Entry stage

#CUD_04_08
@AT_MCUD_11
Scenario: To verify user is able to change the status of Debt record from Active to Inactive

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_11
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the first row pencil icon under Financial Commitments in Customer Financials tab
And User_608 click the Status Radio button under Customer Debt screen
When User_608 click the Update button in Customer Debt screen
And User_608 verify the first row status as In-Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication


#CUD_04_09
@AT_MCUD_12
Scenario: To verify user is able to change the status of Debt record from Inctive to Active

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MCUD_12
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the first row pencil icon under Financial Commitments in Customer Financials tab
And User_608 click the Status Radio button under Customer Debt screen
When User_608 click the Update button in Customer Debt screen
And User_608 verify the first row status as Active under Financial Commitments in Customer Financials tab
Then logout from the ijaraApplication
