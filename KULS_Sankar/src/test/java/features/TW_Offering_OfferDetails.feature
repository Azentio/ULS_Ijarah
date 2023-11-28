Feature: To verify the Tawarruq --> Offering --> Offer Details screen

@AT_TW_OFO_12
Scenario: To verify the values displayed under Eligibility Details section & functionality of accept offer button

Given navigate the IJARA URL
And login with valid credentials-Tawarruq Offering stage
And User_608 get the test data for test case AT_TW_OFO_12
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
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