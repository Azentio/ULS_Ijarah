Feature: To check the QuotationInfo feature
#This test case also cover the functionality of AT_MU_QIA_002
@AT_MU_QIA_001
Scenario: To verify that user can able to add quotation in Murabah_Quotation Info
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_QIA_001
#And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Quotation info
And User click the Entitle button under inbox
And Navigate to Quotation Info section
And click on add button in quotation info section at app data entry stage
And Enter the value in Deductible amount field in Quotation info
And Select the value in Insurance company Bp Id field in Quotation info
And Enter the value in Gross premium amount field in Quotation info
And Enter the value in VAT on Gross premium amount field in Quotation info
And Enter the value in Net Gross premium amount field in Quotation info
And Enter the value in Base premium amount field in Quotation info
And Enter the value in VAT on Base premium amount field in Quotation info
And Enter the value in Net base premium amount field in Quotation info
And Enter the value in Total discount amount field in Quotation info
And Enter the value in Expiry date field in Quotation info
And Enter the value in Quotation reference no field in Quotation info
And Click on Save icon in Quotation info

@AT_MU_QIA_003
Scenario: To verify that user can able to update quotation in Murabah_Quotation Info
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_QIA_003
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Quotation info
And User click the Entitle button under inbox
And Navigate to Quotation Info section
#And Click on Add icon in Insurance info section
And Click on Pencil icon of existing record in Quotation info
And Update the value in Deductible amount field in Quotation info
And Update the value in Insurance company Bp Id field in Quotation info
And Update the value in Gross premium amount field in Quotation info
And Update the value in VAT on Gross premium amount field in Quotation info
And Update the value in Net Gross premium amount field in Quotation info
And Update the value in Base premium amount field in Quotation info
And Update the value in VAT on Base premium amount field in Quotation info
And Update the value in Net base premium amount field in Quotation info
And Update the value in Total discount amount field in Quotation info
And Update the value in Expiry date field in Quotation info
And Update the value in Quotation reference no field in Quotation info
And Click on Save icon in Quotation info

@AT_MU_QIA_004
Scenario: Validate the quotation Info view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_MU_QIA_004
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Quotation info
And User click the Entitle button under inbox
And Navigate to Quotation Info section
And Validate Base premium amount field is present in Quotation info view list
And Validate VAT on Base premium amount field is present in Quotation info view list
And Validate NET Base premium amount field is present in Quotation info view list
And Validate Quotation reference no field is present in Quotation info view list
And Validate Status field is present in Quotation info view list
And Search the quotation info record with valid data
And Search the quotation info record with invalid data
And Validate Export to PDF functionality in Quotation info
And Validate Export to excel functionality in Quotation info







