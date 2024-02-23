Feature: To Test the margin money section in disbursment maker stage
@AT_AL_DSB_MM_01
Scenario: To verify margin money add screen  should have valid fields
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on margin money section at disbursement maker stage
And user_076 click on add button in margin money at disbursement maker stage
Then user_076 verify margin money screen should have save button
Then user_076 verify margin money screen should have back button
Then user_076 verify margin money screen should have own contribution field
Then user_076 verify margin money screen should have amount field
Then user_076 verify margin money screen should have own contribution amount paid field
Then logout from the ULS Application
Then user_076 invoke soft assert in margin money section
@AT_AL_DSB_MM_02
Scenario: To verify user can able to create and save the margin money record with valid input at disbursment maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on margin money section at disbursement maker stage
And user_076 click on add button in margin money at disbursement maker stage
And user_076 get the test data for test case ID AT_AL_DSB_MM_02
And user_076 verify own contribution amount field should be non mandatory text box in margin money screen
And user_076 verify amount field should be non mandatory text box in margin money screen in margin money screen
And user_076 verify own contribution amount paid field should be non mandatory dropdown in margin money screen
And user_076 click on save button in margin money screen
Then user_076 verify margin money screen should show the save successful popup while save the record
Then logout from the ULS Application
Then user_076 invoke soft assert in margin money section
@AT_AL_DSB_MM_03
Scenario: To verify user can able to create and save the margin money record with valid input at disbursment maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on margin money section at disbursement maker stage
And user_076 click on add button in margin money at disbursement maker stage
And user_076 get the test data for test case ID AT_AL_DSB_MM_03
And user_076 enter character input in own contribution amount field in margin money screen
Then user_076 verify own contribution amount should not accept character input in margin money screen
And user_076 enter special character input in own contribution amount field in margin money screen
Then user_076 verify own contribution amount should not accept special character input in margin money screen
And user_076 enter character input in amount field in margin money screen
Then user_076 verify amount should not accept character input in margin money screen
And user_076 enter special character input in amount field in margin money screen
Then user_076 verify amount should not accept special character input in margin money screen
Then logout from the ULS Application
Then user_076 invoke soft assert in margin money section