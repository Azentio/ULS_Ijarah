Feature: To test the employmentDetail module in URL
#v0169
@AT_EDC_01
Scenario: To verify the employmentDetail record is available in system
Given Navigate the IJARA URL
#And User_6047 login with valid credentials
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 get the test data for test case ID AT_EDC_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the business
And user_6047 verify the Primary Employment below the Employment Details
And user_6047 verify the Employment Period below the Employment Details
And user_6047 verify the Nature of Employment below the Employment Details
And user_6047 verify the Company Type below the Employment Details
And user_6047 verify the Profession below the Employment Details
And user_6047 verify the Profession Type below the Employment Details
And user_6047 verify the Statutory Authority below the Employment Details
And user_6047 verify the Employer Name  below the Employment Details
And user_6047 verify the Employer Name If (Others) below the Employment Details
And user_6047 verify the Employee Id below the Employment Details
And user_6047 verify the Date Of Joining below the Employment Details
And user_6047 verify the Employment End Date below the Employment Details
And user_6047 verify the Department below the Employment Details
And user_6047 verify the Designation below the Employment Details
And user_6047 verify the Employment Type below the Employment Details
And user_6047 verify the Direct Manager Contact Number Extension below the Employment Details
And user_6047 verify the Direct Manager Phone Number below the Employment Details
And user_6047 verify the Income Paymode below the Employment Details
And user_6047 verify Employer Phone Extension below the Employment Details
And user_6047 verify the Employer Phone Number below the Employment Details
And user_6047 verify the State below the Employment Details
And user_6047 verify the City below the Employment Details
And user_6047 verify the Pin code below the Employment Details
And user_6047 verify the Sector below the Employment Details
And user_6047 verify the Industry Sub Sector below the Employment Details
And user_6047 verify the No Of Partners  below the Employment Details
And user_6047 verify the Nature OF Business below the Employment Details
And user_6047 verify the Registered Business Name below the Employment Details
And user_6047 verify the Registered Business Numbe below the Employment Details
And user_6047 verify the Business Registration Date below the Employment Details
And user_6047 verify the Office Premises Type below the Employment Details
And user_6047 verify the Share Holder Percentage below the Employment Details
And user_6047 verify the No Of Employees below the Employment Details
And user_6047 verify the Total Experience below the Employment Details
And user_6047 verify the Experience At Current Employment below the Employment Details
And user_6047 verify the Direct Manager below the Employment Details
And user_6047 verify the Employer City Code below the Employment Details
And user_6047 verify the Retirement Age below the Employment Details
And user_6047 verify the Remarks below the Employment Details
Then logout from the ULS Application

@AT_EDC_02
Scenario: To verify already added details at employment details stage is visible at data check stage

Given Navigate the IJARA URL
#And User_6047 login with valid credentials
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 get the test data for test case ID AT_EDC_01
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the business
And user_6047 validate the Employment Period Validation below  the Employment Details
And user_6047 validate the Nature Of Employment Validation below  the Employment Details
And user_6047 validate the Employer Name If Validation below  the Employment Details
And user_6047 validate the Employee Id Validation below the Employment Details
And user_6047 validate the Date Of Joining Validation below the Employment Details
And user_6047 validate the Employment Type Validation below  the Employment Details
And user_6047 validate the Share HOlder Percentage Validation below  the Employment Details
And user_6047 validate the Total Experience Validation below the Employment Details
And user_6047 validate the Retirement Age Validation below the Employment Details
And user_6047 verify the back button below the Employment Details
And user_6047 verify the primary Employment Default Vale As Yes below the Employment Details
Then logout from the ULS Application

@AT_EDC_04
Scenario: To verify fields when nature of employment is Company/Firm

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 get the test data for test case ID AT_EDC_04
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the Company/Firm
And user_6047 verify the Nature of Employment below the Employment Details in CF
And user_6047 verify the Company Type below the Employment Details in CF
And user_6047 verify the Profession below the Employment Details in CF
And user_6047 verify the Profession Type below the Employment Details in CF
And user_6047 verify the Statutory Authority below the Employment Details in CF
And user_6047 verify the Employment End Date below the Employment Details in CF
And user_6047 verify Employer Phone Extension below the Employment Details in CF
And user_6047 verify the No Of Partners  below the Employment Details in CF
And user_6047 verify the Nature OF Business below the Employment Details in CF
And user_6047 verify the Registered Business Name below the Employment Details in CF
And user_6047 verify the Registered Business Numbe below the Employment Details in CF
And user_6047 verify the Business Registration Date below the Employment Details in CF
And user_6047 verify the Office Premises Type below the Employment Details in CF
And user_6047 verify the Share Holder Percentage below the Employment Details in CF
And user_6047 verify the No Of Employees below the Employment Details in CF
And user_6047 verify the Remarks below the Employment Details in CF
Then logout from the ULS Application

