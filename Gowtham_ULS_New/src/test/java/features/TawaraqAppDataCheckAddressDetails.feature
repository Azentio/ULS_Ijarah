Feature: Tawaraq App Data Check Address Details

  @AT_TW_ADP_AD_01
  Scenario: Address details at Data Check stage
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search1
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Address type should visible in address details screen
	Then User_607 verify Address Status should visible in address details screen
	Then User_607 verify Residential or Occupancy Status should visible in address details screen
	Then User_607 verify Communication Address should visible in address details screen
	Then verify Location Category should visible in address details screen
	Then User_607 verify Address line1 should visible in address details screen
	Then User_607 verify Address line2 should visible in address details screen
	Then User_607 verify Country should visible in address details screen
	Then User_607 verify Province id  should visible in address details screen
	Then User_607 verify Neighbourhood should visible in address details screen
	Then User_607 verify City should visible in address details screen
	Then User_607 verify Zip Code should visible in address details screen
	Then User_607 logout from the ijaraApplication
	
	@AT_TW_ADP_AD_02
  Scenario: Address details at Data Check stage
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Duration Of Stay should visible in address details screen
	Then User_607 verify Latitude Details Of The Address  should visible in address details screen
	Then User_607 verify Longitude Details Of The Address should visible in address details screen 
	Then User_607 verify Land Mark should visible in address details screen
	Then User_607 verify Occupancy Date should visible in address details screen
	Then User_607 verify Landlord Name  should visible in address details screen
	Then User_607 verify Landlord Mobile Number should visible in address details screen
	Then User_607 verify Rent Amount should visible in address details screen
	Then User_607 verify Frequency Of Rent should visible in address details screen
	Then User_607 verify PO BOX Number should visible in address details screen
	Then User_607 verify Mobile Number should visible in address details screen
	Then User_607 logout from the ijaraApplication
	
	@AT_TW_ADP_AD_03
	Scenario: To verify the field Address Type,Address Status,Residential or occupancy status,Communication address
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Address type should be mandatory
	Then User_607 verify Address type should be display only 
	Then User_607 verify Address type should be dropdown
	Then User_607 verify Address Status should be mandatory
	Then User_607 verify Address Status should be display only 
	Then User_607 verify Address Status should be dropdown
	Then User_607 verify Residential or occupancy status should be mandatory
	Then User_607 verify Residential or occupancy status should be display only 
	Then User_607 verify Residential or occupancy status should be dropdown
	Then User_607 verify Communication address should be a toggle button 
	Then User_607 verify Communication address should be display only 
	Then User_607 logout from the ijaraApplication
	
	
	@AT_TW_ADP_AD_04
	Scenario: To verify the field Location Category,Address line1,Address line2,Country
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Location Category should be display only 
	Then User_607 verify Location Category should be dropdown
	Then User_607 verify Address line1 should be mandatory
	Then User_607 verify Address line1 should be display only 
	Then User_607 verify Address line1 should be text box
	Then User_607 verify Address line2 should be mandatory
	Then User_607 verify Address line2 should be display only 
	Then User_607 verify Address line2 should be text box
	Then User_607 verify Country should be mandatory
	Then User_607 verify Country should be display only 
	Then User_607 verify Country should be text box
	Then User_607 logout from the ijaraApplication
	
	
	@AT_TW_ADP_AD_05
	Scenario: To verify the field Province Id,Neighbourhood,City,Zip code
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Province Id should be mandatory
	Then User_607 verify Province Id should be display only 
	Then User_607 verify Province Id should be text box
	Then User_607 verify Neighbourhood District Name should be mandatory
	Then User_607 verify Neighbourhood District Name should be display only 
	Then User_607 verify Neighbourhood District Name should be text box
	Then User_607 verify City should be mandatory
	Then User_607 verify City should be display only 
	Then User_607 verify City should be text box
	Then User_607 verify Zip code should be mandatory
	Then User_607 verify Zip code should be display only 
	Then User_607 verify Zip code should be text box
	Then User_607 logout from the ijaraApplication
	

	@AT_TW_ADP_AD_06
	Scenario: To verify the field Province Id,Neighbourhood,City,Zip code
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify PO Box Number should be display only 
	Then User_607 verify PO Box Number should be text box
	Then User_607 verify Mobile number should be display only 
	Then User_607 verify Mobile number should be text box	
	Then User_607 verify  Duration Of Stay should be display only 
	Then User_607 verify  Duration Of Stay should be text box	
	Then User_607 verify Latitude Details Of The Address should be display only 
	Then User_607 verify Latitude Details Of The Address should be text box
	Then User_607 verify Longitude Details Of The Address should be display only 
	Then User_607 verify Longitude Details Of The Address should be text box
	Then User_607 logout from the ijaraApplication
	
	
	@AT_TW_ADP_AD_07
	Scenario: To verify the field Land Mark,Occupancy Date,Landlord Name,Landlord Mobile Number
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Land Mark should be display only 
	Then User_607 verify Land Mark should be text box
	Then User_607 verify Occupancy Date should be mandatory
	Then User_607 verify Occupancy Date should be display only 
	Then User_607 verify Occupancy Date should be Date
	Then User_607 verify Landlord Name should be display only 
	Then User_607 verify Landlord Name should be text box
	Then User_607 verify Landlord Mobile Number should be display only 
	Then User_607 verify Landlord Mobile Number should be text box
	Then User_607 logout from the ijaraApplication
	
	@AT_TW_ADP_AD_08
	Scenario: To verify field Rent Amount,Frequency Of Rent
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify Rent Amount should be display only 
	Then User_607 verify Rent Amount should be text box
	Then User_607 verify Frequency Of Rent should be display only 
	Then User_607 verify Frequency Of Rent should be text box
	Then User_607 logout from the ijaraApplication
	
	@AT_TW_ADP_AD_09
	Scenario: To verify field Rent Amount,Frequency Of Rent
	Given navigate the IJARA URL
  And login with valid credentials9
	And User_607 Select LOS in module name
	And User_607 get the test data for test case ID AT_TW_ADP_AD_01
	And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
	And User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details
	And User_607 Select record after search
	And User_607 click on additional customer info tab
	And User_607 click eye icon of customer personal information
	And User_607 click eye icon of address details
	Then User_607 verify field Status should be display only
	Then User_607 verify field Status should be toggle status  
	Then User_607 clicking on back button system should navigate to the previous screen
	And User_607 click eye icon of address details
	Then User_607 logout from the ijaraApplication
	
	
	
	
	
	
	
