Feature: To check the customer personal details feature

@AT_M_CDC_01
Scenario: To verify that all fields are present in customer personal details page
Given navigate the IJARA URL
And login with valid credentials
#And User get the test data for test case AT_DOC_001
And User get the test data for test case AT_M_CDC_01
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Customer details section
And Validate Application type field is displayed in customer personal details page
And Validate customer type field is displayed in customer personal details page
And Validate title field is displayed in customer personal details page
And Validate first name field is displayed in customer personal details page
And Validate middle name field is displayed in customer personal details page
And Validate last name field is displayed in customer personal details page
And Validate first name arabic field is displayed in customer personal details page
And Validate middle name arabic field is displayed in customer personal details page
And Validate last name arabic field is displayed in customer personal details page
And Validate date of birth field is displayed in customer personal details page
And Validate age field is displayed in customer personal details page
And Validate gender field is displayed in customer personal details page
And Validate education level field is displayed in customer personal details page
And Validate maritail status field is displayed in customer personal details page
And Validate nationality field is displayed in customer personal details page
And Validate residential status field is displayed in customer personal details page
And Validate language field is displayed in customer personal details page
And Validate no of dependents field is displayed in customer personal details page
And Validate client category field is displayed in customer personal details page
And Validate blacklisted field is displayed in customer personal details page
And Validate remarks field is displayed in customer personal details page

@AT_M_CDC_02
Scenario: To verify that existing records present in customer personal details page
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_M_CDC_02
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Customer details section
And Validate that existing records are present in customer personal details page


@AT_M_CDC_03
Scenario: To verify that fields present in customer personal details page view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_M_CDC_03
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Customer details section
And Validate First name field is displayed in customer personal details view list
And Validate Middle name field is displayed in customer personal details view list
And Validate Last name field is displayed in customer personal details view list
And Validate Family name field is displayed in customer personal details view list
And Validate Customer type field is displayed in customer personal details view list
And Validate Applicant type field is displayed in customer personal details view list
And Validate Status field is displayed in customer personal details view list


@AT_M_CDC_04
Scenario: To verify that fields present in customer personal details page view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_M_CDC_04
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Customer details section
And Search the customer personal details record with valid details
And Search the customer personal details record with invalid details





