Feature: Customer Search

  @AT_MU_IJCS_04
  Scenario: to test the functionality of customer search with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_01
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

		@AT_MU_IJCS_05
		Scenario: to test the functionality of customer search with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_02
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
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
 		And User_607 Save the record
 		And User_607 Check Please Fill Details Popup showing or not
 		And User_607 User Check negative value accepct or not in the numaric field
 		
 		@AT_MU_IJCS_06
		Scenario: to test the functionality of customer search with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_04
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Select Customer type
		And User_607 Enter Customer Name
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
    And User_607 Check able to enter characters value in numeric field
    And User_607 Check able to enter special characters in any field
    And User_607 Check Save button Field
    And User_607 Update testdata from AT_NEWAPP_02
 		And User_607 Check Product Field should be editable
 		And User_607 Check Sub Product Field should be editable
 		And User_607 Update testdata from AT_NWP_03
 		And User_607 Check Negative Total Finance Amount Requested should be editable
		And User_607 Check Declared Net Monthly Income should be editable
		And User_607 Check Declared Current Obligations should be editable
		And User_607 Check Special Promotion Campaign should be editable
		And User_607 Check Sourcing Channel should be editable
		And User_607 Check Business Center Code should be editable
		And User_607 Check Servicing Type should be editable
		And User_607 Update testdata from AT_NWP_04
		And User_607 Check Region should be editable
		And User_607 Check Servicing Branch should be editable
		And User_607 Check Spoke Location should be editable
		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
		And User_607 Check Sourcing Type should be editable
		And User_607 Check Sourcing Office should be editable
		And User_607 Check Sourcing Entity should be editable
		And User_607 Check Sourcing Staff should be editable
		And User_607 Check Reference Type should be editable
		And User_607 Check Reference Entity should be editable
		And User_607 Check Reference Code should be editable
    And User_607 Save the record
 		And User_607 Click Add button in application details
    
    @AT_MU_IJCS_07
    Scenario: To test the functionality of Application Details with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_02
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Select Customer type
		And User_607 Enter Customer Name
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
    And User_607 Update testdata from AT_NEWAPP_02
    And User_607 Check Product field should be mandatory 
 		And User_607 Check Product Field should be editable
 		And User_607 Check Sub Product field should be mandatory
 		And User_607 Check Sub Product Field should be editable
 		And User_607 Update testdata from AT_NWP_03
 		And User_607 Check Total Finance Amount Requested should be mandatory
 		And User_607 Check Total Finance Amount Requested should be editable
    And User_607 Check Declared Net Monthly Income should be mandatory
 		And User_607 Check Declared Net Monthly Income should be editable
 		And User_607 Check Declared Current Obligations should be non mandatory
 		And User_607 Check Declared Current Obligations should be editable
 		And User_607 Update testdata from AT_NWP_03
 		And User_607 Check Special Promotion Campaign should be non mandatory
 		And User_607 Check Special Promotion Campaign should be editable
 		And User_607 Check Sourcing Channel should be mandatory
 		And User_607 Check Sourcing Channel should be editable
 		And User_607 Check Business Center Code should be mandatory
 		And User_607 Check Business Center Code should be editable
 		And User_607 Check Servicing Type should be mandatory
 		And User_607 Check Servicing Type should be editable
 		And User_607 Check Region should be mandatory
 		And User_607 Check Region should be editable
 		And User_607 Update testdata from AT_NWP_04
 		And User_607 Check Servicing Branch should be mandatory
 		And User_607 Check Servicing Branch should be editable
    And User_607 Update testdata from AT_NWP_04
		And User_607 Check Servicing Branch should be editable
		And User_607 Check Spoke Location should be editable
		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
		And User_607 Check Topup Type should be Non mandatory
 		And User_607 Check Topup Type should be editable
 		And User_607 Check Topup Application No should be Non mandatory
 		And User_607 Check Topup Application No should be editable
 		
    @AT_MU_IJCS_08
    Scenario: To test the functionality of Application Details with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_02
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Select Customer type
		And User_607 Enter Customer Name
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
 		And User_607 Update testdata from AT_NWP_04
 		And User_607 Check Sourcing Type should be mandatory
 		And User_607 Check Sourcing Type should be editable
 		And User_607 Check Sourcing Office should be mandatory in application Details
 		And User_607 Check Sourcing Office should be editable
 		And User_607 Check Sourcing Entity should be mandatory
 		And User_607 Check Sourcing Entity should be editable
 		And User_607 Check Sourcing Staff should be mandatory
 		And User_607 Check Sourcing Staff should be editable
 		
    @AT_MU_IJCS_09
    Scenario: To test the functionality of Application Details with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_02
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Select Customer type
		And User_607 Enter Customer Name
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
    And User_607 Check Reference Type should be non mandatory
    And User_607 Check Reference Type should be editable
    And User_607 Check Reference Entity should be non mandatory
 		And User_607 Check Reference Entity should be editable
    And User_607 Check Reference Code should be non mandatory
    And User_607 Check Reference Code should be editable
    
    @AT_MU_IJCS_10
    Scenario: To test the functionality of Application Details with valid data
		Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJCS_02
    And User_607 Select LOS in module name
    And User_607 click the menu icon in after login screen
		And User_607 navigate to the Transactions flag
		And User_607 navigate to the Application manager flag
		And User_607 click the Application details flag
		And User_607 click the add icon to add the customer details
		And User_607 Select Customer type
		And User_607 Enter Customer Name
 		And User_607 Select ID type
 		And User_607 Enter Customer ID number
 		And User_607 Enter date of birth
 		And User_607 Click Search button after filled the fields
 		And User_607 Click Create New button
 		And User_607 Click save button in creating new reord screen
 		And User_607 Check Please Fill Details Popup showing or not
 		And User_607 User Check negative value accepct or not in the numaric field
 		And User_607 Check able to enter characters value in numeric field
 		And User_607 Update testdata from AT_NEWAPP_02
 		And User_607 Check Product Field should be editable
 		And User_607 Check Sub Product Field should be editable
 		And User_607 Update testdata from AT_NWP_03
 		And User_607 Enter characters in Total Finance Amount Requested
		And User_607 Enter characters in Declared Net Monthly Income
		And User_607 Enter characters in characters in Declared Current Obligations
		And User_607 Check Special Promotion Campaign should be editable
		And User_607 Check Sourcing Channel should be editable
		And User_607 Check Business Center Code should be editable
		And User_607 Check Servicing Type should be editable
		And User_607 Update testdata from AT_NWP_04
		And User_607 Check Region should be editable
		And User_607 Check Servicing Branch should be editable
		And User_607 Check Spoke Location should be editable
		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
		And User_607 Check Sourcing Type should be editable
		And User_607 Check Sourcing Office should be editable
		And User_607 Check Sourcing Entity should be editable
		And User_607 Check Sourcing Staff should be editable
		And User_607 Check Reference Type should be editable
		And User_607 Check Reference Entity should be editable
		And User_607 Enter characters in Reference Code
    And User_607 Save the record
 		And User_607 Check Please Fill Details Popup showing or not
 		
 		
 		
 		
 		
 		
 		