Feature: Persoanl Loan Customer Search

  @AT_PL_CS_01
  Scenario: to test the functionality of customer search with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_01
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Check Customer Type should be mandatory 
		And User_607 Check Customer Type Field should be Selectable
		And User_607 Check CIF ID Field should be Editable
		And User_607 Check CIF ID Field should be numeric
		And User_607 Check ID Type Field should be Selectable
		And User_607 Check ID Number Field should be Alphanumeric
		
		And logout from the ULSApplication
		
		@AT_PL_CS_02
  Scenario: to test the functionality of customer search with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_03
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Update testdata from AT_IJCS_02
		And User_607 Select Customer type
    And User_607 Check Customer Name Field should be Editable
    And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
    And User_607 Check Mobile Number Field should be non mandatory 
    And User_607 Check Mobile Number Field should accept only numeric values
    And User_607 Check Mobile Number Field should be editable
    And User_607 Check Date of birth Field should be mandatory
    And User_607 Check Email ID Field should be non-mandatory
 		And User_607 Check Email ID Field should be alphanumeric
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Create New button
    And User_607 Check System must redirect the Application Details page
    And logout from the ULSApplication
		
		
		
		