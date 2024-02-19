Feature: To test the drawdown details section in disbursment maker stage
@AT_AL_DSB_DD_01
Scenario: To verify drawdown sectionn should have facility detais and schedule details drawdown section and payment details section
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on drawdown details section in disbursement maker stage
And user_076 click on edit button in drawdown details at disbursement maker stage
Then user_076 verify facility details section should be visible in drawdown details at disbursement maker stage
Then user_076 verify schedule details section should be visible in drawdown details at disbursement maker stage
Then user_076 verify payment details section should be visible in drawdown details at disbursement maker stage
Then user_076 verify drawdown breakup section should be visible in drawdown details at disbursement maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in drawdown details at disbursment maker checker stage
@AT_AL_DSB_DD_02
Scenario: To verify in drawdown details section facility info section should have mentioned fields
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on drawdown details section in disbursement maker stage
And user_076 click on edit button in drawdown details at disbursement maker stage
Then user_076 verify facility details section should have product field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have sub product field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have scheme field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have sanction date field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have last disbursement date field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have is tranche allowed field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have loan no field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have sanction amount field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have disbursed amount field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have currenct disbursed amount field in drawdown details section at disbursement maker stage
Then user_076 verify facility details section should have available amount field in drawdown details section at disbursement maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in drawdown details at disbursment maker checker stage
@AT_AL_DSB_DD_03
Scenario: To verify schedule details should have mentioned list view fields that should be read only mode
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on drawdown details section in disbursement maker stage
And user_076 click on edit button in drawdown details at disbursement maker stage
And user_076 find the payment schedule details section at disbursment maker stage
Then user_076 verify payment for field should be visible in schedule section list view at disbursment maker stage
Then user_076 verify schedule amount field should be visible in schedule section list view at disbursment maker stage
Then user_076 verify planned date field should be visible in schedule section list view at disbursment maker stage
Then user_076 verify currency field should be visible in schedule section list view at disbursment maker stage
Then user_076 verify schedule notes field should be visible in schedule section list view at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in drawdown details at disbursment maker checker stage
@AT_AL_DSB_DD_04
Scenario: To verify payment details should have mentioned list view fields that should be read only mode
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on drawdown details section in disbursement maker stage
And user_076 click on edit button in drawdown details at disbursement maker stage
And user_076 find the payment details section index at disbursement maker stage
Then user_076 verify disbursement amount field should be visible in payment details list view at disbursement maker stage
Then user_076 verify currency field should be visible in payment details list view at disbursement maker stage
Then user_076 verify loan account field should be visible in payment details list view at disbursement maker stage
Then user_076 verify disbursement status field should be visible in payment details list view at disbursement maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in drawdown details at disbursment maker checker stage
@AT_AL_DSB_DD_05
Scenario: To verify schedule details should have mentioned list view fields that should be read only mode
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on drawdown details section in disbursement maker stage
And user_076 click on edit button in drawdown details at disbursement maker stage
And user_076 find the dradown breakup section at disbursment maker stage
Then user_076 verify edit field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify drawdown ID field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify beneficiary ID field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify beneficiary name field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify drawdown amount field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify currency field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify payment status field should be visible in drawdown breakup list view at disbursment maker stage
Then user_076 verify status field should be visible in drawdown breakup list view at disbursment maker stage  
Then logout from the ULS Application
And user_076 invoke soft assert in drawdown details at disbursment maker checker stage