
Feature: To test the ApplicationDataEntry module in URL
@AT_FI_001
Scenario:  Facility Info tab should get open with the required field

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info  
And User_6047 check the Save button under the Facility info
Then User_6047 check the Back button under the Facility info
Then User_6047 check the Classification field under the Facility info
Then User_6047 check the Product field under the Facility info
Then User_6047 check the Scheme field under the Facility info
Then User_6047 check the Program Code field under the Facility info
Then User_6047 check the Facility type field under the Facility info
Then User_6047 check the Pricing Indicator field under the Facility info
Then User_6047 check the Requested Amount field under the Facility info
Then User_6047 check the Declared Property Value field under the Facility info
Then User_6047 check the Declared Down Payment Amount field under the Facility info
Then User_6047 check the Currency field under the Facility info
Then User_6047 check the Loan Tenure field under the Facility info
Then User_6047 check the Servicing Branch field under the Facility info
Then logout from the ijaraApplication
@AT_FI_002

Scenario:  To verify the field of Classification,Product,Scheme under the Facility info
Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info  
Then User_6047 Verify the Classification field should be mandatory,editable,text lookup
Then User_6047 Verify the Product field should be mandatory,editable,text lookup
Then User_6047 Verify the Scheme field should be mandatory,editable,text lookup
Then logout from the ijaraApplication
@AT_FI_003
Scenario:  To verify the field of Program code,Servicing branch,Pricing indicator under the Facility info

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info
Then User_6047 Verify the Program code field should be mandatory,editable,text lookup
Then User_6047 Verify the Servicing branch field should be mandatory,editable
Then User_6047 Verify the Pricing indicator field should be mandatory,editable,text lookup
Then logout from the ijaraApplication
@AT_FI_004
Scenario:  To verify the field of Requested amount,Declared downpayment amount,Currency,Loan tenure(months) under the Facility info

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_001
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info
Then User_6047 Verify the Requested amount field should be mandatory,editable,num 
Then User_6047 Verify the Declared downpayment amount field should be mandatory,editable,num
Then User_6047 Verify the Currency field should be mandatory,editable,text lookup
Then User_6047 Verify the Loan tenure(months) field should be mandatory,editable,numeric lookup
Then logout from the ijaraApplication
@AT_FI_006   
Scenario: To check the blank field,invalid data in facility info tab

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info  
Then User_6047 select the input for Classification field under the Facility info
Then User_6047 select the input for Product field under the Facility info
Then User_6047 select the input for Scheme field under the Facility info
Then User_6047 select the input for Program Code field under the Facility info
Then User_6047 click the save button under the facility info
 #to check the blank field
Then User_6047 verify the popup of fill all field
Then User_6047 select the input for Facility type field under the Facility info
Then User_6047 select the input for Pricing Indicator field under the Facility info
Then User_6047 select the input for serving branch field under the Facility info
Then User_6047 give the input for Declared Property Value field under the Facility info
Then User_6047 give the input for Declared Down Payment Amount field under the Facility info
And User_6047 enter the characters to the declared downpayment amount
And User_6047 check the invalid data in the declared downpayment amount
And User_6047 enter the special characters to the declared downpayment amount
And User_6047 check the invalid data in the declared downpayment amount
And User_6047 enter the negative number to the declared downpayment amount
And User_6047 check the negative data in the declared downpayment amount
Then User_6047 give the input for Request Amount field under the Facility info
Then User_6047 select the input for Currency field under the Facility info
Then User_6047 give the input for Loan Tenure field under the Facility info 
 #for save
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info
Then User_6047 Extract the application details record reference number in new facilityinfo stage
Then logout from the ijaraApplication
#TC @AT_FI_006 - user to add new record
@AT_FI_005
Scenario:  To verify the field of Add button,Back button,save button under the Facility info

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info
Then User_6047 click the classification field and select the data for user to add new record 
Then User_6047 click the Back button and verify the functionality of back button
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 to verify the same record should get saved in the system
Then logout from the ijaraApplication
@AT_FI_007
Scenario: To verify the buttons available on screen while modify the Facility Info

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 check the Classification field under the Facility info
Then User_6047 check the Product field under the Facility info
Then User_6047 check the Scheme field under the Facility info
Then User_6047 check the Program Code field under the Facility info
Then User_6047 check the Pricing Indicator field under the Facility info
Then User_6047 check the Requested Amount field under the Facility info
Then User_6047 check the Declared Down Payment Amount field under the Facility info
Then User_6047 check the Currency field under the Facility info
Then User_6047 check the Loan Tenure field under the Facility info
Then User_6047 check the Servicing Branch field under the Facility info
Then logout from the ijaraApplication



@AT_FI_008
Scenario: To verify the Modification of Facility Info record

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
Then User_6047 clear the Loan Tenure field under facility
Then User_6047 modify the Loan Tenure field under facility info
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info
And User_6047 Click the Search button under inbox
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
And User_6047 to check same record saved inLoan Tenure field under facility info
Then logout from the ijaraApplication
@AT_FI_009
Scenario: To verify the invalid data,success message and back button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
And User_6047 modify the declared downpayment amount
#not allow invalid data
And User_6047 check the invalid data in the declared downpayment amount
And User_6047 modify the correct data for declared downpayment amount
Then User_6047 click the save button under the facility info
Then User_6047 verify the successfully saved message under the facility info
And User_6047 Click the back button in facility list
And User_6047 verify the the back button function using inbox label in facility list
Then logout from the ijaraApplication
@AT_FI_010
Scenario: To verify the functionality of activate,deactivate and back button under facility info-modify

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_005
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click the Search button 
Then User_6047 search the facility list under facility info
And User_6047 click the Entitle button under facility list
And User_6047 click the status toggle button for deactivate
And User_6047 to check the status is deactive
And User_6047 click the status toggle button for activate
And User_6047 to check the status is active
And User_6047 click the back Button
And User_6047 to verify the functionality of back button with add button display
Then logout from the ijaraApplication
@AT_FI_012
Scenario: To verify the functionality of add button and display any matching , non matching record in facilist list 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_012
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
And User_6047 click the Entitle button under inbox 
And User_6047 Click the Facility info tab
And User_6047 Click Add button under the Facility info
And User_6047 give the input for Loan Tenure field under the Facility info
And User_6047 to check same record saved inLoan Tenure field under facility info
And User_6047 click the back Button
#And User_6047 Click the Search button under inbox
#Then User_6047 search the facility list under facility info
And User_6047 click the Search button under facility info tab and search the matching data in listview
And User_6047 check the result data in facility list view
And User_6047 clear the search box
And User_6047 click the Search button under facility info tab and search the mismatching data in listview
And User_6047 check the result in facility list view
Then logout from the ijaraApplication
@AT_FI_013
Scenario: To verify the functionality of Export to PDF button,Excel button and back button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo
And User_6047 Get the test data for test case ID AT_FI_013
Then User_6047 Click the Mail box in ULS application
Then User_6047 Click the Search button under inbox
And User_6047 Search the Ref Id under inbox 
Then User_6047 click the Entitle button under inbox 
Then User_6047 Click the Facility info tab
And User_6047 Click the Export button under Facility info tab
#And User_6047 Click the Excel button under Export
#Then User_6047 Click the export button
Then User_6047 click on export to excel button
And User_6047 verify the system is downloading the excel file in Facility Details
#And User_6047 Click the PDF button under Export
Then User_6047 Click the export button
Then User_6047 click on export to pdf button
And User_6047 verify the system is downloading the pdf file
Then logout from the ijaraApplication

