Feature: Murabha app data check insurance info

@AT_MU_IA_01
  Scenario: verify the Screen
    Given navigate the IJARA URL
    And login with valid credentials08
    And User_610 get the test data set id for DS_AT_MU_IA_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Insurance Info screen
    And User_610 click view button 
    And User_610 verify the Insurance Info screen get open
    Then logout from the ijaraApplication
    
    @AT_MU_IA_02
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials08
    And User_610 get the test data set id for DS_AT_MU_IA_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Insurance Info screen
    And User_610 click view button 
    And User_610 verify the field Insurance year
    And User_610 verify the field Depreciation
    And User_610 verify the field Assert Price
    Then logout from the ijaraApplication

    
    @AT_MU_IA_03
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials08
    And User_610 get the test data set id for DS_AT_MU_IA_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Insurance Info screen
    And User_610 click view button 
    And User_610 verify the Rate Per Price
    And User_610 verify the Minium Insurance Premium
    And User_610 verify the Base Insurance Premium
    Then logout from the ijaraApplication
    
    
    @AT_MU_IA_04
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials08
    And User_610 get the test data set id for DS_AT_MU_IA_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Insurance Info screen
    And User_610 click view button
    And User_610 verify the VAT premium
    And User_610 verify the Net Premium
    And User_610 verify the Back button
    Then logout from the ijaraApplication 
    