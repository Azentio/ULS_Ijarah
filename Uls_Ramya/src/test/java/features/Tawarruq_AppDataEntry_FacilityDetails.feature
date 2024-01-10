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
Then User_6047 verify the successfully saved message under the facility info
Then User_6047 Extract the application details record reference number in facilityinfo stage
Then User_6047 click the Back button and verify the functionality of back button
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 to verify the same record should get saved in facilityInfo
Then logout from the ijaraApplication 


@AT_FAC_DET_05
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

And User_6047 click the Entitle button under facility list
Then User_6047 to verify the same record should get saved in facilityInfo
Then User_6047 click the Back button and verify the functionality of back button
Then logout from the ijaraApplication 