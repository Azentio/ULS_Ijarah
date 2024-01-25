Feature: Murabh app Data Check Repayment Mode

  @AT_MU_ADC_RE_01
  Scenario: To verify that all fields are present in App data check_Repayment mode module
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on Repayment Mode info tab
    And user_607 click on view button of Repayment mode screen at app data check stage
		And user_607 Validate that Repayment mode field is displayed in repayment mode page
		And user_607 Validate that Account Holder Name field is displayed in repayment mode page
		And user_607 Validate that Account Type field is displayed in repayment mode page
		And user_607 Validate that Account Number field is displayed in repayment mode page
		And user_607 Validate that Account Currency field is displayed in repayment mode page
		And user_607 Validate that Bank Name field is displayed in repayment mode page
		And user_607 Validate that Bank Branch field is displayed in repayment mode page
		And user_607 Validate that ECS Code field is displayed in repayment mode page
		And user_607 Validate that Status field is displayed in repayment mode page
		Then logout from the ULSApplication
		
		@AT_MU_ADC_RE_02
		Scenario: To verify that all fields are present in App data check_Repayment mode module view list
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on Repayment Mode info tab
		And user_607 Validate that Repayment mode field is displayed in repayment mode module view list
		And user_607 Validate that Account holder name field is displayed in repayment mode module view list
		And user_607 Validate that Account type field is displayed in repayment mode module view list
		And user_607 Validate that Account Currency field is displayed in repayment mode module view list
		And user_607 Validate that Bank Name field is displayed in repayment mode module view list
		And user_607 Validate that Currency field is displayed in repayment mode module view list
		Then logout from the ULSApplication
		
		@AT_MU_ADC_RE_03
		Scenario: To verify that all fields are present in App data check_Repayment mode module view list
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on Repayment Mode info tab
    And User_607 Search the maching record in the repayment mode list view
    And User_607 Search the missmatching record in the repayment mode list view
    And User_607 Verify Export to PDF in document details Auto Loan App Data Entry
    Then user_607 verify in new app stage system is downloading the customer identification pdf file
    And User_607 Verify Export to Excel in document details Auto Loan App Data Entry
    Then user_607 verify in new app stage system is downloading the customer identification xls file
    Then logout from the ULSApplication
    And user_607 invoke soft asset in customer identification details screen at new app stage
    
    
    
    
		