@AT_EDC_05
Scenario: To verify fields when nature of employment is Pensioner

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_05
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the Pensioner
And user_6047 verify the Employment Period in Pensioner below the Employment Details
And user_6047 verify the Nature of Employment in Pensioner below the Employment Details 
And user_6047 verify the Employer Name in Pensioner below the Emp Details 
And user_6047 verify the Employer Name If in Pensioner below the Emp Details 
And user_6047 verify the Employee Id in Pensioner below the Emp Details
And user_6047 verify the Date Of Joining in Pensioner below the Emp Details 
And user_6047 verify the Employment End Date in Pensioner below the Emp Details 
And user_6047 verify the Department in Pensioner below the Emp Details 
And user_6047 verify the Designation in Pensioner below the Emp Details 
And user_6047 verify the Employment Type in Pensioner below the Emp Details
And user_6047 verify the Direct Manager Contact Number Extension in Pensioner below the Emp Details
And user_6047 verify the Direct Manager Phone Number in Pensioner below the Emp Details
And user_6047 verify the Income Paymode in Pensioner below the Emp Details
And user_6047 verify Employer Phone Extension in Pensioner below the Emp Details
And user_6047 verify the Employer Phone Number in Pensioner below the Emp Details
And user_6047 verify the State in Pensioner below the Emp Details
And user_6047 verify the Pin code in Pensioner below the Emp Details
And user_6047 verify the Total Experience in Pensioner below the Emp Details
And user_6047 verify the Experience At Current Employment in Pensioner below the Emp Details
And user_6047 verify the Direct Manager in Pensioner below the Emp Details
And user_6047 verify the Employer City Code in Pensioner below the Emp Details
And user_6047 verify the Retirement Age in Pensioner below the Emp Details
And user_6047 verify the Remarks in Pensioner below the Emp Details
Then logout from the ULS Application

@AT_EDC_09
Scenario: To verify fields when nature of employment is Self-employed

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_09
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the Self-employed
Then user_6047 verify the Nature of Employment in Self-employed below the Employment Details
Then user_6047 verify the Company Type in Self-employed below the Employment Details
Then user_6047 verify the Profession in Self-employedbelow the Employment Details
Then user_6047 verify the Profession Type in Self-employed below the Employment Details
Then user_6047 verify the Statutory Authority in Self-employed below the Employment Details
Then user_6047 verify the Employment End Date in Self-employed below the Employment Details
#Then user_6047 verify the Income Paymode in Self-employed below the Employment Details
Then user_6047 verify Employer Phone Extension in Self-employed below the Employment Details
Then user_6047 verify the No Of Partners in Self-employed  below the Employment Details
Then user_6047 verify the Nature OF Business in Self-employed below the Employment Details
Then user_6047 verify the Registered Business Name in Self-employed Name below the Employment Details
Then user_6047 verify the Registered Business Number in Self-employed below the Employment Details
Then user_6047 verify the Business Registration Date in Self-employed below the Employment Details
Then user_6047 verify the Office Premises Type in Self-employed below the Employment Details
Then user_6047 verify the Share Holder Percentage in Self-employed below the Employment Details
Then user_6047 verify the No Of Employees in Self-employed below the Employment Details
Then user_6047 verify the Remarks in Self-employed below the Emp Details
Then logout from the ULS Application

@AT_EDC_07
Scenario: To verify fields when nature of employment is Salaried

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_07
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And User_6047 click the Action button for the Salaried
Then User_6047 verify the Nature of Employment in Salaried below the Employment Details
Then User_6047 verify the Employer Name in Salaried below the Employment Details
Then User_6047 verify the Employer Name If (Others) in Salaried below the Employment Details
Then User_6047 verify the Employee Id in Salaried below the Employment Details
Then User_6047 verify the Date Of Joining in Salaried below the Employment Details
Then User_6047 verify the Employment End Date in Salaried below the Employment Details
Then User_6047 verify the Department in Salaried below the Employment Details
Then User_6047 verify the Designation in Salaried below the Employment Details
Then User_6047 verify the Employment Type in Salaried below the Employment Details
Then User_6047 verify the Direct Manager Contact Number Extension in Salaried below the Employment Details
Then User_6047 verify the Direct Manager Phone Number in Salaried below the Employment Details
Then User_6047 verify the Income Paymode in Salaried below the Employment Details
Then User_6047 verify Employer Phone Extension in Salaried below the Employment Details
Then User_6047 verify the Employer Phone Number in Salaried below the Employment Details
Then User_6047 verify the State in Salaried below the Employment Details
Then User_6047 verify the Pin code in Salaried below the Employment Details
Then User_6047 verify the Total Experience in Salaried below the Employment Details
Then User_6047 verify the Experience At Current Employment in Salaried below the Employment Details
Then User_6047 verify the Direct Manager in Salaried below the Employment Details
Then User_6047 verify the Employer City Code in Salaried below the Employment Details
Then User_6047 verify the Retirement Age in Salaried below the Employment Details
Then User_6047 verify the Remarks in Salaried below the Employment Details
Then logout from the ULS Application

