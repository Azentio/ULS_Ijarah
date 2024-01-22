Feature: Murabha App Data Entry Application Details

  @AT_MU_APE_AD_01
  Scenario: To test the functionality of Application Details with valid data
		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
 		And User_607 Check Product Field should be editable in Murabha AppDataEntry Application Details
 		And User_607 Check Sub Product Field should be editable in Murabha AppDataEntry Application Details
 		And User_607 Check Negative Total Finance Amount Requested should be editable
		And User_607 Check Declared Net Monthly Income should be editable
		And User_607 Check Declared Current Obligations should be editable
		And User_607 Check Special Promotion Campaign should be editable
		And User_607 Check Sourcing Channel should be editable
		And User_607 Check Business Center Code should be editable
		And User_607 Check Servicing Type should be editable
		And User_607 Check Region should be editable
#		And User_607 Check Servicing Branch should be editable
#		And User_607 Check Spoke Location should be editable
#		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
		And User_607 Check Sourcing Type should be editable
		And User_607 Check Sourcing Office should be editable
		And User_607 Check Sourcing Entity should be editable
#		And User_607 Check Sourcing Staff should be editable
		And User_607 Check Reference Type should be editable
		And User_607 Check Reference Entity should be editable
		And User_607 Check Reference Code should be editable
    And User_607 Save the record
 		And User_607 Click Add button in application details  
 		And logout from the ULSApplication
 		
 		@AT_MU_APE_AD_02
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
 		And User_607 Check Product field should be mandatory in Murabha AppDataEntry Application Details
 		And User_607 Check Product Field should be editable in Murabha AppDataEntry Application Details
 		And User_607 Check Sub Product field should be mandatory in Murabha AppDataEntry Application Details
 		And User_607 Check Sub Product Field should be editable in Murabha AppDataEntry Application Details
 #		And User_607 Update testdata from AT_NWP_03
 		And User_607 Check Total Finance Amount Requested should be mandatory
 		And User_607 Check Total Finance Amount Requested should be editable
    And User_607 Check Declared Net Monthly Income should be mandatory
 		And User_607 Check Declared Net Monthly Income should be editable
 		And User_607 Check Declared Current Obligations should be non mandatory
 		And User_607 Check Declared Current Obligations should be editable
 		And logout from the ULSApplication 
 		
 		
 		@AT_MU_APE_AD_03
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
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
 		And User_607 Check Servicing Branch should be mandatory
 		And User_607 Check Servicing Branch should be editable
 		And User_607 Check Servicing Branch should be editable
		And User_607 Check Spoke Location should be editable
		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
		And User_607 Check Topup Type should be Non mandatory
 		And User_607 Check Topup Type should be editable
 		And User_607 Check Topup Application No should be Non mandatory
 		And User_607 Check Topup Application No should be editable
 		And logout from the ULSApplication
 		
 		@AT_MU_APE_AD_04
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
 		And User_607 Check Sourcing Type should be mandatory
 		And User_607 Check Sourcing Type should be editable
 		And User_607 Check Sourcing Office should be mandatory in application Details
 		And User_607 Check Sourcing Office should be editable
 		And User_607 Check Sourcing Entity should be mandatory
 		And User_607 Check Sourcing Entity should be editable
 		And User_607 Check Sourcing Staff should be nonmandatory
 		And User_607 Check Sourcing Staff should be editable
 		And User_607 Check Reference Type should be non mandatory
    And User_607 Check Reference Type should be editable
    And User_607 Check Reference Entity should be non mandatory
 		And User_607 Check Reference Entity should be editable
    And User_607 Check Reference Code should be non mandatory
    And User_607 Check Reference Code should be editable
    And logout from the ULSApplication
    
    @AT_MU_APE_AD_05
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
    And User_607 Enter characters in Total Finance Amount Requested
		And User_607 Enter characters in Declared Net Monthly Income
		And User_607 Enter characters in characters in Declared Current Obligations
		And User_607 Check Special Promotion Campaign should be editable
		And User_607 Check Sourcing Channel should be editable
		And User_607 Check Business Center Code should be editable
		And User_607 Check Servicing Type should be editable
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
 		And logout from the ULSApplication
 		
 		@AT_MU_APE_AD_06
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
    And user_607 Check Save button field is visible or not
    And user_607 Check Submit field is visible or not
    And user_607 Check Eligibility check field is visible or not
    And user_607 Check Status field is visible or not
    And user_607 Check View summary field is visible or not
    And user_607 Check Back field is visible or not
    And User_607 Check Product Field should be editable in Murabha AppDataEntry Application Details
    #And User_607 Save the record
 #		And User_607 Click Add button in application details
 		And User_607 delete Declared Net Monthly Income value
    And User_607 Save the record
 		And User_607 Check Please Fill Details Popup showing or not
 		And User_607 Check Negative Total Finance Amount Requested should be editable
 		And User_607 Save the record
 		And User_607 Check Please Fill Details Popup showing or not
 		And logout from the ULSApplication
    
    @AT_MU_APE_AD_07
 		Scenario: To test the functionality of Application Details with valid data
 		Given navigate the IJARA URL
    And login with valid credentials10
    And User_607 get the test data for test case AT_MU_APE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Murabha AppDataEntry Application Details
    And User_607 Select record after search
    And user_607 click on Application Details info tab
    And user_607 Click submit button in Murabha AppDataEntry Application Details screen
    And user_607 Verify Action confirmation popup should be visible or not
    And user_607 Close the Action confirmation popup
    And user_607 Click status toggle button in Murabha AppDataEntry Application Details screen
    And user_607 Scroll to save button
    And User_607 Save the record
    And User_607 Get the saved record number from the popup
    And User_607 Click search in the list view and search record Murabha AppDataEntry Application Details screen
    And user_607 verify the status should be changed or not
    And user_607 click on Application Details info tab
    And user_607 click view summery button
    And user_607 Verify Transaction summary screen open or not
    And user_607 Close Transaction summary screen
    #And user_607 Check verify the functionality of Back button
    #And User_607 Click Search in inbox
    #And User_607 Search in the search Field Murabha AppDataEntry Application Details
    #And User_607 Select record after search
    And User_607 Click Return button in Murabha AppDataEntry Application Details
    And user_607 Verify Return screen open or not
    And user_607 Close Return screen
    And logout from the ULSApplication
    
    
   
    
