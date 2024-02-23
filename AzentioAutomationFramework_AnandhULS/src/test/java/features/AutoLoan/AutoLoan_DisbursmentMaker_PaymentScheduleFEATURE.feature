Feature: To test the payment schedule section in disbursement maker stage
@AT_AL_PS_DSP_01
Scenario: To verify payment schedule field should have mentioned sections and mentioned fields
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 click on payment schedule in disbursement maker stage
And user_076 click on edit button in payment schedule at disbursement maker stage
Then user_076 payment schedule section should have facility details at disbursement maker stage
Then user_076 payment schedule section should have payment details section at disbursement maker stage
Then user_076 payment schedule section should have back button at disbursement maker stage
Then user_076 verify product field should be visible in facility details section at disbursement maker stage
Then user_076 verify sub product field should be visible in facility details section at disbursement maker stage
Then user_076 verify scheme field should be visible in facility details section at disbursement maker stage
Then user_076 verify sanction date field should be visible in facility details section at disbursement maker stage
Then user_076 verify last disbursement date field should be visible in facility details section at disbursement maker stage
Then user_076 verify is tranche allowed field should be visible in facility details section at disbursement maker stage
Then user_076 verify is loan no field should be visible in facility details section at disbursement maker stage
Then user_076 verify is sanction amount field should be visible in facility details section at disbursement maker stage
Then user_076 verify is disbursed amount field should be visible in facility details section at disbursement maker stage
Then user_076 verify is available amount field should be visible in facility details section at disbursement maker stage
Then logout from the ULS Application
And user_076 invoke soft assert in payment schedule at disbursement stage
@AT_AL_PS_DSP_02
Scenario: To verify user can able to add record in payment details section and verify the field in payment details
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AL_PS_DSP_02
And user_076 click on payment schedule in disbursement maker stage
And user_076 click on edit button in payment schedule at disbursement maker stage
And user_076 click on add button in payment details at disbursement maker stage
Then user_076 verify payment type field should be mandatory editable dropdown
Then user_076 verify payee field should be mandatory editable dropdown
Then user_076 verify planned date field should be non mandatory editable date field
Then user_076 verify planned scheduled amount field should be non mandatory editable input field
Then user_076 verify currency field should be mandatory editable input field
Then user_076 verify scheduled notes field should be non mandatory editable textbox
And user_076 click on save button in payment details screen
Then logout from the ULS Application
And user_076 invoke soft assert in payment schedule at disbursement stage
@AT_AL_PS_DSP_03
Scenario: To verify user can able to add record in payment details section and verify the field in payment details
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_076 get the test data for test case ID AT_AL_PS_DSP_02
And user_076 click on payment schedule in disbursement maker stage
And user_076 click on edit button in payment schedule at disbursement maker stage
Then user_076 verify payment details screen list view should have configured fields
Then user_076 verify scheduled amount field value should be matched with our saved record value in payment details screen
Then user_076 verify currency field value should be matched with our saved record value in payment details screen
Then user_076 verify scheduled notes field value should be matched with our saved record value in payment details screen
Then logout from the ULS Application
And user_076 invoke soft assert in payment schedule at disbursement stage
