Feature: To check the App Data Check - Income feature


@AT_INCD_01
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_01
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab
And User click the Eye button under Income section in Customer Financials Tab
And User validate Save button available under Income details screen
And User validate Back button available under Income details screen
And User validate Employment Type field available under Income details screen
And User validate Lumpsum Amount field available under Income details screen
And User validate Financial Year field available under Income details screen
And User validate Filing Date field available under Income details screen
And User validate Income field available under Income details screen
And User validate Frequency field available under Income details screen
And User validate Amount field available under Income details screen
And User validate Defined % field available under Income details screen
And User validate Adjusted % field available under Income details screen
And User validate Amount Considered field available under Income details screen
And User validate Action button available under Income details screen
And User validate Total Income field available under Income details screen
And User validate Total Income considered field available under Income details screen
And User validate Salary credited to Bank field available under Income details screen
And User validate Deduction field available under Income details screen
And User validate Deduction Frequency field available under Income details screen
And User validate Deduction Amount field available under Income details screen
And User validate Deduction Def % field available under Income details screen
And User validate Deduction Adj % field available under Income details screen
And User validate Deduction Considered field available under Income details screen
And User validate Deduction Action button field available under Income details screen
And User validate Total Deduction field available under Income details screen
And User validate Total Deduction Considered field available under Income details screen
And User validate Currency field available under Income details screen
Then logout from the ijaraApplication


@AT_INCD_02
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_02
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab
And User click the Eye button under Income section in Customer Financials Tab
And User click the Save button under Income details screen
And User validate the confirmation message under Income details screen
And User click the Back button under Income details screen
Then logout from the ijaraApplication


@AT_INCD_03
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_03
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab
And User click the Eye button under Income section in Customer Financials Tab
And User validate Employment Type field available under Income details screen
And User validate Lumpsum Amount field available under Income details screen
And User validate Financial Year field available under Income details screen
And User validate Filing Date field available under Income details screen
And User validate Income field available under Income details screen
And User validate Frequency field available under Income details screen
And User validate Amount field available under Income details screen
And User validate Defined % field available under Income details screen
And User validate Adjusted % field available under Income details screen
And User validate Amount Considered field available under Income details screen
And User validate Total Income field available under Income details screen
And User validate Total Income considered field available under Income details screen
And User validate Salary credited to Bank field available under Income details screen
And User validate Deduction field available under Income details screen
And User validate Deduction Frequency field available under Income details screen
And User validate Deduction Amount field available under Income details screen
And User validate Deduction Def % field available under Income details screen
And User validate Deduction Adj % field available under Income details screen
And User validate Deduction Considered field available under Income details screen
And User validate Total Deduction field available under Income details screen
And User validate Total Deduction Considered field available under Income details screen

Then logout from the ijaraApplication

@AT_INCD_04
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_04
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab
And User verify Employment details section available under Customer Financials tab
And User click the eye button under Employment details section available in Customer Financials tab
And User verify the Customer Employement page is available under Customer Financials tab
And User click the Back button in Customer Employement screen under Customer Financials tab
And User verfiy Income section available under Customer Financials tab
And User click the Eye button under Income section in Customer Financials Tab

Then logout from the ijaraApplication


@AT_INCD_05
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_05
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab
And User verify Self Employed customer available under Income section in Customer Financials Tab
And User verify Self Employed income field is available under Income section in Customer Financials Tab
Then logout from the ijaraApplication


@AT_INCD_06
Scenario: Income Summary Detail records for display only at Data Check stage.

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INCD_06
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click the Customer Financials tab
And User click the Eye button under Customer Financials tab

And User verify the Salaried customer available under Income section in Customer Financials Tab

Then logout from the ijaraApplication


