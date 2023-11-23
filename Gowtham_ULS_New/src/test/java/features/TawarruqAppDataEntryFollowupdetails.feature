Feature: Tawarruq AppData Entry Followup details

  @AT_TW_AD_FU_001
  Scenario: Verify the Fields
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    #
    #And User_607 verify the add buttton
    And User_607 click add button under customer follow details
    And User_607 validate called when field enabled or not under murabha customer follow details
    And User_607 validate Customer Responce field enabled or not under customer follow details
    And User_607 validate Follow Up Data field enabled or not under murabha customer follow details
    And User_607 validate Sign Status field enabled or not under customer follow details
    And User_607 validate Remark Category field enabled or not under customer follow details
    And User_607 validate Save button field enabled or not under customer follow details
    And User_607 validate Back button field enabled or not under customer follow details
    Then logout from the ULSApplication

  @AT_TW_AD_FU_002
  Scenario: Verify the Fields and Save
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    And User_607 click add button under customer follow details
    #
    And User_607 validate the called when field should be date , mandatory and editable in murabha
    And User_607 validate the customer responce field should be lookUp , mandatory and editable in Murabha
    And User_607 validate the follow up date field should be date , mandatory and editable in murabha
    And User_607 validate the sign Status field should be dropdown , mandatory and editable in murabha
    And User_607 validate the remarks field should be textbox , mandatory and editable in murabha
    And User_607 validate the save button under customer follow details in murabha

  @AT_TW_AD_FU_003
  Scenario: Verify the save button success message
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    And User_607 click add button under customer follow details
    #
    And User_607 validate the called when field should be date , mandatory and editable in murabha
    And User_607 validate the customer responce field should be lookUp , mandatory and editable in Murabha
    And User_607 validate the save button under customer follow details in murabha

  @AT_TW_AD_FU_004
  Scenario: Verify the validation message for invalid data
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    And User_607 click add button under customer follow details
    And User_607 click the Save button with mandatory field blank under Income details screen
    And User_607 verify validation message for mandatory field as blank under Income details screen

  @AT_TW_AD_FU_005
  Scenario: Verify the validation message for invalid data
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    And User_607 click add button under customer follow details
    And User_607 to verify the functionality of add button should allow create new record
    And User_607 to verify the functionality of edit button should redirct the edit page
    #And User_607 to verify the functionality of search box with matching data should be show matching data in murabha
    #And User_607 to verfiy the functionality of search box with not matching data should not be show no data in murabha
    Then logout from the ULSApplication
    
    
    
    @AT_TW_AD_FU_006
    Scenario: Verify the Fields
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details
    And User_607 Select record after search
    And User_607 click the customer follow details in morabha
    And User_607 Click Edit button in Follow-Up Details List Screen
    And User_607 Check Save button and Back button in Follow Up Details screen
    And User_607 Check Able to modify the record in Follow Up Details screen
    And User_607 Click save button Follow-Up Details Screen
    And User_607 Click Edit button in Follow-Up Details List Screen
    And User_607 Clear the value in Called when field
    And User_607 Click save button Follow-Up Details Screen
    And User_607 Check Please Fill Details Popup showing or not
    And User_607 Enter invalid in Called when field
    And User_607 Click save button Follow-Up Details Screen
    And User_607 Check Please Fill Details Popup showing or not
    And User_607 Clicking on back button system should navigate to the previous screen
    And User_607 to verify the functionality of edit button should redirct the edit page
    Then logout from the ULSApplication
    
    
    
    
    
    
    
    
    
    
    
    
