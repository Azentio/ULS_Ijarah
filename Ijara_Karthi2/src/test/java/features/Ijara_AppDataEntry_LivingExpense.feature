Feature: Verify the functionalities for AppDataEntry(LivingExpenses)
@AT_LEA_001
Scenario: Creation of Living Expense with valid data.
Given navigate the IJARA URL
And user update test data set id for AT_LEA_001
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton
And user click the ExpenseType on Action
And user click the field livingExpense 
And user click the field AddButton
And user click the field AddbuttonunderExpenseInfo
And user verify the field saveButton
And user verify the field BackButton
And user verify the field DeleteButton
And user verify the field ExpenseType
And user verify the field Amount

@AT_LEA_002_&_003_&_004
Scenario: Creation of Living Expense with valid data.
Given navigate the IJARA URL
And user update test data set id for AT_LEA_001
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton
And user click the ExpenseType on Action
And user click the field livingExpense 
And user click the field AddButton
And user click the CustomerName in input field
And user select the CustomerName in under customerInput
And user click the field AddbuttonunderExpenseInfo
And user verify the field BackButton
And user verify the field DeleteButton
And user click the select check box
And user select the type in expeseType select box
And user Enter the Amount in Amount field
And user verify the Total living expense field
And user verify the Accredited Cost field
And user click the field saveButton



@AT_LEA_005
Scenario: Creation of Living Expense with valid data.
Given navigate the IJARA URL
And user update test data set id for AT_LEA_001
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton
And user click the ExpenseType on Action
And user click the field livingExpense 
And user click the field AddButton
And user click the field AddbuttonunderExpenseInfo
And user click the select check box
And user select the type in expeseType select box
#And user Enter the Negative Amount in Amount field
And user Enter the Special Char in Amount field
And user Enter the String value in Amount field
And user Enter the Amount in Amount field
And user click the field saveButton
And user verify the Please fill Mandatory field 


@AT_LEA_006
Scenario: Creation of Living Expense with valid data.
Given navigate the IJARA URL
And user update test data set id for AT_LEA_001
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton
And user click the ExpenseType on Action
And user click the field livingExpense 
And user click the Edit button under Action
And user verify the field saveButton
And user verify the field BackButton
And user verify the field DeleteButton
And user verify the field ExpenseType
And user verify the field Amount
And user modify the Amount field
And user click the field saveButton
And user verify the Please fill Mandatory field 
And user Enter the Amount in Amount field
And user click the field saveButton















