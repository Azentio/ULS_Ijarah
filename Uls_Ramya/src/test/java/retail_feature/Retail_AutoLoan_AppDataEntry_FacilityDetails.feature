Feature: To test the Retail-AutoLoan-App Data Entry- Facility Details 
@AT_ADE_FD_01_01
Scenario: To verify the Facility Details screen is getting open with all valid fields

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Retail-AutoLoan-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_ADE_FD_01_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Refere Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab
And User_6047 Click Add button under the Facility info 
Then User_6047 To verify the Classification field under the Facility info
Then User_6047 To verify the Product field under the Facility info
Then User_6047 To verify the Scheme field under the Facility info
Then User_6047 To verify the Program Code field under the Facility info
Then User_6047 To verify the Facility type field under the Facility info
Then User_6047 To verify the Pricing Indicator field under the Facility info
Then User_6047 To verify the serving branch field under the Facility info
Then User_6047 To verify the Request Amount under the Facility info
Then User_6047 To verify the Currency field under the Facility info
Then User_6047 To verify the Loan Tenure under the Facility info
Then User_6047 To verify the Declared Down payment amount under the Facility info
Then User_6047 To verify the status under the Facility info
Then logout from the ijaraApplication

@AT_ADE_FD_01_02
Scenario: To verify the functionality of save button and same record should saved in the system

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Retail-AutoLoan-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_ADE_FD_01_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Refere Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab
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
Then User_6047 give the input for Declared Down payment amount under the Facility info
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info screen
Then User_6047 Extract the facility details record reference number in facilityinfo stage
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list record under facility info screen
And User_6047 click the Entitle button under facility list
Then User_6047 to verify the same record should get saved in facilityInfo screen
Then logout from the ijaraApplication

@AT_ADE_FD_01_03
Scenario: To verify the fields of facility details

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Retail-AutoLoan-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_ADE_FD_01_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Refere Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab
And User_6047 Click Add button under the Facility info 
Then User_6047 To verify the field Classification should be mandatory,editable,dropdown
Then User_6047 To verify the field Product should be mandatory,editable,dropdown
Then User_6047 To verify the field Scheme should be mandatory,editable,dropdown
Then User_6047 To verify the field Program code should be mandatory,editable,dropdown
Then User_6047 To verify the field Facility Type should be mandatory,editable,dropdown
Then User_6047 To verify the field Servicing Branch should be mandatory,editable,dropdown
Then logout from the ijaraApplication

@AT_ADE_FD_01_04
Scenario: To verify the fields of facility details

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-Retail-AutoLoan-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_ADE_FD_01_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Refere Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info screen tab
And User_6047 Click Add button under the Facility info 
Then User_6047 To verify the field Pricing or Intrest Indicator should be mandatory,editable,dropdown
Then User_6047 To verify the field Declared Down payment amount should be mandatory,editable,dropdown
Then User_6047 To verify the field Requested amount should be mandatory,editable,dropdown
Then User_6047 To verify the field Currency should be mandatory,editable,dropdown
Then User_6047 To verify the field Loan tenure should be mandatory,editable,dropdown
Then User_6047 To verify the field Status should be mandatory,editable,dropdown
Then logout from the ijaraApplication
