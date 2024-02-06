Feature: To tes the application details screen at disbursment maker stage
@AT_AD_AL_DMC_01
Scenario: To test the application details submit fucntionality at disbursment maker stage with auto loan product
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AD_AL_DMC_01
And user_076 verify application details fields sre should be read only mode at disbuursment maker stage
And user_076 verify application details field data should be matched with data entry stage value at disbuursment maker stage
And user_076 click on approve button in application details screen at disbursment maker stage
And user_076 enter the approval remark in application details screen at disbursment maker stage
And user_076 click on alert approve button in application details screen at disbursment maker stage
Then user_076 verify disbursment maker record should get moved to disbursment check stage
And user_076 retive the disbursment checker user ID and store it in excel database
Then logout from the ULS Application
And user_076 invoke soft assert in application details screen at disbursment maker stage
@AT_AD_AL_DMC_01_01
Scenario: To test the application details submit fucntionality at disbursment maker stage with auto loan product
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AD_AL_DMC_01_01
And user_076 verify application details fields sre should be read only mode at disbuursment maker stage
And user_076 verify application details field data should be matched with data entry stage value at disbuursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in application details screen at disbursment maker stage

@AT_AD_AL_DMC_02
Scenario: To verify beneficiary details field should be read only mode at field data should be matched with disbursment maker stage 
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AD_AL_DMC_02
And user_076 click on reject button in disbursment maker stage
And user_076 enter the alert remark for rejecting the record at disbursment maker stage
And user_076 click on alert reject button in disbursment checker stage
Then user_076 verify record should get rejected in the system at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in application details screen at disbursment maker stage

@AT_AD_AL_DMC_03
Scenario: To verify beneficiary details field should be read only mode at field data should be matched with disbursment maker stage 
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AD_AL_DMC_03
And user_076 click on return button in application details at disbursment checker stage
And user_076 give the return stage to disbursment maker stage at disbursment checker stage
And user_076 give the return remark at disbursment checker stage
And user_076 click on alert return button in disbursment checker stage
Then user_076 verify alert should show the stages and disbursment maker user ID at disbursment checker stage
Then logout from the ULS Application
And user_076 invoke soft assert in application details screen at disbursment maker stage


#@AT_AL_BD_DMC_06_02
#Scenario: To get the app data entry record values to check the records under disbursment checker stage
#Given navigate to ULS URL
#And use_076 login with valid app data entry user ID in auto loan product for pre requisites of disbursment checker maker
#And click on search box upon click on the mail box
#And click on search text box upon click the search button
#And user_076 search the auto loan disbursment maker record reference number at mail box
#And user_076 select the auto loan disbursment maker record in mail box
#And user_076 get the loan requested amount in app data entry stage
#And user_076 click on offering tab at app data entry stage
#And user_076 get the total amount financed amount value under offering tab
#And user_076 get the loan tenure value under offering tab
#And user_076 click on application details tab
