Feature: To Test the document details screen at disbusrment maker and checker stage
@AT_AL_DC_01_MKR
Scenario: To verify document details screen fields should be read only mode and field values shoud be matched with data entry stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AL_DC_01_MKR
And user_076 click on document details section at disbursment maker stage
And user_076 click on list view view button in document details screen
Then user_076 verify document details screen fields should be read only mode at disbursment maker stage
Then user_076 verify document details field values should be matched with data entry value at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke softAssert in document details at disbursment maker checker stage
@AT_AL_DC_01_CHR
Scenario: To verify document details screen fields should be read only mode and field values shoud be matched with data entry stage
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AL_DC_01_CHR
And user_076 click on document details section at disbursment checker stage
And user_076 click on list view view button in document details screen
Then user_076 verify document details screen fields should be read only mode at disbursment checker stage
Then user_076 verify document details field values should be matched with data entry value at disbursment checker stage
Then logout from the ULS Application
And user_076 invoke softAssert in document details at disbursment maker checker stage