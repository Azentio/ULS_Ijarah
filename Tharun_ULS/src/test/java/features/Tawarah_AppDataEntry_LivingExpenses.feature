Feature: Murabha_AppDataEntry_LivingExpenses



@AT_TW_AD_LEA_004
Scenario: Creation of Living Expense with valid data.
Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And User_610 click Living Expenses Screen in App Data Entery 
And user click the field AddButton
And user click the CustomerName in input field
And user select the CustomerName in under customerInput
And user click the field AddbuttonunderExpenseInfo
And user verify the field BackButton
And user verify the field DeleteButton
And user select the type in expeseType select box
And user click the select check box
And user Enter the Amount in Amount field
And user Enter the Value ExpectedCostOfLiving field
And user Enter the Value MinimumCostOfLiving Field


@AT_TW_AD_LEA_005
Scenario: Creation of Living Expense with valid data.
 Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And User_610 click Living Expenses Screen in App Data Entery
And user click the field AddButton
And user click the field AddbuttonunderExpenseInfo
And user select the type in expeseType select box
And user click the select check box
#And user Enter the Negative Amount in Amount field
And user Enter the Special Char in Amount field
And user Enter the String value in Amount field
And user Enter the Amount in Amount field
And user Enter the Value ExpectedCostOfLiving field
And user Enter the Value MinimumCostOfLiving Field
And user click the field saveButton
And User_7181 enter the special character for account number field

@AT_TW_AD_LEA_006
Scenario: Creation of Living Expense with valid data.
 Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And User_610 click Living Expenses Screen in App Data Entery
And user click the field AddButton
And user click the CustomerName in input field
And user select the CustomerName in under customerInput
And user click the field AddbuttonunderExpenseInfo
And user verify the field BackButton
And user verify the field DeleteButton
And user select the type in expeseType select box
And user click the select check box
And user Enter the Amount in Amount field
And user verify the Total living expense field
And user verify the Accredited Cost field
And user click the field saveButton
And user click the Edit button under Action
And user verify the field saveButton
And user verify the field BackButton
And user verify the field DeleteButton
And user verify the field ExpenseType
And user verify the field Amount
And user modify the Amount field
And user click the field saveButton
#And user verify the Please fill Mandatory field 
And user Enter the Amount in Amount field
And user Enter the Value ExpectedCostOfLiving field
And user Enter the Value MinimumCostOfLiving Field
And user click the field saveButton

  @AT_TW_AD_LEA_007
  Scenario: System should allow to do modification
    Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And User_610 click Living Expenses Screen in App Data Entery
  And User_610 click edit button under documents details
  And User_610 verify the system not allow user to do a modification with invalid data Spouse Salary
  And User_610 save button and verify the success message in murabha


@AT_TW_AD_LEA_010
Scenario: Validation of Living expense view list
  Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
  And User_610 click Living Expenses Screen in App Data Entery
And User_610 click edit button under documents details
And Update the status to Inactive in living expense
And Click on Save icon in Living expense tab


@AT_TW_AD_LEA_003

Scenario: Creation of Living Expense with valid data.
 Given navigate the IJARA URL
   And login with valid credentials2
    And user update test data set id for AT_LEA_001
 # And User_610 click the module name
  # And User_610 select the LOS in module name
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
  And user click the ExpenseType on Action
 And User_610 click Living Expenses Screen in App Data Entery
And user click the field AddButton
And user click the CustomerName in input field
And user select the CustomerName in under customerInput
And user click the field AddbuttonunderExpenseInfo
And user select the type in expeseType select box
And user click the select check box
And user Enter the Amount in Amount field
And user verify the Total living expense field
And user verify the Accredited Cost field
And user verify the ExpectedCostOfLiving field
And user Verify the MinimumCostOfLiving Field




