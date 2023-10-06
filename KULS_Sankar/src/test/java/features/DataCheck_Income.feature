Feature: To check the App Data Check - Income feature

# AT_INCD_01-- Income -- Self Employed
# IDC_01_01, IDC_01_02
@AT_INCD_01
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Eye button under Income section in Customer Financials Tab
And User_608 validate Save button available under Income details screen
And User_608 validate Back button available under Income details screen
And User_608 validate Employment Type field available under Income details screen
And User_608 validate Lumpsum Amount field available under Income details screen
And User_608 validate Financial Year field available under Income details screen
And User_608 validate Filing Date field available under Income details screen
And User_608 validate Income field available under Income details screen
And User_608 validate Frequency field available under Income details screen
And User_608 validate Amount field available under Income details screen
And User_608 validate Defined % field available under Income details screen
And User_608 validate Adjusted % field available under Income details screen
And User_608 validate Amount Considered field available under Income details screen
And User_608 validate Action button available under Income details screen
And User_608 validate Total Income field available under Income details screen
And User_608 validate Total Income considered field available under Income details screen
And User_608 validate Salary credited to Bank field available under Income details screen
And User_608 validate Deduction field available under Income details screen
And User_608 validate Deduction Frequency field available under Income details screen
And User_608 validate Deduction Amount field available under Income details screen
And User_608 validate Deduction Def % field available under Income details screen
And User_608 validate Deduction Adj % field available under Income details screen
And User_608 validate Deduction Considered field available under Income details screen
And User_608 validate Deduction Action button field available under Income details screen
And User_608 validate Total Deduction field available under Income details screen
And User_608 validate Total Deduction Considered field available under Income details screen
And User_608 validate Currency field available under Income details screen
Then logout from the ijaraApplication


# IDC_01_03, IDC_01_04
@AT_INCD_02
Scenario: To verify the functionality of Save button and Back button

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Eye button under Income section in Customer Financials Tab
And User_608 click the Save button under Income details screen
And User_608 validate the confirmation message under Income details screen
And User_608 click the Eye button under Income section in Customer Financials Tab
And User_608 click the Back button under Income details screen
Then logout from the ijaraApplication


# IDC_01_05 <--> IDC_01_25
@AT_INCD_03
Scenario: To verify the fields available under income details section. 

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 click the Eye button under Income section in Customer Financials Tab
And User_608 validate Employment Type field available under Income details screen
And User_608 validate Lumpsum Amount field available under Income details screen
And User_608 validate Financial Year field available under Income details screen
And User_608 validate Filing Date field available under Income details screen
And User_608 validate Income field available under Income details screen
And User_608 validate Frequency field available under Income details screen
And User_608 validate Amount field available under Income details screen
And User_608 validate Defined % field available under Income details screen
And User_608 validate Adjusted % field available under Income details screen
And User_608 validate Amount Considered field available under Income details screen
And User_608 validate Total Income field available under Income details screen
And User_608 validate Total Income considered field available under Income details screen
And User_608 validate Salary credited to Bank field available under Income details screen
And User_608 validate Deduction field available under Income details screen
And User_608 validate Deduction Frequency field available under Income details screen
And User_608 validate Deduction Amount field available under Income details screen
And User_608 validate Deduction Def % field available under Income details screen
And User_608 validate Deduction Adj % field available under Income details screen
And User_608 validate Deduction Considered field available under Income details screen
And User_608 validate Total Deduction field available under Income details screen
And User_608 validate Total Deduction Considered field available under Income details screen
Then logout from the ijaraApplication


# IDC_01_26, IDC_01_27
@AT_INCD_04
Scenario: To verify Empoyment details and Income details tab is mandatory for eligibility

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify Employment details section available under Customer Financials tab
And User_608 click the eye button under Employment details section available in Customer Financials tab
And User_608 verify the Customer Employement page is available under Customer Financials tab
And User_608 click the Back button in Customer Employement screen under Customer Financials tab
And User_608 verfiy Income section available under Customer Financials tab
And User_608 click the Eye button under Income section in Customer Financials Tab
Then logout from the ijaraApplication


# IDC_01_28, IDC_01_29
@AT_INCD_05
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify Self Employed customer available under Income section in Customer Financials Tab
And User_608 verify Self Employed income field is available under Income section in Customer Financials Tab
Then logout from the ijaraApplication

# IDC_01_30
@AT_INCD_06
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_INCD_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 click the Customer Financials tab
And User_608 click the Eye button under Customer Financials tab
And User_608 verify the Salaried customer available under Income section in Customer Financials Tab
Then logout from the ijaraApplication


