Feature: To verify the Murabha-AppDataEntry-Address Details screen

@AT_MU_AD_01
Scenario: The Address details screen is getting open with all valid fields

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
And User_6047 verify back button should visible in address details screen
And User_6047 verify save button should visible in address details screen
Then User_6047 verify Address type should visible in address details screen
Then User_6047 verify Address Status should visible in address details screen
Then User_6047 verify Residential or Occupancy Status should visible in address details screen
Then User_6047 verify Communication Address should visible in address details screen
Then User_6047 verify Location Category should visible in address details screen
Then User_6047 verify Address line1 should visible in address details screen
Then User_6047 verify Address line2 should visible in address details screen
Then User_6047 verify Country should visible in address details screen
Then User_6047 verify Province id  should visible in address details screen
Then User_6047 verify Neighbourhood should visible in address details screen
Then User_6047 verify City should visible in address details screen
Then User_6047 verify Zip Code should visible in address details screen
Then User_6047 verify PO BOX Number should visible in address details screen
Then User_6047 verify Mobile Number should visible in address details screen
Then User_6047 verify Duration Of Stay should visible in address details screen
Then User_6047 verify Latitude Details Of The Address  should visible in address details screen
Then User_6047 verify Longitude Details Of The Address should visible in address details screen 
Then User_6047 verify Land Mark should visible in address details screen
Then User_6047 verify Occupancy Date should visible in address details screen
Then User_6047 verify Landlord Name  should visible in address details screen
Then User_6047 verify Landlord Mobile Number should visible in address details screen
Then User_6047 verify Rent Amount should visible in address details screen
Then User_6047 verify Frequency Of Rent should visible in address details screen
Then logout from the ijaraApplication

@AT_MU_AD_02
Scenario: To verify the Address details screen data
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_01
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 Give the input for Address type in Address Details
Then User_6047 Give the input for Address Status in Address Details 
Then User_6047 Give the input for Residential or Occupancy Status in Address Details  
Then User_6047 Give the input for Location Category in Address Details
Then User_6047 Give the input for Address line1 in Address Details
Then User_6047 Give the input for Address line2 in Address Details 
Then User_6047 Give the input for Country in Address Details 
Then User_6047 Give the input for Province id in Address Details
Then User_6047 Give the input for City in Address Details 
Then User_6047 Give the input for Neighbourhood in Address Details 
Then User_6047 Give the input for Zip Code in Address Details 
Then User_6047 Give the input for PO BOX Number in Address Details 
Then User_6047 Give the input for Mobile Number in Address Details 
Then User_6047 Give the input for Duration Of Stay in Address Details 
Then User_6047 Give the input for Latitude Details Of The Address in Address Details 
Then User_6047 Give the input for Longitude Details Of The Address in Address Details 
Then User_6047 Give the input for Land Mark in Address Details 
Then User_6047 Give the input for Occupancy Date in Address Details 
Then User_6047 Give the input for Landlord Name in Address Details  
Then User_6047 Give the input for Landlord Mobile Number in Address Details 
Then User_6047 Give the input for Rent Amount in Address Details 
Then User_6047 Give the input for Frequency Of Rent in Address Details 
And User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
#And User_6047 clict the edit button under the Address detail
Then User_6047 click on edit button on created record of address details
Then User_6047 to verify the same record should get saved in Address Details
Then logout from the ijaraApplication 

@AT_MU_AD_03
Scenario: To verify the fields in address Details
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_03
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab

And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Address type should be mandatory,editable,dropdown
Then User_6047 verify Address Status should be mandatory,editable,dropdown
Then User_6047 verify Residential or occupancy status should be mandatory,editable,dropdown
Then User_6047 verify Communication address should be a toggle button,editable 
Then User_6047 verify Location Category should be editable,dropdown
Then User_6047 verify Address line1 should be mandatory,editable,text box
Then User_6047 verify Address line2 should be mandatory,editable,text box
Then User_6047 verify Country should be mandatory,editable,text box
Then User_6047 verify Province Id should be mandatory,editable,dropdown
Then User_6047 verify Neighbourhood should be mandatory,editable,text box
Then User_6047 verify City should be mandatory,editable,text box
Then logout from the ijaraApplication

@AT_MU_AD_04
Scenario: To verify the fields in address Details
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_04
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Zip code should be mandatory,editable,text box
Then User_6047 verify PO Box Number should be editable,text box
Then User_6047 verify Mobile number should be editable,text box
Then User_6047 verify Duration Of Stay should be editable,text box
Then User_6047 verify Latitude Details Of The Address should be editable,text box
Then User_6047 verify Longitude Details Of The Address should be editable,text box
Then User_6047 verify Land Mark should be editable,text box
Then User_6047 verify Occupancy Date should be  mandatory,editable,text box
Then User_6047 verify Landlord Name should be editable,text box
Then User_6047 verify Landlord Mobile Number should be editable,text box
Then User_6047 verify Rent Amount should be editable,text box
Then User_6047 verify Frequency Of Rent should be editable,dropdown
Then logout from the ijaraApplication

@AT_MU_AD_05
Scenario: To verify the field status and functionality of back button
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_05
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
Then User_6047 click on edit button on created record of address details
And User_6047 change the address details status active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on the toggle button
Then User_6047 click on edit button on created record of address details
And User_6047 change the address details status active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on the toggle button
And User_6047 to click the back button in customer Identificatoin
And User_6047 verify the functionality of back button in address details 
Then logout from the ijaraApplication

@AT_MU_AD_06
Scenario: To verify the impact when user keep invalid input in address datails field
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_MU_AD_06
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Referencee Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 click on add button of address details
#And User_6047 clict the Add button under the Address detail
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field
Then User_6047 give the character input to the numeric field
Then User_6047 validate invalid data in numeric field 
Then User_6047 give the negative number to the numeric field
Then User_6047 validate the invalid data in numeric field of address detail
Then User_6047 give the special character to the numeric field
Then User_6047 validate the invalid data in numeric field of address detail  
Then logout from the ijaraApplication
