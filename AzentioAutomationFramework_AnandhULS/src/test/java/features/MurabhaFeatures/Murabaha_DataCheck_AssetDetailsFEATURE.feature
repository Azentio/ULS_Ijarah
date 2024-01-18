Feature: To test the asset details record at app data check stage with murabaha product
@AT_MUB_DATACHK_ADC_01
Scenario: To verify asset details field are read only mode at app data check stage
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 click on asset details tab at app data check stage
And user_076 click on view button in asset details list view at app data check stage
Then user_076 verify asset details screen should have asset details section at app data check stage
Then user_076 verify asset details screen should have dealer details section at app data check stage
Then user_076 verify asset details screen should have Registration details section at app data check stage
Then user_076 verify asset details screen should have Asset Price and Down Payment details section at app data check stage
Then user_076 verify asset details screen field should be read only mode at app data check stage
And user_076 click on back button in asset details at app data check stage
Then user_076 verify back button is working as expected in asset details at app data check stage
Then logout from the ULS Application
Then user_076 invoke soft assert in asset details at app data check stage