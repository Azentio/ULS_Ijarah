Feature: Murabha Contract Singing 

  @AT_MU_CS_06
  Scenario: verify the fields
    Given navigate the IJARA URL
    And login with valid credentials12
    And User_610 get the test data set id for DS_AT_MU_CS_05
   # And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Contract Singing Screen in Murabha
    And User_610 verify the Contract Singing Authority field under Contract Singing Screen in Murabha
    And User_610 verify the Offered Amount field under Contract Singing Screen in Murabha
    And User_610 verify the Contract Singin Date field under Contract Singing Screen in Murabha
    And User_610 verify the Contract Validity field under Contract Singing Screen in Murabha
    Then logout from the ijaraApplication