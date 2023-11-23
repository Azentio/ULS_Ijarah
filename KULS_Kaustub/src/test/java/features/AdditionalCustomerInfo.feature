Feature: To verify while modification, when user keep any mandatory field blank and click on save button

@AT_IDA_01
Scenario: To verify any mandatory field blank and Save the data
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_CAI_01
And User click the module name dropdown in ULS application for Additional Customer Info at New Application Stage
And User select the module name as LOS1 in ULS application for Additional Customer Info at New Application Stage
And User click the Mail box in ULS application for Additional Customer Info at New Application Stage
And User click the Search button under inbox for Additional Customer Info at New Application Stage
And User search the Ref id under inbox for Additional Customer Info at New Application Stage
And User click the Entitle button under inbox for Additional Customer Info at New Application Stage
And User click the Additional Customer Info Tab
And User click on the Add button of Customer Personal Information
And User click on the Add button of Customer Identification
And User keep any mandatory field blank and click on save btn
And user verify the popup post clicking save btn
