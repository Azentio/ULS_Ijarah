Feature: to test the reference sceen at app data entry stage (Auto Loan product)
@AT_AL_APPDATAENTRY_REFDETAILS_01
Scenario: To test the employment screen field auto dynamic population
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on customer financial tab in app data entry of auto loan
And user_076 click on edit button in customer financial record of auto loan product
And user_076 click on add button in employment list which is in customer financials
Then user_076 verify employment screen should have the save and back button
Then user_076 verify employment screen should have all the fields at app data entry stage
And user_076 get the test data for AT_AL_APPDATAENTRY_REFDETAILS_01
And user_076 choose nature of employment as company firm in employment details screen
Then user_076 verify primary employment period should be enable at employment details screen
Then user_076 verify employment details field should be changed as per company firm
And user_076 choose nature of employment as Self_employed Professional in employment details screen
Then user_076 verify employment details field should be changed as per Self_employed Professional
And user_076 choose nature of employment as Salaried in employment details screen
Then user_076 verify employment details field should be changed as per Salaried
Then logout from the ULS Application
And user_076 invoke soft assert in employment details screen
@AT_AL_APPDATAENTRY_REFDETAILS_02
Scenario: To Test the employment details screen with salaried customer
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on customer financial tab in app data entry of auto loan
And user_076 click on edit button in customer financial record of auto loan product
And user_076 click on add button in employment list which is in customer financials
And user_076 get the test data for AT_AL_APPDATAENTRY_REFDETAILS_02
Then user_076 verify nature of employment feld should be mandatory dropdown
Then user_076 verify primary employment field should be non mandatory toggle button
Then user_076 verify employment period field should be mandatory dropdown
Then user_076 verify employer name field should be mandatory dropdown
Then user_076 verify employer name if others field should be non mandatory text box
Then user_076 verify employee ID field should be mandatory text box
Then user_076 verify Date of joining field should be mandatory date
Then user_076 verify empoyment end date field should be non mandatory date
Then user_076 verify department field should be non mandatory editable dropdown
Then user_076 verify designation field should be non mandatory dropdown
Then user_076 verify employment type field should be mandatory dropdown
Then user_076 verify direct manager contact extension field should be non mandatory textbox
Then user_076 verify direct manager contact no field should be non mandatory textbox
Then user_076 verify direct manager name field should be non mandatory textbox
Then user_076 verify employer city code field should be non mandatory textbox
Then user_076 verify employer phone extension field should be non mandatory textbox
Then user_076 verify employer phone number field should be non mandatory textbox
Then user_076 verify total experience years field should be non mandatory dropdown
Then user_076 verify remarks field should be non mandatory textbox
And user_076 click on save button in customer financials record at app data entry stage
Then user_076 verify customer financials record got saved at app data entry stage
Then logout from the ULS Application
And user_076 invoke soft assert in employment details screen
@AT_AL_APPDATAENTRY_REFDETAILS_02_02
Scenario: To make customer employment details record inactive
Given navigate the IJARA URL
And login with valid credentials for auto loan app data entry stage
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the app data entry record reference number of auto loan
And user_076 select the app data entry record of auto loan
And user_076 click on customer financial tab in app data entry of auto loan
And user_076 click on edit button in customer financial record of auto loan product
And user_076 get the customer employment list view at app data entry stage
And user_076 filter the active record in customer employment list view
And user_076 click on edit button in customer employment list view
And user_076 change the record status to inactive of customer employment list view
And user_076 click on save button in customer financials record at app data entry stage
Then user_076 verify customer financials record got saved at app data entry stage