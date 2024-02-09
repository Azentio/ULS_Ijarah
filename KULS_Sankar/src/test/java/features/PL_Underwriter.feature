Feature: To check the Personal loan - Underwriter test cases

@AT_PL_UNW_01
Scenario: To verify the Personal loan - Underwriter stage below tabs should be display on screen

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 verify the Offer Decision tab is displayed in Underwriter
And User_608 verify the Application Details tab is displayed in Underwriter
And User_608 verify the Customer details tab is displayed in Underwriter
And User_608 verify the Additional Customer info tab is displayed in Underwriter
And User_608 verify the Customer Financials tab is displayed in Underwriter
#And User_608 verify the Living Expenses tab is displayed in Underwriter
And User_608 verify the Facility Info tab is displayed in Underwriter
#And User_608 verify the Quotation Info tab is displayed in Underwriter
#And User_608 verify the Insurance Info tab is displayed in Underwriter
And User_608 verify the Document Details tab is displayed in Underwriter
And User_608 verify the Policy Check tab is displayed in Underwriter
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_02
Scenario: To verify Offer decision tab below sections should be display under offer decision tab. Below fields should be auto populated under decision section

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 verify Decision section is displayed under Offer Decision tab
And User_608 verify Facility Details section is displayed under Offer Decision tab
And User_608 verify Eligibility Details section is displayed under Offer Decision tab
And User_608 verify Finance Configuration section is displayed under Offer Decision tab
And User_608 verify Pricing Details section is displayed under Offer Decision tab
And User_608 verify Instalment Details section is displayed under Offer Decision tab
And User_608 verify Approval Details Hyperlinks section is displayed under Offer Decision tab
And User_608 verify Approval level field under Decision section in Offer Decision tab
And User_608 verify Underwriter field under Decision section in Offer Decision tab
And User_608 verify Reviewer field under Decision section in Offer Decision tab
And User_608 verify Decision Date field under Decision section in Offer Decision tab
And User_608 verify Decision field under Decision section in Offer Decision tab
And User_608 system should able to select accept\reject from dropdown under Decision section
And User_608 verify the Offer amount under Finance Configuration section in Offer Decision tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_03
Scenario: Below fields should be display under Facility details section & below fields should be auto populated under Finance configuration.

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 verify the Product field is displayed under Facility Details section
And User_608 verify the Sub-Product field is displayed under Facility Details section
And User_608 verify the Scheme field is displayed under Facility Details section
And User_608 verify the Pricing Indicator field is displayed under Facility Details section
And User_608 verify the Repayment Type field is displayed under Facility Details section
And User_608 verify the Compute Instalment On field is displayed under Facility Details section
And User_608 verify the Principal Frequency field is displayed under Facility Details section
And User_608 verify the Interest Frequency field is displayed under Facility Details section
And User_608 verify the Eligible Income field is displayed under Facility Details section
And User_608 verify the Average Account Balance field is displayed under Facility Details section
And User_608 verify the Applicable LTV1 field is displayed under Facility Details section
And User_608 verify the Applicable LTV2 field is displayed under Facility Details section
And User_608 verify Requested Amount field is displayed under Finance configuration section
And User_608 verify Requested Tenure field is displayed under Finance configuration section
And User_608 verify Offered Amount field is displayed under Finance configuration section
And User_608 verify Offered Tenure field is displayed under Finance configuration section
And User_608 verify Deviation Amount field is displayed under Finance configuration section
And User_608 verify Deviation Tenure field is displayed under Finance configuration section
And User_608 verify Period field is displayed under Pricing Details section
And User_608 verify Interest Def field is displayed under Pricing Details section
And User_608 verify Rate Type field is displayed under Pricing Details section
And User_608 verify Index Rate field is displayed under Pricing Details section
And User_608 verify Offer Rate field is displayed under Pricing Details section
And User_608 verify Effective Rate field is displayed under Pricing Details section
And User_608 verify the Instalment Period field is displayed under Installment Details section
And User_608 verify the Instalment Amount field is displayed under Installment Details section
And User_608 verify the Deviate button available under Offer Decision screen
And User_608 verify the Recompute button available under Offer Decision screen
And User_608 verify the Save button available under Offer Decision screen
And User_608 verify the Offer button available under Offer Decision screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_04
Scenario: Recommendations/Sanction Conditions Approval History Details screen should get open & System should able to add new record.

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click Recommendations\Sanction Conditions Approval History link under Approval Details Hyperlinks section
And User_608 click the Add button in List of condition section under Offer decision tab
And User_608 verify Recommendations\Sanction Hyperlink screen get open under Offer decision tab
And User_608 select Note Code value from dropdown in Recommendation\Sanction Hyperlink screen
And User_608 enter Sequence Number value in input field under Recommendation\Sanction Hyperlink screen
And User_608 select Note Sub Code value from dropdown in Recommendation\Sanction Hyperlink screen
And User_608 enter Condition value in input field under Recommendation\Sanction Hyperlink screen
And User_608 select Date under Recommendation\Sanction Hyperlink screen
And User_608 enter Remarks in input field under Recommendation\Sanction Hyperlink screen
And User_608 click the Save button under Recommendation\Sanction Hyperlink screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_05
Scenario: To verify the save button & Offer button under offer decision

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 select the Decision value as accept\reject from dropdown under Decision section
And User_608 clicks on the Save button under the Offer Decision tab
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click the Offer button after selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage after clicking Offer button under Offer Decision tab
And User_608 select the Decision value as Select from dropdown under Decision section in Offer Decision tab
And User_608 click the Offer button without selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage without selecting decision under Offer Decision tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

