Feature: Murabha_AppDataEntry_LivingExpenses

  @AT_LEA_001
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 verify the field saveButton
    And User_607 verify the field BackButton
    And User_607 verify the field ExpenseType
    And User_607 verify the ExpectedCostOfLiving field
    And User_607 Verify the MinimumCostOfLiving Field
    And User_607 verify the field Amount

  @AT_LEA_002
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field                                                          																																											.
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 verify the field ExpenseType
    And User_607 verify the field Amount
    And User_607 click the CustomerName in input field
    And User_607 select the CustomerName in under customerInput
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 verify the field BackButton
    And User_607 select the type in expeseType select box
    And User_607 click the select check box
    And User_607 Enter the Amount in Amount field
    And User_607 Enter the Value ExpectedCostOfLiving field
    And User_607 Enter the Value MinimumCostOfLiving Field

  @AT_LEA_003
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 click the CustomerName in input field
    And User_607 select the CustomerName in under customerInput
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 select the type in expeseType select box
    And User_607 click the select check box
    And User_607 Enter the Amount in Amount field
    And User_607 verify the Total living expense field
    And User_607 verify the Accredited Cost field
    And User_607 verify the ExpectedCostOfLiving field
    And User_607 Verify the MinimumCostOfLiving Field

  @AT_LEA_004
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 click the CustomerName in input field
    And User_607 select the CustomerName in under customerInput
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 verify the field BackButton
    And User_607 verify the field DeleteButton
    And User_607 select the type in expeseType select box
    And User_607 click the select check box
    And User_607 Enter the Amount in Amount field
    And User_607 Enter the Value ExpectedCostOfLiving field
    And User_607 Enter the Value MinimumCostOfLiving Field

  @AT_LEA_005
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 select the type in expeseType select box
    And User_607 click the select check box
    #And User_607 Enter the Negative Amount in Amount field
    And User_607 Enter the Special Char in Amount field
    And User_607 Enter the String value in Amount field
    And User_607 Enter the Amount in Amount field
    And User_607 Enter the Value ExpectedCostOfLiving field
    And User_607 Enter the Value MinimumCostOfLiving Field
    And User_607 click the field saveButton
    And User_607 verify the Please fill Required field

  @AT_LEA_006
  Scenario: Creation of Living Expense with valid data.
    Given navigate the IJARA URL
    And User_607 update test data set id for AT_LEA_001
    And login with valid credentials
    #And User_607 click the module in select field
    #And User_607 click the LOS in select field
    And User_607 click the messagebox under LOS field
    And User_607 click the search button under messagebox
    And User_607 Enter the clientname under searchButton
    And User_607 Select record after search
    And User_607 click the field livingExpense
    And User_607 click the field AddButton
    And User_607 click the CustomerName in input field
    And User_607 select the CustomerName in under customerInput
    And User_607 click the field AddbuttonunderExpenseInfo
    And User_607 verify the field BackButton
    And User_607 verify the field DeleteButton
    And User_607 select the type in expeseType select box
    And User_607 click the select check box
    And User_607 Enter the Amount in Amount field
    And User_607 verify the Total living expense field
    And User_607 verify the Accredited Cost field
    And User_607 click the field saveButton
    And User_607 click the Edit button under Action
    And User_607 verify the field saveButton
    And User_607 verify the field BackButton
    And User_607 verify the field DeleteButton
    And User_607 verify the field ExpenseType
    And User_607 verify the field Amount
    And User_607 modify the Amount field
    And User_607 click the field saveButton
    #And User_607 verify the Please fill Mandatory field
    And User_607 Enter the Amount in Amount field
    And User_607 Enter the Value ExpectedCostOfLiving field
    And User_607 Enter the Value MinimumCostOfLiving Field
    And User_607 click the field saveButton
