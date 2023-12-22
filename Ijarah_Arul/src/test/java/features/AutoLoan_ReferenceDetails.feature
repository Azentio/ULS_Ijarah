Feature: To check the Autoloan_Repayment mode feature
@AT_AL_APPDATAENTRY_REFDETAILS_03
Scenario: To verify that user can able to add employment details record in Autoloan_App data entry
Given navigate the IJARA URL
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Click on Add icon in Customer Employment list section
And Select the value in Nature of Employment dropdown in Autoloan_Employment details.
And Select the value in Company type dropdown in Autoloan_Employment details
And Select the value in Profession dropdown in Autoloan_Employment details
And Select the value in Profession type dropdown in Autoloan_Employment details
And Select the value in Statutory Authority dropdown in Autoloan_Employment details
And Select the value in Employment End date field in Autoloan_Employment details
And Enter the value in Employer phone extension field in Autoloan_Employment details
And Enter the value in No of partners field in Autoloan_Employment details
And Select the value in Nature of Business field in Autoloan_Employment details
And Enter the value in Registered business name field in Autoloan_Employment details
And Enter the value in Registered business number field in Autoloan_Employment details
And Enter the value in Business Registration date field in Autoloan_Employment details
And Select the value in Office premises type field in Autoloan_Employment details
And Enter the value in Share holder percentage field in Autoloan_Employment details
And Enter the value in No of Employees field in Autoloan_Employment details
And Enter the value in Reamrks field in Autoloan_Employment details
And Click on Save icon in Autoloan_Employment details

@AT_AL_APPDATAENTRY_REFDETAILS_04
Scenario: To verify that user can able to add employment details record with negative validation in Autoloan_App data entry
Given navigate the IJARA URL
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Click on Add icon in Customer Employment list section
And Click on Save icon in Autoloan_Employment details
And Validate Field is required popup is displayed in Autoloan_Employment details
And Enter special characters in required field in Autoloan_Employment details
And Validate alpha numeric characters allowed popup is displayed in Autoloan_Employment details

@AT_AL_APPDATAENTRY_REFDETAILS_05
Scenario: To verify that fields are present in Autoloan_Employment details view list
#This test case also covers the functionality of AT_AL_APPDATAENTRY_REFDETAILS_06
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Validate Nature of employment field is present in Autoloan_Employment details view list
And Validate Employer name field is present in Autoloan_Employment details view list
And Validate Employment status field is present in Autoloan_Employment details view list
And Validate Status is present in Autoloan_Employment details view list
And Click on Add icon in Customer Employment list section
And Click on Back icon in Customer Employment list section

@AT_AL_APPDATAENTRY_REFDETAILS_07
Scenario: To verify that export functionality in Autoloan_Employment details view list
#This test case also covers the functionality of AT_AL_APPDATAENTRY_REFDETAILS_06
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Validate the export to PDF functionality in Autoloan_Employment details
And Validate the export to Excel functionality in Autoloan_Employment details


@AT_AL_APPDATAENTRY_REFDETAILS_08
Scenario: To verify that search criteria in Autoloan_Employment details view list
#This test case also covers the functionality of AT_AL_APPDATAENTRY_REFDETAILS_06
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Search the Autoloan_Employment details record with valid data
And Search the Autoloan_Employment details record with invalid data

@AT_AL_APPDATAENTRY_REFDETAILS_09
Scenario: To verify that user can able to update the record in Autoloan_Employment details view list
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Click on Edit icon of first record in Autoloan_Employment details
And Update the value in Nature of Employment dropdown in Autoloan_Employment details.
And Update the value in Company type dropdown in Autoloan_Employment details
And Update the value in Profession dropdown in Autoloan_Employment details
And Update the value in Profession type dropdown in Autoloan_Employment details
And Update the value in Statutory Authority dropdown in Autoloan_Employment details
And Update the value in Employment End date field in Autoloan_Employment details
And Update the value in Employer phone extension field in Autoloan_Employment details
And Update the value in No of partners field in Autoloan_Employment details
And Update the value in Nature of Business field in Autoloan_Employment details
And Update the value in Registered business name field in Autoloan_Employment details
And Update the value in Registered business number field in Autoloan_Employment details
And Update the value in Business Registration date field in Autoloan_Employment details
And Update the value in Office premises type field in Autoloan_Employment details
And Update the value in Share holder percentage field in Autoloan_Employment details
And Update the value in No of Employees field in Autoloan_Employment details
And Update the value in Reamrks field in Autoloan_Employment details
And Click on Save icon in Autoloan_Employment details


@AT_AL_APPDATAENTRY_REFDETAILS_10
Scenario: To verify that user can able to update the record with negative validation in Autoloan_Employment details view list
And login with valid credentials for Autoloan_Identification
And User_074 get the test data for test case AT_AL_IDA_01
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User_074 search the Ref id under inbox for Autoloan_Identification details
And User click the Entitle button under inbox
And User navigate to Customer Financials tab in Autoloan_Employment details
And Click on pencil icon of first record in Customer Personal Information
And Remove the values in required field in Autoloan_Employment details
And Click on Save icon in Autoloan_Employment details
And Validate Field is required popup is displayed in Autoloan_Employment details
And Update special characters in required field in Autoloan_Employment details
And Validate alpha numeric characters allowed popup is displayed in Autoloan_Employment details


