Feature: To Test the application details record at the App data entry stage tawarruq
@AT_TW_AD_01
Scenario: To test user can able to create the application details record with valid valid
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_AD_01
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
Then user_0482 verify Classification field should be mandatory editable dropdown
Then user_0482 verify product field should be mandatory editable dropdown
Then user_0482 verify total finance amount request field should be mantatory numeric
Then user_0482 verify declared net monthly income field should be mandatory numeric
#Then user_0482 verify declared currrent obligation field should be non mandatory editable numeric
Then user_0482 verify special promotional campaign field should be non mandatory editable dropdown
Then user_0482 verify sourcing channel field should be mandatory editable dropdown
Then user_0482 verify business center code field should be mandatory editable dropdown
Then user_0482 verify service type field should be mandatory editable dropdown
Then user_0482 verify region field should be mandatory editable dropdown
Then user_0482 verify servicing branch field should be mandatory editable dropdown
Then user_0482 verify spoke location field should be non mandatory editable dropdown
Then user_0482 verify closing staff or servicing staff or RM field should be mandatory editable dropdown
Then user_0482 verify Topup type should be non mandatory editable dropdown
Then user_0482 verify Topup Application should be non mandatory editable textbox
Then user_0482 verify closing staff or servicing staff or RM field should be mandatory editable dropdown
Then user_0482 verify sourcing type field should be mandatory editable lookup
Then user_0482 verify sourcing office field should be mandatory editable lookup
Then user_0482 verify sourcing entity field should be mandatory editable lookup
Then user_0482 verify sourcing staff field should be non mandatory editable lookup
Then user_0482 verify reference type field should be non mandatory editable lookup
Then user_0482 verify reference entity field should be non mandatory editable lookup
Then user_0482 verify reference code field should be non mandatory editable textbox
And user_0482 click on save button in application details new app record
Then user_0482 verify system should save the record of application details new app
Then logout from the ULS Application
And user_0482 invoke soft assert for new application screen
@AT_TW_AD_02
Scenario: To test user can able to create the application details record with in valid data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_0482 get the test data for test case id AT_TW_AD_02
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And user_076 click on save button while open the application details record
And user_076 click on add button of application details record
And user_076 in customer search screen select the customer type
And user_076 in customer search screen enter customer name
And user_076 in custommer search screen select ID type
And user_076 in customer search screen enter id number
And user_076 in customer search screen enter date of birth of the customer
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
And user_076 click on save button without enter the mandatory field in application details screen
Then user_076 verify system should show the validation for fill the mandatory field in application details screen
And user_076 enter the negative input in numeric field in application details screen
Then user_076 verify system should not allow user to enter the negative input in numeric field in application details screen
And user_076 enter the special character input field in application details screen
Then user_076 verify system should not allow user to enter the special caharcter in input field in application details screen
And user_076 enter the character input in numerical input field of charcter in input field in application details screen
Then user_076 verify system wont allow user to enter the character input in applicationn details screen
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_TW_AD_03
Scenario: To test user can able to create the application details record with in valid data
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
#user_0482 get the test data for test case id AT_TW_AD_03
And user_0482 get the test data for test case id AT_TW_AD_03
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And user_076 click on save button while open the application details record
And user_076 click on edit button of new application list view record
And user_076 update the list view record of application details record
Then user_076 verify user can able to update the application details record
And user_076 click on edit button of new application list view record
And user_076 change the record active if its inactive and change inactive if active record
And user_076 click on edit button of new application list view record
Then user_076 verify application details screen have submit button
Then user_076 verify application details screen have return button
Then user_076 verify application details screen have view summary button
And user_076 click on view summary button in application details screen
Then user_076 verify system should show the summary of the record
And user_076 click on back button in application details update screen
Then user_076 verify application details update screen should moved to previoues screen
Then logout from the ULS Application
And user_076 invoke soft assert for new application screen

@AT_TW_AD_06
Scenario: System should display the below mention fields on List view of Application Details

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_AD_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 verify Action field available in list view under Application Details screen
And User_608 verify Client Name field available in list view under Application Details screen
And User_608 verify Client Name(Alternate Lanuguage) field available in list view under Application Details screen
And User_608 verify Product field available in list view under Application Details screen
And User_608 verify Sub Product field available in list view under Application Details screen
And User_608 verify Current Stage field available in list view under Application Details screen
And User_608 verify Location field available in list view under Application Details screen
And User_608 verify Allocated To field available in list view under Application Details screen
And User_608 verify Service field available in list view under Application Details screen
And User_608 verify Status field available in list view under Application Details screen
And User_608 click the Search Icon under Application Details screen
And User_608 search mismatch value system should not display any records under Application Details screen
And User_608 verify the system is should not displayed any records under Application Details screen
And User_608 search matching value system should display all the possible matching records under Application Details screen
And User_608 verify the all the possible matching records are displayed under Application Details screen
And User_608 click the Export button under Application Details screen
And User_608 click the PDF and verify under Application Details screen
And User_608 click the Export button under Application Details screen
And User_608 click the XLS and verify under Application Details screen
#And User_608 click the Add button under Application Details screen
#And User_608 verfiy the new record creation page under Application Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen at Tawarruq App Data Entry stage