Feature: To verify the Murabaha Application --> Data check stage --> Customer Financials --> Employment details screen

# EDC_01_01, EDC_01_02, EDC_01_03
@AT_MU_EDC_01
Scenario: Employment Details screen should be available under Data Check stage should get open with below fields and button,
System should populate all the data at this stage correctly same as App data entry stage

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Business record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Primary Employment field available under Employment details screen
And User_608 verify Employment Period field available under Employment details screen
And User_608 verify Employment Period value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Nature of Employment value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employer Name if Others value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Employee ID value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Date of Joining value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Employment Type value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
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
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Share Holder Percentage value should populate correctly same as App data entry stage under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


#EDC_01_05
@AT_MU_EDC_02
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Company/Firm.

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Company\Firm record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


#EDC_01_06
@AT_MU_EDC_03
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Pensioner.

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Pensioner record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Employment Period field available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
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
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


#EDC_01_07
@AT_MU_EDC_04
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Self-employed Professional

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 clickt the pagination next button under Employment details section
And User_608 click the Self-Employed Professional record Eye button under Employment List section in Customer Financials tab
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


#EDC_01_08
@AT_MU_EDC_05
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Salaried

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Salaried Customer record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Employer Name field available under Employment details screen
And User_608 verify Employer Name if Others field available under Employment details screen
And User_608 verify Employee ID field available under Employment details screen
And User_608 verify Date of Joining field available under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Department field available under Employment details screen
And User_608 verify Designation field available under Employment details screen
And User_608 verify Employment Type field available under Employment details screen
And User_608 verify Direct Manager Contact Number Extension field available under Employment details screen
And User_608 verify Direct Manager Telephone field available under Employment details screen
And User_608 verify Income Paymode field available under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Number field available under Employment details screen
And User_608 verify State field available under Employment details screen
And User_608 verify Pincode field available under Employment details screen
And User_608 verify Total Experience(Years) field available under Employment details screen
And User_608 verify Experience At Current Employment field available under Employment details screen
And User_608 verify Direct Manager Name field available under Employment details screen
And User_608 verify Employer City Code field available under Employment details screen
And User_608 verify Retirement Age field available under Employment details screen
And User_608 verify Remarks field available under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


#EDC_01_09 --> EDC_01_29
@AT_MU_EDC_06
Scenario: To verify the fields are Dropdown, Textbox, Mandatory/Non-Mandatory and Display/Read only.

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Salaried Customer record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Primary Employment field should be Toggle button, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employment Period field should be Dropdown, Mandatory and Read only under Employment details screen
And User_608 verify Nature of Employment field should be Dropdown, Mandatory and Read only under Employment details screen
And User_608 verify Employer Name field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employer Name if(Others) field should be Textbox, Mandatory and Read only under Employment details screen
And User_608 verify Employee ID field should be Textbox, Mandatory and Read only under Employment details screen
And User_608 verify Date of Joining field should be Date, Mandatory and Read only under Employment details screen
And User_608 verify Employment End Date field should be Date, Non-Mandatory and Read only under Employment details screen
And User_608 verify Department field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Designation field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employment Type field should be Dropdown, Mandatory and Read only under Employment details screen
And User_608 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Direct Manager Telephone field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Income Paymode field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employer Phone Number field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Total Experience(Years) field should be Textbox, Mandatory and Read only under Employment details screen
And User_608 verify Experience At Current Employment field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Direct Manager Name field should be Textbox, Non-Mandatory and Read only under Employment details screen
#And User_608 verify Employer City Code field should be Textbox, Non-Mandatory and Read only under Employment details screen
#And User_608 verify Remarks field should be Textbox, Non-Mandatory and Read only under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


# EDC_01_30 --> EDC_01_47 & EDC_01_50
@AT_MU_EDC_07
Scenario: To verify Employment Details screen should get open with below mentioned Fields when Nature of Employment is: Self-employed

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Self-Employed Customer record Eye button under Employment List section in Customer Financials tab
And User_608 verify Back button available under Employment details screen
And User_608 verify Primary Employment field available under Employment details screen
And User_608 verify Primary Employment field should be Toggle button, Non-Mandatory and Read only under Employment details screen
And User_608 verify Nature of Employment field available under Employment details screen
And User_608 verify Nature of Employment field should be Dropdown, Mandatory and Read only under Employment details screen
And User_608 verify Company Type field available under Employment details screen
And User_608 verify Company Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Profession field available under Employment details screen
And User_608 verify Profession field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Profession Type field available under Employment details screen
And User_608 verify Profession Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Statutory Authority field available under Employment details screen
And User_608 verify Statutory Authority field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employment End Date field available under Employment details screen
And User_608 verify Employment End Date field should be Date, Non-Mandatory and Read only under Employment details screen
And User_608 verify Employer Phone Extension field available under Employment details screen
And User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify No Of Partners field available under Employment details screen
And User_608 verify No Of Partners field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Nature of Business field available under Employment details screen
And User_608 verify Nature of Business field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Registered Business Name field available under Employment details screen
And User_608 verify Registered Business Name field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Registered Business Number field available under Employment details screen
And User_608 verify Registered Business Number field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Business Registration Date field available under Employment details screen
And User_608 verify Business Registration Date field should be Date, Non-Mandatory and Read only under Employment details screen
And User_608 verify Office Premises Type field available under Employment details screen
And User_608 verify Office Premises Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen
And User_608 verify Share Holder Percentage field available under Employment details screen
And User_608 verify Share Holder Percentage field should be Textbox, Mandatory and Read only under Employment details screen
And User_608 verify No of Employees field available under Employment details screen
And User_608 verify No of Employees field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify Remarks field available under Employment details screen
And User_608 verify Remarks field should be Textbox, Non-Mandatory and Read only under Employment details screen
And User_608 verify the functionality of Back button under Employment details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


# EDC_02_01 & EDC_02_02
@AT_MU_EDC_08
Scenario: System should display the below mention fields on List view of Employment Details

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify Back button available in Customer Employment section list view under Customer Financials tab
And User_608 verify Search button available under Customer Employment section list view in Customer Financials tab
And User_608 verify Nature of Employment field available under Customer Employment section list view in Customer Financials tab
And User_608 verify Employer Name field available under Customer Employment section list view in Customer Financials tab
And User_608 verify Employment Status field available under Customer Employment section list view in Customer Financials tab
And User_608 verify system should display the records on the list view under Customer Employment section in Customer Financials tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage


# EDC_02_04, EDC_02_05, EDC_02_08
@AT_MU_EDC_09
Scenario: System should display the below mention fields on List view of Employment Details

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_EDC_09
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Search button under Customer Employment section in Customer Financials tab
And User_608 verify the functionality of Search box with matching data under Customer Employment section
And User_608 verify system should display all the possible matching records under Customer Employment section
And User_608 verify the functionality of Search box with mismatch data under Customer Employment section
And User_608 verify system should not display any records or system should display the message as No data found under Customer Employment section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage
