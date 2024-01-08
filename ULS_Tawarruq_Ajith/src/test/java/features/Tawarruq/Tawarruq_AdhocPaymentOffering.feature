Feature: Testing the functionalities of Adhoc payment offering stage in Tawarruq Application
@TW_APD_01
Scenario: Adhoc Payment Details should be available under this stage with all valid fields
Given navigate the Tawarruq URL
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_01
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click adhoc payment tab in offering stage Tawarruq 
And user_0482 click add button in adhoc payment offering stage Tawarruq 
And user_0482 Verify Transaction type field should be present
And user_0482 Verify Transaction type field should be Non Mandatory and editable
And user_0482 Verify Transaction Against field should be present
And user_0482 Verify Transaction Against field should be Non Mandatory and editable
And user_0482 Verify Reference number field should be present
And user_0482 Verify Reference number field should be Non Mandatory and editable
And user_0482 Verify Paid amount field should be present
And user_0482 Verify Paid amount field should be Non Mandatory and editable
And user_0482 click save button in Adhoc payment offering stage 
And user_0482 Verify Ok and Close button after click save button
And user_0482 click add button in adhoc payment offering stage Tawarruq 
And user_0482 Verify the functionalities of back button in Adhoc payment offering stage 
#fail due to bug AZ1LN-8544
@TW_APD_02
Scenario: Negative Valifation for Adhoc Payment Details all valid fields
Given navigate the Tawarruq URL
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_02
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click adhoc payment tab in offering stage Tawarruq 
And user_0482 click add button in adhoc payment offering stage Tawarruq
And user_0482 enter invalid character in Reference number and validate
And user_0482 enter invalid character in paid amount and validate
@TW_APD_03
Scenario: User able to update the all field in Adhoc payment tab in offering stage
Given navigate the Tawarruq URL
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_03
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click adhoc payment tab in offering stage Tawarruq 
And user_0482 click first record in adhoc payment tab under offering details Tawarruq Application
And user_0482 Verify Transaction type field should be able to Modify
And user_0482 Verify Transaction Against field should be able to Modify
And user_0482 Verify Reference number field should be able to Modify
And user_0482 Verify Paid amount field should be able to Modify
And user_0482 click upadte button in Adhoc payment offering stage 
And user_0482 Verify Ok and Close button after click save button
And user_0482 click first record in adhoc payment tab under offering details Tawarruq Application
And user_0482 Verify the functionalities of back button in Adhoc payment offering stage 
#fail due to bug AZ1LN-8544
@TW_APD_04
Scenario: Negative Valifation for Adhoc Payment Details Update screen all valid fields
Given navigate the Tawarruq URL
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_04
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click adhoc payment tab in offering stage Tawarruq 
And user_0482 click first record in adhoc payment tab under offering details Tawarruq Application
And user_0482 enter invalid character in Reference number upadte screen and validate
And user_0482 enter invalid character in paid amount update screen and validate
#fail due to no activate deactivate button AZ1LN-8572
@TW_APD_05
Scenario: To verify the functionality of Activate/Deactivate button
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_05
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click first record in adhoc payment tab under offering details Tawarruq Application
And user_0482 click deactivate button and verify status deactivated
And user_0482 click activate button and verify status activated

@TW_APD_06
Scenario: To verify the Adhoc payment list view Validation
Given navigate the Tawarruq URL
And login with valid credentials for offering stage for Tawarruq
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_APD_06
And user_0482 search the offering stage record reference number in Tawarruq
And user_0482 select the offering stage record from mail box in Tawarruq
And user_0482 click adhoc payment tab in offering stage Tawarruq 
And user_0482 click search button in list view adhoc payment in Offering stageTawarruq
And user_0482 search and validate matched data in list view adhoc payment in Offering stageTawarruq
And user_0482 click search button in list view adhoc payment in Offering stageTawarruq
And user_0482 search and validate unmatched data in list view adhoc payment in Offering stageTawarruq
And user_0482 click Export drop down in list view adhoc payment in Offering stageTawarruq
And user_0482 click export to pdf button in list view adhoc payment in Offering stageTawarruq and validate the downloaded file
And user_0482 click Export drop down in list view adhoc payment in Offering stageTawarruq
And user_0482 click export to excel button in list view adhoc payment in Offering stageTawarruq and validate the downloaded file




