Feature: To check the customer details feature

@AT_AL_OFF_CD_07
Scenario: To verify that field validation of Autoloan_Offering_customer details
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_07
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Click on eye icon of existing record in AutoLoan_Offering_customer details
And Validate that Relationship field is present in customer details
And Validate that Existing bank Relationship field is present in customer details
And Validate that Blacklisted field is present in customer details
And Validate that Politically Exposed field is present in customer details
And Validate that Remarks field is present in customer details

@AT_AL_OFF_CD_08
Scenario: To verify that field validation of Autoloan_Offering_customer details
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_08
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Click on eye icon of existing record in AutoLoan_Offering_customer details
And Validate that Phone number field is present in customer details
And Validate that Mobile number primary field is present in customer details
And Validate that Mobile number secondary field is present in customer details
And Validate that Email field is present in customer details
And Validate that Prefered customer method field is present in customer details
And Validate that Prefered time for customer field is present in customer details


@AT_AL_OFF_CD_09
Scenario: To verify that field validation of Autoloan_Offering_customer details view list
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_09
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Validate the CIF ID field is present in Customer details view list
And Validate the First name field is present in Customer details view list
And Validate the Middle name field is present in Customer details view list
And Validate the Last name field is present in Customer details view list
And Validate the Customer type field is present in Customer details view list
And Validate the Applicant type field is present in Customer details view list
And Validate the Customer rating field is present in Customer details view list
And Validate the Status field is present in Customer details view list
And Search the customer details record with valid data
And Search the customer details record with invalid data


@AT_AL_OFF_CD_10
Scenario: To verify that export functionality in Autoloan_Offering_customer details view list
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_OFF_CD_10
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Customer details
And User click the Entitle button under inbox
And User navigate to Customer details section
And Validate the export to PDF functionality in Autoloan_Offering_Customer details
And Validate the export to Excel functionality in Autoloan_Offering_Customer details

