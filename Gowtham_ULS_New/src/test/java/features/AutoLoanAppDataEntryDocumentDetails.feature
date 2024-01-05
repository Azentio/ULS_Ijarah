Feature: Auto Loan App Data Entry Document Details

  @AT_Al_DOC_09
  Scenario: Verify the fields in document details Auto Loan App Data Entry
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And User_607 click on document details info tab Auto Loan App Data Entry
    And User_607 Verify back button in document details Auto Loan App Data Entry
    And User_607 Verify Add button in document details Auto Loan App Data Entry
    And User_607 Verify Search box in document details Auto Loan App Data Entry
    And User_607 Verify Export to PDF in document details Auto Loan App Data Entry
    And User_607 Verify Export to Excel in document details Auto Loan App Data Entry
    And User_607 Click view button in list view screen
    And User_607 Verify Already filled data in document details Auto Loan App Data Entry
    And User_607 Click back button in document details Auto Loan App Data Entry record
    And User_607 Verify Post clicking on Add button system should allow user to create new record
    And User_607 Click back button in document details Auto Loan App Data Entry record
    And User_607 Search matching value system should display all the possible matching records
    And User_607 Search missmatching value system should display not matching any records
    And logout from the ULSApplication
    
    @AT_Al_DOC_10
    Scenario: Verify the fields in document details Auto Loan App Data Entry
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 get the test data for test case AT_AL_INC_01
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry Income Details List
    And User_607 Select record after search
    And User_607 click on document details info tab Auto Loan App Data Entry
    And User_607 Verify Export to PDF in document details Auto Loan App Data Entry
    Then user_607 verify in new app stage system is downloading the customer identification pdf file
    And User_607 Verify Export to Excel in document details Auto Loan App Data Entry
    Then user_607 verify in new app stage system is downloading the customer identification xls file
    And User_607 Verify the back button in List View screen
    And User_607 Select record after search
    And logout from the ULSApplication
    
    
 