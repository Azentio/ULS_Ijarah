Feature: To check the Contract Signing Stage - Repayment Mode screen

@AT_CS_RDC_01
Scenario: To verify the availability of Repayment mode in Contract signing stage

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CS_RDC_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Repayment Mode tab
And User_608 click the View button under Repayment Mode tab
And User_608 verify Back button available in Repayment Mode screen
And User_608 verify Help button available in Repayment Mode screen
And User_608 verify Repayment Mode field available in Repayment Mode screen
And User_608 verify Account Holder Name field available in Repayment Mode screen
And User_608 verify Account Type field available in Repayment Mode screen
And User_608 verify Account Number field available in Repayment Mode screen
And User_608 verify Account Currency field available in Repayment Mode screen
And User_608 verify Bank Name field available in Repayment Mode screen
And User_608 verify Branch Name field available in Repayment Mode screen
And User_608 verify ECS Code field available in Repayment Mode screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Repayment Mode screen at Ijarah Contract Signing stage


@AT_CS_RDC_02
Scenario: To verify Repayment mode records Values display only at Contract signing stage.

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CS_RDC_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Repayment Mode tab
And User_608 verify Delete button should be available in Repayment Mode screen
And User_608 click the View button under Repayment Mode tab
And User_608 verify Repayment Mode value should be Display only in Repayment Mode screen
And User_608 verify Account Holder Name value should be Display only in Repayment Mode screen
And User_608 verify Account Type value should be Display only in Repayment Mode screen
And User_608 verify Account Number value should be Display only in Repayment Mode screen
And User_608 verify Account Currency value should be Display only in Repayment Mode screen
And User_608 verify Bank Name value should be Display only in Repayment Mode screen
And User_608 verify Branch Name value should be Display only in Repayment Mode screen
And User_608 verify ECS Code value should be Display only in Repayment Mode screen
And User_608 verify Status field should be Display in Repayment Mode screen
And User_608 to verify the functionality of Help button under Customer Identification screen
And User_608 post clicking on Help button, system should display the description of all the fields in details
Then logout from the ijaraApplication
And User_608 invoke soft assert in Repayment Mode screen at Ijarah Contract Signing stage