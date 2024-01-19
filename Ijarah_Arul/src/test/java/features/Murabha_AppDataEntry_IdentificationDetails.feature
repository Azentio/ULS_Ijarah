Feature: To check the Murabha_AppDataEntry_Identification feature
@AT_MU_AR_IDA_01
Scenario: To verify that user can able to add a record in Identification tab
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_01
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Click on Add button in Autoloan_Identification details
And User_074 Select the value in ID Type field in Murabha App data entry Identification details 
And Enter the value in ID Number field in Murabha App data entry Identification details 
And Enter the value in Issue Date field in Murabha App data entry Identification details
And Enter the value in Expiry Date field in Murabha App data entry Identification details
And User_074 Select the value in Issuing Authority field in Murabha App data entry Identification details
And User_074 Select the value in Country of Issue field in Murabha App data entry Identification details
And User_074 Click on Save icon in Autoloan_Identification details

@AT_MU_AR_IDA_02
Scenario: To verify that user can able to add a record with negative validation in Identification tab
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_02
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Click on Add button in Autoloan_Identification details
And User_074 Click on Save icon in Autoloan_Identification details
And User_074 Validate field is required popup is displayed in Autoloan_Identification details
And Enter special characters in required field in Murabha App data entry Identification details
And User_074 Validate alphanumeric characters allowed popup is displayed in Autoloan_Identification details

@AT_MU_AR_IDA_03
Scenario: To verify that user can able to update a record in Identification tab
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_03
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Click on Edit icon of existing record in Autoloan_Identification details
And User_074 Update the value in ID Type field in Murabha App data entry Identification details 
And User_074 Update the value in ID Number field in Murabha App data entry Identification details 
And User_074 Update the value in Issuing Authority field in Murabha App data entry Identification details
And User_074 Update the value in Country of Issue field in Murabha App data entry Identification details
And User_074 Click on Save icon in Autoloan_Identification details

@AT_MU_AR_IDA_04
Scenario: To verify that user can able to update a record with negative validation in Identification tab
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_04
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Click on Edit icon of existing record in Autoloan_Identification details
And User_074 Remove the value in required field in Autoloan_Identification details
And User_074 Click on Save icon in Autoloan_Identification details
And User_074 Validate field is required popup is displayed in Autoloan_Identification details
And User_074 Update special characters in required field in Murabha App data entry Identification details
And User_074 Validate alphanumeric characters allowed popup is displayed in Autoloan_Identification details

@AT_MU_AR_IDA_05
Scenario: To verify that user can able to update a status of record in Identification tab
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_05
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Click on Edit icon of existing record in Autoloan_Identification details
And User_074 Update status to Inactive in Autoloan_Identification details
And User_074 Click on Save icon in Autoloan_Identification details
And User_074 Click on Edit icon of existing record in Autoloan_Identification details
And User_074 Update status to Active in Autoloan_Identification details
And User_074 Click on Save icon in Autoloan_Identification details
And User_074 Click on Edit icon of existing record in Autoloan_Identification details
And User_074 Validate Help icon is displayed in Autoloan_Identification details
And User_074 Validate back button functionality in Autoloan_Identification details


@AT_MU_AR_IDA_06
Scenario: To verify that fields are displayed in Identification details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_06
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
And User_074 Validate ID type field is displayed in Autoloan_Identification details
And User_074 Validate ID number field is displayed in Autoloan_Identification details
And User_074 Validate Date of Issue field is displayed in Autoloan_Identification details
And User_074 Validate Place of Issue field is displayed in Autoloan_Identification details
And User_074 Validate Date of Expiry field is displayed in Autoloan_Identification details
#And User_074 Validate Primary ID flag field is displayed in Autoloan_Identification details
And User_074 Validate status field is displayed in Autoloan_Identification details


@AT_MU_AR_IDA_07
Scenario: To verify the search criteria and export functionality in Identification details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User_074 get the test data for test case AT_MU_AR_IDA_07
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details
And User click the Entitle button under inbox
And Navigate to Additional customer info tab in Tawarraq_Commodity maker
And User_074 Click on pencil icon of existing record in Customer personal Information section
#And Find the position of Identification details view list at AutoLoan
And User_074 Search the Murabha App data entry identification details record with valid data
And User_074 Search the Murabha App data entry identification details record with invalid data
And User_074 Validate Export to PDF Functionality in Autoloan identification details
And User_074 Validate Export to Excel Functionality in Autoloan identification details