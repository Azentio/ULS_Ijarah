Feature: To check the Auto Loan -- Underwriter L1 stage

@AT_AL_UNWL1_01
Scenario: To verify the Tab - Offer decision screen
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - Underwriter L1
And User_608 get the test data for test case AT_AL_UNWL1_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
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
And User_608 System should able to select Accept\Reject from dropdown Decision section in Offer Decision tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage

@AT_AL_UNWL1_02
Scenario: To verify Below fields are available under Facility Details, Finance configuration, Pricing Details, Pricing Details sections

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - Underwriter L1
And User_608 get the test data for test case AT_AL_UNWL1_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
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
Then logout from the ijaraApplication
And User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage

#AZ1LN-8932 - resolved
@AT_AL_UNWL1_03
Scenario: To check underwriter user can add new record in recommendation/sanction condition screen

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - Underwriter L1
And User_608 get the test data for test case AT_AL_UNWL1_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click Recommendations\Sanction Conditions Approval History link under Approval Details Hyperlinks section
And User_608 click the Add button in List of condition section under Offer decision tab
And User_608 verify Recommendations\Sanction Hyperlink screen get open under Offer decision tab
And User_608 select the Note Code from dropdown under Recommendation\Sanction Hyperlink screen
And User_608 enter Sequence Number under Recommendation\Sanction Hyperlink screen
And User_608 select Note Sub Code from dropdown under Recommendation\Sanction Hyperlink screen
And User_608 enter Condition under Recommendation\Sanction Hyperlink screen
And User_608 enter Date under Recommendation\Sanction Hyperlink screen
And User_608 enter Remarks under Recommendation\Sanction Hyperlink screen
And User_608 click the Save button under Recommendation\Sanction Hyperlink screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage

#Every time we run the scenario, record move to offering stage in another user(0371), then we move to L1 stage
@AT_AL_UNWL1_04
Scenario: To verify the buttons and functionality of Save and Offer button under offer decision scrren.

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - Underwriter L1
And User_608 get the test data for test case AT_AL_UNWL1_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 verify the Deviate button available under Offer Decision screen
And User_608 verify the Recompute button available under Offer Decision screen
And User_608 verify the Save button available under Offer Decision screen
And User_608 verify the Offer button available under Offer Decision screen
And User_608 select Accept\Reject from dropdown Decision section in Offer Decision tab
And User_608 clicks on the Save button under the Offer Decision tab
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click the Offer button after selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage after clicking Offer button under Offer Decision tab
And User_608 select the Decision value as Select under Decision section in Offer Decision tab
And User_608 click the Offer button without selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage without selecting decision under Offer Decision tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage

# Return the Record from offering to L1
@Return
Scenario: Return the record from Offering stage to Underwriter(L1)

Given navigate the IJARA URL
And login with valid credentials for return
And User_608 get the test data for test case AT_AL_UNWL1_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Application details tab
And User_608 click the Return button under Application details tab
And User_608 select L1 Approval from dropdown in Return popup screen
And User_608 enter the Remarks under Return popup screen
And User_608 click the Return button under Return popup screen
Then logout from the ijaraApplication

@AT_AL_UNWL1_05
Scenario: Underwriter - Main screen --> Verify the below tabs

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - Underwriter L1
And User_608 get the test data for test case AT_AL_UNWL1_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Application details tab
And User_608 verify all the populate data correctly at this stage and display only in Application details screen
And User_608 click the Customer Details tab
And User_608 click the Eye button under Customer Details tab
And User_608 verify all the populate data correctly at this stage and display only in Customer details screen
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify all the populate data correctly at this stage and display only under Customer Financials tab
And User_608 click the Asset Details tab
And User_608 click the Eye button under Asset Details tab
And User_608 verify all the populate data correctly at this stage and display only under Asset Details tab
And User_608 click the Document Details tab
And User_608 click the Eye button under Document Details tab
And User_608 click the Policy Check tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage