Feature: To check the Additional Customer Info feature

# IDA_02_01,IDA_02_04    (IDA_02_02,IDA_02_03--> not scriptable)
@AT_IDA_03
Scenario: Customer Additional info - App Data -Entry

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_IDA_03
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Additional Customer Info tab
And User click the Add button in Customer Personal Info section under Additional Customer Info tab
And User click the Add button in Customer Identification under Additional Customer Info tab

And User select the ID Type in Customer Identification screen
And User enter the invalid ID number in Customer Identification screen
And User verify the invalid data validation in Customer Identification screen
And User enter the special characters in ID number under Customer Identification screen
And User verify the Special character validation in Customer Identification screen
And User select the Issuing Authority in Customer Identification screen
And User click the save button with mandatory field blank in Customer Identification screen
And User verify the Validation error msg in Customer Identification screen



Then logout from the ijaraApplication





 #Customer Personal Information 
  #Customer Identification 