Feature: App Data Customer FollowUp Details

  @AT_AD_FU_001
  Scenario: Customer FollowUp Details
  
    Given navigate the IJARA URL
    And login with valid credentials
    And User_610 get the test data set id for DS_AT_DC_ID_001
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details
    And User_610 validate Add button field enabled or not under customer follow details
    And User_610 click add button under customer follow details
    And User_610 validate called when field enabled or not under customer follow details
    And User_610 validate Customer Responce field enabled or not under customer follow details
    And User_610 validate Follow Up Data field enabled or not under customer follow details
    And User_610 validate Sign Status field enabled or not under customer follow details
    And User_610 validate Remark Category field enabled or not under customer follow details
    And User_610 validate Save button field enabled or not under customer follow details
    And User_610 validate Back button field enabled or not under customer follow details


@AT_AD_FU_002
  Scenario: Customer FollowUp Details
    Given navigate the IJARA URL
    And login with valid credentials
    And User_610 get the test data set id for DS_AT_AD_FU_002
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details
    And User_610 click add button under customer follow details
     #   
    And User_610 validate the called when field should be date , mandatory and editable
    And User_610 validate the customer responce field should be lookUp , mandatory and editable
    And User_610 validate the follow up date field should be date , mandatory and editable
    And User_610 validate the sign Status field should be dropdown , mandatory and editable
    And User_610 validate the remarks field should be textbox , mandatory and editable 
    And User_610 validate the save button under customer follow details
    
    
    @AT_AD_FU_003
  Scenario: Customer FollowUp Details
    Given navigate the IJARA URL
    And login with valid credentials
    And User_610 get the test data set id for DS_AT_AD_FU_002
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details
    And User_610 click add button under customer follow details
        
    And User_610 validate the called when field should be date , mandatory and editable
    And User_610 validate the customer responce field should be lookUp , mandatory and editable
    And User_610 validate the follow up date field should be date , mandatory and editable
    And User_610 validate the sign Status field should be dropdown , mandatory and editable
    And User_610 validate the remarks field should be textbox , mandatory and editable 
    And User_610 validate the save button under customer follow details
    And User_610 validate the conformation message after save button and close button
    
    
    @AT_AD_FU_004
  Scenario: Customer FollowUp Details
    Given navigate the IJARA URL
    And login with valid credentials
    And User_610 get the test data set id for DS_AT_AD_FU_002
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details
    And User_610 click add button under customer follow details
        
    And User_610 validate the called when field should be date , mandatory and editable
    And User_610 validate the save button under customer follow details
    And User_610 vaildate the message for blank field is which mandatory
    
    
    @AT_AD_FU_005
  Scenario: Customer FollowUp Details
    Given navigate the IJARA URL
    And login with valid credentials
    And User_610 get the test data set id for DS_AT_AD_FU_002
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the customer follow details
    
    #And User_610 validate Add button field enabled or not under customer follow details
    #And User_610 validate Edit button field enabled or not under customer follow details
    #And User_610 validate search for the record field enabled or not under customer follow details
    #And User_610 validate export to PDF and EXCEL field enabled or not under customer follow details
    #And User_610 validate followUp details field enabled or not under customer follow details
    #
    #And User_610 to verify the values in list view should be not editable
    And User_610 click add button under customer follow details
    And User_610 to verify the functionality of add button should allow create new record
    And User_610 to verify the functionality of edit button should redirct the edit page
    And User_610 to verify the functionality of search box with matching data should be show matching data
    And User_610 to verfiy the functionality of search box with not matching data should not be show no data
    #And User_610 to verify the functionality of export to PDF button should download PDF file
    #And User_610 to verify the functionality of export to EXCEL button should download EXCEL file
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    