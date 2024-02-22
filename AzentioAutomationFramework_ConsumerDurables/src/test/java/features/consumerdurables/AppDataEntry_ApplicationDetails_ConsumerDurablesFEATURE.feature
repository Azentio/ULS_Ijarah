Feature: To test the appliction details screen at app data entry stage (cussumer durables product)
@AT_CD_AD_APPDETAILS_01
Scenario: To verify user can able to create consumer durables record at app data entry stage
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_AD_APPDETAILS_01
Then user_076 verify save button and back buttons are visible in new application screen
Then user_076 verify product field should be mandatory editable dropdown
Then user_076 verify sub product field should be mandatory editable dropdown
And user_076 clear the finance amount field input in application details screen 
Then user_076 verify total finance amount request field should be mantatory numeric
And user_076 clear the declared net monthly income field input in application details screen 
Then user_076 verify declared net monthly income field should be mandatory numeric
And user_076 clear the declared current obligation field input in application details screen
Then user_076 verify declared currrent obligation field should be non mandatory editable numeric
Then user_076 verify special promotional campaign field should be non mandatory editable dropdown
Then user_076 verify sourcing channel field should be mandatory editable dropdown
Then user_076 verify business center code field should be mandatory editable dropdown
Then user_076 verify service type field should be mandatory editable dropdown
Then user_076 verify region field should be mandatory editable dropdown
Then user_076 verify servicing branch field should be mandatory editable dropdown
Then user_076 verify spoke location field should be non mandatory editable dropdown
Then user_076 verify closing staff or servicing staff or RM field should be mandatory editable dropdown
Then user_076 verify topup type field should be non mandatory editable dropdown
And user_076 clear the topup application number field input in application details screen
Then user_076 verify topup application number field should be non mandatory editable input
Then user_076 verify sourcing type field should be mandatory editable lookup
Then user_076 verify sourcing office field should be mandatory editable lookup
Then user_076 verify sourcing entity field should be mandatory editable lookup
Then user_076 verify sourcing staff field should be non mandatory editable lookup
Then user_076 verify reference type field should be non mandatory editable lookup
Then user_076 verify reference entity field should be non mandatory editable lookup
And user_076 clear the reference code number field input in application details screen
Then user_076 verify reference code field should be non mandatory editable textbox
And user_076 click on save button in application details new app record
Then user_076 verify system should save the record of application details new app
Then logout from the ULS Application
And user_076 invoke soft assert in application details in app data entry stage
@AT_CD_AD_APPDETAILS_02
Scenario: To verify user can able to create consumer durables record at app data entry stage
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 get the test data for test case ID AT_CD_AD_APPDETAILS_02
And user_076 clear the finance amount field input in application details screen 
And user_076 click on save button without enter the mandatory field in application details screen
Then user_076 verify system should show the validation for fill the mandatory field in application details screen
And user_076 enter the negative input in numeric field in application details screen
Then user_076 verify system should not allow user to enter the negative input in numeric field in application details screen
And user_076 enter the special character input field in application details screen
Then user_076 verify system should not allow user to enter the special caharcter in input field in application details screen
And user_076 enter the character input in numerical input field of charcter in input field in application details screen
Then user_076 verify system wont allow user to enter the character input in applicationn details screen
Then logout from the ULS Application
And user_076 invoke soft assert in application details in app data entry stage
@AT_CD_AD_APPDETAILS_05
Scenario: To verify user can able to submit consumer durables record from app data entry stage
Given navigate to ULS URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on submit button in application details at data entry stage
And user_076 enter the submit remark for application details record at data entry stage
And user_076 click on alert submit button in application details screen at data entry stage
Then user_076 verify consumer durables record should get submitted from data entry stage and moved to next stage
And user_076 extract the user ID for consumer durables which submitted on data entry stage
Then logout from the ULS Application
And user_076 invoke soft assert in application details in app data entry stage
@AT_CD_AD_APPDETAILS_05_PostReq
Scenario: To return the cunsumer durables record to app data entry stage
Given navigate to ULS URL
And login with valid underwritter user credntials for cnsumer durables
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the consumer durables data entry record reference number in search text box
And select the consumer durables data entry record form mail box
And user_076 click on application details tab at underwritter stage
And user_076 click on return button in underwritter stage
And user_076 click on return stage dropdown in underwritter stage
And user_076 select the data entry stage in return dropdown
And user_076 enter the return remark while return the under writter record
And user_076 click on alert return button
Then user_076 verify consumer durables record got returned to app data entry stage
And user_076 extract the app data entry user ID in underwritter stage
Then logout from the ULS Application
And user_076 invoke soft assert in application details screen at under writter stage