Feature: To check the Facility details feature

@AT_M_FD_01
Scenario: Validate that fields are present in facility details page 
Given navigate the MURABHA URL
And login with valid credentials-Murabaha App Data Entry
And User get the test data for test case AT_M_FD_01
And User_607 click the module in select field
And User_607 click the LOS in select field
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_Facility details
And User click the Entitle button under inbox
And Navigate to Facility Info tab
And Click on Add button in Facility Info tab
And Validate Classification field is present in Facility details page
And Validate Product field is present in Facility details page
And Validate Scheme field is present in Facility details page
And Validate Program Code field is present in Facility details page
And Validate Facility type field is present in Facility details page
And Validate Servicing branch field is present in Facility details page
And Validate Pricing interest indicator field is present in Facility details page
And Validate Declared property asset value field is present in Facility details page
And Validate Declared down payment amount field is present in Facility details page
And Validate Requested Amount field is present in Facility details page
And Validate Currency field is present in Facility details page
And Validate Loan tenure field is present in Facility details page
And Validate Moratorium Period field is present in Facility details page
And Validate Future Rental flag field is present in Facility details page

@AT_M_FD_02
Scenario: Validate that user can able to add a record in facility details
Given navigate the MURABHA URL
And login with valid credentials-Murabaha App Data Entry
And User get the test data for test case AT_M_FD_02
And User_607 click the module in select field
And User_607 click the LOS in select field
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_Facility details
And User click the Entitle button under inbox
And Navigate to Facility Info tab
And Click on Add button in Facility Info tab
And Select the value in Classification field in facility details
And Select the value in Product field in facility details
And Select the value in Scheme field in facility details
And Select the value in Program code field in facility details
And Select the value in Facility type field in facility details
And Select the value in Servicing Branch field in facility details
And Select the value in Pricing interest indicator field in facility details
And Enter the value in Declared property asset value field in facility details
And Enter the value in Declared down payment amount field in facility details
And Enter the value in Requested amount field in facility details
And Select the value in Currency field in facility details
And Enter the value in Loan tenure field in facility details
And Enter the value in Moratorium peroid field in facility details
And Select the value in Future rental flag field in facility details
And Click on Save icon in facility details


@AT_M_FD_03
Scenario: Validate that user can able to submit the record in facility details
Given navigate the MURABHA URL
And login with valid credentials-Murabaha App Data Entry 
And User get the test data for test case AT_M_FD_03
And User_607 click the module in select field
And User_607 click the LOS in select field
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_Facility details
And User click the Entitle button under inbox
And Click on Submit button for Facility details
And Click on Ok button in submit confirmation popup for Facility details
And Click on Submit button in submit confirmation popup for Facility details


