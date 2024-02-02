Feature: To test the facility details section at disbursment checker stage
@AT_FD_AL_DMC_01
Scenario: To verify facility section should be read only mode at disbursment checker stage
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_FD_AL_DMC_01
And user_076 click on facility details tab at disbursment checker stage
And user_076 click on view button in facility details at disbursment checker stage
Then user_076 verify all the facility details fields are in read only mode at disbursment checker stage
Then user_076 verify facility details field values should matched with app data entry value at disbursment checker stage
Then logout from the ULS Application
And user_076 invoke soft assert in facility details section at disbursment maker stage 