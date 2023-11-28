Feature: New Appplication Identification Details

 @AT_TW_NEWAPP_IDA_07
Scenario: To test the export functionality in identification details list view (Murabha)
Given navigate the IJARA URL
And login with valid credentials2
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_604 get the test data for test case id AT_NewAPP_M_IDA_07
And user_604 search the record Tawarruq New Appplication Identification Details
And user_604 select the new application stage customer identification details record from mail box
And user_604 click on additional customer info tab in new application stage
And user_604 click on edit button customer personal information screen at new app stage
And user_604 get the location of identification details list view at new app stage
And user_604 click on export button in identification details list view at new app stage
And user_604 click on pdf export in indetification list view at new app stage
Then user_604 verify system should download the pdf file of identification details record in new app stage
And user_604 click on export button in identification details list view at new app stage
And user_604 click on xlsx export in indetification list view at new app stage
Then user_604 verify system should download the xlsx file of identification details record in new app stage
Then logout from the ijaraApplication
And user_604 invoke soft asset in customer identification details screen at new app stage