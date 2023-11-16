Feature: To check the Tawarruq --> App Data Entry stage --> Document details screen


@AT_TW_CD_01_01
Scenario: Personal Details screen should get open with Customer Information screen and below mentioned Fields

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_AD_DOC_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox




Then logout from the ijaraApplication