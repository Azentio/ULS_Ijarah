Feature: Tawarruq Commodity Maker Adhoc Payment

  @AT_TW_CSM_09
  Scenario: Verify the fields in adhoc payment
        
    Given navigate the IJARA URL
    And login with valid credentials10
    And User_610 get the test data set id for DS_AT_TW_CSM_06
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the Adhoc Payment Screen 
    And User_610 click view button
    And User_610 verify the Transaction Type field
    And User_610 verify the Transaction Againts field
    And User_610 verify the Reference Number field
    And User_610 verify the Paid Amount field
    Then logout from the ijaraApplication