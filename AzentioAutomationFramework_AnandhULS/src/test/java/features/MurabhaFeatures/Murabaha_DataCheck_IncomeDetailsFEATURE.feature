Feature: To test the income details screen at app data check stage with murabaha product
@AT_MU_IDC_01
Scenario: To verify income details screen should show all the configured values and value should same as data entry value
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the income details screen location at app data check stage
And user_076 select the income details record at app data check stage
Then user_076 verify employment type field should be visible in income details screen at data check stage
Then user_076 verify lumpsum amount field should be visible in income details screen at data check stage
Then user_076 verify income field should be visible in income details screen at data check stage
Then user_076 verify income frequence field should be visible in income details screen at data check stage
Then user_076 verify income amount field should be visible in income details screen at data check stage
Then user_076 verify income defined percentage field should be visible in income details screen at data check stage
Then user_076 verify income adjusted percentage field should be visible in income details screen at data check stage
Then user_076 verify amount considred field should be visible in income details screen at data check stage
Then user_076 verify income action button should be visible in income details screen at data check stage
Then user_076 verify total income field should be visible in income details screen at data check stage
Then user_076 verify total income considered field should be visible in income details screen at data check stage
Then user_076 verify salary credited to bank field should be visible in income details screen at data check stage
Then user_076 verify deduction field should be visible in income details screen at data check stage
Then user_076 verify deduction amount field should be visible in income details screen at data check stage
Then user_076 verify dedcution def percentage field should be visible in income details screen at data check stage
Then user_076 verify deduction adjusted percentage field should be visible in income details screen at data check stage
Then user_076 verify deduction considered field should be visible in income details screen at data check stage
Then user_076 verify dedcution action button should be visible in income details screen at data check stage
Then user_076 verify total deduction considered field should be visible in income details screen at data check stage
Then user_076 verify currency field should be visible in income details screen at data check stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen
@AT_MU_IDC_02
Scenario: To test the export funtionality income details screen (Murabaha product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the income details screen location at app data check stage
And user_076 select the income details record at app data check stage
Then user_076 verify save button is visible in income details screen at app data check stage
And user_076 click on back button in income details screen at app data check stage
Then user_076 verify income details screen should get navigate to backward at app data check stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen
@PRE_REQ_01_AT_MU_IDC_03
Scenario: To return the murabaha app check stage record
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 get the test data for test case ID PRE_REQ_01_AT_MU_IDC_03
And user_076 click on return button in data check stage
And user_076 give the return stage option data entry stage at data check stage
And user_076 give record return remark at data check stage
And user_076 click on return button in popup window at data check stage
And user_076 get the popup text and extract store the data entry user id at app data check stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen
@PRE_REQ_02_AT_MU_IDC_03
Scenario: To store the income details record at app data entry stage
Given navigate the IJARA URL
And user_076 login with valid data entry user ID for murabaha product
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number in murabah data entry stage
And user_076 select the app data entry record reference number in murabah data entry stage
And user_076 get the test data for test case ID PRE_REQ_02_AT_MU_IDC_03
And user_076 select the Murabaha app data entry record reference number from mail box
And user_076 select the customer financials tab at app data entry stage
And user_076 select the customer personal information record at app data entry stage
And user_076 find the income details screen location at app data entry stage
And user_076 select the income details record at app data entry stage
And user_076 get the income screen amount value at app data entry stage
And user_076 get the income screen income defined percentage value at app data entry stage
And user_076 get the income screen income adjusted percentage value at app data entry stage
And user_076 get the income screen income amount considered value at app data entry stage
And user_076 get the income screen deduction amount value at app data entry stage
And user_076 get the income screen deduction defined percentage value at app data entry stage
And user_076 get the income screen deduction adjusted percentage value at app data entry stage
And user_076 get the income screen deduction amount considered value at app data entry stage
And user_076 click on application details in app data entry stage
And user_076 click on submit button in app data entry stage
And user_076 enter the alert remark in app data entry stage
And user_076 click on alert submit button in app dat entry stage
And user_076 get the app data check user id from the toast popup and extract the user id at app data entry stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen

@AT_MU_IDC_03
Scenario: To verify all the income details screen fields are read only and field data should be matched with data entry stage (Murabaha product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the income details screen location at app data check stage
And user_076 select the income details record at app data check stage
And user_076 get the test data for test case ID AT_MU_IDC_03
Then user_076 verify income details amount field data value should be matched with data entry value at data check stage
Then user_076 verify income details income defined percentage field data value should be matched with data entry value at data check stage
Then user_076 verify income details income adjusted percentage field data value should be matched with data entry value at data check stage
Then user_076 verify income details amount considered field data value should be matched with data entry value at data check stage
Then user_076 verify income details deduction amount field data value should be matched with data entry value at data check stage
Then user_076 verify income details deduction defined percentage field data value should be matched with data entry value at data check stage
Then user_076 verify income details deduction adjusted percentage field data value should be matched with data entry value at data check stage
Then user_076 verify income details deduction considered field data value should be matched with data entry value at data check stage
Then user_076 verify employment type field should be read only mode
Then user_076 verify income field should be read only mode
Then user_076 verify frequency field should be read only mode
Then user_076 verify amount field should be read only mode
Then user_076 verify defined percentage field should be read only mode
Then user_076 verify adjusted percentage field should be read only mode
Then user_076 verify amount considered field should be read only mode
Then user_076 verify total income field should be read only mode
Then user_076 verify total income considered field should be read only mode
Then user_076 verify salary credited to bank field should be read only mode
Then user_076 verify deduction field should be read only mode
Then user_076 verify deduction frequency field should be read only mode
Then user_076 verify deduction amount field should be read only mode
Then user_076 verify deduction def percentage field should be read only mode
Then user_076 verify deduction adjusted percentage field should be read only mode
Then user_076 verify deduction considered field should be read only mode
Then user_076 verify total deduction field should be read only mode
Then user_076 verify total deduction considered field should be read only mode
Then logout from the ULS Application
And invoke softAssert in income details app data screen

@AT_MU_IDC_04
Scenario: To verify income details list view search functionality in app data check stage (Murabaha product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the income details screen location at app data check stage
And user_076 get the test data for test case id AT_MU_IDC_04
And user_076 click on search button in income details list view search button in app data check stage
And user_076 search the valid search text in income details in app data check stage
Then user_076 verify system should show the search result for valid search text in income details app data check stage
And user_076 search the invalid search text in income details in app data check stage
Then user_076 verify system should not show the search result for invalid search text in income details app data check stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen
@AT_MU_IDC_05
Scenario: To test the export funtionality income details screen (Murabaha product)
Given navigate the IJARA URL
And login with valid app data check stage credentials for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search Murabaha app data check record reference number in mail box
And user_076 select the Murabaha app data check record reference number from mail box
And user_076 select the customer financials tab at app data check stage
And user_076 select the customer personal information record at app data check stage
And user_076 find the income details screen location at app data check stage
And user_076 click on export button in income details list view at app data check stage
And user_076 click on pdf export button in income details list view export option
Then user_076 verify income details list view file should be downloaded as pdf format at app data check stage
And user_076 click on export button in income details list view at app data check stage
And user_076 click on xlsx export button in income details list view export option
Then user_076 verify income details list view file should be downloaded as xlsx format at app data check stage
And user_076 select the income details record at app data check stage
And user_076 click on back button in income details screen at app data check stage
Then user_076 verify income details screen should get navigate to backward at app data check stage
Then logout from the ULS Application
And invoke softAssert in income details app data screen