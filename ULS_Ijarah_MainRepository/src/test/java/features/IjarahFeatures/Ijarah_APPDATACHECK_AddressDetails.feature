Feature: Test the IJARA URL
@AT_NADC_01
Scenario: Address details at Data Check stage
Given navigate the IJARA URL
And login with valid credentials-Data Check
#And user_626 click on module dropdown in IJRARAH
#And user_626 click on LOS option in module dropdown
And user_626 get the test data for test case ID AT_NADC_01
And user_626 click on mail box
And user_626 click on search box upon click on the mail box
And user_626 search the record reference number in search text box
And user_626 Select record after search
And user_626 click on additional customer info tab
And user_626 click eye icon of customer personal information
And user_626 click eye icon of address details
Then user_626 verify Address type should visible in address details screen
Then user_626 verify Address Status should visible in address details screen
Then user_626 verify Residential or Occupancy Status should visible in address details screen
Then user_626 verify Communication Address should visible in address details screen
Then verify Location Category should visible in address details screen
Then user_626 verify Address line1 should visible in address details screen
Then user_626 verify Address line2 should visible in address details screen
Then user_626 verify Country should visible in address details screen
Then user_626 verify Province id  should visible in address details screen
Then user_626 verify Neighbourhood should visible in address details screen
Then user_626 verify City should visible in address details screen
Then user_626 verify Zip Code should visible in address details screen
Then user_626 verify PO BOX Number should visible in address details screen
Then user_626 verify Mobile Number should visible in address details screen
Then user_626 verify Duration Of Stay should visible in address details screen
Then user_626 verify Latitude Details Of The Address  should visible in address details screen
Then user_626 verify Longitude Details Of The Address should visible in address details screen 
Then user_626 verify Land Mark should visible in address details screen
Then user_626 verify Occupancy Date should visible in address details screen
Then user_626 verify Landlord Name  should visible in address details screen
Then user_626 verify Landlord Mobile Number should visible in address details screen
Then user_626 verify Rent Amount should visible in address details screen
Then user_626 verify Frequency Of Rent should visible in address details screen
Then User_626 logout from the ijaraApplication

@AT_NADC_03
Scenario: To verify the field Address Type,Address Status,Residential or occupancy status,Communication address
#ADC_01_05
Given navigate the IJARA URL
And user_626 login with valid credentials
And user_626 click on module dropdown in IJRARAH
And user_626 click on LOS option in module dropdown
And user_626 get the test data for test case ID AT_NADC_01
And user_626 click on mail box
And user_626 click on search box upon click on the mail box
And user_626 click on search text box upon click the search button
And user_626 search the record reference number in search text box
And user_626 select the record form mail box
And user_626 click on additional customer info tab
And user_626 click eye icon of customer personal information
And user_626 click eye icon of address details
Then user_626 verify Address type should be mandatory
Then user_626 verify Address type should be display only 
Then user_626 verify Address type should be dropdown
# ADC_01_06 To verify the field Address status
Then user_626 verify Address Status should be mandatory
Then user_626 verify Address Status should be display only 
Then user_626 verify Address Status should be dropdown
# ADC_01_07 To verify the field Residential or occupancy status
Then user_626 verify Residential or occupancy status should be mandatory
Then user_626 verify Residential or occupancy status should be display only 
Then user_626 verify Residential or occupancy status should be dropdown
# ADC_01_08 To verify the field Communication address
Then user_626 verify Communication address should be a toggle button 
Then user_626 verify Communication address should be display only 

#@AT_NADC_04
#Scenario: To verify the field Location Category,Address line1,Address line2,Country
#ADC_01_09 To verify the field Location Category
Then user_626 verify Location Category should be display only 
Then user_626 verify Location Category should be dropdown
# ADC_01_10 To verify the field Address line 1
Then user_626 verify Address line1 should be mandatory
Then user_626 verify Address line1 should be display only 
Then user_626 verify Address line1 should be text box
# ADC_01_11 To verify the field Address line2
Then user_626 verify Address line2 should be mandatory
Then user_626 verify Address line2 should be display only 
Then user_626 verify Address line2 should be text box
# ADC_01_12 To verify the field Country
Then user_626 verify Country should be mandatory
Then user_626 verify Country should be display only 
Then user_626 verify Country should be text box
#@AT_NADC_05
#Scenario: To verify the field Province Id,Neighbourhood,City,Zip code
#ADC_01_13 To verify the field Province Id
Then user_626 verify Province Id should be mandatory
Then user_626 verify Province Id should be display only 
Then user_626 verify Province Id should be text box
#ADC_01_14 To verify the field Neighbourhood/District Name
Then user_626 verify Neighbourhood District Name should be mandatory
Then user_626 verify Neighbourhood District Name should be display only 
Then user_626 verify Neighbourhood District Name should be text box
#ADC_01_15To verify the field City
Then user_626 verify City should be mandatory
Then user_626 verify City should be display only 
Then user_626 verify City should be text box
#ADC_01_16 To verify the field Zip code
Then user_626 verify Zip code should be mandatory
Then user_626 verify Zip code should be display only 
Then user_626 verify Zip code should be text box
#
Then user_626 verify PO Box Number should be display only 
Then user_626 verify PO Box Number should be text box
#ADC_01_18 To verify the field Mobile number(Primary)
Then user_626 verify Mobile number should be display only 
Then user_626 verify Mobile number should be text box	
#ADC_01_19 To verify the field Duration Of Stay
Then user_626 verify  Duration Of Stay should be display only 
Then user_626 verify  Duration Of Stay should be text box	
#ADC_01_20	To verify the field Latitude Details Of The Address
Then user_626 verify Latitude Details Of The Address should be display only 
Then user_626 verify Latitude Details Of The Address should be text box
#ADC_01_21	To verify the field Longitude Details Of The Address
Then user_626 verify Longitude Details Of The Address should be display only 
Then user_626 verify Longitude Details Of The Address should be text box
#@AT_NADC_07
#Scenario: To verify the field Land Mark,Occupancy Date,Landlord Name,Landlord Mobile Number
#ADC_01_22 To verify the field 'Land Mark'
Then user_626 verify Land Mark should be display only 
Then user_626 verify Land Mark should be text box
#ADC_01_23 To verify the field 'Occupancy Date'
Then user_626 verify Occupancy Date should be mandatory
Then user_626 verify Occupancy Date should be display only 
Then user_626 verify Occupancy Date should be Date
#ADC_01_24	To verify the field 'Landlord Name'
Then user_626 verify Landlord Name should be display only 
Then user_626 verify Landlord Name should be text box
#ADC_01_25	To verify the field 'Landlord Mobile Number'
Then user_626 verify Landlord Mobile Number should be display only 
Then user_626 verify Landlord Mobile Number should be text box
#@AT_NADC_08
#Scenario: To verify field Rent Amount,Frequency Of Rent
#ADC_01_26 To verify field Rent Amount
Then user_626 verify Rent Amount should be display only 
Then user_626 verify Rent Amount should be text box
#ADC_01_27 To verify field Frequency Of Rent
Then user_626 verify Frequency Of Rent should be display only 
Then user_626 verify Frequency Of Rent should be text box
#@AT_NADC_09
#Scenario: To verify field Status, Functionality back button
#ADC_01_28 To verify the field Status
Then user_626 verify field Status should be display only
Then user_626 verify field Status should be toggle status  
#ADC_01_29 To verify the functionality of Back button
Then User_626 clicking on back button system should navigate to the previous screen


