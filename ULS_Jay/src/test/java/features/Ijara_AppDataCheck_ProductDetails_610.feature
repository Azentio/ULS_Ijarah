Feature: Ijara Appa Data Check product details or Facility Details 

  @AT_DC_PD_002
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    And User_610 verify the Scheme field
    And User_610 verify the product field
    And User_610 verify the Request Amount field
    And User_610 verify the Loan Tenure field
    Then logout from the ijaraApplication

  @AT_DC_PD_003
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    And User_610 verify the Data under Scheme field
    And User_610 verify the Data under product field
    And User_610 verify the Data under Request Amount field
    #And User_610 verify the Data under Loan Tenure field
    And User_610 verify the Data under currency field
    Then logout from the ijaraApplication

  @AT_DC_PD_005
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    And User_610 verify the Product field should be mandatory Display and field should text
    And User_610 verify the Request Type field should be mandatory Display and field should text
    Then logout from the ijaraApplication

  @AT_DC_PD_006
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    And User_610 verify the Scheme field should be mandatory Display and field should text
    And User_610 verify the Request Amount field should be Non mandatory Display and field should text
    Then logout from the ijaraApplication

  @AT_DC_PD_007
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    And User_610 verify the Tenure Months field should be mandatory Display and field should text
    Then logout from the ijaraApplication

  @AT_DC_PD_008
  Scenario: check Data product Deatils
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_IJ_IA_01
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Facility Info Screen
    And User_610 click view button in customer identification
    Then logout from the ijaraApplication
