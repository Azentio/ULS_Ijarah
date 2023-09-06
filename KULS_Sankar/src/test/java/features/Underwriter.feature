Feature: To check the underwriter feature

# Unw_01
@AT_UNW_001_01
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_001_01
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User verify the Offer Decision tab is displayed in Underwriter
And User verify the Application Details tab is displayed in Underwriter
And User verify the Customer details tab is displayed in Underwriter
And User verify the Additional Customer info tab is displayed in Underwriter
And User verify the Customer Financials tab is displayed in Underwriter
And User verify the Living Expenses tab is displayed in Underwriter
And User verify the Facility Info tab is displayed in Underwriter
And User verify the Asset Details tab is displayed in Underwriter
And User verify the Quotation Info tab is displayed in Underwriter
And User verify the Insurance Info tab is displayed in Underwriter
And User verify the Policy Check tab is displayed in Underwriter
And User verify the Document Details tab is displayed in Underwriter
And User click the Pencil icon under Offer Decision tab
And User verify Decision section is displayed under Offer Decision tab
And User verify Facility Details section is displayed under Offer Decision tab
And User verify Eligibility Details section is displayed under Offer Decision tab
And User verify Finance Configuration section is displayed under Offer Decision tab
And User verify Pricing Details section is displayed under Offer Decision tab
And User verify Instlment Details section is displayed under Offer Decision tab
And User verify Approval Details Hyperlinks section is displayed under Offer Decision tab
Then logout from the ijaraApplication

# Unw_02, Unw_03, Unw_04, Unw_05
@AT_UNW_001_02
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_001_02
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Pencil icon under Offer Decision tab
And User verify Decision section is displayed under Offer Decision tab
And User verify Facility Details section is displayed under Offer Decision tab
And User verify Eligibility Details section is displayed under Offer Decision tab
And User verify Finance Configuration section is displayed under Offer Decision tab
And User verify Pricing Details section is displayed under Offer Decision tab
And User verify Instlment Details section is displayed under Offer Decision tab
And User verify Approval Details Hyperlinks section is displayed under Offer Decision tab
And User verify Approval level field under Decision section in Offer Decision tab
And User verify Underwriter field under Decision section in Offer Decision tab
And User verify Reviewer field under Decision section in Offer Decision tab
And User verify Decision Date field under Decision section in Offer Decision tab
And User verify Decison field under Decision section in Offer Decision tab
And User select the Decision dropdown as Accept\Reject under Decision section in Offer Decision tab
And User verify the Offer amount under Finance Configuration section in Offer Decision tab
Then logout from the ijaraApplication


# Unw_14, Unw_07, Unw_08, Unw_09. Unw_10
@AT_UNW_002_01
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_002
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Pencil icon under Offer Decision tab

And User verify the Deviate button under Offer Decision screen
And User verify the Recompute button under Offer Decision screen
And User verify the Save button under Offer Decision screen
And User verify the Offer button under Offer Decision screen

And User verify the Product field is displayed under Facility Details section
And User verify the Sub-Product field is displayed under Facility Details section
And User verify the Scheme field is displayed under Facility Details section
And User verify the Pricing Indicator field is displayed under Facility Details section
And User verify the Repayment Type field is displayed under Facility Details section
And User verify the Compute Instalment On field is displayed under Facility Details section
And User verify the Principal Frequency field is displayed under Facility Details section
And User verify the Interest Frequency field is displayed under Facility Details section
And User verify the Eligible Income field is displayed under Facility Details section
And User verify the Average Account Balance field is displayed under Facility Details section
And User verify the Applicable LTV1 field is displayed under Facility Details section
And User verify the Applicable LTV2 field is displayed under Facility Details section

And User verify Requested Amount field is displayed under Finance configuration section
And User verify Requested Tenure field is displayed under Finance configuration section
And User verify Offered Amount field is displayed under Finance configuration section
And User verify Offered Tenure field is displayed under Finance configuration section
And User verify Deviation Amount field is displayed under Finance configuration section
And User verify Deviation Tenure field is displayed under Finance configuration section

And User verify Period field is displayed under Pricing Details section
And User verify Interest Def field is displayed under Pricing Details section
And User verify Rate Type field is displayed under Pricing Details section
And User verify Index Rate field is displayed under Pricing Details section
And User verify Offer Rate field is displayed under Pricing Details section
And User verify Effective Rate field is displayed under Pricing Details section

And User verify the Instalment Period field is displayed under Installment Details section
And User verify the Instalment Amount field is displayed under Installment Details section
Then logout from the ijaraApplication


@AT_UNW_002_02
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_002
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Pencil icon under Offer Decision tab

And User clicks on the Save button under the Offer Decision tab
And User click the Entitle button under inbox
And User click the Pencil icon under Offer Decision tab

#And User click the Offer button after selecting the Decision under Offer Decision tab
#And User verify the validation messgage after clicking Offer button under Offer Decision tab
#
#And User click the Offer button without selecting the Decision under Offer Decision tab
#And User verify the validation messgage after clicking Offer button under Offer Decision tab


Then logout from the ijaraApplication
