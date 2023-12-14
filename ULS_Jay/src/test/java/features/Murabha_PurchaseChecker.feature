Feature: Murabha Purchase checker

  @AT_M_PUR_15
  Scenario: verify the field in purchase checker
    Given navigate the IJARA URL
    And login with valid credentials13
    And User_610 get the test data set id for DS_AT_M_PUR_15
    # And User_610 get the test data set id for DS_AT_MU_EMPD_07
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the purchase order screen
    And User_610 click view button
    And User_610 verify the Po Reference Number field 
    And User_610 verify the Purchas Order Date field
    And User_610 verify the Estimated Purchas Due Date field
    And User_610 verify the Assert Avaliablity field
    And User_610 verify the Receiver Name field
    And User_610 verify the Discount Percentage field
    And User_610 verify the Istemara Fees field
    And User_610 verify the Assert Price With Vat field
    And User_610 verify the Net Amount Payable To Dealer field
    And User_610 verify the Assert ID field
    Then logout from the ijaraApplication
