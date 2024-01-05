Feature: To check the  Murabha_Offering Stage - Offer Details feature

@AT_M_OFO_01
Scenario: To verify the availability of Offer decision in system

Given navigate the IJARA URL
And login with valid credentials for Murabha_Offering_OfferDetails
And User_074 get the test data for test case AT_M_OFO_01
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_Offering_offer details
And User click the Entitle button under inbox
And User_074 click the pencil icon button under Offer Details tab
And User_074 verify the Offer Details section available under Offer Details tab
And User_074 verify the Finance Details section available under Offer Details tab
And User_074 verify the Credit Risk Factor section available under Offer Details tab
And User_074 verify the Credit Score Details section available under Offer Details tab
And User_074 verify the Eligibility Details section available under Offer Details tab
And User_074 verify the Interest Rate Structure section available under Offer Details tab
And User_074 verify the Installments section available under Offer Details tab
And User_074 verify the Appeal Request section available under Offer Details tab
Then logout from the ULS Application


@AT_M_OFO_02
Scenario: To verify if Offer Details section is available with correct fields and button.

Given navigate the IJARA URL
And login with valid credentials for Murabha_Offering_OfferDetails
And User_074 get the test data for test case AT_M_OFO_02
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_Offering_offer details
And User click the Entitle button under inbox
And User_074 click the pencil icon button under Offer Details tab
And User_074 verify Product field available under Offer Details section
And User_074 verify Sub-Product field available under Offer Details section
And User_074 verify Scheme field available under Offer Details section
And User_074 verify Pricing Indicator field available under Offer Details section
And User_074 verify Offered Amount field available under Offer Details section
And User_074 verify Tenure field available under Offer Details section
And User_074 verify Nature of Finance field available under Offer Details section
And User_074 verify Currency field available under Offer Details section
And User_074 verify Eligible Income field available under Offer Details section
Then logout from the ULS Application


@AT_M_OFO_03
Scenario: To verify if Finance Details section is available with correct fields and button.

Given navigate the IJARA URL
And login with valid credentials for Murabha_Offering_OfferDetails
And User_074 get the test data for test case AT_M_OFO_03
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_Offering_offer details
And User click the Entitle button under inbox
And User_074 click the pencil icon button under Offer Details tab
And User_074 verify Total Obligations field available under Finance Details section
And User_074 verify Total Net Income field available under Finance Details section
And User_074 verify Total Income field available under Finance Details section
And User_074 verify Total Fees field available under Finance Details section
And User_074 verify Total Down Payment Amount field available under Finance Details section
And User_074 verify Total Contract Value field available under Finance Details section
And User_074 verify Number of Installments field available under Finance Details section
And User_074 verify Last Installment Amount field available under Finance Details section
And User_074 verify IRR field available under Finance Details section
And User_074 verify Installment Frequency field available under Finance Details section
And User_074 verify APR field available under Finance Details section
And User_074 verify Amount Requested field available under Finance Details section
And User_074 verify Additional Down Payment field available under Finance Details section
And User_074 verify Down Payment Percentage field available under Finance Details section
And User_074 verify Tenure field available under Finance Details section
And User_074 verify Profit Amount field available under Finance Details section
And User_074 verify Down Payment Amount field available under Finance Details section
Then logout from the ULS Application


@AT_M_OFO_04
Scenario: To verify the fields are available under Credit Risk Factor and Credit Score Details section

Given navigate the IJARA URL
And login with valid credentials for Murabha_Offering_OfferDetails
And User_074 get the test data for test case AT_M_OFO_04
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_Offering_offer details
And User click the Entitle button under inbox
And User_074 click the pencil icon button under Offer Details tab
And User_074 verify the Credit Risk Factor section available under Offer Details tab
And User_074 verify the Total Score field available under Credit Risk Factor section
And User_074 verify the Risk Level field availble under Credit Risk Factor section
And User_074 verify the Credit Score Details section available under Offer Details tab
And User_074 verify the Serial No field available under Credit Score details section
And User_074 verify the Customer Name field available under Credit Score details section
And User_074 verify the Credit Bureau Score field available under Credit Score details section
Then logout from the ULS Application

@AT_M_OFO_05
Scenario: To verify if Eligibility Details section is available with correct fields and button

Given navigate the IJARA URL
And login with valid credentials for Murabha_Offering_OfferDetails
And User_074 get the test data for test case AT_M_OFO_05
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_Offering_offer details
And User click the Entitle button under inbox
And User_074 click the pencil icon button under Offer Details tab
And User_074 verify the Eligibility Details section available under Offer Details tab
And User_074 verify the Eligibility Type field available under Eligibility Details section
And User_074 verify the Eligibility Amount field available under Eligibility Details section
And User_074 verify the Eligibility Percentage field available under Eligibility Details section
And User_074 verify the Currency field available under Eligibility Details section
And User_074 verify the Actual Percentage field available under Eligibility Details section
And User_074 verify the Deviation level field available under Eligibility Details section
Then logout from the ULS Application