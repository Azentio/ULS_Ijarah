Feature: To test the Consumer Durable-App Data Entry- Facility Details 
@AT_CD_ADE_FI_01
Scenario: To verify the Facility Details screen is getting open with all valid fields

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FI_01
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info screen tab in ConsumerDurable 
And User_6047 Click edit button under the Facility info
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
Then logout from the ULS Application

@AT_CD_ADE_FI_02
Scenario: To verify the Facility in Details screen 
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FI_01
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info screen tab in ConsumerDurable 
#And User_6047 Click edit button under the Facility info
And User_6047 Click Add button under the Facility info
Then User_6047 Verify the Classification field should be mandatory,editable,text lookup
Then User_6047 Verify the Product field should be mandatory,editable,text lookup
Then User_6047 Verify the Scheme field should be mandatory,editable,text lookup
Then User_6047 Verify the Program code field should be mandatory,editable,text lookup
Then User_6047 Verify the Servicing branch field should be mandatory,noneditable
Then User_6047 Verify the Pricing indicator field should be mandatory,editable,text lookup
Then User_6047 Verify the Requested amount field should be mandatory,noneditable 
Then User_6047 Verify the Declared downpayment amount field should be mandatory,editable,text
Then User_6047 Verify the Currency field should be mandatory,editable,text lookup
Then User_6047 Verify the Loan tenure(months) field should be mandatory,editable,numeric lookup
Then logout from the ULS Application


