Feature: Verify the functionalities for AppDataEntry(LivingExpenses)

  @AT_TW_AD_LEA_001
  Scenario: Creation of Living Expense with valid data.
        
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_TW_AD_LEA_001
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    
    
    And User_610 click the field livingExpense
    And User_610 click the field AddButton
    And User_610 click the field AddbuttonunderExpenseInfo
    And User_610 verify the field saveButton
    And User_610 verify the field BackButton
    And User_610 verify the field DeleteButton
    And User_610 verify the field ExpenseType
    And User_610 verify the ExpectedCostOfLiving field
    And User_610 Verify the MinimumCostOfLiving Field
    And User_610 verify the field Amount
    Then logout from the ijaraApplication

  @AT_TW_AD_LEA_002
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And login with valid credentials07
    And User_610 get the test data set id for DS_AT_TW_AD_LEA_001
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 get the test data set id for DS_AT_TW_AD_LEA_002
    
    
    And User_610 click the field livingExpense
    And User_610 click the field AddButton
    And User_610 verify the field ExpenseType
    And User_610 verify the field Amount
    And User_610 click the CustomerName in input field
    And User_610 select the CustomerName in under customerInput
    And User_610 click the field AddbuttonunderExpenseInfo
    And User_610 verify the field BackButton
    And User_610 verify the field DeleteButton
    And User_610 select the type in expeseType select box
    And User_610 Enter the Amount in Amount field
    And User_610 save button and validate the success meassage
    Then logout from the ijaraApplication

