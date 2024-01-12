Feature: To test the facility info screen at app data check stage with Ijarah product
@AT_FAC_DET_08
Scenario: To verify facility info list view search functionlaity work as expected
Given navigate the IJARA URL
And user_076 login with valid app data entry user credentials for ijarah product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 get the test data for test case ID AT_FAC_DET_08
And user_076 search the ijarah app data entry record in mail box
And user_076 select the ijarah app data entry record
And user_076 click on facility info tab at app data entry stage
And user_076 click on search button in facility info app data entry stage
And user_076 search the valid search test in facility info app data entry stage
Then user_076 verify facility info list view grid should show the valid matches at app data entry stage
And user_076 search the in valid search test in facility info app data entry stage
Then user_076 verify facility info list view grid should not show the record at app data entry stage
Then logout from the ULS Application
And invoke softAssert at facility info app data entry stage
@AT_FAC_DET_09
Scenario: To verify facility info list view search functionlaity work as expected
Given navigate the IJARA URL
And user_076 login with valid app data entry user credentials for ijarah product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the ijarah app data entry record in mail box
And user_076 select the ijarah app data entry record
And user_076 click on facility info tab at app data entry stage
And user_076 click on export button in facility info screen at app data entry stage
And user_076 choose pdf option in facility info at app data entry
Then user_076 verify facility info list view record should downloaded in pdf format
And user_076 click on export button in facility info screen at app data entry stage
And user_076 choose xlsx option in facility info at app data entry
Then user_076 verify facility info list view record should downloaded in xlsx format
Then logout from the ULS Application
And invoke softAssert at facility info app data entry stage