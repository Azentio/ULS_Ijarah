Feature: To check the Identification details feature

@AT_IDA_04
Scenario: To verify that user can able to modify Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen
And User get the test data for test case AT_IDA_04
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And click on Edit icon of existing record in Additional customer info
And Click on Pencil icon in Customer identification section
And Update the value in ID type field in identification section
And Update the value in ID Number field in identification section
And Update the value in Issuing Authority field in identification section 
And Update the value in Country of Issue field in identification section
And Click on Save icon in identification section

@AT_IDA_05
Scenario: To verify that user can able to modify Identification details status
Given navigate the IJARA URL
And login with valid credentials to test the tawrraq new app screen
#And login with valid credentials
And User get the test data for test case AT_IDA_05
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And click on Edit icon of existing record in Additional customer info
And Click on Pencil icon in Customer identification section
And Update the status to Inactive in Identification section
And Click on Save icon in identification section
And Click on Pencil icon in Customer identification section
And Update the status to Active in Identification section
And Click on Save icon in identification section
And Click on View icon in Customer identification section
And Click on View summary button in identification section
And Validate that user can navigate to View summary page

@AT_IDA_06
Scenario: To verify all fields in view list of  Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen
And User get the test data for test case AT_IDA_06
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And click on Edit icon of existing record in Additional customer info
And Validate Id type field is displayed in Identification view list
And Validate Id Number field is displayed in Identification view list
And Validate Date of Issue field is displayed in Identification view list
And Validate Date of Expiry field is displayed in Identification view list
And Validate Place of issue field is displayed in Identification view list
And Validate status field is displayed in Identification view list

@AT_IDA_07
Scenario: To verify search criteria in view list of  Identification details
Given navigate the IJARA URL
And login with valid credentials to test the tawrraq new app screen
And User get the test data for test case AT_IDA_07
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab
And click on Edit icon of existing record in Additional customer info
And Search the record with valid data in Identification details
And Search the record with invalid data in Identification details



