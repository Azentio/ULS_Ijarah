
Feature: To test the Consumer Durable-App Data Entry-Financial commitments 
@AT_CD_ADE_FC_01
Scenario: To verify the Financial commitments screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_01
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 verify the Save button in Financial commitments
Then User_6047 verify the Back button in Financial commitments
Then User_6047 verify the Finance Type in Financial commitments
Then User_6047 verify the Financier Institution in Financial commitments
Then User_6047 verify the Account Number in Financial commitments
Then User_6047 verify the Sanction Date in Financial commitments
Then User_6047 verify the Sanction Amount in Financial commitments
Then User_6047 verify the Interest Rate % in Financial commitments
Then User_6047 verify the Tenure(months) in Financial commitments
Then User_6047 verify the Maturity Date in Financial commitments
Then User_6047 verify the Installment Amount in Financial commitments        
Then User_6047 verify the Current Principal Balance in Financial commitments
Then User_6047 verify the Amount Considered in Financial commitments
Then User_6047 verify the Include in Eligibility Calculation in Financial commitments
Then User_6047 verify the Currency in Financial commitments
Then User_6047 verify the Remarks in Financial commitments
Then User_6047 verify the Next Due date in Financial commitments
Then User_6047 verify the Collateral Type in Financial commitments
Then User_6047 verify the Closed Date in Financial commitments
Then User_6047 verify the Frequency in Financial commitments
Then User_6047 verify the Last Payment Amount in Financial commitments
Then User_6047 verify the Last Payment Date in Financial commitments
Then User_6047 verify the Product Name in Financial commitments
Then User_6047 verify the Balance Transfer Flag in Financial commitments
Then User_6047 verify the Last 24 Cycle in Financial commitments
Then User_6047 verify the Loan Status in Financial commitments
Then User_6047 verify the Remaining Tenure (months) in Financial commitments
Then User_6047 verify the Disbursement Date in Financial commitments
Then User_6047 verify the NPA CLASSIFICATION in Financial commitments
Then logout from the ULS Application

@AT_CD_ADE_FC_02
Scenario: To verify the system allow the modification of data,save button shows
 the conformation message and functionality of back button

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_02
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 Select the value for finance type 
Then User_6047 Select the value for Financial Institution
Then User_6047 Enter the value for sanction amount
Then User_6047 Enter the value for tenure(months)
Then User_6047 Enter the value for installment amount
Then User_6047 Enter the value for remaining tenure(months)
Then User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
Then User_6047 modify and verify the system should allow user to modification with valid data
Then User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
Then User_6047 verify The same record should get saved in a system
Then User_6047 to click the back button in financial commitment
Then User_6047 verify the functionality of back button in financial commitment
Then logout from the ULS Application

@AT_CD_ADE_FC_03
Scenario: To verify the fields in Financial commitments screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_03
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 Verify the field Finance Type should be mandatory and allow select any value from LOV
Then User_6047 Verify the field Financial Institution should be Non-mandatory and allow select any value from LOV
Then User_6047 Verify the field Account Number should be Non-mandatory textbox and allow user to only positive numeric value 
Then User_6047 Verify the field Sanction Date should be Non-mandatory and date
Then User_6047 Verify the field Sanction Amount should be mandatory,textbox and allow user to enter only positive numeric value 
Then User_6047 Verify the field interest Rate should be Non-mandatory,textbox and allow user to enter only positive numeric value 
Then logout from the ULS Application

@AT_CD_ADE_FC_04
Scenario: To verify the fields in Financial commitments screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_03
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox 
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 Verify the field Current Principal Balance should be Non-mandatory,textbox and allow user to enter only positive numeric value 
Then User_6047 Verify the field Tenure(months) should be mandatory,textbox and allow user to enter only positive numeric value
Then User_6047 Verify the field Maturity Date should be Non-mandatory,date
Then User_6047 Verify the field Installment Amount should be mandatory,textbox and allow user to enter only positive numeric value
Then User_6047 Verify the field Amount Considered should be Non-mandatory,textbox and allow user to enter only positive numeric value
Then User_6047 Verify the field Currency should be Non-mandatory and allow select any value from LOV
Then logout from the ULS Application

@AT_CD_ADE_FC_05
Scenario: To verify the fields in Financial commitments screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_03
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 Verify the field Remarks should be Non-mandatory,textbox 
Then User_6047 Verify the field Next Due date should be Non-mandatory and date
Then User_6047 Verify the field Collateral Type should be Non-mandatory and allow select any value from LOV
Then User_6047 Verify the field Closed Date should be Non-mandatory and date
Then User_6047 Verify the field Last Payment Amount should be Non-mandatory and textbox
Then User_6047 Verify the field Product Name should be Non-mandatory and textbox
Then logout from the ULS Application

@AT_CD_ADE_FC_06
Scenario: To verify the fields in Financial commitments screen
Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_03
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 Verify the field Last24 Cycle should be Non-mandatory and textbox
Then User_6047 Verify the field Balance Transfer Flag should be Non-mandatory and toggle button
Then User_6047 Verify the field Facility Status should be Non-mandatory and dropdown
Then User_6047 Verify the field Remaining Tenure(months) should be mandatory and textbox and allow user to enter only positive numeric value
Then User_6047 Verify the field Disbursement Date should be Non-mandatory and date
Then User_6047 Verify the field Request for Balance Takeover should be Non-mandatory and dropdown
Then User_6047 Verify the field NPA CLASSIFICATION should be Non-mandatory and dropdown
Then logout from the ULS Application

