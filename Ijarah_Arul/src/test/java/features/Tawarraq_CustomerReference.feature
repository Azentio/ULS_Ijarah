Feature: To check the Tawarraq_Customer Reference feature
@AT_TW_CR_01

Scenario: To verify that user can able to create Customer reference record
Given navigate the IJARA URL
And login with valid credentials for Tawarraq_CustomerReference
And User get the test data for test case AT_TW_CR_01
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Tawarraq_Customer Reference
And User click the Entitle button under inbox