# Return the Record from offering to L1
@Return
Scenario: Return the record from Offering stage to Underwriter(L1)

Given navigate the IJARA URL
And login with valid credentials for return
And User_608 get the test data for test case AT_PL_UNW_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Application details tab
And User_608 click the Return button under Application details tab
And User_608 select L1 Approval from dropdown in Return popup screen
And User_608 enter the Remarks under Return popup screen
And User_608 click the Return button under Return popup screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_06
Scenario: To check whether underwriter is allowed to deviate on Offered Amount or not

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 enter invalid Deviation Amount under Finance configuration section in Offer Decision tab
And User_608 click the Deviate button under Offer Decision screen
And User_608 to verify validation message offered amount is greater than requested amount in Offer Decision tab
And User_608 enter Deviation Amount value under Finance configuration section in Offer Decision tab
And User_608 enter Deviation Tenure value under Finance configuration section in Offer Decision tab
And User_608 click the Deviate button under Offer Decision screen
And User_608 post clicking on deviate button system should able to deviate offered amount
And User_608 click the Accept Deviation button in Deviation Comparison screen
And User_608 click the Offer Decision tab in Underwriter stage
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click the Deviate button under Offer Decision screen
And User_608 to check whether underwriter is able to view the previous offers generated of the application if deviation is accepted
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab

@AT_PL_UNW_07
Scenario: To verify the below tab system should populate all the data at this stage correctly & All data must be for display only

Given navigate the IJARA URL
And login with valid credentials-Personal loan Underwriter
And User_608 get the test data for test case AT_PL_UNW_07
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID in ULS Application for Personal loan
And User_608 click the Entitle button under inbox
And User_608 click the Application details tab
And User_608 verify all the populate data correctly at this stage and display only in Application details screen
And User_608 verify the Approve button under Application Details
And User_608 verify the Reject button under Application Details
And User_608 verify the Return button under Application Details
And User_608 verify the View summary button under Application Details
And User_608 click the Customer Details tab
And User_608 click the Eye button under Customer Details tab
And User_608 verify all the populate data correctly at this stage and display only in Customer details screen
And User_608 verify the Additional Customer info tab in Underwriter stage
And User_608 to verify system should populate all the data under Additional Customer info tab at this stage
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify all the populate data correctly at this stage and display only under Customer Financials tab
#And User_608 verify the Living Expenses tab in Underwriter stage
#And User_608 click the Eye button under Living Expenses tab
And User_608 verify the Facility Info tab in Underwriter stage
And User_608 click the Eye button under Facility Info tab
#And User_608 verify the Quotation Info tab in Underwriter stage
#And User_608 click the Eye button under Quotation Info tab
#And User_608 verify the Insurance Info tab in Underwriter stage
#And User_608 click the Eye button under Insurance Info tab
And User_608 verify the Document Details tab in Underwriter stage
And User_608 click the Eye button under Document Details tab
And User_608 verify the Policy Check tab in Underwriter stage
Then logout from the ijaraApplication
And User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab