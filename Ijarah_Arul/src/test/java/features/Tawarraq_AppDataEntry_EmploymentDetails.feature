Feature: To check the Tawarraq_Employment details feature

Scenario: 
@AT_TW_AD_EMPD_04
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Self-employed Professional

Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data entry_Employment details
And User_608 get the test data for test case AT_TW_AD_EMPD_04
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Tawarraq_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
#And User_608 clickt the pagination next button under Employment details section
And User_608 click on edit button of customer financial record at data entry stage
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
@AT_TW_AD_EMPD_05
Scenario: Employment Details screen should get open with below mentioned Fields when Nature of Employment is : Salaried

Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data entry_Employment details
And User_608 get the test data for test case AT_TW_AD_EMPD_05
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
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
@AT_TW_AD_EMPD_06
Scenario: To verify the fields are Dropdown, Textbox, Mandatory/Non-Mandatory and Display/Read only.

Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data entry_Employment details
And User_608 get the test data for test case AT_TW_AD_EMPD_06
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
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

@AT_TW_AD_EMPD_11
Scenario: To verify that search criteria in Employment details view list
Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data entry_Employment details
And User_608 get the test data for test case AT_TW_AD_EMPD_11
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And Click on Edit icon in Customer personal information page
And Search the Customer Employment record with valid data
And Search the Customer Employment record with invalid data


@AT_MU_EMPD_12
Scenario: To verify that user can able to update the record in Employment details view list
Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data entry_Employment details
And User_608 get the test data for test case AT_TW_AD_EMPD_12
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Murabha_App data entry_Employment details
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And Click on Edit icon in Customer personal information page
And Click on Edit icon in customer employment list page
And Update the value in Nature of Employment field
And Update the value in Company Type field
And Update the value in Profession field
And Update the value in Profession Type field
And Update the value in Statutory Authority  field
And Update the value in Employment End Date field
And Update the value in Employer Phone Extension field
And Update the value in No Of Partners field
And Update the value in Nature of Business field
And Update the value in Registered business Name field
And Update the value in Registered business Number field
And Update the value in Business Registration Date field
And Update the value in Office Premises Type field
And Update the value in Share Holder Percentage field
And Update the value in No Of Employees field
And Update the value in Remarks field
And Click on Save icon in customer employment page