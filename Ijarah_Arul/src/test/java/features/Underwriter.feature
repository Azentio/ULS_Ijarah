Feature: To check the underwriter feature

@AT_UNW_003
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_003
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