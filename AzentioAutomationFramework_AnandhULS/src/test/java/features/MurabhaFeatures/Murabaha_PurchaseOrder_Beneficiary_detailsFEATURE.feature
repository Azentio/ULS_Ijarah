Feature: To Test the beneficiary details screen at purchase order stage

@AT_M_PUR_08
Scenario: To verify user can able to create beneficiary details record with valida input at offering stage
Given navigate the IJARA URL
And user_076 login with valid credentials at purchase order stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for murabaha
And user_076 select the purchase order record at mail box for murabaha product
And user_076 click in beneficiary tab at purchase order stage for murabaha
And user_076 get the test data for test case ID AT_M_PUR_08
And user_076 click on add button in beneficiary tab
And user_076 can able to select the data in facility id dropdown
And user_076 verify beneficiary name field should be mandatory editable text box
And user_076 verify beneficiary type field should be editable dropdown
And user_076 verify beneficiary KYC field should be editable
And user_076 verify beneficiary address is editable text box
And user_076 verify account type field should be editable mandatory text box
And user_076 verify IBAN field should be editable mandatory text box
And user_076 verify MICR type is editable dropdown
And user_076 verify beneficiary MIICR code is editable dropdown
And user_076 verify bank field should be mandatory editable lookup value
And user_076 verify branch name field should be mandatory editable lookup value
And user_076 verify beneficiary repayment type is editable dropdown
And user_076 verify beneficiary repayment mode is editable dropdown
And user_076 click on save button in purchase maker screen
Then user_076 verify purchase maker screen should show the save validation while saving the record
Then logout from the ULS Application
And user_076 invoke soft assert in murabaha purchase order screen

@AT_M_PUR_09
Scenario: To test the search functionality of beneficiary detaisl in purchase order
Given navigate the IJARA URL
And user_076 login with valid credentials at purchase order stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for murabaha
And user_076 select the purchase order record at mail box for murabaha product
And user_076 click in beneficiary tab at purchase order stage for murabaha
And user_076 get the test data for test case ID AT_M_PUR_09
And user_076 click on search button in beneficiary details at purchase order stage
And user_076 search the valid search text in beneficiary details search option at purchase order stage
Then user_076 verify beneficiary details search grid should show the matched result at purchase order stage
And user_076 search the invalid search text in beneficiary details search option at purchase order stage
Then user_076 verify beneficiary details search grid should not show the result at purchase order stage
Then logout from the ULS Application
And user_076 invoke soft assert in murabaha purchase order screen

@AT_M_PUR_11
Scenario: To verify purchase order stage tabs are readonly mode (Asset Details,Configuration,Predisbursment fee ( Fee details),Downpayment summary,Insurance Info,Document Details,Application Details)
Given navigate the IJARA URL
And user_076 login with valid credentials at purchase order stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for murabaha
And user_076 select the purchase order record at mail box for murabaha product
And user_076 click on asset details tab in purchase order stage
Then user_076 verify asset details record should be readonly and data should match with app data entry stage record
And user_076 click on configuration tab in purchase order stage
Then user_076 verify configuration record should be readonly and data should match with app data entry stage record
And user_076 click on fees details tab in purchase order stage
Then user_076 verify fees details record should be readonly and data should match with app data entry stage record
And user_076 click on downpayment summary tab in purchase order stage
Then user_076 verify downpayment summary record should be readonly and data should match with app data entry stage record
And user_076 click on insurance info in purchase order stage
Then user_076 verify insurance info record should be readonly and data should match with app data entry stage record
And user_076 click on document details in purchase order stage
Then user_076 verify document details record should be readonly and data should match with app data entry stage record
And user_076 click on application details tab in purchase order stage
Then user_076 verify application details record should be readonly and data should match with app data entry stage record
Then logout from the ULS Application
And user_076 invoke soft assert in murabaha purchase order screen

@AT_M_PUR_12
Scenario: To verify user can able to submit the purchase order stage record for murabaha product
Given navigate the IJARA URL
And user_076 login with valid credentials at purchase order stage for approve record
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for approve test
And user_076 select the purchase order record at mail box for aprove test murabaha product
And user_076 click on application details in purchase order stage
And user_076 click on submit button at purchase order stage for murabaha
And user_076 give alert remark and click the alert submit button in purchase order record at murabaha product
Then user_076 verify purchase order record should get approved from purchase order stage and store the user ID
Then logout from the ULS Application
@AT_M_PUR_12_01
Scenario: To verify user can able to return the purchase maker record to offering for murabaha product
Given navigate the IJARA URL
And user_076 get the test data for test case ID AT_M_PUR_12_01
And user_076 login with valid credentials at purchase order checker to return the purchase maker stage for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for approve test
And user_076 select the purchase order record at mail box for aprove test murabaha product
And user_076 click on application details in purchase order stage
And user_076 click on return button at purchase order stage for murabaha
And user_076 choose the previous stage at purchase order checker stage for murabaha
And user_076 enter the return remark in purchase order checker stage for murabaha
And user_076 enter the alert return button in purchase order checker stage for murabaha
Then user_076 verify murabaha record should get return to purchase order maker stage
Then logout from the ULS Application

@AT_M_PUR_13
Scenario: To verify user can able to  return the purchase checker record to maker stage for murabaha product
Given navigate the IJARA URL
And user_076 get the test data for test case ID AT_M_PUR_13
And user_076 login with valid credentials at purchase order stage for approve record
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for approve test
And user_076 select the purchase order record at mail box for aprove test murabaha product
And user_076 click on application details in purchase order stage
And user_076 click on return button at purchase order stage for murabaha
And user_076 choose the previous stage at purchase order maker stage for murabaha
And user_076 enter the return remark in purchase order maker stage for murabaha
And user_076 enter the alert return button in purchase order maker stage for murabaha
Then user_076 verify murabaha record should get return to purchase order maker stage
Then logout from the ULS Application
@AT_M_PUR_13_01
Scenario: To verify user can able to  return the purchase checker record to maker stage for murabaha product
Given navigate the IJARA URL
And user_076 get the test data for test case ID AT_M_PUR_13
And user_076 login with valid credentials at offering to submit the purchase maker stage for murabaha
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for approve test
And user_076 select the purchase order record at mail box for aprove test murabaha product
And user_076 click on application details in offering stage
And user_076 click on Approve button at offering stage for murabaha
And user_076 give alert remark and click the alert submit button in offering stage record at murabaha product
Then user_076 verify murabaha offering stage record got submitted to purchase order maker stage
Then logout from the ULS Application


@AT_M_PUR_14
Scenario: To verify the view summary button in purchase order stage
Given navigate the IJARA URL
And user_076 login with valid credentials at purchase order stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search purchase order record reference number in mail box for murabaha
And user_076 select the purchase order record at mail box for murabaha product
And user_076 click on application details in purchase order stage
And user_076 click on view summary button in purchase order stage
Then user_076 verify view summary tab should get open at purchase order stage
Then logout from the ULS Application
And user_076 invoke soft assert in murabaha purchase order screen