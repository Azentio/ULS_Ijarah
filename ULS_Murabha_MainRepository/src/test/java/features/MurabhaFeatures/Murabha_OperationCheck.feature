Feature: To check the Operation check feature

# test cases failed due to no  record in operation check
@AT_MU_OC_01
Scenario: To verify that all fields are present in Asset details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_OperationCheck
And User get the test data for test case AT_MU_OC_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_OperationCheck
And User click the Entitle button under inbox
And Navigate to Asset delivery section
And Validate Asset Manufacture field is present in Asset details view list
And Validate Asset Model field is present in Asset details view list
And Validate Asset Model type field is present in Asset details view list
And Validate Year of Manufacture field is present in Asset details view list
And Validate Asset price field is present in Asset details view list
And Validate Status field is present in Asset details view list
Then logout from the ULS Application

@AT_MU_OC_02
Scenario: To verify that fuctionality of search criteria in Asset details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_OperationCheck
And User get the test data for test case AT_MU_OC_02
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_OperationCheck
And User click the Entitle button under inbox
And Navigate to Asset delivery section
And Search the Asset details record with valid data
And Search the Asset details record with invalid data
Then logout from the ULS Application

@AT_MU_OC_03
Scenario: To verify that fuctionality of export in Asset details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_OperationCheck
And User get the test data for test case AT_MU_OC_03
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_OperationCheck
And User click the Entitle button under inbox
And Navigate to Asset delivery section
And User validate the export to PDF functionality in Asset details screen
And User validate the export to Excel functionality in Asset details screen
Then logout from the ULS Application

@AT_MU_OC_04
Scenario: To verify that user can able to update Asset details record
Given navigate the IJARA URL
And login with valid credentials for Murabha_OperationCheck
And User get the test data for test case AT_MU_OC_04
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_OperationCheck
And User click the Entitle button under inbox
And Navigate to Asset delivery section
And Select the existing record in Asset details view list
And Update the value in Asset delivered field in Asset details page
And Update the value in Delivery date in Asset details page
And Update the value in Remarks field in Asset details page
And Click on Save icon in Asset details page
Then logout from the ULS Application

@AT_MU_OC_05
Scenario: To verify that fields are present in asset details page
Given navigate the IJARA URL
And login with valid credentials for Murabha_OperationCheck
And User get the test data for test case AT_MU_OC_05
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_OperationCheck
And User click the Entitle button under inbox
And Navigate to Asset delivery section
And Select the existing record in Asset details view list
And Validate Asset ID field is displayed in Asset details page
And Validate Asset delivered field is displayed in Asset details page
And Validate Delivery date field is displayed in Asset details page
And Validate Remarks field is displayed in Asset details page
And Validate Help button functionality in Asset details page
Then logout from the ULS Application






