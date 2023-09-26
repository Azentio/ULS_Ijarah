Feature: To check the underwriter feature

# Underwriter userName: 0371 Pwd: Admin@1

# Unw_01
@AT_UNW_001_01
Scenario: To verify user is able to add under underwriter

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
Then logout from the ijaraApplication

# Unw_02, Unw_03, Unw_04, Unw_05
@AT_UNW_001_02
Scenario: To verify user is able to add under underwriter

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
Then logout from the ijaraApplication


# Unw_14, Unw_07, Unw_08, Unw_09. Unw_10
@AT_UNW_002_01
Scenario: To verify user is able to add under underwriter

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
Then logout from the ijaraApplication


@AT_UNW_002_02
Scenario: To verify user is able to add under underwriter

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

Then logout from the ijaraApplication
