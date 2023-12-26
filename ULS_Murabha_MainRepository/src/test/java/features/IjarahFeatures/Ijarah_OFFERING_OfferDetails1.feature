Feature: To check the Offer details feature

@AT_OFL_08
Scenario: To verify that all fields are present in Eligibility details section
Given navigate the IJARA URL
And login with valid credentials-Offering
And User get the test data for test case AT_OFL_08
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User_608 click the Entitle button under inbox
#And Navigate to Document details section
And Click on Pencil icon of existing record in offer details
And Validate the Eligibility type field is displayed in Eligibility details section
And Validate the Eligibility amount field is displayed in Eligibility details section
And Validate the Eligibility percentage field is displayed in Eligibility details section
And Validate the Currency field is displayed in Eligibility details section
And Validate the Actual Percentage field is displayed in Eligibility details section 
And Validate the Deviation level field is displayed in Eligibility details section


@AT_OFL_09
Scenario: To verify that all fields are present in Interest rate Structure section
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_09
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Validate the Period field is displayed in Interest rate structure section
And Validate the Rate definition field is displayed in Interest rate structure section
And Validate the Effective Rate field is displayed in Interest rate structure section
And Validate the Base Rate is displayed in Interest rate structure section
And Validate the Spread rate field is displayed in Interest rate structure section
And Validate the Cap rate is displayed in Interest rate structure section
And Validate the Floor rate field is displayed in Interest rate structure section
And Validate the RBP Adjuster field is displayed in Interest rate structure section
And Validate the Penalty rate is displayed in Interest rate structure section
And Validate the Penalty Fee field is displayed in Interest rate structure section


@AT_OFL_10
Scenario: To verify that all fields are present in Installment section
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_10
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Validate the Instalment Period field is displayed in Interest rate structure section
And Validate the Installment Amount field is displayed in Interest rate structure section
And Validate the Accept offer button is present in Offering page


@AT_OFL_11
Scenario: To verify that all fields are present in Installment section
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_11
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Click on Accept offer button in offering page

@AT_OFL_12
Scenario: To verify that all fields are present in Appeal request section
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_12
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Validate the Original requested amount field is displayed in Appeal request section
And Validate the Original requested tenure field is displayed in Appeal request section
And Validate the New requested amount field in Appeal request section
And Validate the New requested tenure field in Appeal request section


@AT_OFL_13
Scenario: To verify that all fields are present in Appeal request section
#This test case also cover the functionality of AT_OFL_14
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_13
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Validate the Original requested amount field is displayed in Appeal request section
And Validate the Original requested tenure field is displayed in Appeal request section
And Enter the value in New requested amount field in Appeal request section
And Enter the value in New requested tenure field in Appeal request section
And Click on Save button in Appeal request section
And Click on Appeal button in Appeal request section


@AT_OFL_15
Scenario: To verify that all links are present in Appeal request section
Given navigate the IJARA URL
And login with valid credentials for ijara offer details
And User get the test data for test case AT_OFL_15
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for offer details
And User click the Entitle button under inbox
And Click on Pencil icon of existing record in offer details
And Validate the Recommendations sanction Conditions link is displayed in Appeal request section
And Validate the Approval History link is displayed in Appeal request section






