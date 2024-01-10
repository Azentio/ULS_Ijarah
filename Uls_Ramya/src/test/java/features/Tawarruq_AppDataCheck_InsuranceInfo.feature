Feature: To verify the tab Tawarruq - AppDataCheck - Insurance Info
@AT_TW_INS_01

Scenario: Insurance Info screen should get open with all valid fields 

Given Navigate the IJARA URL
And User_6047 Login With valid credentials -Tawarruq - AppDataCheck - InsuranceIfo 
And User_6047 Get the test data for test case ID AT_TW_INS_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refe id under Inbox
And User_6047 Click the Entitle button under inbox  
And User_6047 click insuranceInfo tab
And User_6047 click EyeButton
Then User_6047 To verify the back button field in Insurance Info screen
Then User_6047 To verify the Insurance Quatation Id field in Insurance Info screen
Then User_6047 To verify the Insurance Year field in Insurance Info screen
Then User_6047 To verify the Deprication field in Insurance Info screen
Then User_6047 To verify the Asset Price field in Insurance Info screen
Then User_6047 To verify the Rate Per Asset field in Insurance Info screen
Then User_6047 To verify the Minium Insurance Premium field in Insurance Info screen
Then User_6047 To verify the Base Insurance Premium field in Insurance Info screen
Then User_6047 To verify the VAT Premium field in Insurance Info screen
Then User_6047 To verify the NET Premium field in Insurance Info screen
And User_6047 to click the back button
And User_6047 verify the functionality of back button in InsuranceInfo
Then logout from the ULS Application
