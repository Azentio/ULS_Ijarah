Feature: To check the document details functionality in App data entry screen

@AT_CR_APD_DC_01
Scenario: Validate that user can able to create document details record with valid data

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Click on Add button in Document Details section
And User_074 Select the value in Customer name field in Document details
And User_074 Select the value in Document name field in Document details
And User_074 Select the value in Required at stage field in Document details
And User_074 Select the value in Document status field in Document details
And User_074 Select the value in Mandatory optional field in Document details
And User_074 Select the value in Document category field in Document details
And User_074 Select the value in Upload date field in Document details
And User_074 Select the value in Expected receipt date field in Document details
And User_074 Select the value in Deferred stage field in Document details
And User_074 Select the value in Def approved by field in Document details
And User_074 Select the value in Change in nature approved by field in Document details
And User_074 Select the value in Document form field in Document details
And User_074 Select the value in Document quality field in Document details
And User_074 Select the value in Document reference number field in Document details
And User_074 Select the value in Document received by field in Document details
And User_074 Select the value in Location where received field in Document details
And User_074 Select the value in Rack No field in Document details   
And User_074 Select the value in Shelf No field in Document details
And User_074 Enter the value in Box No field in Document details
And User_074 Select the value in Date of Expiry field in Document details
And User_074 Enter the value in Lodgement amount field in Document details
And User_074 Enter the value in Remarks field in Document details
And User_074 Click on Save icon to save document details record in Document details


@AT_CR_APD_DC_02
Scenario: Validate that user can able to create document details record with invalid data
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Click on Add button in Document Details section
And User_074 Click on Save icon to save document details record in Document details
And User_074 Validate field is required popup is displayed in document details
And User_074 Enter special characters in any required field in document details
And User_074 Validate alphanumeric characters allowed popup is displayed in document details

@AT_CR_APD_DC_03
Scenario: Validate that user can able to update document details record with valid data
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Click on pencil icon of existing record in Document Details section
And User_074 Update the value in Customer name field in Document details
And User_074 Update the value in Document name field in Document details
And User_074 Update the value in Required at stage field in Document details
And User_074 Update the value in Document status field in Document details
And User_074 Update the value in Mandatory optional field in Document details
And User_074 Update the value in Document category field in Document details
And User_074 Update the value in Deferred stage field in Document details
And User_074 Update the value in Def approved by field in Document details
And User_074 Update the value in Change in nature approved by field in Document details
And User_074 Update the value in Document form field in Document details
And User_074 Update the value in Document quality field in Document details
And User_074 Update the value in Document reference number field in Document details
And User_074 Update the value in Document received by field in Document details
And User_074 Update the value in Location where received field in Document details
And User_074 Update the value in Rack No field in Document details   
And User_074 Update the value in Shelf No field in Document details
And User_074 Update the value in Box No field in Document details
And User_074 Update the value in Lodgement amount field in Document details
And User_074 Update the value in Remarks field in Document details
And User_074 Click on Save icon to save document details record in Document details

@AT_CR_APD_DC_04
Scenario: Validate that user can able to update document details record with invalid data
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Click on pencil icon of existing record in Document Details section
And User_074 Remove the values in any required field in Document Details section
And User_074 Click on Save icon to save document details record in Document details
And User_074 Validate field is required popup is displayed in document details
And User_074 Update special characters in any required field in document details
And User_074 Validate alphanumeric characters allowed popup is displayed in document details

@AT_CR_APD_DC_05
Scenario: Validate that fields are present in document details view list
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Validate that Document name field is present in document details view list
And User_074 Validate that Required At Stage field is present in document details view list
And User_074 Validate that Document Status field is present in document details view list
And User_074 Validate that Mandatory Optional field is present in document details view list
And User_074 Validate that Document Category field is present in document details view list
And User_074 Validate that DMS Upload Status field is present in document details view list

@AT_CR_APD_DC_06
Scenario: Validate the functionality of search criteria in document details view list
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Search the document details record with valid data
And User_074 Search the document details record with invalid data
@AT_CR_APD_DC_07
Scenario: Validate the export functionality in document details view list
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CR_APD_DC_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_074 search the Reference ID for Consumer durable_Document details
And User_608 click the Entitle button under inbox
And User_074 Navigate to Document Details section for Consumer Durable
And User_074 Validate the Export to PDF functionality in document details
And User_074 Validate the Export to Excel functionality in document details