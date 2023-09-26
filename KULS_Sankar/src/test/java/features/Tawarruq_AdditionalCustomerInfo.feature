Feature: To check the Tawarruq -- App Data Entry -- Additional Customer Info feature


# IDA_02_01,IDA_02_04    (IDA_02_02,IDA_02_03--> not scriptable)
@AT_IDA_03
Scenario: Customer Additional info - App Data Entry - Tawarruq

Given navigate the IJARA URL
And login with valid credentials
And User_608 get the test data for test case AT_IDA_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Add button in Customer Identification under Additional Customer Info tab

And User_608 select the ID Type in Customer Identification screen
And User_608 enter the invalid ID number in Customer Identification screen
And User_608 verify the invalid data validation in Customer Identification screen
And User_608 enter the special characters in ID number under Customer Identification screen
And User_608 verify the Special character validation in Customer Identification screen
And User_608 select the Issuing Authority in Customer Identification screen
And User_608 click the save button with mandatory field blank in Customer Identification screen
And User_608 verify the Validation error msg in Customer Identification screen

Then logout from the ijaraApplication