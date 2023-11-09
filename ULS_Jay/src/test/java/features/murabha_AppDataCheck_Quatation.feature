Feature: Murabha app data check Quatation info

@AT_MU_QA_01
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
    And User_610 click Quatation Info screen
    And User_610 click view button 
    And User_610 verify the Insurance Info screen get open
    And User_610 verify the field Insurance Company, Base Premium ,Vat on Base Premium
    And User_610 verify the field Net Base Premium , Total Discount , Expiry Date , Quatatio Reference Number
    Then logout from the ijaraApplication
    
    @AT_MU_QA_02
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
    And User_610 click Quatation Info screen
    And User_610 click view button 
    And User_610 verify the Insurance Info screen get open
    And User_610 verify the field Insurance Company
    And User_610 verify the field Base Premium
    And User_610 verify the field Vat On Base Premium
    Then logout from the ijaraApplication
    
    @AT_MU_QA_03
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
    And User_610 click Quatation Info screen
    And User_610 click view button 
    And User_610 verify the Insurance Info screen get open
    And User_610 verify the field Net Base Premium
    And User_610 verify the field Total Discount
    And User_610 verify the field Expiry Date
    Then logout from the ijaraApplication
    
     @AT_MU_QA_04
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
    And User_610 click Quatation Info screen
    And User_610 click view button 
    And User_610 verify the Insurance Info screen get open
    And User_610 verify the field Quatation Reference Number
    And User_610 verify the Back button
    Then logout from the ijaraApplication
    
    @AT_MU_QA_05
  Scenario: matching Data and Mis Matching Data
    Given navigate the IJARA URL
    And login with valid credentials08
    And User_610 get the test data set id for DS_AT_MU_IA_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Quatation Info screen
    And User_610 click search button and enter matching data
    And User_610 click search button and enter mismatching data
    Then logout from the ijaraApplication
     #And User_610 verify the PDF button
    
    