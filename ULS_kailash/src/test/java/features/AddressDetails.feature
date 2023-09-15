Feature: Test the IJARA URL
@AT_NADC_01
Scenario: Address details at Data Check stage
Given navigate the IJARA URL
And login with valid credentials
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_NADC_01
And click on mail box
And click on search box upon click on the mail box
And search the record reference number in search text box
And Select record after search
And click on additional customer info tab
And click on action button below the Address details
And click on search text box upon click the search button
And Select record after search
Then verify Address type should visible in address details screen
Then verify Address Status should visible in address details screen
Then verify Residential or Occupancy Status should visible in address details screen
Then verify Communication Address should visible in address details screen
Then verify Location Category should visible in address details screen
Then verify Address line1 should visible in address details screen
Then verify Address line2 should visible in address details screen
Then verify Country should visible in address details screen
Then verify Province id  should visible in address details screen
Then verify Neighbourhood should visible in address details screen
Then verify City should visible in address details screen
Then verify Zip Code should visible in address details screen
Then verify PO BOX Number should visible in address details screen
Then verify Mobile Number should visible in address details screen
Then verify Duration Of Stay should visible in address details screen
Then verify Latitude Details Of The Address  should visible in address details screen
Then verify Longitude Details Of The Address should visible in address details screen 
Then verify Land Mark should visible in address details screen
Then verify Occupancy Date should visible in address details screen
Then verify Landlord Name  should visible in address details screen
Then verify Landlord Mobile Number should visible in address details screen
Then verify Rent Amount should visible in address details screen
Then verify Frequency Of Rent should visible in address details screen
Then logout from the ijaraApplication

@AT_NADC_03
Scenario: To verify the field Address Type,Address Status,Residential or occupancy status,Communication address
#ADC_01_05
Given navigate the IJARA URL
And login with valid credentials
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And get the test data for test case ID AT_NADC_01
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And search the record reference number in search text box
And select the record form mail box
And click on additional customer info tab
And click on search text box upon click the search button
And click on action button below the Address details
Then verify Address type should be mandatory
Then verify Address type should be display only 
Then verify Address type should be dropdown
# ADC_01_06 To verify the field Address status
Then verify Address Status should be mandatory
Then verify Address Status should be display only 
Then verify Address Status should be dropdown
# ADC_01_07 To verify the field Residential or occupancy status
Then verify Residential or occupancy status should be mandatory
Then verify Residential or occupancy status should be display only 
Then verify Residential or occupancy status should be dropdown
# ADC_01_08 To verify the field Communication address
Then verify Communication address should be a toggle button 
Then verify Communication address should be display only 

@AT_NADC_04
Scenario: To verify the field Location Category,Address line1,Address line2,Country
#ADC_01_09 To verify the field Location Category
Then verify Location Category should be display only 
Then verify Location Category should be dropdown
# ADC_01_10 To verify the field Address line 1
Then verify Address line1 should be mandatory
Then verify Address line1 should be display only 
Then verify Address line1 should be text box
# ADC_01_11 To verify the field Address line2
Then verify Address line2 should be mandatory
Then verify Address line2 should be display only 
Then verify Address line2 should be text box
# ADC_01_12 To verify the field Country
Then verify Country should be mandatory
Then verify Country should be display only 
Then verify Country should be text box
@AT_NADC_05
Scenario: To verify the field Province Id,Neighbourhood,City,Zip code
#ADC_01_13 To verify the field Province Id
Then verify Province Id should be mandatory
Then verify Province Id should be display only 
Then verify Province Id should be text box
#ADC_01_14 To verify the field Neighbourhood/District Name
Then verify Neighbourhood District Name should be mandatory
Then verify Neighbourhood District Name should be display only 
Then verify Neighbourhood District Name should be text box
#ADC_01_15To verify the field City
Then verify City should be mandatory
Then verify City should be display only 
Then verify City should be text box
#ADC_01_16 To verify the field Zip code
Then verify Zip code should be mandatory
Then verify Zip code should be display only 
Then verify Zip code should be text box
@AT_NADC_06
Scenario: To verify the field PO Box Number,Mobile number, Duration Of Stay, Latitude Details Of The Address, Longitude Details Of The Address
#ADC_01_17 To verify the field PO Box Number
Then verify PO Box Number should be display only 
Then verify PO Box Number should be text box
#ADC_01_18 To verify the field Mobile number(Primary)
Then verify Mobile number should be display only 
Then verify Mobile number should be text box	
#ADC_01_19 To verify the field Duration Of Stay
Then verify  Duration Of Stay should be display only 
Then verify  Duration Of Stay should be text box	
#ADC_01_20	To verify the field Latitude Details Of The Address
Then verify Latitude Details Of The Address should be display only 
Then verify Latitude Details Of The Address should be text box
#ADC_01_21	To verify the field Longitude Details Of The Address
Then verify Longitude Details Of The Address should be display only 
Then verify Longitude Details Of The Address should be text box
@AT_NADC_07
Scenario: To verify the field Land Mark,Occupancy Date,Landlord Name,Landlord Mobile Number
#ADC_01_22 To verify the field 'Land Mark'
Then verify Land Mark should be display only 
Then verify Land Mark should be text box
#ADC_01_23 To verify the field 'Occupancy Date'
Then verify Occupancy Date should be mandatory
Then verify Occupancy Date should be display only 
Then verify Occupancy Date should be Date
#ADC_01_24	To verify the field 'Landlord Name'
Then verify Landlord Name should be display only 
Then verify Landlord Name should be text box
#ADC_01_25	To verify the field 'Landlord Mobile Number'
Then verify Landlord Mobile Number should be display only 
Then verify Landlord Mobile Number should be text box


