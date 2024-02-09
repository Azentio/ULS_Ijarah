Feature: To check the Autoloan_ManualBank feature
@AT_AL_MB_01
Scenario: To verify that fields are present in Auto loan_Manual bank view list 
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Validate that Customer name field is displayed in Autoloan_Manual bank view list
And Validate that Account number field is displayed in Autoloan_Manual bank view list
And Validate that Bank code field is displayed in Autoloan_Manual bank view list
And Validate that Branch code field is displayed in Autoloan_Manual bank view list

@AT_AL_MB_02
Scenario: To verify that search criteria and export functionality in Auto loan_Manual bank view list 
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Search the Auto loan manual bank record with valid data
And Search the Auto loan manual bank record with invalid data
And Validate the export to PDF functionality in Auto loan manual bank
And Validate the export to Excel functionality in Auto loan manual bank

@AT_AL_MB_03
Scenario: To verify that user can able to add a record in loan_Manual bank
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Click on Add icon in Autoloan_Manual bank page
And Enter the value in Account holder name field in Autoloan_Manual bank
And Enter the value in Bank code field in Autoloan_Manual bank
And Enter the value in Account branch field in Autoloan_Manual bank
And Select the value in Bank Account type field in Autoloan_Manual bank
And Enter the value in Bank Account number field in Autoloan_Manual bank
And Select the value in Currency code field in Autoloan_Manual bank
And Click on Save icon in Autoloan_Manual bank

@AT_AL_MB_04
Scenario: To verify that user can able to add a record with negative validation in loan_Manual bank
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Click on Add icon in Autoloan_Manual bank page
And Click on Save icon in Autoloan_Manual bank
And Validate Field is required popup is displayed in Autoloan_Manual bank
And Enter special characters in text field in Autoloan_Manual bank
And Validate alphanumeric characters allowed popup is displayed in Autoloan_Manual bank


@AT_AL_MB_05
Scenario: To verify that user can able to update a record in loan_Manual bank
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Click on pencil icon of existing record in Autoloan_Manual bank
And Update the value in Account holder name field in Autoloan_Manual bank
And Update the value in Bank code field in Autoloan_Manual bank
And Update the value in Account branch field in Autoloan_Manual bank
And Update the value in Bank Account type field in Autoloan_Manual bank
And Update the value in Bank Account number field in Autoloan_Manual bank
And Update the value in Currency code field in Autoloan_Manual bank
And Click on Save icon in Autoloan_Manual bank


@AT_AL_MB_06
Scenario: To verify that user can able to update a record with negative validation in loan_Manual bank
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Click on pencil icon of existing record in Autoloan_Manual bank
And Remove the value in required field in Autoloan_Manual bank
And Click on Save icon in Autoloan_Manual bank
And Validate Field is required popup is displayed in Autoloan_Manual bank
And Update special characters in text field in Autoloan_Manual bank
And Validate alphanumeric characters allowed popup is displayed in Autoloan_Manual bank

@AT_AL_MB_07
Scenario: To verify that user can able to update a status of record in Autoloan_Manual bank
Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_074 get the test data for test case AT_AL_MB_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Manual bank
And User click the Entitle button under inbox
And Navigate to Manual bank tab in Autoloan_Manual bank
And Click on pencil icon of existing record in Autoloan_Manual bank
And Update the status to Inactive in Autoloan_Manual bank
And Click on Save icon in Autoloan_Manual bank
And Click on pencil icon of existing record in Autoloan_Manual bank
And Update the status to Active in Autoloan_Manual bank
And Click on Save icon in Autoloan_Manual bank
And Click on pencil icon of existing record in Autoloan_Manual bank
And Validate View summary functionality in Autoloan_Manual bank











