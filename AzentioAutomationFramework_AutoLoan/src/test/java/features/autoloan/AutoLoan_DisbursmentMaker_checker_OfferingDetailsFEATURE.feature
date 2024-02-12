Feature: To test the offering details section in disbursment maker and checker stage 
@AT_OFD_AL_DMC_01_MKR
Scenario: To verify offering details section fields should be readonly mode and fiedl data should be matched with data entry stage record
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_OFD_AL_DMC_01_MKR
And user_076 click on offering details section in disbursment maker stage
Then user_076 clasification field should be readonly mode in offering screen at disbursment maker stage
Then user_076 product field should be readonly mode in offering screen at disbursment maker stage
Then user_076 scheme ID field should be readonly mode in offering screen at disbursment maker stage
Then user_076 Total amount financed field should be readonly mode in offering screen at disbursment maker stage
Then user_076 Loan tenure field should be readonly mode in offering screen at disbursment maker stage
Then user_076 currrency ID field should be readonly mode in offering screen at disbursment maker stage
Then user_076 eligibility income field should be readonly mode in offering screen at disbursment maker stage
Then user_076 insurance amount field should be readonly mode in offering screen at disbursment maker stage
Then user_076 pre retirement EMI field should be readonly mode in offering screen at disbursment maker stage
Then user_076 post retirement EMI field should be readonly mode in offering screen at disbursment maker stage
Then user_076 previous EMI field should be readonly mode in offering screen at disbursment maker stage
Then user_076 previous outstanding field should be readonly mode in offering screen at disbursment maker stage
Then user_076 previous net realizable value field should be readonly mode in offering screen at disbursment maker stage
Then user_076 pre retirement tenure field should be readonly mode in offering screen at disbursment maker stage
Then user_076 total offer amount field should be readonly mode in offering screen at disbursment maker stage
Then user_076 average account balance field should be readonly mode in offering screen at disbursment maker stage
Then user_076 applicable LTV one field should be readonly mode in offering screen at disbursment maker stage
Then user_076 applicable LTV two field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details loan tenure field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details number of installment field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details repay frequency field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details internal rate of return field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details total loan amount financed field should be readonly mode in offering screen at disbursment maker stage
Then user_076 finance details average account balance field should be readonly mode in offering screen at disbursment maker stage
Then user_076 verify offering field values should be matched with app data entry stage value at disbursment maker stage
Then logout from the ULS Application
Then user_076 invoke soft assert in disbursemen maker checker offering screen
@AT_OFD_AL_DMC_01_CHR
Scenario: To verify offering details section fields should be readonly mode and fiedl data should be matched with data entry stage record
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_OFD_AL_DMC_01_CHR
And user_076 click on offering details section in disbursment checker stage
Then user_076 clasification field should be readonly mode in offering screen at disbursment checker stage
Then user_076 product field should be readonly mode in offering screen at disbursment checker stage
Then user_076 scheme ID field should be readonly mode in offering screen at disbursment checker stage
Then user_076 Total amount financed field should be readonly mode in offering screen at disbursment checker stage
Then user_076 Loan tenure field should be readonly mode in offering screen at disbursment checker stage
Then user_076 currrency ID field should be readonly mode in offering screen at disbursment checker stage
Then user_076 eligibility income field should be readonly mode in offering screen at disbursment checker stage
Then user_076 insurance amount field should be readonly mode in offering screen at disbursment checker stage
Then user_076 pre retirement EMI field should be readonly mode in offering screen at disbursment checker stage
Then user_076 post retirement EMI field should be readonly mode in offering screen at disbursment checker stage
Then user_076 previous EMI field should be readonly mode in offering screen at disbursment checker stage
Then user_076 previous outstanding field should be readonly mode in offering screen at disbursment checker stage
Then user_076 previous net realizable value field should be readonly mode in offering screen at disbursment checker stage
Then user_076 pre retirement tenure field should be readonly mode in offering screen at disbursment checker stage
Then user_076 total offer amount field should be readonly mode in offering screen at disbursment checker stage
Then user_076 average account balance field should be readonly mode in offering screen at disbursment checker stage
Then user_076 applicable LTV one field should be readonly mode in offering screen at disbursment checker stage
Then user_076 applicable LTV two field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details loan tenure field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details number of installment field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details repay frequency field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details internal rate of return field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details total loan amount financed field should be readonly mode in offering screen at disbursment checker stage
Then user_076 finance details average account balance field should be readonly mode in offering screen at disbursment checker stage
Then user_076 verify offering field values should be matched with app data entry stage value at disbursment checker stage
Then logout from the ULS Application
Then user_076 invoke soft assert in disbursemen maker checker offering screen