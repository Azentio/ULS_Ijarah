Feature: To check the Auto Loan - App Data Entry -> Customer Financial tab -> Customer Employment List

@AT_AL_ADE_EMP_01
Scenario: Creation of Employment Details record-Employment Details screen should get open with all valid fields in proper format with below mention buttons

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Business record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
#And User_608 verify Save button available under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Employment Period field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Primary Employment field available under Employment details screen
And User_608 to verify the Primary Employment toggle should be Yes in Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Direct Manager Telephone field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Number field available under Employment details screen
And User_608 verify State field available under Employment details screen
And User_608 verify City field available under Employment details screen
And User_608 verify Pincode field available under Employment details screen
And User_608 verify Sector field available under Employment details screen
And User_608 verify Industry Sub Sector field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_02
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Company/Firm

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Company//Firm record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_03
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Pensioner

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Pensioner record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Employment Period field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Direct Manager Telephone field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Number field available under Employment details screen
And User_608 verify State field available under Employment details screen
And User_608 verify City field available under Employment details screen
And User_608 verify Pincode field available under Employment details screen
And User_608 verify Sector field available under Employment details screen
And User_608 verify Industry Sub Sector field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_04
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is: Self-employed Professional

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
#And User_608 click the pagination next button under Employment details section
And User_608 click the Self-employed Professional record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_05
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is Salaried

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Salaried record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Employment Period field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Total Experience(Years) field available under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Direct Manager Telephone field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Number field available under Employment details screen
And User_608 verify State field available under Employment details screen
And User_608 verify Pincode field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_06
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is Salaried

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Salaried record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Date of Joining field should be Date, Mandatory under Employment details screen
And User_608 verify Employment Period field should be Dropdown, Mandatory under Employment details screen
And User_608 verify Nature of Employment field should be Dropdown, Mandatory under Employment details screen
And User_608 verify Employer Name field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Employer Name if(Others) field should be Textbox, Mandatory under Employment details screen
And User_608 verify Employee ID field should be Textbox, Mandatory under Employment details screen
And User_608 verify Employment Type field should be Dropdown, Mandatory under Employment details screen
And User_608 verify Total Experience(Years) field should be Textbox, Mandatory under Employment details screen
And User_608 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Employment End Date field should be Date, Non-Mandatory under Employment details screen
And User_608 verify Primary Employment field should be Toggle button, Non-Mandatory under Employment details screen
And User_608 verify Department field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Designation field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Direct Manager Telephone field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Employer Phone Number field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Direct Manager Name field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Remarks field should be Textbox, Non-Mandatory under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_07
Scenario: Employment Details screen should get open with below mentioned Fields and field validation when Nature of Employment is Self-employed

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Self-employed record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Company Type field should be Dropdown, Mandatory under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Nature of Employment field should be Dropdown, Mandatory under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Employment End Date field should be Date, Non-Mandatory under Employment details screen
And User_608 verify Primary Employment field available under Employment details screen
And User_608 verify Primary Employment field should be Toggle button, Non-Mandatory under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Profession Type field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Statutory Authority field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Share Holder Percentage field should be Textbox, Mandatory under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify No Of Partners field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Nature of Business field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Name field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Registered Business Number field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Business Registration Date field should be Date, Non-Mandatory under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify Office Premises Type field should be Dropdown, Non-Mandatory under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify No of Employees field should be Textbox, Non-Mandatory under Employment details screen
And User_608 verify Remarks field available under Employment details screen
And User_608 verify Remarks field should be Textbox, Non-Mandatory under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_08
Scenario: Creation of Employment Details record - To verify the functionality of save button post entering all valid details and clicking  on save button

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button under Customer Employment list section in Customer Financials tab
And User_608 select Nature of Employment from dropdown in Employment Details screen
And User_608 select Company Type from dropdown in Employment Details screen
And User_608 enter Date of Joining in Employment Details screen 
And User_608 select Employment Period from dropdown in Employment Details screen
And User_608 select Employer Name from dropdown in Employment Details screen
And User_608 enter Employee ID in Employment Details screen
And User_608 select Employment Type from dropdown in Employment Details screen
#And User_608 enter Total Experience in Employment Details screen
And User_608 enter Share Holder Percentage in Employment Details screen
And User_608 click Save button in Employment details screen
And User_608 verify the confirmation message post clicking on save button in Employment Details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_09
Scenario: Creation of Employment Details record - To verify the impact when user enter invalid values in character field

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_09
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click Add button under Customer Employment list section in Customer Financials tab
And User_608 select Nature of Employment from dropdown in Employment Details screen
And User_608 click Save button in Employment details screen
And User_608 to verify impact when user keep mandatory field blank and click on save button in Employment Details screen
And User_608 only enters the Special character in Employment Details screen
And User_608 to verify the impact when user enter special characters value in Employment Details screen
And User_608 enter the character values in numeric field in Employment Details screen
And User_608 to verify the impact when user enter characters value in numeric field in Employment Details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_10
Scenario: To verify the Employment Details Parameter details List view

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_10
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 verify Back button available in Customer Employment section list view under Customer Financials tab
And User_608 verify Add button available in Customer Employment section list view under Customer Financials tab
And User_608 verify Search button available under Customer Employment section list view in Customer Financials tab
And User_608 verify export to PDF button available in Customer Employment section list view under Customer Financials tab
And User_608 verify export to Excel button available in Customer Employment section list view under Customer Financials tab
And User_608 verify Nature of Employment field available under Customer Employment section list view in Customer Financials tab
And User_608 verify Employer Name field available under Customer Employment section list view in Customer Financials tab
And User_608 verify Employment Status field available under Customer Employment section list view in Customer Financials tab
And User_608 verify values should be non editable in Customer Employment section list view under Customer Financials tab
And User_608 verify list view values are displayed in Customer Employment section under Customer Financials tab
And User_608 to verify the functionality of Back button under Customer Financials tab
And User_608 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_11
Scenario: To verify the functionality of Export to PDF & XLS - functionality of Search box with matching & mismatch data

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_11
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the Export button under Customer Employment list section in Customer Financials tab
And User_608 to verify the functionality of Export to PDF button under Customer Employment list section
And User_608 verify post clicking on PDF button system should download PDF file of that records in Customer Employment section
And User_608 click the Export button under Customer Employment list section in Customer Financials tab
And User_608 to verify the functionality of Export to Excel button under Customer Employment list section
And User_608 verify post clicking on XLS button system should download Excel file of that records in Customer Employment section
And User_608 click the Search button under Customer Employment section in Customer Financials tab
And User_608 to verify functionality of Search box with matching data under Customer Employment section
And User_608 verify system should display all the possible matching records under Customer Employment section
And User_608 to verify functionality of Search box with mismatch data under Customer Employment section
And User_608 verify system should not display any records or system should display the message as No data found under Customer Employment section
And User_608 click Add button under Customer Employment list section in Customer Financials tab
And User_608 to verify post clicking on Add button system should allow to create new record of Customer Employment details
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage

@AT_AL_ADE_EMP_12
Scenario: To verify user is able to modify Employment details record in the system

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_ADE_EMP_12
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the pencil icon under Customer Financials tab
And User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab
And User_608 click the Salaried record Edit button under Customer Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 Delete the Mandatory field value in Employment Details screen
And User_608 click Update button in Employment details screen
And User_608 verify while modification, when user keep any mandatory field blank and click on Update button in Employment details screen
And User_608 enters the invalid data in Employment Details screen
And User_608 verify system should not allow to do a modification with invalid data in Employment Details screen
And User_608 verify system should allow to modify the Employment details record in Employment details screen
And User_608 verify while modification system allow to Update the record with valid data in Employment details screen
And User_608 click Update button in Employment details screen
And User_608 verify the confirmation message post clicking on Update button in Employment Details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage