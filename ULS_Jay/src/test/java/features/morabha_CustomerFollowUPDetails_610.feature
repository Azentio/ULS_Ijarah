Feature: Murabha Customer Follow Up Details 
@AT_MU_FU_001
Scenario: Verify the Fields 
    Given navigate the IJARA URL
    And login with valid credentials06
		And User_610 get the test data set id for DS_AT_MU_FU_01
		And User_610 click the module name
    And User_610 select the LOS in module name
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details in morabha
    #
    And User_610 verify the add buttton
    And User_610 click add button under customer follow details
    And User_610 validate called when field enabled or not under murabha customer follow details
    And User_610 validate Customer Responce field enabled or not under customer follow details
    And User_610 validate Follow Up Data field enabled or not under murabha customer follow details
    And User_610 validate Sign Status field enabled or not under customer follow details
    And User_610 validate Remark Category field enabled or not under customer follow details
    And User_610 validate Save button field enabled or not under customer follow details
    And User_610 validate Back button field enabled or not under customer follow details
    
    
    
   @AT_MU_FU_002
Scenario: Verify the Fields 
    Given navigate the IJARA URL
    And login with valid credentials06
		And User_610 get the test data set id for DS_AT_MU_FU_01
		And User_610 click the module name
    And User_610 select the LOS in module name
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details in morabha
    And User_610 click add button under customer follow details
    #
    And User_610 validate the called when field should be date , mandatory and editable in murabha 
    And User_610 validate the customer responce field should be lookUp , mandatory and editable in Murabha
    And User_610 validate the follow up date field should be date , mandatory and editable in murabha 
    And User_610 validate the sign Status field should be dropdown , mandatory and editable in murabha
    And User_610 validate the remarks field should be textbox , mandatory and editable in murabha
    And User_610 validate the save button under customer follow details in murabha
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    