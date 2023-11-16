Feature: To check the Document details feature

@AT_MU_ADC_01
Scenario: To verify that all fields are present in Document Details
#This test case also cover the functionality of AT_DOC_003
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_DOC_001
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Document details section
And Click on Add icon in Document details section
And Select the value in Customer name field
And Select the value in Document name field
And Select the value in Required at stage field
And Select the value in Document status field
And Select the value in Mandatory optional field
And Select the value in Document category field
And Select the value in Upload date field
And Select the value in Expected receipt date field
And Select the value in Deferred stage field
And Select the value in Def approved by field
And Select the value in Change in nature approved by field
And Select the value in Document form field
And Select the value in Document quality field
And Select the value in Document reference number field
And Select the value in Document received by field
And Select the value in Location where received field
And Select the value in Rack No field  
And Select the value in Shelf No field
And Enter the value in Box No field
And Select the value in Date of Expiry field
And Enter the value in Lodgement amount field
And Enter the value in Remarks field
And Click on Save icon to save document details record

@AT_MU_ADC_02
Scenario: To verify that existing document details records are present in view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_DOC_002
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Document details section
And Validate that existing records are present in document details view list

@AT_MU_ADC_03
Scenario: Validation of document details back, Help, Upload option
#This test case also cover the functionality of AT_DOC_005
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_DOC_004
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Document details section
And Click on Add icon in Document details section
And Validate the Help button is present in document details page
And Click on Back Icon in document section section
And Click on Pencil icon of existing record
And Validate that upload button is displayed in document details
And Validate that View document button is present in document details


@AT_MU_ADC_04
Scenario: Validation of document details View list fields and export functionality
#This test case also cover the functionality of AT_DOC_007, AT_DOC_008, AT_DOC_009
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_DOC_006
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for document details
And User click the Entitle button under inbox
And Navigate to Document details section
And Validate the fields are present in document details view list
And Click on Search icon in Document details
And Search the document details value with valid data
And Click on Search icon in Document details
And Search the document details value with Invalid data
#And Click on Export dropdown in document details
#And Validate the export to excel functionality of document details
#And Validate the export to PDF functionality of document details


@AT_MU_ADC_05
Scenario: To verify that user can able to modify Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen_614
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

@AT_MU_ADC_06
Scenario: To verify that user can able to modify Identification details status
Given navigate the IJARA URL
And login with valid credentials to test the tawrraq new app screen_614
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

@AT_MU_ADC_07
Scenario: To verify all fields in view list of  Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen_614
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


@AT_MU_ADC_08
Scenario: To verify that user can able to modify Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen_614
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

@AT_MU_ADC_09
Scenario: To verify all fields in view list of  Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen_614
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

@AT_MU_INC_09
Scenario: To verify that user can able to modify Identification details status
Given navigate the IJARA URL
And login with valid credentials to test the tawrraq new app screen_614
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

@AT_MU_INC_10
Scenario: To verify all fields in view list of  Identification details
Given navigate the IJARA URL
#And login with valid credentials
And login with valid credentials to test the tawrraq new app screen_614
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

