Feature: To check the Employment details feature

@AT_MU_EMPD_10
Scenario: To verify that all fields are present in Employment details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User get the test data for test case AT_MU_EMPD_10
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And Click on Edit icon in Customer personal information page
And Validate that Nature of Employment field is present in Customer Employment list view list
And Validate that Employer Name field is present in Customer Employment list view list
And Validate that Employment Status field is present in Customer Employment list view list
And Validate that Status field is present in Customer Employment list view list


@AT_MU_EMPD_11
Scenario: To verify that search criteria in Employment details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User get the test data for test case AT_MU_EMPD_11
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And Click on Edit icon in Customer personal information page
And Find the position of Employment details view list at Murabha_App data entry
And Search the Customer Employment record with valid data
And Search the Customer Employment record with invalid data


@AT_MU_EMPD_12
Scenario: To verify that user can able to update the record in Employment details view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_App data entry_Employment details
And User get the test data for test case AT_MU_EMPD_12
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And Click on Edit icon in Customer personal information page
And User_608 click the Salaried Customer record Eye button under Employment List section in Customer Financials tab
#And Click on Edit icon in customer employment list page
And Update the value in Nature of Employment field
And Update the value in Company Type field
And Update the value in Profession field
And Update the value in Profession Type field
And Update the value in Statutory Authority  field
And Update the value in Employment End Date field
And Update the value in Employer Phone Extension field
And Update the value in No Of Partners field
And Update the value in Nature of Business field
And Update the value in Registered business Name field
And Update the value in Registered business Number field
And Update the value in Business Registration Date field
And Update the value in Office Premises Type field
And Update the value in Share Holder Percentage field
And Update the value in No Of Employees field
And Update the value in Remarks field
And Click on Save icon in customer employment page
