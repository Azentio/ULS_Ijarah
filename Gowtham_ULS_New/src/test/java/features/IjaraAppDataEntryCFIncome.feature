Feature: Ijara AppData Entry CF Income

  # INC_01_01, INC_01_03
  @AT_INC_01_001
  Scenario: System should display the below mention fields and button under Income details sections
    Given navigate the IJARA URL
    And login with valid credentials4
    And User_607 get the test data for test case AT_TW_AD_INC_01
   And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field Ijara App Data Entry Income Details List
	  And User_607 Select record after search
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
    Then logout from the ULSApplication

  # INC_01_04
  @AT_INC_01_002
  Scenario: To verify the functionality of Save button
    Given navigate the IJARA URL
    And login with valid credentials4
    And User_607 get the test data for test case AT_TW_AD_INC_02
  	And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field Ijara App Data Entry Income Details List
	  And User_607 Select record after search
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
    Then logout from the ULSApplication

  # INC_01_04 -->  INC_01_27
  @AT_INC_01_003
  Scenario: To verify the below fields under income details section. 
    Given navigate the IJARA URL
    And login with valid credentials4
    And User_607 get the test data for test case AT_TW_AD_INC_03
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field Ijara App Data Entry Income Details List
	  And User_607 Select record after search
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
    Then logout from the ULSApplication
    
  # INC_02_01,  INC_02_02, INC_02_03
  @AT_INC_01_004
  Scenario: To verify the functionality of Save button with mandatory field as blank
    Given navigate the IJARA URL
    And login with valid credentials4
    And User_607 get the test data for test case AT_TW_AD_INC_04
   And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field Ijara App Data Entry Income Details List
	  And User_607 Select record after search
    And User_607 click the Customer Financials tab
    And User_607 click the pencil icon under Customer Financials tab
    And User_607 click Add button under Income section in Customer Financials tab
    And User_607 enter the Lumpsum Amount under Income screen in Customer Financials tab
    And User_607 enter the Pension Amount under Income screen in Customer Financials tab
    And User_607 select the Income option under Income screen in Customer Financials tab
    And User_607 select the Frequency option under Income screen in Customer Financials tab
    And User_607 click the Save button with mandatory field blank under Income details screen
    And User_607 verify validation message for mandatory field as blank under Income details screen
    Then logout from the ULSApplication

  @AT_INC_01_005
    Scenario: Modification of Income details record
    Given navigate the IJARA URL
    And login with valid credentials4
    And User_607 get the test data for test case AT_TW_AD_INC_05
   And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field Ijara App Data Entry Income Details List
	  And User_607 Select record after search
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
    Then logout from the ULSApplication