@AT_CD_ADE_FC_07
Scenario: To verify the impact of mandatory field blank,invalid value and click on save button

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_07
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the add button of Financial commitments
Then User_6047 click the Save Button
Then User_6047 verify the popup of fill all field
Then User_6047 Enter the characters value in numeric field in Financial commitments(Tenure months)
#Then User_6047 click the Save Button
Then User-6047 Verify the impact of character value in numeric field Financial commitments
#Then User_6047 Enter the characters value in any field Financial commitments
#Then User_6047 Verify the impact of characters value in any field Financial commitments
Then logout from the ULS Application

@AT_CD_ADE_FC_08
Scenario: To verify the Modification of Customer Debt modification record screen(Financial commitments)

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_07
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
Then User_6047 verify the Save button in Financial commitments
Then User_6047 verify the Back button in Financial commitments
Then User_6047 Modify the data in Financial commitments      
Then User_6047 click the Save Button
Then User_6047 Verify the System should allow user to modify the Customer Personal Information 
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
Then User_6047 modify with valid data in Financial commitments field(Remaining tenure)
Then User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
Then User_6047 Verify the same record should get saved in the system
Then User_6047 Delete the mandatory data in Financial commitments field
Then User_6047 click the Save Button
Then User_6047 Verify the validation message for blank field
Then User_6047 modify with invalid data in Financial commitments field
Then User_6047 Verify the validation message for invalid data Financial commitments screen
Then User_6047 to click the back button in modification of financial commitment record
Then User_6047 verify the functionality of back button in modification of financial commitment record
Then logout from the ULS Application

@AT_CD_ADE_FC_09
Scenario: To verify the fields in Modification of Customer Debt modification record screen(Financial commitments) and list view

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_07
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
#list view fields
And User_6047 verify the add botton in financial commitments list view
Then User_6047 verify the Edit botton in financial commitments list view
Then User_6047 verify the search botton in financial commitments list view
Then User_6047 verify the Export to PDF,XLS in financial commitments list view
Then User_6047 verify list view fields are shown in financial commitments list view
And User_6047 Click the edit button of Financial commitments
#modificarion of financial commitments screen
Then User_6047 verify the Save button in Financial commitments
Then User_6047 verify the Back button in Financial commitments
Then User_6047 verify the Finance Type in Financial commitments
Then User_6047 verify the Financier Institution in Financial commitments
Then User_6047 verify the Account Number in Financial commitments
Then User_6047 verify the Sanction Date in Financial commitments
Then User_6047 verify the Sanction Amount in Financial commitments
Then User_6047 verify the Interest Rate % in Financial commitments
Then User_6047 verify the Tenure(months) in Financial commitments
Then User_6047 verify the Maturity Date in Financial commitments
Then User_6047 verify the Installment Amount in Financial commitments        
Then User_6047 verify the Current Principal Balance in Financial commitments
Then User_6047 verify the Amount Considered in Financial commitments
Then User_6047 verify the Include in Eligibility Calculation in Financial commitments
Then User_6047 verify the Currency in Financial commitments
Then User_6047 verify the Remarks in Financial commitments
Then User_6047 verify the Next Due date in Financial commitments
Then User_6047 verify the Collateral Type in Financial commitments
Then User_6047 verify the Closed Date in Financial commitments
Then User_6047 verify the Frequency in Financial commitments
Then User_6047 verify the Last Payment Amount in Financial commitments
Then User_6047 verify the Last Payment Date in Financial commitments
Then User_6047 verify the Product Name in Financial commitments
Then User_6047 verify the Balance Transfer Flag in Financial commitments
Then User_6047 verify the Last 24 Cycle in Financial commitments
Then User_6047 verify the Loan Status in Financial commitments
Then User_6047 verify the Remaining Tenure (months) in Financial commitments
Then User_6047 verify the Disbursement Date in Financial commitments
Then User_6047 verify the NPA CLASSIFICATION in Financial commitments
Then logout from the ULS Application

@AT_CD_ADE_FC_10
Scenario: To verify the Values in List view should be non editable,functionality of add and search button with matching and mismatching data

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_10
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 To verify Values in List view should be non editable
And User_6047 Click the add button of Financial commitments
And User_6047 To verify the Add button allow user to create new record of Financial commitments 
Then User_6047 to click the back button in financial commitment
And User_6047 click the Search button under Financial commitments and search the matching data in listview
And User_6047 verify the match result data in Financial commitments list view
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
Then User_6047 click the Search button under Financial commitments tab and search the mismatching data in listview
Then User_6047 verify the mismatch result in Financial commitments list view
Then logout from the ULS Application

@AT_CD_ADE_FC_11
Scenario: To verify the functionality of Export to PDF and Excel button, user is able to change the status of Debt record

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_6047 get the test data set id for AT_CD_ADE_FC_10
And User_6047 click the module name dropdown in ULS application
And User_6047 select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Reference ID for Consumer Durable
And User_6047 click the Entitle button under inbox
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 click the Export button in Financial commitments
Then User_6047 click on export to excel button in Financial commitments
And User_6047 verify the system  downloading the excel file in Financial commitments
And User_6047 click the Export button in Financial commitments
Then User_6047 click on export to pdf button in Financial commitments
And User_6047 verify the system downloading the pdf file
And User_6047 Click the edit button of Financial commitments
And User_6047 change the financial commitmet status to active to inactive or inactive to active
Then User_6047 click the Save Button
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 Click the customer Financial tab
And User_6047 click edit icon
And User_6047 Click the edit button of Financial commitments
And User_6047 change the financial commitmet status to active to inactive or inactive to active
Then User_6047 click the Save Button
Then User_6047 verify system should show the record status as active or inactive based on toggle
Then logout from the ULS Application
