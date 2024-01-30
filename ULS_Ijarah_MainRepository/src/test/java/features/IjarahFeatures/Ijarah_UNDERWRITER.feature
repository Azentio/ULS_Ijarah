Feature: To check the IJARAH -- Underwriter stage features

# Underwriter userName: 0371 Pwd: Admin@1 --> Ref Id -- 3063

# Unw_01
@AT_UNW_001_01
Scenario: To verify the Underwriter screen

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_001_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Offer Decision tab is displayed in Underwriter
And User_608 verify the Application Details tab is displayed in Underwriter
And User_608 verify the Customer details tab is displayed in Underwriter
And User_608 verify the Additional Customer info tab is displayed in Underwriter
And User_608 verify the Customer Financials tab is displayed in Underwriter
And User_608 verify the Living Expenses tab is displayed in Underwriter
And User_608 verify the Facility Info tab is displayed in Underwriter
And User_608 verify the Asset Details tab is displayed in Underwriter
And User_608 verify the Quotation Info tab is displayed in Underwriter
And User_608 verify the Insurance Info tab is displayed in Underwriter
And User_608 verify the Policy Check tab is displayed in Underwriter
And User_608 verify the Document Details tab is displayed in Underwriter
Then logout from the ULS Application
And User_608 invoke soft assert in Offer Decision screen at Ijarah Underwriter stage

# Unw_02, Unw_03, Unw_04, Unw_05
@AT_UNW_001_02
Scenario: To verify the Tab - Offer decision in Underwriter Stage

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_001_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 verify Decision section is displayed under Offer Decision tab
And User_608 verify Facility Details section is displayed under Offer Decision tab
And User_608 verify Eligibility Details section is displayed under Offer Decision tab
And User_608 verify Finance Configuration section is displayed under Offer Decision tab
And User_608 verify Pricing Details section is displayed under Offer Decision tab
And User_608 verify Instlment Details section is displayed under Offer Decision tab
And User_608 verify Approval Details Hyperlinks section is displayed under Offer Decision tab
And User_608 verify Approval level field under Decision section in Offer Decision tab
And User_608 verify Underwriter field under Decision section in Offer Decision tab
And User_608 verify Reviewer field under Decision section in Offer Decision tab
And User_608 verify Decision Date field under Decision section in Offer Decision tab
And User_608 verify Decison field under Decision section in Offer Decision tab
And User_608 select the Decision dropdown as Accept\Reject under Decision section in Offer Decision tab
And User_608 verify the Offer amount under Finance Configuration section in Offer Decision tab
Then logout from the ULS Application


# Unw_14, Unw_07, Unw_08, Unw_09. Unw_10
@AT_UNW_002_01
Scenario: To verify the Facility Details, Finance configuration, Pricing Details,Installment Details section fields and buttons under Offer decision screen.

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_002
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 verify the Deviate button under Offer Decision screen
And User_608 verify the Recompute button under Offer Decision screen
And User_608 verify the Save button under Offer Decision screen
And User_608 verify the Offer button under Offer Decision screen
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
Then logout from the ULS Application


@AT_UNW_002_02
Scenario: To verify the Save button and Offer button functionality under offer decision scrren.

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_002
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 select the Decision dropdown as Accept\Reject under Decision section in Offer Decision tab
And User_608 clicks on the Save button under the Offer Decision tab
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click the Offer button after selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage after clicking Offer button under Offer Decision tab
And User_608 select the Decision dropdown as Select under Decision section in Offer Decision tab
And User_608 click the Offer button without selecting the Decision under Offer Decision tab
And User_608 verify the validation messgage without selecting decision under Offer Decision tab
Then logout from the ULS Application
And User_608 invoke soft assert in Offer Decision screen at Ijarah Underwriter stage

@Return
Scenario: Return the record from Offering stage to Underwriter(L1)

Given navigate the IJARA URL
And login with valid credentials for return
And User_608 get the test data for test case AT_UNW_002
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Application details tab
And User_608 click the Return button under Application details tab
And User_608 select L1 Approval from dropdown in Return popup screen
And User_608 enter the Remarks under Return popup screen
And User_608 click the Return button under Return popup screen
Then logout from the ULS Application


@AT_UNW_003
Scenario: Validate that user can able to save the condition in offering page

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_003
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And Click On the Recommendation in Offer Decision
And Click On the Add button in List of Condition
And select the value in Note Code Dropdown Below the Conditions
Then Enter Number in Sequence Number Field Below the Conditions
Then select not recommended in Note Sub Code Dropdown Below the Conditions
Then Enter Data in Condition Field Below the Conditions
Then Select the value in Date field Below the Conditions
Then select the value in fulfilled Dropdown Below the Conditions
Then Turn on the Approval Status Below the Conditions
Then Fill The Remarks Field Below the Conditions
Then Click on the Save button To Save The Conditions Record
And Validate Save successful popup is displayed in the condition
Then logout from the ULS Application
And User_608 invoke soft assert in under Offer Decision tab at Ijarah Underwriter stage

@AT_UNW_004
Scenario: To check whether underwriter is allowed to deviate on Offered Amount or not

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_004
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Pencil icon under Offer Decision tab
And User_608 enter the Deviation Amount under Finance configuration section in Offer Decision tab
And User_608 enter the Deviation Tenure under Finance configuration section in Offer Decision tab
And User_608 click the Deviate button under Offer Decision screen
And User_608 post clicking on deviate button system should able to deviate offered amount
And User_608 click the Accept Deviation button in Deviation Comparison screen
And User_608 click the Offer Decision tab in Underwriter stage
And User_608 click the Pencil icon under Offer Decision tab
And User_608 click the Deviate button under Offer Decision screen
And User_608 to check whether underwriter is able to view the previous offers generated of the application if deviation is accepted
Then logout from the ULS Application
And User_608 invoke soft assert in under Offer Decision tab at Ijarah Underwriter stage


@AT_UNW_006
Scenario: Underwriter - Main screen and Added Screen

Given navigate the IJARA URL
And login with valid credentials-Underwriter
And User_608 get the test data for test case AT_UNW_006
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Application Details tab in Underwriter stage
And User_608 verify the Approve button under Application Details
And User_608 verify the Reject button under Application Details
And User_608 verify the Return button under Application Details
And User_608 verify the View summary button under Application Details
And User_608 verify the Customer details tab in Underwriter stage
And User_608 to verify system should populate all the data under Customer details tab at this stage
And User_608 verify the Additional Customer info tab in Underwriter stage
And User_608 to verify system should populate all the data under Additional Customer info tab at this stage
And User_608 verify the Customer Financials tab in Underwriter stage
And User_608 to verify system should populate all the data under Customer Financials tab at this stage
And User_608 verify the Living Expenses tab in Underwriter stage
And User_608 click the Eye button under Living Expenses tab
And User_608 verify the Facility Info tab in Underwriter stage
And User_608 click the Eye button under Facility Info tab
And User_608 verify the Asset Details tab in Underwriter stage
And User_608 click the Eye button under Asset Details tab
And User_608 verify the Quotation Info tab in Underwriter stage
And User_608 click the Eye button under Quotation Info tab
And User_608 verify the Insurance Info tab in Underwriter stage
And User_608 click the Eye button under Insurance Info tab
And User_608 verify the Policy Check tab in Underwriter stage
And User_608 verify the Document Details tab in Underwriter stage
Then logout from the ULS Application
And User_608 invoke soft assert in under Offer Decision tab at Ijarah Underwriter stage