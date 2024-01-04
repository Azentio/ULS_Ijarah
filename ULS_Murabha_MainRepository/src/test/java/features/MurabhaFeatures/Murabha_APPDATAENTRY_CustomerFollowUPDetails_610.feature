Feature: Murabha Customer Follow Up Details 
@AT_MU_FU_001
Scenario: Verify the Fields 
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
		And User_610 get the test data set id for DS_AT_MU_FU_01
		And User_610 click the module name
    And User_610 select the LOS in module name
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details in morabha
    #
    #And User_610 verify the add buttton
    And User_610 click add button under customer follow details
    And User_610 validate called when field enabled or not under murabha customer follow details
    And User_610 validate Customer Responce field enabled or not under customer follow details
    And User_610 validate Follow Up Data field enabled or not under murabha customer follow details
    And User_610 validate Sign Status field enabled or not under customer follow details
    And User_610 validate Remark Category field enabled or not under customer follow details
    And User_610 validate Save button field enabled or not under customer follow details
    And User_610 validate Back button field enabled or not under customer follow details
    
    
    
   @AT_MU_FU_002
Scenario: Verify the Fields and Save
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
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
    
    @AT_MU_FU_003
Scenario: Verify the save button success message 
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
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
    And User_610 validate the save button under customer follow details in murabha
    
    
     @AT_MU_FU_004
Scenario: Verify the validation message for invalid data 
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
		And User_610 get the test data set id for DS_AT_MU_FU_01
		And User_610 click the module name
    And User_610 select the LOS in module name
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details in morabha
    And User_610 click add button under customer follow details
    And User_610 validate the save button under customer follow details
    And User_610 vaildate the message for blank field is which mandatory
    
    
    @AT_MU_FU_005
Scenario: Verify the validation message for invalid data 
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
		And User_610 get the test data set id for DS_AT_MU_FU_01
		And User_610 get the test data set id for DS_AT_MU_FU_005
		And User_610 click the module name
    And User_610 select the LOS in module name
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details in morabha
    
    And User_610 click add button under customer follow details
    And User_610 to verify the functionality of add button should allow create new record
    And User_610 to verify the functionality of edit button should redirct the edit page
    #And User_610 to verify the functionality of search box with matching data should be show matching data in murabha
    #And User_610 to verfiy the functionality of search box with not matching data should not be show no data in murabha
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    