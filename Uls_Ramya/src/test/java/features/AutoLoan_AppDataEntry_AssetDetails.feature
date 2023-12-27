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