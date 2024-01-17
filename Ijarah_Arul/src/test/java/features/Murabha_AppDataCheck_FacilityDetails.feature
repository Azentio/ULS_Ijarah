Feature: To check the Facility details feature

@AT_M_ADC_FD_01
Scenario: To verify that all fields are present in Facility page
Given navigate the IJARA URL
And login with valid credentials for Murabha_customer personal details
#And User get the test data for test case AT_DOC_001
And User get the test data for test case AT_M_ADC_FD_01
And User click the Mail box in ULS application
And User click the Search button under inbox
#And User search the Ref id under inbox for document details
And User search the Ref id under inbox for Murabha_AppdataCheck_FacilityDetails
And User click the Entitle button under inbox
And Navigate to Facility Info tab
And Click on view icon of existing record in Murabha_Facility list
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


@AT_M_ADC_FD_02
Scenario: To verify that all fields are present in Facility page view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_customer personal details
#And User get the test data for test case AT_DOC_001
And User get the test data for test case AT_M_ADC_FD_02
And User click the Mail box in ULS application
And User click the Search button under inbox
#And User search the Ref id under inbox for document details
And User search the Ref id under inbox for Murabha_AppdataCheck_FacilityDetails
And User click the Entitle button under inbox
And Navigate to Facility Info tab
And Validate Classification field is present in Murabha_Facility details view list
And Validate Product field is present in Murabha_Facility details view list
And Validate Tenure field is present in Murabha_Facility details view list
And Validate Requested amount field is present in Murabha_Facility details view list
And Validate Status field is present in Murabha_Facility details view list



@AT_M_ADC_FD_03
Scenario: To verify that search criteria and export functionality of Facility page view list
Given navigate the IJARA URL
And login with valid credentials for Murabha_customer personal details
#And User get the test data for test case AT_DOC_001
And User get the test data for test case AT_M_ADC_FD_03
And User click the Mail box in ULS application
And User click the Search button under inbox
#And User search the Ref id under inbox for document details
And User search the Ref id under inbox for Murabha_AppdataCheck_FacilityDetails
And User click the Entitle button under inbox
And Navigate to Facility Info tab
And Search the Murabha_Facility details record with valid data
And Search the Murabha_Facility details record with invalid data
And Validate the export to PDF functionality in Murabha_Facility details
And Validate the export to Excel functionality in Murabha_Facility details
