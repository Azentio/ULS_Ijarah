Feature: Identifications Details under Data Check Stage
 @AT_DC_ID_001
  Scenario: Identifications Details
    Given navigate the IJARA URL
    And login with valid credentials-Data Check
    And User_610 get the test data set id for DS_AT_DC_ID_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
  #  
    And User_610 click additional customer info
    And User_610 click view button in customer identification 
    And User_610 click eye button in customer identification 
  # 
   # And User_610 verify the field Save button under identification details 
    And User_610 verify the field Back button under identification details  
    Then logout from the ULS Application
   
    @AT_DC_ID_002
  Scenario: Identifications Details
    Given navigate the IJARA URL
    And login with valid credentials-Data Check
    And User_610 get the test data set id for DS_AT_DC_ID_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
  #  
    And User_610 click additional customer info
    And User_610 click view button in customer identification 
    And User_610 click eye button in customer identification 
  # 
    And User_610 verify the field ID Type under identification details 
    And User_610 verify the field ID Number under identification details 
    And User_610 verify the field ID Issue Date under identification details 
    And User_610 verify the field ID Expiry identification details 
    And User_610 verify the field Issuing Authority under identification details 
    And User_610 verify the field Control Of Issue under identification details 
    
    Then logout from the ULS Application
    
     @AT_DC_ID_003
  Scenario: Identifications Details
    Given navigate the IJARA URL
    And login with valid credentials-Data Check
    And User_610 get the test data set id for DS_AT_DC_ID_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
  #  
    And User_610 click additional customer info
    And User_610 click view button in customer identification 
    And User_610 click eye button in customer identification 
  # 
    And User_610 verify the Data Display in ID Type under identification details 
    And User_610 verify the Data Display in ID Number under identification details 
    And User_610 verify the Data Display in ID Issue Date under identification details 
    And User_610 verify the Data Display in ID Expiry identification details 
    And User_610 verify the Data Display in Issuing Authority under identification details 
    And User_610 verify the Data Display in Control Of Issue under identification details 
    
    Then logout from the ULS Application
        
    @AT_DC_ID_005
  Scenario: Identifications Details
    Given navigate the IJARA URL
    And login with valid credentials-Data Check
    And User_610 get the test data set id for DS_AT_DC_ID_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
  #  
    And User_610 click additional customer info
    And User_610 click view button in customer identification 
    And User_610 click eye button in customer identification     
  #
    And User_610 verify ID Type field should be mandatory display and text box
    And User_610 verify ID Type number should be mandatory display and numberic
    And User_610 verify Issue Date field should be non mandatory display and calender
   # 
    Then logout from the ULS Application
    
    @AT_DC_ID_006
  Scenario: Identifications Details
    Given navigate the IJARA URL
    And login with valid credentials-Data Check
    And User_610 get the test data set id for DS_AT_DC_ID_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
  #  
    And User_610 click additional customer info
    And User_610 click view button in customer identification 
    And User_610 click eye button in customer identification     
  #
    And User_610 verify Expiry Date field should be non mandatory display and text box
    And User_610 verify Issuing Authority number should be non mandatory display and numberic
    And User_610 verify Country of Issue field should be non mandatory display and calender
  #
   Then logout from the ULS Application