Feature: To check the Offering Stage - Offer Details feature

# *********************** userType06 ***************************

@AT_OFO_01
Scenario: To verify the availability of Offer decision in system

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify the Offer Details section available under Offer Details tab
And User_608 verify the Finance Details section available under Offer Details tab
And User_608 verify the Credit Risk Factor section available under Offer Details tab
And User_608 verify the Credit Score Details section available under Offer Details tab
And User_608 verify the Eligibility Details section available under Offer Details tab
And User_608 verify the Interest Rate Structure section available under Offer Details tab
And User_608 verify the Installments section available under Offer Details tab
And User_608 verify the Appeal Request section available under Offer Details tab
Then logout from the ijaraApplication


@AT_OFO_02
Scenario: To verify if Offer Details section is available with correct fields and button.

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify Product field available under Offer Details section
And User_608 verify Sub-Product field available under Offer Details section
And User_608 verify Scheme field available under Offer Details section
And User_608 verify Pricing Indicator field available under Offer Details section
And User_608 verify Offered Amount field available under Offer Details section
And User_608 verify Tenure field available under Offer Details section
And User_608 verify Nature of Finance field available under Offer Details section
And User_608 verify Currency field available under Offer Details section
And User_608 verify Eligible Income field available under Offer Details section
Then logout from the ijaraApplication


@AT_OFO_03
Scenario: To verify if Finance Details section is available with correct fields and button.

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify Total Obligations field available under Finance Details section
And User_608 verify Total Net Income field available under Finance Details section
And User_608 verify Total Income field available under Finance Details section
And User_608 verify Total Fees field available under Finance Details section
And User_608 verify Total Down Payment Amount field available under Finance Details section
And User_608 verify Total Contract Value field available under Finance Details section
And User_608 verify Number of Installments field available under Finance Details section
And User_608 verify Last Installment Amount field available under Finance Details section
And User_608 verify IRR field available under Finance Details section
And User_608 verify Installment Frequency field available under Finance Details section
And User_608 verify APR field available under Finance Details section
And User_608 verify Amount Requested field available under Finance Details section
And User_608 verify Additional Down Payment field available under Finance Details section
And User_608 verify Down Payment Percentage field available under Finance Details section
And User_608 verify Tenure field available under Finance Details section
And User_608 verify Profit Amount field available under Finance Details section
And User_608 verify Down Payment Amount field available under Finance Details section
Then logout from the ijaraApplication


@AT_OFO_04
Scenario: To verify the fields are available under Credit Risk Factor and Credit Score Details section

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify the Credit Risk Factor section available under Offer Details tab
And User_608 verify the Total Score field available under Credit Risk Factor section
And User_608 verify the Risk Level field availble under Credit Risk Factor section
And User_608 verify the Credit Score Details section available under Offer Details tab
And User_608 verify the Serial No field available under Credit Score details section
And User_608 verify the Customer Name field available under Credit Score details section
And User_608 verify the Credit Bureau Score field available under Credit Score details section
Then logout from the ijaraApplication

@AT_OFO_05
Scenario: To verify if Eligibility Details section is available with correct fields and button

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify the Eligibility Details section available under Offer Details tab
And User_608 verify the Eligibility Type field available under Eligibility Details section
And User_608 verify the Eligibility Amount field available under Eligibility Details section
And User_608 verify the Eligibility Percentage field available under Eligibility Details section
And User_608 verify the Currency field available under Eligibility Details section
And User_608 verify the Actual Percentage field available under Eligibility Details section
And User_608 verify the Deviation level field available under Eligibility Details section
Then logout from the ijaraApplication


@AT_OFO_06
Scenario: To verify if all the fields are non-editable under Offer Details tab

Given navigate the IJARA URL
And login with valid credentials-Offering
And User_608 get the test data for test case AT_OFO_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the pencil icon button under Offer Details tab
And User_608 verify the Offer Details section available under Offer Details tab
And User_608 verify Product field is non-editable under Offer Details section
And User_608 verify Sub-Product field is non-editable under Offer Details section
And User_608 verify Scheme field is non-editable under Offer Details section
And User_608 verify Pricing Indicator field is non-editable under Offer Details section
And User_608 verify Offered Amount field is non-editable under Offer Details section
And User_608 verfiy Tenure field is non-editable under Offer Details section
And User_608 verify Nature of Finance field is non-editable under Offer Details section
And User_608 verify Currency field is non-editable under Offer Details section
And User_608 verify Eligible Income field is non-editable under Offer Details section
And User_608 verify Total Obligations field is non-editable under Finance Details section
And User_608 verify Total Net Income field is non-editable under Finance Details section
And User_608 verify Total Income field is non-editable under Finance Details section
And User_608 verify Total Fees field is non-editable under Finance Details section
And User_608 verify Total Down Payment Amount field is non-editable under Finance Details section
And User_608 verify Total Contract Value field is non-editable under Finance Details section
And User_608 verify No of Installments field is non-editable under Finance Details section
And User_608 verify Last Installment Amount field is non-editable under Finance Details section
And User_608 verify IRR field is non-editable under Finance Details section
And User_608 verify Installment Frequency field is non-editable under Finance Details section
And User_608 verify APR field is non-editable under Finance Details section
And User_608 verify Amount Requested field is non-editable under Finance Details section
And User_608 verify Additional Down Payment field is non-editable under Finance Details section
And User_608 verify Down Payment Percentage field is non-editable under Finance Details section
And User_608 verify Tenure field is non-editable under Finance Details section
And User_608 verify Profit Amount field is non-editable under Finance Details section
And User_608 verify Down Payment Amount field is non-editable under Finance Details section
Then logout from the ijaraApplication