Feature: Tawarah_AppDataEntry_IdentificationDetailsListView

@AT_TW_NEWAPP_IDA_07

Scenario: To verify the Identification Details List view
Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And user click on the Additional Customer info
  And user click on Add Button below the Additional Customer info
  Then User to verify the Values in list view should be in read only mode in customer details
  And user to verify the Id type should be in display only        
  And user to verify the Id number should be in display only  
  And user to verify the Id issue date should be in display only  
  And user to verify the Id expiry date should be in display only  
  And user to verify the Id status should be in display only   