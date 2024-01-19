Feature: To test the living expense screent at app data check stage with ijarah product
@AT_IJ_DATACHK_LED_01
Scenario: To verify living expense screen should have all the configured screen at app data check stage (Ijarah product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for ijarah
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search ijarah app data check record reference number in mail box
And user_076 select the ijarah app data check record reference number from mail box
And user_076 click on living expense tab at app data check stage
And user_076 click on view button of living expense screen at app data check stage
Then user_076 verify expense type should show in living expense screen at app data check stage
Then user_076 verify amount should show in living expense screen at app data check stage
Then user_076 verify expected cost of living should show in living expense screen at app data check stage
Then user_076 verify minimum cost of living should show in living expense screen at app data check stage
Then user_076 verify accredit cost should show in living expense screen at app data check stage
Then user_076 verify total living expense should show in living expense screen at app data check stage
Then logout from the ULS Application
And user_076 invoke softAssert in data check living expense screen
@AT_IJ_DATACHK_LED_02
Scenario: To verify living expense screen should have all the field is in read only mode at app data check stage (Ijarah product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for ijarah
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search ijarah app data check record reference number in mail box
And user_076 select the ijarah app data check record reference number from mail box
And user_076 click on living expense tab at app data check stage
And user_076 click on view button of living expense screen at app data check stage
Then user_076 verify customer name field should be read only mode in living expense screen at app data check stage
Then user_076 verify total living expense field should be read only mode in living expense screen at app data check stage
Then user_076 verify Accredit cost field should be read only mode in living expense screen at app data check stage
Then user_076 verify Is Spouse employed field should be read only mode in living expense screen at app data check stage
Then user_076 verify Spouse salary field should be read only mode in living expense screen at app data check stage
Then user_076 verify Living allowance field should be read only mode in living expense screen at app data check stage
Then user_076 verify expected cost of living field should be read only mode in living expense screen at app data check stage
Then user_076 verify minimum cost of living field should be read only mode in living expense screen at app data check stage
Then user_076 verify expense type field should be read only mode in living expense screen at app data check stage
Then user_076 verify amount field should be read only mode in living expense screen at app data check stage
Then logout from the ULS Application
And user_076 invoke softAssert in data check living expense screen