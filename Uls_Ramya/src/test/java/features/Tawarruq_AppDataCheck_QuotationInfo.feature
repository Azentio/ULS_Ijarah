Feature: To verify the tab Tawarruq - AppDataCheck - Quotation Info
@AT_TW_QI_01 


Scenario: Quotation Info screen should get open with all valid fields 

Given Navigate the IJARA URL
And User_6047 Login With valid credentials -Tawarruq - AppDataCheck - Quotation Info 
And User_6047 Get the test data for test case ID AT_TW_QI_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Referen id under Inbox
And User_6047 Click the Entitle button under inbox  
And User_6047 click Quotation Info tab
And User_6047 click EyeButton
And User_6047 to verify the back button
Then User_6047 verify the field Insurance Company 
Then User_6047 verify the field Base Premium 
Then User_6047 verify the field VAT on Base Premium 
Then User_6047 verify the field Net Base Premium 
Then User_6047 verify the field Total Discount 
Then User_6047 verify the field Expiry Date
Then User_6047 verify the field Quatatio Reference Number
Then User_6047 verify the field Deductible Amount 
Then User_6047 verify the field Gross Premium Amount 
Then User_6047 verify the field Vat On Gross Premium Amount
Then User_6047 verify the field NetGross Premium Amount 
And User_6047 to click the back button
And User_6047 verify the functionality of back button in Quotation Info
Then logout from the ULS Application



