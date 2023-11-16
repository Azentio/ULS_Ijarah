Feature: To check the Customer reference feature

@AT_IJ_NewApp_CR_04
Scenario: To verify that user can able to modify customer reference record
Given navigate the IJARA URL
And login with valid credentials for test the Ijarah New App stage
And User get the test data for test case AT_IJ_NewApp_CR_04
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for customer reference
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And Click on Pencil icon in customer personal information
And Click on Pencil icon in Reference list view
And Update status to Inactive in Customer reference page
And Click on Save icon in customer reference page
And Click on Pencil icon in Reference list view
And Update status to Active in Customer reference page
And Click on Save icon in customer reference page
And Click on Pencil icon in Reference list view
And Click on back icon in Customer reference page


@AT_IJ_NewApp_CR_05
Scenario: To verify that user can able to modify customer reference record with negative validation
Given navigate the IJARA URL
And login with valid credentials for test the Ijarah New App stage
And User get the test data for test case AT_IJ_NewApp_CR_05
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for customer reference
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And Click on Pencil icon in customer personal information
And Click on Pencil icon in Reference list view
And Update special characters in text field in customer reference page
And Remove the value in required fields in Customer reference page
And Click on Save icon and validate field is required popup in customer reference page
#And Update special characters in text field in customer reference page
#And Click on Save icon and validate warning popup in customer reference page

@AT_IJ_NewApp_CR_06
Scenario: Validate the view list of customer reference field
Given navigate the IJARA URL
And login with valid credentials for test the Ijarah New App stage
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User get the test data for test case AT_IJ_NewApp_CR_06
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for customer reference
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And Click on Pencil icon in customer personal information
And Validate Salutation field is present in Reference list view page
And Validate Name field is present in Reference list view page
And Validate Mobile number field is present in Reference list view page
And Validate Years known field is present in Reference list view page
And Validate Status field is present in Reference list view page
And find the position of customer reference list view at new app stage
And Search the Customer reference record with valid data
And Search the Customer reference record with invalid data





