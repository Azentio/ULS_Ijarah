Feature: New Application

  @AT_NWP_01
  Scenario: Application Detail
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search box
	  And User_607 Select record after search
 		And User_607 Check GoBack Field
 		And User_607 Check Save button Field
 		And User_607 Check Submit button Field 
 		And User_607 Check Return button Field
 		And User_607 Check Views summary Field
 		And User_607 Check Product Field
 		And User_607 Check Subproduct Field
 		And User_607 Check Total Finance Amount Requested Field
 		And User_607 Check Declared Net Monthly Income Field
 		And User_607 Check Declared Current Obligations Field
 		And User_607 Check Special Promotion/Campaign Field
 		And User_607 Check Sourcing Channel Field
 		And User_607 Check Business Center Code Field
 		And User_607 Check Servicing Type Field
 		And User_607 Check Region Field
 		And User_607 Check Servicing Branch Field
 		And User_607 Check Spoke Location Field
 		And User_607 Check Closing Staff Or Servicing Staff Or RM Field
 		And User_607 Check Topup Type Field
 		And User_607 Check Topup Application No Field
 		
 		
 		 @AT_NWP_02
    Scenario: Application Detail
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_NEWAPP_02
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search box
	  And User_607 Select record after search
 		And User_607 Check SourcingType Field
 		And User_607 Check SourcingOffice Field
 		And User_607 Check SourcingEntity Field
 		And User_607 Check SourcingStaff Field
 		And User_607 Check ReferenceType Field
 		And User_607 Check ReferenceEntity Field
 		And User_607 Check ReferenceCode Field
 		And User_607 Save the record 
 		And User_607 Click back button to move main page
	  And User_607 Select record after search
 		And User_607 Check Product field should be mandatory 
 		And User_607 Check Product Field should be editable
 		And User_607 Check Sub Product field should be mandatory
 		And User_607 Check Sub Product Field should be editable
 		
 		@AT_NWP_03
    Scenario: Application Detail
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search box
	  And User_607 Select record after search
 		And User_607 Check Total Finance Amount Requested should be mandatory
 		And User_607 Check Total Finance Amount Requested should be editable
 		And User_607 Check Declared Net Monthly Income should be mandatory
 		And User_607 Check Declared Net Monthly Income should be editable
 		And User_607 Check Declared Current Obligations should be non mandatory
 		And User_607 Check Declared Current Obligations should be editable
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
 		
 		@AT_NWP_04
    Scenario: Application Detail
    Given navigate the IJARA URL
    And login with valid credentials
 		And User_607 Check Servicing Branch should be mandatory
 		And User_607 Check Servicing Branch should be editable
 		And User_607 Check Spoke Location should be Non mandatory
 		And User_607 Check Spoke Location should be editable
 		And User_607 Check Closing Staff Or Servicing Staff Or RM should be mandatory
 		And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
 		And User_607 Check Topup Type should be Non mandatory
 		And User_607 Check Topup Type should be editable
 		And User_607 Check Topup Application No should be Non mandatory
 		And User_607 Check Topup Application No should be editable
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		