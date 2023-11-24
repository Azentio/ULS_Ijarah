Feature: Murabha App Data Entery Living Expenses

  @AT_LEA_007
  Scenario: System should allow to do modification
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_FU_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Living Expenses Screen in App Data Entery
  	And User_610 click edit button under documents details
  	And User_610 verify the system not allow user to do a modification with invalid data Spouse Salary
  	And User_610 save button and verify the success message in murabha
  	Then logout from the ijaraApplication