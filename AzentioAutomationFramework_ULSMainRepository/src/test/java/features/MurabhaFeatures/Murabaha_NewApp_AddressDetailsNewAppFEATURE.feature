Feature: To test the address details screen in new app stage (Murabha)
@AT_NewApp_M_AD_01
Scenario: To test the address details screen at new app stage with valid input (Murabaha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_01
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in address details at new app stage
Then user_076 verify address details screen should have back button and save button in new app stage
Then user_076 verify address type field should be editable mandatory dropdown at new app stage
Then user_076 verify address status field should be editablble mandatory dropdown at new app stage
Then user_076 verify residential or occupancy status field should be editable mandatory dropdown at new app stage
Then user_076 verify communication address field should be non mandatory editable calendar at new app stage
Then user_076 verify location category field should be mandatory editable lookup at new app stage
Then user_076 verify address line one field should be mandatory editable textbox at new app stage
Then user_076 verify address line two field should be mandatory editable textbox at new app stage
Then user_076 verify country field should be mandatory editable textbox at new app stage
Then user_076 verify provience id field should be mandatory editable textbox at new app stage
Then user_076 verify neighbourhood district name field should be mandatory editable textbox at new app stage
Then user_076 verify city field should be mandatory editable textbox at new app stage
Then user_076 verify zipcode field should be mandatory editable textbox at new app stage
Then user_076 verify po box number field should be non mandatory editable textbox at new app stage
Then user_076 verify mobile number field should be non mandatory editable numeric at new app stage
Then user_076 verify duration of stay field should be non mandatory editable numeric field at new app stage
Then user_076 verify latitude details of address field should be non mandatory editable textbox at new app stage
Then user_076 verify longitude details of address field should be non mandatory editable textbox at new app stage
Then user_076 verify landmark field should be non mandatory editable textbox at new app stage at new app stage
Then user_076 verify occupancy date field should be mandatory editable calendar at new app stage at new app stage
Then user_076 verify landlord name field should be non mandatory editable text box at new app stage at new app stage
Then user_076 verify landlord mobile number field should be non mandatory editable numeric field at new app stage
Then user_076 verify rent amount field should be non mandatory editable numeric field at new app stage
Then user_076 verify frequency rent field should be non mandatory editable dropdown at new app stage
And user_076 click on save button in address screen ta new app stage
Then user_076 verify address details record got saved in new app stage 
Then logout from the ULS Application
And user_076 invoke soft assert in address details screen at new appp stage

@AT_NewApp_M_AD_02
Scenario: To test the address details screen at new app stage with in valid input (Murabha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_02
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on add button in address details at new app stage
And user_076 click on save button in customer address details in new app stage
Then user_076 verify system should show the validation for fill the mandatory details of customer address details in new app stage
And user_076 enter the special caharcter input in address line one input box at new app stage
Then user_076 verify address line one field should show the validation for special character input at new app stage
And user_076 enter the character input in rent amount field in new app stage
Then user_076 verify rent amount field should not accept the character innput in new app stage
And user_076 click on back button in address details in new app stage
Then user_076 verify address details screen got move to the previous screen in address details at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in address details screen at new appp stage

@AT_NewApp_M_AD_03
Scenario: to verify user can able to update the list view record of address details in new app stage (Murabha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_03
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer address details list view record in new app stage
And user_076 update the address line one in address  details list view record in new app stage
And user_076 click on save button in address screen ta new app stage
Then user_076 verify address details record got updated in new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in address details screen at new appp stage
@AT_NewApp_M_AD_04
Scenario: to verify user can able to update the list view record of address details in new app stage (Murabha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_04
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer address details list view record in new app stage
And user_076 make address line one fied as blank in address details list view record at new app stage
And user_076 click on save button in customer address details in new app stage
Then user_076 verify system should show the validation for fill the mandatory details of customer address details in new app stage
And user_076 enter the special caharcter input in address line one input box at new app stage
Then user_076 verify address line one field should show the validation for special character input at new app stage
And user_076 make rent amount field as blank in rent amount field in new app stage of address details record
And user_076 enter the character input in rent amount field in new app stage
Then user_076 verify rent amount field should not accept the character innput in new app stage
And user_076 click on back button in address details in new app stage
Then user_076 verify address details screen got move to the previous screen in address details at new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in address details screen at new appp stage
@AT_NewApp_M_AD_05
Scenario: to verify user can able to update the list view record status of address details in new app stage (Murabha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_05
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_076 click on edit button of customer address details list view record in new app stage
And user_076 change the address details status to active to inactive or inactive to active in new app stage
And user_076 click on save button in address screen ta new app stage
Then user_076 verify record status of address details got changed as per the toggle button in new app stage
And user_0076 click on edit button of customer address details after changing the status
And user_076 change the address details status to active to inactive or inactive to active in new app stage
And user_076 click on save button in address screen ta new app stage
Then user_076 verify record status of address details got changed as per the toggle button in new app stage
Then logout from the ULS Application
And user_076 invoke soft assert in address details screen at new appp stage

@AT_NewApp_M_AD_06
Scenario: to verify user can able to update the list view record of address details in new app stage (Murabha)
Given navigate the IJARA URL
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And get the test data for test case id AT_NewApp_M_AD_06
And user_076 search for murabaha record reference number in new app stage
And user_076 select the murabaha record in new app stage
And user_076 click on additional customer info tab in new application stage
And user_076 click on edit button customer personal information screen at new app stage
And user_76 verify address details list view record should be readonly ot editable at new app stage
And user_076 click on search button in address details list view in new app stage
And user_076 search the matched text in address details list view in new app stage
Then user_076 verify system should show the valid matches in address details list view in new app stage
And user_076 search the unmatched text in address details list view in new app stage
Then user_076 verify system should not show matches in address details list view in new app stage