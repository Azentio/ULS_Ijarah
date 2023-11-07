Feature: Ijara AppData Check Quation Info

	  @AT_IJ_QA_01
	  Scenario: Quation Info with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJ_QA_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field
	  And User_607 Select record after search
	  And User_607 Click Quotation Info Page
	  And User_607 Click View button in Quotation Info page
	  And User_607 Check GoBack button in Quotation Details page
	  And User_607 Check Insurance Company BpId Field
	  And User_607 Check Base Premium Amount Field
	  And User_607 Check Vat On Base Premium Amount Field
	  And User_607 Check Net Base Premium Amount Field
	  And User_607 Check total Discount Amount Field
    And User_607 Check Expiry Date Field
    And User_607 Check Quote Reference No
    
    @AT_IJ_QA_02
	  Scenario: Quation Info with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJ_QA_02
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field
	  And User_607 Select record after search
	  And User_607 Click Quotation Info Page
	  And User_607 Click View button in Quotation Info page
	  And User_607 Check Insurance Company BpId Field
    And User_607 Check Base Premium Amount Field
	  And User_607 Check Vat On Base Premium Amount Field
    
    @AT_IJ_QA_03
	  Scenario: Quation Info with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJ_QA_03
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field
	  And User_607 Select record after search
	  And User_607 Click Quotation Info Page
	  And User_607 Click View button in Quotation Info page
	 	And User_607 Check Net Base Premium Amount Field
	  And User_607 Check total Discount Amount Field
    And User_607 Check Expiry Date Field
    
    @AT_IJ_QA_04
	  Scenario: Quation Info with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_IJ_QA_04
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
	  And User_607 Click Search in inbox
	  And User_607 Search in the search Field
	  And User_607 Select record after search
	  And User_607 Click Quotation Info Page
	  And User_607 Click View button in Quotation Info page
	 	And User_607 Check Quote Reference No
    And User_607 Check back button navigate to the previous screen
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    