@AT_EDC_08
Scenario: To verify the field present in Salaried under the Customer Financials tab

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_07
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And User_6047 click the Action button for the Salaried
Then User_6047 To check the Primary Employment field should be Toggle
Then User_6047 To check the Primary Employment field should be Non-Mandatory
Then User_6047 To check the Primary Employment field should be display only
Then User_6047 To check the Employment Period field should be Drop Down
Then User_6047 To check the Employment Period field should be Mandatory
Then User_6047 To check the Employment Period field should be display only
Then User_6047 To check the Nature of employment field should be Drop Down
Then User_6047 To check the Nature of employment field should be Mandatory
Then User_6047 To check the Nature of employment field should be display only
Then User_6047 To check the Employer Name field should be Drop Down
Then User_6047 To check the Employer Name field should be Non-Mandatory
Then User_6047 To check the Employer Name field should be display only
Then User_6047 To check the Employer Name if field should be textbox
Then User_6047 To check the Employer Name if field should be Mandatory
Then User_6047 To check the Employer Name if field should be display only
Then User_6047 To check the Employee ID field should be textbox
Then User_6047 To check the Employee ID field should be Mandatory
Then User_6047 To check the Employee ID field should be display only
Then User_6047 To check the Date of Joining field should be date
Then User_6047 To check the Date of Joining should be Mandatory
Then User_6047 To check the Date of Joining should be display only
Then User_6047 To check the Employment End date field should be date
Then User_6047 To check the Employment End date should be Non-Mandatory
Then User_6047 To check the Employment End date should be display only
Then User_6047 To check the Department field should be Drop Down
Then User_6047 To check the Department field should be Non-Mandatory
Then User_6047 To check the Department field should be display only
Then User_6047 To check the Designation field should be Drop Down
Then User_6047 To check the Designation field should be Non-Mandatory
Then User_6047 To check the Designation field should be display only
Then User_6047 To check the Employment Type field should be Drop Down
Then User_6047 To check the Employment Type field should be Mandatory
Then User_6047 To check the Employment Type field should be display only
Then User_6047 To check the Direct Manager Contact No field should be textbox
Then User_6047 To check the Direct Manager Contact No field should be Non-Mandatory
Then User_6047 To check the Direct Manager Contact No field should be display only
Then User_6047 To check the Direct Manager Phone No field should be textbox
Then User_6047 To check the Direct Manager Phone No field should be Non-Mandatory
Then User_6047 To check the Direct Manager Phone No field should be display only
Then User_6047 To check the Direct Manager field should be textbox
Then User_6047 To check the Direct Manager field should be Non-Mandatory
Then User_6047 To check the Direct Manager field should be display only
Then User_6047 To check the Employer Phone Number field should be textbox
Then User_6047 To check the Employer Phone Number field should be Non-Mandatory
Then User_6047 To check the Employer Phone Number field should be display only
Then User_6047 To check the Employer City Code field should be textbox
Then User_6047 To check the Employer City Code field should be Non-Mandatory
Then User_6047 To check the Employer City Code field should be display only
Then User_6047 To check the Employer Phone Extension field should be textbox
Then User_6047 To check the Employer Phone Extension field should be Non-Mandatory
Then User_6047 To check the Employer Phone Extension field should be display only
Then User_6047 To check the Total Experience field should be Field should be dropdown
Then User_6047 To check the Total Experience field should be Non-Mandatory
Then User_6047 To check the Total Experience field should be display only
Then User_6047 To check the Income Paymode field should be Field should be dropdown
Then User_6047 To check the Income Paymode field should be Non-Mandatory
Then User_6047 To check the Income Paymode field should be display only
Then User_6047 To check the Remarks field should be Field should be Text box,Non-Mandatory and display only
Then logout from the ULS Application

@AT_EDC_10
Scenario: to verify the field present under the employment detail (Self-employed)


Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_07
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
And user_6047 click the Action button for the Self-employed 
Then User_6047 To check the Primary Employment field should be Toggle,Non-Mandatory,display only
Then User_6047 To check the company type field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the profession type field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Nature of Employment field should be Drop Down,Mandatory,display only
Then User_6047 To check the Profession field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Statutory authority field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Employment end date field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Employer Phone extension field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the no of partners field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Nature of business field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Registered business name field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Registered business number field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Business registration date field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Office premises type field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Shareholder percentage field should be TextBox,Mandatory,display only
Then User_6047 To check the No of Employes field should be TextBox,Non-Mandatory,display only
Then User_6047 To check the Remarks field should be TextBox,Non-Mandatory,display only
Then logout from the ULS Application


@AT_EDC_13
Scenario: To verify the functionality of Search box with matching data in listview of employment detail

Given Navigate the IJARA URL
And User_6047 login with valid credentials-ijara-DataCheck-Employment detail
And User_6047 Get the test data for test case ID AT_EDC_07
#And And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 search the Ref id under inbox
And User_6047 click the Entitle button under inbox
And User_6047 click the Customer Financials tab
And User_6047 click On the Action button below Customer Employment List
Then User_6047 click the Search button under customer employment and check the matching data in listview
Then User_6047 check the result data
Then User_6047 click the back button
Then User_6047 click On the Action button below Customer Employment List
Then User_6047 click the Search button under customer employment and check the mismatch data in listview
Then User_6047 check the result 
Then logout from the ULS Application
