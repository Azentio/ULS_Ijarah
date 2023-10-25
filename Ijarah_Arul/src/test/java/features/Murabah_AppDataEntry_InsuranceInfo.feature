Feature: To check the InsuranceInfo feature
@AT_MU_INS_01
Scenario: To verify that all fields are present in Murabah_Insurance info
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INS_MU_01
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Insurance info
And User click the Entitle button under inbox
And Navigate to Insurance Info section
And Click on Add icon in Insurance info section
And Validate that Insurance quatation id field is displayed in Insurance info
And Validate that Insurance Year field is displayed in Insurance info
And Validate that Depreciation field is displayed in Insurance info
And Validate that Asset price field is displayed in Insurance info
And Validate that Rate per Asset field is displayed in Insurance info
And Validate that Minimum Insurance premium field is displayed in Insurance info
And Validate that Base Insurance premium field is displayed in Insurance info
And Validate that VAT Premium field is displayed in Insurance info
And Validate that Net Premium field is displayed in Insurance info


@AT_MU_INS_02
Scenario: To verify that user can able to add insurance details in Murabah_Insurance info
#This test case also covers the functionality of AT_MU_INS_03
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INS_MU_02
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Insurance info
And User click the Entitle button under inbox
And Navigate to Insurance Info section
And Click on Add icon in Insurance info section
And Select the value in Insurance quatation id field in Insurance info
And Select the value in Insurance Year field in Insurance info
And Enter the value in Depreciation field in Insurance info
And Enter the value in Asset price field in Insurance info
And Enter the value in Rate per Asset field in Insurance info
And Enter the value in Minimum Insurance premium field in Insurance info
And Enter the value in Base Insurance premium field in Insurance info
And Enter the value in VAT Premium field in Insurance info
And Enter the value in Net Premium field in Insurance info
And Click on Save icon in Insurance info


@AT_MU_INS_04
Scenario: To validate all fields are present in Insurance info 
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INS_MU_04
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Insurance info
And User click the Entitle button under inbox
And Navigate to Insurance Info section
And Validate that Insurance year field is displayed in Insurance info view list
And Validate that Depreciation field is displayed in Insurance info view list
And Validate that Asset price field is displayed in Insurance info view list
And Validate that Base Insurance premium field is displayed in Insurance info view list
And Validate that VAT Premium field is displayed in Insurance info view list
And Validate that Net Premium field is displayed in Insurance info view list
And Validate that Status field is displayed in Insurance info view list

