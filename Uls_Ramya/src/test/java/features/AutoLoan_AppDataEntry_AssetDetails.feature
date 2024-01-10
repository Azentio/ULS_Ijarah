Feature: To test the AutoLoan-ApplicationDataEntry-AssetDetails module in URL
@AT_AL_ASD_01
Scenario:  Asset Detailtab should get open with the required field

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
And User_6047 verify the add button in asset details segment
And User_6047 click on add button in asset details tab
Then User_6047 verify asset manufacture field in asset detail
Then User_6047 verify asset model field in asset detail
Then User_6047 verify asset model type field in asset detail
Then User_6047 verify year of manufacture field in asset detail
Then User_6047 verify asset condition field in asset detail
Then User_6047 verify asset color field in asset detail
Then User_6047 verify drivetrain field in asset detail
Then User_6047 verify number of cylinder in asset detail
Then User_6047 verify volume of engine field in asset detail
Then User_6047 verfy no of units field in asset detail
Then User_6047 verify chassis number field in asset detail
Then User_6047 verify plate number field in asset detail
Then User_6047 verify asset dealer field in asset detail 
Then User_6047 verify agent name field in asset detail
Then User_6047 verify agent email ID field in asset detail
Then User_6047 verify agent mobile number field in asset detail
Then logout from the ULS Application

@AT_AL_ASD_02
Scenario:  To verify the field should be Mandatory,editable,lookup value,non mandatory and textbox

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
And User_6047 click on add button in asset details tab
Then User_6047 To verify Asset Manufacture should be Mandatory,editable,Lookup value
Then User_6047 verify asset model field should be mandatory editable lookup
Then User_6047 verify asset model type field should be non mandatory editable textbox
Then logout from the ULS Application

@AT_AL_ASD_03
Scenario:  To verify the field should be Mandatory,editable,lookup value,non mandatory and textbox

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 verify year of manufacture field should be mandatory editable numeric
Then User_6047 To verify asset condition field should be mandatory and editable lookup
Then User_6047 To verify asset color field should be non mandatory editable lookup
Then User_6047 To verify drivetrain field should be non mandatory editable textbox
Then User_6047 To verify number of cylinder field should be non mandatory editable numeric
Then logout from the ULS Application

@AT_AL_ASD_04
Scenario:  To verify the field should be Mandatory,editable,lookup value,non mandatory and textbox

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 To verify volume of engine field should be non mandatory editable numeric field
Then User_6047 To verfy no of units field should be non mandatory editable numeric field
Then User_6047 To verify chassis number field should be mandatory editable numeric field
Then User_6047 To verify plate number field should be mandatory editable numeric field
Then logout from the ULS Application

@AT_AL_ASD_05
Scenario:  To verify Dealer Details and Registration Agent Detail section

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 To verify Asset Dealer in Dealer Details section 
Then User_6047 To verify asset dealer field should be mandatory editable lookup
Then User_6047 verify agent name in Registration Agent Detail section
Then User_6047 verify agent email ID in Registration Agent Detail section
Then User_6047 verify agent mobile number in Registration Agent Detail section
Then logout from the ULS Application

@AT_AL_ASD_06
Scenario:  To verify the field should be Mandatory,editable,lookup value,non mandatory and textbox

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 To verify agent name field should be non mandatory editable lookup
Then User_6047 To verify agent email ID field should be non mandatory editable textbox
Then User_6047 To verify agent mobile number field should be non mandatory editable numeric
Then logout from the ULS Application

@AT_AL_ASD_07
Scenario:  To verify the Asset Price and Down Payment Details section in AssetDetails

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 verify Asset Price field in asset detail
Then User_6047 verify Down Payment field in asset detail
Then User_6047 verify Down Payment Percentage field in asset detail
Then User_6047 verify Green Card Issue Date field in asset detail
Then User_6047 verify Residual Value field in asset detail
Then User_6047 verify Green Card No field in asset detail
Then User_6047 verify Weight field in asset detail
Then User_6047 verify Mileage field in asset detail
Then User_6047 verify Country of Manufacturing field in asset detail
Then User_6047 verify Asset Agreed Fulfilment Location field in asset detail
Then User_6047 verify Location of Signing the Agreement field in asset detail
Then User_6047 verify Asset Received Location field in asset detail
Then User_6047 verify Remark field in asset detail
Then logout from the ULS Application
@AT_AL_ASD_08
Scenario:  To verify the Asset Price and Down Payment Details should be non-Mandatory,editable,numeric,date
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 verify Asset Price should be Mandatory,editable,numeric
Then User_6047 verify Down Payment should be non-Mandatory,editable,numeric
Then User_6047 verify Down Payment Percentage should be non-Mandatory,editable,numeric
Then User_6047 verify Green Card Issue Date should be non-Mandatory,editable,date
Then User_6047 verify Residual Value should be non-Mandatory,editable,numeric
Then logout from the ULS Application
@AT_AL_ASD_09
Scenario:  To verify the Asset Price and Down Payment Details should be non-Mandatory,editable,numeric,date
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 verify Green Card No should be non-Mandatory,editable,numeric
Then User_6047 verify Weight should be non-Mandatory,editable,numeric
Then User_6047 verify Mileage should be non-Mandatory,editable,numeric
Then User_6047 verify Country of Manufacturing should be non-Mandatory,editable,lookup value
Then logout from the ULS Application
@AT_AL_ASD_10
Scenario:  To verify the Asset Price and Down Payment Details should be non-Mandatory,editable,numeric,date
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 verify Asset Agreed Fulfilment Location should be Mandatory,editable,lookup value
Then User_6047 verify Location of Signing the Agreement should be Mandatory,editable,lookup value
Then User_6047 verify Asset Received Location should be Mandatory,editable,lookup value
Then User_6047 verify Remark should be Mandatory,editable,textbox
Then logout from the ULS Application
@AT_AL_ASD_11
Scenario:  To verify the To test the asset details screen with invalid inputs
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails
And User_6047 Get the test data for test case ID AT_AL_ASD_01
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on asset details segment button
Then User_6047 click on add button in asset details tab
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field
Then User_6047 Enter the character input in number of cylender input box
Then User_6047 Verify number of cylender input field not accept the number of cylender input 
Then User_6047 Enter the negative input in Down Payment input box
Then User_6047 verify agent Down Payment field should show the validation for negative input
Then User_6047 Enter the special character input in asset price input box
Then User_6047 Verify asset price input field not accept the special character input 
Then logout from the ULS Application
