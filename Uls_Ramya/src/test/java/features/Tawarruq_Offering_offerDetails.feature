Feature: To verify the offerDetails screen in Tawarruq
@AT_TW_OFO_02
Scenario: To verify if Finance Details section is available with correct fields and button under offering

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-offering-offerDetails
And User_6047 Get the test data for test case ID AT_TW_OFO_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search  the Ref Id Under inbox
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


@AT_TW_OFO_04
Scenario: To verify if Eligibility Details section is available with correct fields and button under offering

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-offering-offerDetails
And User_6047 Get the test data for test case ID AT_TW_OFO_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search  the Ref Id Under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
Then User_6047 To verify the Eligibility Type field in Finance Details section
Then User_6047 To verify the Eligibility Amount field in Finance Details section
Then User_6047 To verify the Eligibility Percentage field in Finance Details section
Then User_6047 To verify the Currency field in Finance Details section
Then User_6047 To verify the Actual Percentage field in Finance Details section
Then User_6047 To verify the Deviation Level field in Finance Details section
Then logout from the ULS Application

@AT_TW_OFO_05
Scenario: To verify the Offer details screen

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-offering-offerDetails
And User_6047 Get the test data for test case ID AT_TW_OFO_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search  the Ref Id Under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
#And User_6047 Click the search button in facilityinfo
#And User_6047 Select the record in facilityinfo
#And User_6047 Click the Entitle button under inbox 
Then User_6047 To verify the Back Button in Offer details screen
Then User_6047 To verify the Accept Offer in Offer details screen
Then User_6047 To verify the Offer Details section in Offer details screen
Then User_6047 To verify the Finance Details section in Offer details screen
Then User_6047 To verify the Credit Risk Factor (CONV) section in Offer details screen
Then User_6047 To verify the Credit Score Details (CONV) section in Offer details screen
Then User_6047 To verify the Eligibility Details section in Offer details screen
Then User_6047 To verify the Interest Rate Structure section in Offer details screen
Then User_6047 To verify the Installments section in Offer details screen
Then User_6047 To verify the Appeal Request section in Offer details screen
Then logout from the ULS Application

#@AT_TW_OFO_06
Scenario: To verify if all the fields in Eligibility Details are non-editable 

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-offering-offerDetails
And User_6047 Get the test data for test case ID AT_TW_OFO_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search  the Ref Id Under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click edit icon
#And User_6047 Click the search button in facilityinfo
#And User_6047 Select the record in facilityinfo
#And User_6047 Click the Entitle button under inbox 
Then User_6047 To verify the Eligibility Type field is non-editable 
Then User_6047 To verify the Eligibility Amount field is non-editable
Then User_6047 To verify the Eligibility Percentage field is non-editable
Then User_6047 To verify the Currency field in is non-editable
Then User_6047 To verify the Actual Percentage field is non-editable
Then User_6047 To verify the Deviation Level field in is non-editable
Then logout from the ULS Application


