Feature: To verify the tab commodity Purchase Maker - Insurance Info,Document Details
@AT_TW_CSM_17

Scenario: Insurance Info screen should get open with all valid fields and All data must be display only

Given Navigate the IJARA URL
And User_6047 Login With valid credentials - commodity-insuranceIfo,documentDetails
And User_6047 Get the test data for test case ID AT_TW_CSM_17
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Ref id under Inbox
And User_6047 Click the Entitle button under inbox 
#And User_6047 click edit icon
And User_6047 click next Button 
And User_6047 click insuranceInfo tab
And User_6047 click EyeButton
Then User_6047 To verify the Insurance Quatation Id field in Insurance Info screen
Then User_6047 To verify the Insurance Year field in Insurance Info screen
Then User_6047 To verify the Deprication field in Insurance Info screen
Then User_6047 To verify the Asset Price field in Insurance Info screen
Then User_6047 To verify the Rate Per Asset field in Insurance Info screen
Then User_6047 To verify the Minium Insurance Premium field in Insurance Info screen
Then User_6047 To verify the Base Insurance Premium field in Insurance Info screen
Then User_6047 To verify the VAT Premium field in Insurance Info screen
Then User_6047 To verify the NET Premium field in Insurance Info screen
Then logout from the ULS Application

@AT_TW_CSM_18
Scenario: Document Details screen should get open with all valid fields and All data must be display only

Given Navigate the IJARA URL
And User_6047 Login With valid credentials - commodity-insuranceIfo,documentDetails
And User_6047 Get the test data for test case ID AT_TW_CSM_18
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Ref id under Inbox
And User_6047 Click the Entitle button under inbox 
#And User_6047 click edit icon
And User_6047 click next Button 
And User_6047 click Document Details tab
And User_6047 click EyeButton
Then User_6047 To verify the Customer Name field in Insurance Info screen
Then User_6047 To verify the Document Name field in Insurance Info screen
Then User_6047 To verify the Required At Stage field in Insurance Info screen
Then User_6047 To verify the Document Status field in Insurance Info screen
Then User_6047 To verify the Mandatory/optional field in Insurance Info screen
Then User_6047 To verify the document Category field in Insurance Info screen
Then User_6047 To verify the Upload Date field in Insurance Info screen
Then User_6047 To verify the Expected Receipt Date field in Insurance Info screen
Then User_6047 To verify the Defferal Stage field in Insurance Info screen
Then User_6047 To verify the Def Approved By field in Insurance Info screen
Then User_6047 To verify the Change in Nature Approved By field in Insurance Info screen
Then User_6047 To verify the Document Form field in Insurance Info screen
Then User_6047 To verify the Document Quality field in Insurance Info screen
Then User_6047 To verify the Document Ref Num field in Insurance Info screen
Then User_6047 To verify the Document Received By field in Insurance Info screen
Then User_6047 To verify the Location Where Received field in Insurance Info screen
Then User_6047 To verify the Rack No field in Insurance Info screen
Then User_6047 To verify the Shelf No field in Insurance Info screen
Then User_6047 To verify the Box No field in Insurance Info screen 
Then User_6047 To verify the DateOfExpiry field in Insurance Info screen 
Then User_6047 To verify the Lodgement Amount field in Insurance Info screen 
Then User_6047 To verify the Remarks field in Insurance Info screen 

