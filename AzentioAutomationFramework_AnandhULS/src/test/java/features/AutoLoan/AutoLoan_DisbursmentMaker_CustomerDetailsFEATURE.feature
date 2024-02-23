Feature: To test the customer details sections in disbursment maker stage
@AT_ADC_AL_DMC_01_MKR
Scenario: To verify customer details field should be read only mode and field data should be matched with data entry stage at disbursmet maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_ADC_AL_DMC_01_MKR
And user_076 click on customer details tab in disbursment maker stage
And user_076 click on view button of customer details record in disbursment maker stage
Then user_076 verify all the customer details fields are should be read only mode at disbursment maker stage
Then user_076 verify customer details field value should be matched with data entry stage at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in customer details screen at disbursment maker checker stage
@AT_ADC_AL_DMC_01_CHR
Scenario: To verify customer details field should be read only mode and field data should be matched with data entry stage at disbursmet checker stage
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_ADC_AL_DMC_01_CHR
And user_076 click on customer details tab in disbursment checker stage
And user_076 click on view button of customer details record in disbursment checker stage
Then user_076 verify all the customer details fields are should be read only mode at disbursment checker stage
Then user_076 verify customer details field value should be matched with data entry stage at disbursment checker stage
Then logout from the ULS Application
And user_076 invoke soft assert in customer details screen at disbursment maker checker stage