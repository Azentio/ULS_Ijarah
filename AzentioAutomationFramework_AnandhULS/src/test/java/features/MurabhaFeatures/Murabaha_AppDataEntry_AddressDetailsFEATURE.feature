Feature: To test the app data entry address details screen with murabaha product
@AT_MU_ADE_IAD_04
Scenario: To test the dealer details and registration details section
Given navigate the IJARA URL
And user_076 login with valid app data entry user ID for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search app data entry record reference number in mail box
And user_076 select the app data entry record at mail box search grid for murabaha
And user_076 click on asset details section at app data entry stage
And user_076 click on add button in asset details in asset details at app data entry stage
And user_076 get test data for test case ID AT_MU_ADE_IAD_04
Then user_076 verify delar details section should have asset details field at app data entry stage
Then user_076 verify asset dealer field should be editable mandatory lookup value at app data entry stage
Then user_076 verify registration details section should have agent name email id and mobile number field at app data entry stage
Then user_076 verify agent name field should be non mandatory editable lookup value at app data entry stage
Then user_076 verify agent email id field should be non mandatory editable text box at app data entry stage
Then user_076 verify agent mobile number field should be non mandatory editable numeric at app data entry stage
Then logout from the ULS Application
And invoke soft assert in asset details data entry stage for murabaha product