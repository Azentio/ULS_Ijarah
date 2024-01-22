Feature: To test the Tawarruq-App Data Entry- Facility Details 
@AT_FAC_DET_04
Scenario: To verify the availability of Add button,backbutton and save button on Facility Info 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FAC_DET_04
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reff Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info 
Then User_6047 give the input for Classification field under the Facility info
Then User_6047 give the input for Product field under the Facility info
Then User_6047 give the input for Scheme field under the Facility info
Then User_6047 give the input for Program Code field under the Facility info
Then User_6047 give the input for Facility type field under the Facility info
Then User_6047 give the input for Pricing Indicator field under the Facility info
#Then User_6047 select the input for serving branch field under the Facility info
Then User_6047 give the input for Request Amount under the Facility info
Then User_6047 give the input for Currency field under the Facility info
Then User_6047 give the input for Loan Tenure under the Facility info
 #for save
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info screen
Then User_6047 Extract the application details record reference number in facilityinfo stage
Then User_6047 click the Back button and verify the functionality of back button
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list record under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 to verify the same record should get saved in facilityInfo
Then logout from the ijaraApplication 

@AT_FAC_DET_05
Scenario: To verify the impact of blank field and invalid data with Facility Info 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FAC_DET_04
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reff Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info 
Then User_6047 click the save button under the facility info
Then User_6047 To verify the validation message for blank field
Then User_6047 enter the negative numeric value to requested amount field 
Then User_6047 to verify negative numeric value in request amout field
Then User_6047 enter the character value to requested amount field 
Then User_6047 to verify character value value in request amout field
Then User_6047 enter the special character value to requested amount field 
Then User_6047 to verify special character value in request amout field
Then logout from the ijaraApplication 

@AT_FAC_DET_06
Scenario: To verify the fields available on screen while modify the Facility Info
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FAC_DET_04
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reff Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list record under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 check the Classification field under the Facility info
Then User_6047 check the Product field under the Facility info
Then User_6047 check the Scheme field under the Facility info
Then User_6047 check the Program Code field under the Facility info
Then User_6047 check the Pricing Indicator field under the Facility info
Then User_6047 check the Requested Amount field under the Facility info
Then User_6047 check the Currency field under the Facility info
Then User_6047 check the Loan Tenure field under the Facility info
Then User_6047 check the Servicing Branch field under the Facility info
Then User_6047 clear the Loan Tenure field under facility
Then User_6047 click the save button under the facility info
Then User_6047 To verify the validation message for blank field
Then User_6047 To modify the Loan Tenure field under facility info
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list record under facility info
And User_6047 click the Entitle button under facility list
And User_6047 check same record saved inLoan Tenure field under facility info
And User_6047 enter the invalid data to required amount field
And User_6047 verify the invalid data in required amount field
Then User_6047 give the valid input for Request Amount under the Facility info
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info
Then logout from the ijaraApplication

@AT_FAC_DET_07
Scenario: To verify the functionality of activate,deactivate and back button under facility info-modify

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Tawarruq-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FAC_DET_04
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Reff Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list record under facility info
And User_6047 click the Entitle button under facility list
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
And User_6047 click search button
Then User_6047 search the facility list record under facility info
Then User_6047 verify system should show the record status as active or inactive based on the toggle
And User_6047 click edit icon
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on the toggle
And User_6047 click edit icon
And User_6047 click the back Button
And User_6047 to verify the functionality of back button with add button display
And User_6047 Click the back button in facility list
And User_6047 verify the the back button function using inbox label in facility list
Then logout from the ijaraApplication

