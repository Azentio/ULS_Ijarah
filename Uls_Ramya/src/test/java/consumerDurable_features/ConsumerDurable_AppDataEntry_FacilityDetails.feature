Feature: To test the Consumer Durable-App Data Entry- Facility Details 
@AT_CD_ADE_FC_01
Scenario: To verify the Facility Details screen is getting open with all valid fields

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ConsumerDurable-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_CD_ADE_FC_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab in ConsumerDurable 
And User_6047 Click Add button under the Facility info
And User_6047 Click edit button under the Facility info
And User_6047 click edit icon
Then User_6047 To verify the save button under the Facilityinfo screen
Then User_6047 To verify the back button field under the Facilityinfo screen
Then User_6047 To verify the Classification field under the Facilityinfo screen
Then User_6047 To verify the Product field under the Facilityinfo screen
Then User_6047 To verify the Scheme field under the Facilityinfo screen
Then User_6047 To verify the Program Code field under the Facilityinfo screen
Then User_6047 To verify the Facility type field under the Facilityinfo screen
Then User_6047 To verify the Pricing Indicator field under the Facilityinfo screen
Then User_6047 To verify the serving branch field under the Facilityinfo screen
Then User_6047 To verify the Request Amount under the Facilityinfo screen
Then User_6047 To verify the Currency field under the Facilityinfo screen
Then User_6047 To verify the Loan Tenure under the Facilityinfo screen
Then User_6047 To verify the Declared Down payment amount under the Facilityinfo screen
Then User_6047 To verify the status under the Facilityinfo screen
Then logout from the ijaraApplication

@AT_CD_ADE_FC_02
Scenario: To verify the fields Facility Details screen 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ConsumerDurable-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_CD_ADE_FC_01
#And User_6047 Click the module name dropdown in ULS application
#And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the referen Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab in ConsumerDurable 
#And User_6047 Click Add button under the Facility info
And User_6047 click edit icon