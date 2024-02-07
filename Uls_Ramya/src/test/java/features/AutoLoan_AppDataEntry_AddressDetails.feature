Feature: To verify the AutoLoan-AppDataEntry-Address Details screen

@AT_AU_AD_01
Scenario: The Address details screen is getting open with all valid fields

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And click on module dropdown in IJRARAH
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
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

@AT_AU_AD_02
Scenario: To verify the Address details screen data

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 Give the input for Address type 
Then User_6047 Give the input for Address Status 
Then User_6047 Give the input for Residential or Occupancy Status  
Then User_6047 Give the input for Location Category 
Then User_6047 Give the input for Address line1 
Then User_6047 Give the input for Address line2 
Then User_6047 Give the input for Country 
Then User_6047 Give the input for Province id  
Then User_6047 Give the input for Neighbourhood 
Then User_6047 Give the input for City 
Then User_6047 Give the input for Zip Code 
Then User_6047 Give the input for PO BOX Number 
Then User_6047 Give the input for Mobile Number 
Then User_6047 Give the input for Duration Of Stay 
Then User_6047 Give the input for Latitude Details Of The Address 
Then User_6047 Give the input for Longitude Details Of The Address 
Then User_6047 Give the input for Land Mark 
Then User_6047 Give the input for Occupancy Date 
Then User_6047 Give the input for Landlord Name  
Then User_6047 Give the input for Landlord Mobile Number 
Then User_6047 Give the input for Rent Amount 
Then User_6047 Give the input for Frequency Of Rent 
And User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
And User_6047 clict the edit button under the Address detail
Then User_6047 to verify the same record should get saved Address Details
Then logout from the ijaraApplication 

@AT_AU_AD_03
Scenario: To verify the field Address Type,Address status,Residential or occupancy status,Communication address

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Address type should be mandatory,editable,dropdown
Then User_6047 verify Address Status should be mandatory,editable,dropdown
Then User_6047 verify Residential or occupancy status should be mandatory,editable,dropdown
Then User_6047 verify Communication address should be a toggle button,editable 
Then logout from the ijaraApplication

@AT_AU_AD_04
Scenario:To verify the field Location Category,Address line1,Address line2,Country

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Location Category should be editable,dropdown
Then User_6047 verify Address line1 should be mandatory,editable,text box
Then User_6047 verify Address line2 should be mandatory,editable,text box
Then User_6047 verify Country should be mandatory,editable,text box
Then logout from the ijaraApplication

 @AT_AU_AD_05
Scenario:To verify the field Province Id,Neighbourhood,City,Zip code

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Province Id should be mandatory,editable,dropdown
Then User_6047 verify Neighbourhood should be mandatory,editable,text box
Then User_6047 verify City should be mandatory,editable,text box
Then User_6047 verify Zip code should be mandatory,editable,text box
Then logout from the ijaraApplication

 @AT_AU_AD_06 
 Scenario: To verify the field PO Box Number,Mobile number, Duration Of Stay, Latitude Details Of The Address
 
 Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify PO Box Number should be editable,text box
Then User_6047 verify Mobile number should be editable,text box
Then User_6047 verify Duration Of Stay should be editable,text box
Then User_6047 verify Latitude Details Of The Address should be editable,text box
Then logout from the ijaraApplication
 
 @AT_AU_AD_07
 Scenario: To verify the field Longitude Details Of The Address,Land Mark,Occupancy Date,Landlord Name,
 Landlord Mobile Number,Rent Amount,Frequency Of Rent
  
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 verify Longitude Details Of The Address should be editable,text box
Then User_6047 verify Land Mark should be editable,text box
Then User_6047 verify Occupancy Date should be  mandatory,editable,text box
Then User_6047 verify Landlord Name should be editable,text box
Then User_6047 verify Landlord Mobile Number should be editable,text box
Then User_6047 verify Rent Amount should be editable,text box
Then User_6047 verify Frequency Of Rent should be editable,dropdown
Then logout from the ijaraApplication

@AT_AU_AD_08
Scenario: To verify the field status and functionality of back button
 
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the edit button under the Address detail
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 clict the edit button under the Address detail
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 to click the back button in customer Identificatoin
And User_6047 verify the functionality of back button in address details 
Then logout from the ijaraApplication

@AT_AU_AD_09
Scenario: To verify the impact when user keep invalid input in address datails field

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_09
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Address detail
Then User_6047 click the Save button
Then User_6047 verify the popup of fill all field
Then User_6047 give the character input in numeric field
Then User_6047 validate the invalid data in numeric field 
Then User_6047 give the negative number in numeric field
Then User_6047 validate the invalid data in numeric field 
Then User_6047 give the special character in numeric field
Then User_6047 validate the invalid data in numeric field   
Then logout from the ijaraApplication

 @AT_AU_AD_10
 Scenario:  To verify the Address details List view
 
 Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 verify the add botton in address details list view
Then User_6047 verify the Edit botton in address details list view
Then User_6047 verify the search botton in address details list view
Then User_6047 verify the Export to PDF,XLS in address details list view
Then User_6047 verify list view fields are shown in address details list view
Then logout from the ijaraApplication

 @AT_AU_AD_11
 Scenario: To verify Values in List view should be non editable,functionality of add and edit button in address details
 
 Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 To verify Values in List view should be non editable
And User_6047 clict the Add button under the Address detail
And User_6047 To verify the Add button allow user to create new record of Address details 
And User_6047 To click the back button in Modification of Address details screen
And User_6047 clict the edit button under the Address detail
And User_6047 To verify if user click the edit button System should redirect user to edit page
Then logout from the ijaraApplication

@AT_AU_AD_12
 Scenario: To verify the functionality of Search box with matching,mismatching data,Export to Excel and PDF button in list view
 
Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 click the Search button under Address details tab and search the matching data in listview
And User_6047 check the match result data in Address details list view
And User_6047 click the Search button under Address details tab and search the mismatching data in listview
And User_6047 check the mismatch result in Address details list view
And User_6047 click the back Button
And User_6047 verify the functionality of back button in address details 
Then logout from the ijaraApplication

@AT_AU_AD_13
Scenario: To verify  the modification of address detail screen

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails
And User_6047 Get the test data for test case ID AT_AU_AD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under Inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
#And User_6047 click the search button
#And User_6047 click on search text box and search the record
And User_6047 Click edit icon
And User_6047 clict the edit button under the Address detail
And User_6047 To verify the save and back botton in addressDetails screen 
And User_6047 To delete the data in zip code
Then User_6047 click the Save button
Then User_6047 To verify system should show the proper validation message for blank field 
And User_6047 To modify with invalid data in Modification of Address details screen
And User_6047 To verify system should not allow modification with invalid data
And User_6047 To modify with valid data in Modification of Address details screen
Then User_6047 click the Save button
Then User_6047 verify the successfully saved message popup
And User_6047 clict the edit button under the Address detail
Then User_6047 To verify same record should get saved in Modification of Address details screen
And User_6047 To click the back button in Modification of Address details screen
And User_6047 verify the functionality of back button in  Modification of Address details screen 
Then logout from the ijaraApplication


 