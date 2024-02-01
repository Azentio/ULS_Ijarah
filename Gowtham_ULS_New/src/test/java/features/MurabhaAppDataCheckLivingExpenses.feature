Feature: Murabha AppData Check Living Expenses

  	@AT_MU_ADC_LV_01
    Scenario: To verify living expense screen should have all the configured screen at app data check stage (Ijarah product)
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on living expense info tab
		And user_607 click on view button of living expense screen at app data check stage
		Then user_607 verify expense type should show in living expense screen at app data check stage
		Then user_607 verify amount should show in living expense screen at app data check stage
		Then user_607 verify expected cost of living should show in living expense screen at app data check stage
		Then user_607 verify minimum cost of living should show in living expense screen at app data check stage
		Then user_607 verify accredit cost should show in living expense screen at app data check stage
		Then user_607 verify total living expense should show in living expense screen at app data check stage
		Then logout from the ULSApplication
		And user_607 invoke softAssert in data check living expense screen
  
  	@AT_MU_ADC_LV_02
		Scenario: To verify living expense screen should have all the field is in read only mode at app data check stage (Ijarah product)
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on living expense info tab
		And user_607 click on view button of living expense screen at app data check stage
		Then user_607 verify customer name field should be read only mode in living expense screen at app data check stage
		Then user_607 verify total living expense field should be read only mode in living expense screen at app data check stage
		Then user_607 verify Accredit cost field should be read only mode in living expense screen at app data check stage
		Then user_607 verify Is Spouse employed field should be read only mode in living expense screen at app data check stage
		Then user_607 verify Spouse salary field should be read only mode in living expense screen at app data check stage
		Then logout from the ULSApplication
		And user_607 invoke softAssert in data check living expense screen
		
		@AT_MU_ADC_LV_03
		Scenario: To verify living expense screen should have all the field is in read only mode at app data check stage (Ijarah product)
		Given navigate the IJARA URL
    And login with valid credentials11
		And User_607 Select LOS in module name
		And User_607 get the test data for test case AT_MU_ADC_LV_01
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha Appdata Check Living Expenses
    And User_607 Select record after search
    And user_607 click on living expense info tab
		And user_607 click on view button of living expense screen at app data check stage
		Then user_607 verify Living allowance field should be read only mode in living expense screen at app data check stage
		Then user_607 verify expected cost of living field should be read only mode in living expense screen at app data check stage
		Then user_607 verify minimum cost of living field should be read only mode in living expense screen at app data check stage
		Then user_607 verify expense type field should be read only mode in living expense screen at app data check stage
		Then user_607 verify amount field should be read only mode in living expense screen at app data check stage
		Then logout from the ULSApplication
		And user_607 invoke softAssert in data check living expense screen
		
		
		
		
		
		
		
		
		
		
		
		