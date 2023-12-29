Feature: Auto Loan AppData Entry Identification Details

  @AT_AL_IND_01
  Scenario: to test the customer identification details screen with valid input at new app stage
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_01
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on add button in customer identification screen
    Then user_607 verify id type field should be editable mandatory dropdown
    Then user_607 verify id number field should be editable mandatory numeric field
    Then user_607 verify id issue date field should be editable non mandatiry mandatory calendar field
    Then user_607 verify id expairy date field should be editable non mandatiry mandatory calendar field
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage


 @AT_AL_IND_02
  Scenario: to test the customer identification details screen with valid input at new app stage
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_01
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on add button in customer identification screen
    Then user_607 verify id type field should be editable mandatory dropdown
    Then user_607 verify id number field should be editable mandatory numeric field
    Then user_607 verify id issue date field should be editable non mandatiry mandatory calendar field
    Then user_607 verify id expairy date field should be editable non mandatiry mandatory calendar field
    Then user_607 verify issuing authority field should be editable non mandatory dropdown
    Then user_607 verify country of issue field should be editable non mandatory dropdown
    Then user_607 verify primary ID flag field should be toggle buttton
    And user_607 click on save button in customer identification details of new app stage
    Then user_607 system should show the success pop up for identification details saved record in new app stage
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage
    
	
  @AT_AL_IND_03
  Scenario: to test the customer identificatin details screen with in valid input at new app stage
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_02
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on add button in customer identification screen
    And user_607 click on save button customer identification details screen without enter the mandatory details at new app stage
    Then user_607 verify system should show the validation to fill the mandatory details in customer identification screen at new app stage
    And user_607 enter the special character input in id number field
    Then user_607 verify system should show the validation for the id number field at new app stage
    And user_607 enter the character input in ID number field
    #Then user_607 verify system wont allow user to enter the character input in ID number field at new app stage
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage
    
    
  @AT_AL_IND_04
  Scenario: to verify user can able to update the customer identification details record from list view
     Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_03
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on edit button of customer identification details list view record
    And user_607 update the id number field in identification detais record at new app stage
    And user_607 click on save button in customer identification details of new app stage
    Then user_607 verify system should show the successful update pop up in identification details screen at new appp stage
    And user_607 get the list view record of customer identification at new app stage
    Then user_607 verify system should show the updated value in identification details at new app stage
    Then logout from the ULSApplication

  @AT_AL_IND_05
  Scenario: to test the customer identificatin details screen with in valid input at new app stage
     Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_04
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on edit button of customer identification details list view record
    And user_607 remove the mandatory details value from customer identification details of updated record at new app stage
    And user_607 click on save button customer identification details screen without enter the mandatory details at new app stage
    And user_607 enter the special character input in id number field
    Then user_607 verify system should show the validation for the id number field at new app stage
    And user_607 enter the character input in ID number field
    #Then user_607 verify system wont allow user to enter the character input in ID number field at new app stage
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage

  @AT_AL_IND_06
  Scenario: To test the customer identification details screen in new app stage
     Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_05
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 click on edit button of customer identification details list view record
    Then user_607 verify system should change the identification record status active and in active at new app stage
    And user_607 click on edit button of the list view record of customer identification at new app stage
    Then user_607 verify system should change the identification record status active and in active at new app stage
    And user_607 click on edit button of the list view record of customer identification at new app stage
    And user_607 click on view summary button in identification new app stage record
    Then user_607 verify system should show the record summary of identification at new app stage
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage

  @AT_AL_IND_07
  Scenario: To test the customer identification details screen in new app stage
     Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And user_607 get the test data for test case id AT_AL_IND_06
    And user_607 click on additional customer info tab in new application stage
    And user_607 click on edit button customer personal information screen at new app stage
    And user_607 verify identification list view record should be read only not editable at new app stage
    And user_607 click on search button in customer identification details list view at new app stage
    And user_607 search for valid search text in customer identification details list view at new app stage
    Then user_607 system should show the search result in customer identification details list view at new app stage
    And user_607 search for in valid search text in customer identification details list view at new app stage
    Then user_607 system should not show the search result in customer identification details list view at new app stage
    And user_607 click on export button in customer identification details list view
    And user_607 click on pdf export of customer identification details in new app stage
    Then user_607 verify in new app stage system is downloading the customer identification pdf file
    And user_607 click on export button in customer identification details list view
    And user_607 click on xls export of customer identification details in new app stage
    Then user_607 verify in new app stage system is downloading the customer identification xls file
    And user_607 click on add button in customer identification screen
    And user_607 click on back button in customer identification details in new app stage
    Then user_607 verify identififcation details screen got move backward to previos screen at new app stage
    And user_607 click on edit button of customer identification details list view record
    And user_607 click on back button in customer identification details in new app stage
    Then user_607 verify identififcation details screen got move backward to previos screen at new app stage
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage
