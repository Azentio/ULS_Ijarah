Feature: To verify the offerDetails screen in murabha application
@AT_MU_OFO_01
Scenario: To verify the section under the offer details

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha-offering-offerDetail
And User_6047 Get the test data for test case ID AT_MU_OFO_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refere id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
And User_6047 verify the Offer Details section under offer details
Then User_6047 verify the Finance Details section under offer details
Then User_6047 verify the Credit Risk Factor (CONV) section under offer details
Then User_6047 verify the Credit Score Details (CONV) section under offer details
Then User_6047 verify the Eligibility Details section under offer details
Then User_6047 verify the Interest Rate Structure section under offer details
Then User_6047 verify the Installments section under offer details
Then User_6047 verify the Appeal Request section under offer details
Then logout from the ULS Application

@AT_MU_OFO_02
Scenario: To verify if Facility Details section is available with correct fields and button

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha-offering-offerDetail
And User_6047 Get the test data for test case ID AT_MU_OFO_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refere id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
And User_6047 To verify the product field is displayed
Then User_6047 To verify the Sub-Product field is displayed
Then User_6047 To verify the Scheme field is displayed
Then User_6047 To verify the Nature of Finance field is displayed
Then User_6047 To verify the Currency field is displayed
Then User_6047 To verify the Pricing Indicator field is displayed
Then User_6047 To verify the Tenure field is displayed
Then User_6047 To verify the Eligible Income field is displayed
Then User_6047 To verify the Offered Amount field is displayed
Then logout from the ULS Application



@AT_MU_OFO_03
Scenario: To verify if Finance Details section is available with correct fields and button under offering

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha-offering-offerDetail
And User_6047 Get the test data for test case ID AT_MU_OFO_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refere id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
And User_6047 To verify the Amount Requested field in Finance Details section
Then User_6047 To verify the Down Payment Percentage field in Finance Details section
Then User_6047 To verify the Down Payment Amount  field in Finance Details section
Then User_6047 To verify the Additional Down payment field in Finance Details section
Then User_6047 To verify the Total Down Payment Amount field in Finance Details section
Then User_6047 To verify the Profit Amount field in Finance Details section
Then User_6047 To verify the Total Fees field in Finance Details section
Then User_6047 To verify the Total Contract Value field in Finance Details section
Then User_6047 To verify the Tenure field in Finance Details section
Then User_6047 To verify the Total Income field in Finance Details section
Then User_6047 To verify the Total Obligations field in Finance Details section
Then User_6047 To verify the Total Net Income field in Finance Details section
Then User_6047 To verify the No. of Installments field in Finance Details section
Then User_6047 To verify the Installment Frequency field in Finance Details section
Then User_6047 To verify the IRR field in Finance Details section
Then User_6047 To verify the APR field in Finance Details section
Then User_6047 To verify the Last Installment Amount field in Finance Details section
Then logout from the ULS Application

@AT_MU_OFO_05
Scenario: To verify if Eligibility Details section is available with correct fields and button under offering

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha-offering-offerDetail
And User_6047 Get the test data for test case ID AT_MU_OFO_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refere id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
Then User_6047 To verify the Eligibility Type field in Eligibility Details
Then User_6047 To verify the Eligibility Amount field in Eligibility Details
Then User_6047 To verify the Eligibility Percentage field in Eligibility Details
Then User_6047 To verify the Currency field in Eligibility Details
Then User_6047 To verify the Actual Percentage field in Eligibility Details
Then User_6047 To verify the Deviation Level field in Eligibility Details
Then logout from the ULS Application

@AT_MU_OFO_06
Scenario: To verify if all the fields are non-editable
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha-offering-offerDetail
And User_6047 Get the test data for test case ID AT_MU_OFO_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refere id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon

And User_6047 To verify the product field is non-editable
Then User_6047 To verify the Sub-Product field is non-editable
Then User_6047 To verify the Scheme field is non-editable
Then User_6047 To verify the Nature of Finance field is non-editable
#Then User_6047 To verify the Currency field is non-editable
Then User_6047 To verify the Pricing Indicator field is non-editable
Then User_6047 To verify the Tenure field is non-editable
Then User_6047 To verify the Eligible Income field is non-editable
Then User_6047 To verify the Offered Amount field is non-editable

And User_6047 To verify the Amount Requested field in Finance Details section is non-editable
Then User_6047 To verify the Down Payment Percentage field in Finance Details section is non-editable
Then User_6047 To verify the Down Payment Amount  field in Finance Details section is non-editable
Then User_6047 To verify the Additional Down payment field in Finance Details section is non-editable
Then User_6047 To verify the Total Down Payment Amount field in Finance Details section is non-editable
Then User_6047 To verify the Profit Amount field in Finance Details section is non-editable
Then User_6047 To verify the Total Fees field in Finance Details section is non-editable
Then User_6047 To verify the Total Contract Value field in Finance Details section is non-editable
Then User_6047 To verify the Tenure field in Finance Details section is non-editable
Then User_6047 To verify the Total Income field in Finance Details section is non-editable
Then User_6047 To verify the Total Obligations field in Finance Details section is non-editable
Then User_6047 To verify the Total Net Income field in Finance Details section is non-editable
Then User_6047 To verify the No. of Installments field in Finance Details section is non-editable
Then User_6047 To verify the Installment Frequency field in Finance Details section is non-editable
Then User_6047 To verify the IRR field in Finance Details section is non-editable
Then User_6047 To verify the APR field in Finance Details section is non-editable
Then User_6047 To verify the Last Installment Amount field in Finance Details section is non-editable

Then User_6047 To verify the Eligibility Type field in Eligibility Details is non-editable
Then User_6047 To verify the Eligibility Amount field in Eligibility Details is non-editable
Then User_6047 To verify the Eligibility Percentage field in Eligibility Details is non-editable
Then User_6047 To verify the Currency field in Eligibility Details is non-editable
Then User_6047 To verify the Actual Percentage field in Eligibility Details is non-editable
Then User_6047 To verify the Deviation Level field in Eligibility Details is non-editable
