Feature: Income Details List

  # INC_01_01, INC_01_03
  @AT_TW_AD_INC_01
  Scenario: System should display the below mention fields and button under Income details sections
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_01
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click Add button under Income section in Customer Financials tab
And User_607 validate Save button available under Income details screen
And User_607 validate Back button available under Income details screen
And User_607 validate Employment Type field available under Income details screen
And User_607 validate Lumpsum Amount field available under Income details screen
And User_607 validate Pension Amount field available under Income details screen
And User_607 validate Income field available under Income details screen
And User_607 validate Frequency field available under Income details screen
And User_607 validate Amount field available under Income details screen
And User_607 validate Defined % field available under Income details screen
And User_607 validate Adjusted % field available under Income details screen
And User_607 validate Amount Considered field available under Income details screen
And User_607 validate Action button available under Income details screen
And User_607 validate Total Income field available under Income details screen
And User_607 validate Total Income considered field available under Income details screen
And User_607 validate Salary credited to Bank field available under Income details screen
And User_607 select the Salary credited to Bank value under Income details screen
And User_607 validate Bank Name field available under Income details screen
And User_607 validate Branch Name field available under Income details screen
And User_607 validate Deduction field available under Income details screen
And User_607 validate Deduction Frequency field available under Income details screen
And User_607 validate Deduction Amount field available under Income details screen
And User_607 validate Deduction Def % field available under Income details screen
And User_607 validate Deduction Adj % field available under Income details screen
And User_607 validate Deduction Considered field available under Income details screen
And User_607 validate Deduction Action button field available under Income details screen
And User_607 validate Total Deduction field available under Income details screen
And User_607 validate Total Deduction Considered field available under Income details screen
And User_607 validate Currency field available under Income details screen
And User_607 click the Back button under Income details screen
And User_607 verify system should navigate to the previous screen in Customer Financials tab
Then logout from the ULS Application

  # INC_01_04
  @AT_TW_AD_INC_02
  Scenario: To verify the functionality of Save button
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_02
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click Add button under Income section in Customer Financials tab
And User_607 enter the Lumpsum Amount under Income screen in Customer Financials tab
And User_607 enter the Pension Amount under Income screen in Customer Financials tab
And User_607 select the Income option under Income screen in Customer Financials tab
And User_607 select the Frequency option under Income screen in Customer Financials tab
And User_607 enter the Income Amount under Income screen in Customer Financials tab
And User_607 enter the Adjusted% under Income screen in Customer Financials tab
And User_607 select the Salary credited to Bank value under Income details screen
And User_607 select the Bank Name under Income screen in Customer Financials tab
And User_607 select the Branch Name under Income screen in Customer Financials tab
And User_607 select the Deduction option under Income screen in Customer Financials tab
And User_607 select the Deduction Frequency option under Income screen in Customer Financials tab
And User_607 enter the Deduction Amount under Income screen in Customer Financials tab
And User_607 enter the Deduction Adjusted% under Income screen in Customer Financials tab
And User_607 select the Currency under Income screen in Customer Financials tab
And User_607 click the Save button under Income details screen
And User_607 validate the confirmation message as success under Income details screen
Then logout from the ULS Application

  # INC_01_04 -->  INC_01_27
  @AT_TW_AD_INC_03
  Scenario: To verify the below fields under income details section. 
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_03
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click the pencil button under Income section in Customer Financials tab
And User_607 verify Employment Type auto populated from Employment details screen
And User_607 verify Lumpsum Amount auto populated from Employment details screen
And User_607 verify Income field should be Mandatory, LOV and Allow to user select any value from LOV
And User_607 verify Frequency field should be Mandatory, LOV and Allow to user select any value from LOV
And User_607 verify income Amount field should be Mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Amount Considered field should be auto populated in post entering Adjusted% value
And User_607 verify Total income value should get auto populated post entering the Amount
And User_607 verify Total income considered value should get auto populate post entering the value in Adjusted% field
And User_607 verify Salary credited to Bank field should be Non-mandatory and Dropdown
And User_607 verify Deduction field should be Non-mandatory, LOV and Allow to user select any value from LOV
And User_607 verify Deduction Amount field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Deduction Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Deduction Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy
And User_607 verify Deduction Considered field should be auto populated in post entering Deduction Adj% value
And User_607 verify Total Deduction value should get auto populated post entering the Deduction Amount
And User_607 verify Deduction considered value should get auto populate post entering the value in Deduction Adj% field
And User_607 verify Bank Name field should be Non-mandatory, LOV and Allow to user select any value from LOV
And User_607 verify Branch Name field should be Non-mandatory, LOV and Allow to user select any value from LOV
And User_607 click Add Row button system should add a row under Income screen
And User_607 click Delete Row button system should delete a row under Income screen
Then logout from the ULS Application

  # INC_02_01,  INC_02_02, INC_02_03
  @AT_TW_AD_INC_04
  Scenario: To verify the functionality of Save button with mandatory field as blank
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_04
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click Add button under Income section in Customer Financials tab
And User_607 enter the Lumpsum Amount under Income screen in Customer Financials tab
And User_607 enter the Pension Amount under Income screen in Customer Financials tab
And User_607 select the Income option under Income screen in Customer Financials tab
And User_607 select the Frequency option under Income screen in Customer Financials tab
And User_607 click the Save button with mandatory field blank under Income details screen
And User_607 verify validation message for mandatory field as blank under Income details screen
Then logout from the ULS Application

  @AT_TW_AD_INC_05
  Scenario: Modification of Income details record
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_05
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click the pencil button under Income section in Customer Financials tab
And User_607 validate Save button available under Income details screen
And User_607 validate Back button available under Income details screen
And User_607 verify while modification, when user keep any mandatory field blank and click on save button
And User_607 verify validation message for mandatory field as blank under Income details screen
And User_607 verify while modification enters the invalid data in Income details screen
And User_607 system should not allow user to do a modification with invalid data under Income details screen
And User_607 verify system allow user to modify Lumpsum Amount under Income details screen
And User_607 verify system allow user to modify Pension Amount under Income details screen
And User_607 verify system allow user to modify Income under Income details screen
And User_607 verify system allow user to modify Frequency under Income details screen
And User_607 verify system allow user to modify Income Amount under Income details screen
And User_607 verify while modification system allow user to save the record with valid data
And User_607 post clicking on save button system should display the confirmation message as Success
    # Validate the Back button functionality in income details record page
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 again click the pencil button under Income section in Customer Financials tab
And User_607 Post clicking on back button system should navigate to the previous screen
And User_607 verify system should navigate to the previous screen in Customer Financials tab
Then logout from the ULS Application

  @AT_TW_AD_INC_06
  Scenario: System should display the list of below mention fields for Income List
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_06
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 verify the Back button available in Income list view under Customer Financials tab
And User_607 verify Add button available under Income section list view in Customer Financials tab
And User_607 verify Nature of Employement field available under Income section list view in Customer Financials tab
And User_607 verify Net Income field available under Income section list view in Customer Financials tab
And User_607 verify Net Deduction field available under Income section list view in Customer Financials tab
And User_607 verify Considered Income field available under Income section list view in Customer Financials tab
And User_607 verify Currency field available under Income section list view in Customer Financials tab
And User_607 verify Status field available under Income section list view in Customer Financials tab
And User_607 verify on clicks of list view record, details should be populated in the fields under Income screen
And User_607 click the Back button under Income details screen
And User_607 verify the functionality of Add button under Income section in Customer Financials tab
And User_607 post clicking on Add button system should navigate to new Income details screen
Then logout from the ULS Application

  @AT_TW_AD_INC_07
  Scenario: System should display the list of below mention fields for Income List
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_07
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 click Search button in Income section under Customer Financials tab
And User_607 verify the functionality of Search box with matching data in Income section
And User_607 verify entering any matching value system should display all the possible matching records under Income section
And User_607 verify the functionality of Search box with mismatch data in Income section
And User_607 verify system should not display any records or system should display the message as No data found under Income section
Then logout from the ULS Application

  @AT_TW_AD_INC_08
  Scenario: System should display the list of below mention fields for Income List
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_08
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 click the Customer Financials tab
And User_607 click the pencil icon under Customer Financials tab
And User_607 verify the functionality of Export to PDF button
And User_607 post clicking on Export to PDF button system should download the PDF file of that records
And User_607 verify the functionality of Export to Excel button
And User_607 post clicking on Export to Excel button system should download the Excel file of that records
And User_607 to verify the functionality of Back button under Customer Financials tab
And User_607 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen
Then logout from the ULS Application