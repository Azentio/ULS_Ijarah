Feature: Verify the functionalities for AppDataEntry(Insurance Info)
#cover all insurance manual testcases
 @AT_INS_001
Scenario: Creation of Insurance Info record with valid data
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_INS_001
And user_0482 search the new app data entry stage record reference number in Insurance Info
And user_0482 select the new app data entry stage record from mail box in Insurance Info
And user_0482 click the insurance Info Screen
And user_0482 click the Add button under insurance Info screen
And user_0482 Verify insuranceQuotationId field should be Mandatory Dropdown and Editable
And user_0482 Verify insuranceYear field should be Mandatory Dropdown and Editable 
And user_0482 Verify depriciation field Mandatory textbox and Editable 
And user_0482 Verify AssetPrice field Mandatory textbox and Editable 
And user_0482 Verify RatePerAsset field Mandatory textbox and Editable 
And user_0482 Verify minimumInsurancePremium field Mandatory textbox and Editable 
And user_0482 Verify BaseInsurancePremium field Mandatory textbox and Editable 
And user_0482 Verify VATPremium field Mandatory textbox and Editable 
And user_0482 Verify NetPremium field Mandatory textbox and Editable
And user_0482 Click save button and verify the confirmation message 

@AT_INS_002
Scenario: Creation of Insurance Info record with valid data
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_INS_002
And user_0482 search the new app data entry stage record reference number in Insurance Info
And user_0482 select the new app data entry stage record from mail box in Insurance Info
And user_0482 click the insurance Info Screen
And user_0482 Verify Insurance year in List view
And user_0482 Verify Insurance year value in List view
And user_0482 Verify the Depreciation percentage in list view
And user_0482 Verify the Depreciation percentage value in list view
And user_0482 Verify Asset Price in list view
And user_0482 Verify Asset Price Value in list view
And user_0482 Verify the Base Insurance premium in list view
And user_0482 Verify the Base Insurance premium value in list view
And user_0482 Verify VAT premium in list view
And user_0482 Verify VAT premium value in list view
And user_0482 Verify Net premium in list view 
And user_0482 Verify Net premium value in list view 
And user_0482 Verify Status in list view
And user_0482 Verify Status value in list view

