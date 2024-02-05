Feature: To Test the beneficiary details screen at disbursment maker stage (Auto loan product)
@AT_AL_BD_DMC_01_02
Scenario: To verify the beneficiary detal screen should have configured fields and check user can able to save the record with valid input
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_76 click on beneficiary details tab at disbursment maker stage
And user_76 click on add button in beneficiary details disbursment maker stage
And user_076 get the test data for test case ID AT_AL_BD_DMC_01_02
And user_076 save button and back button isvisible in beneficiary details at disbursment maker stage
Then user_076 verify facility application ID field should be visible non mandatory dropdown at disbursment maker stage
Then user_076 verify beneficiary name field should be visible mandatory editable text box at disbursment maker stage
Then user_076 verify beneficiary type field should be visible mandatory editable dropdown at disbursment maker stage
Then user_076 verify beneficiary KYC field should be visible non mandatory editable text box at disbursment maker stage
Then user_076 verify beneficiary address field should be visible non mandatory text box at disbursment maker stage
Then user_076 verify account type field should be visible mandatory dropdown at disbursment maker stage
Then user_076 verify IBAN account no field should be visible mandatory text box at disbursment maker stage
Then user_076 verify MICR type field should be visible non mandatory dropdown at disbursment maker stage
Then user_076 verify beneficiary MICR code should be visible mandatory dropdown at disbursment maker stage
Then user_076 verify bank code field shuould be visible mandatory dropdown at disbursment maker stage
Then user_076 verify branch name field should be visble mandatory dropdown at disbursment maker stage
Then user_076 verify IFSC Code field should be visible and non mandatory text box at disbursment maker stage
Then user_076 verify payment type field should be visible mandatory dropdown at disbursment maker stage
Then user_076 verify payment mode field should be visible mandatory dropdown at disbursment maker stage
Then user_076 verify beneficiary email ID field should be visible non mandatory textbox at disbursment maker stage
Then user_076 verify remarks field should be visible non mandatory textbox at disbursment maker stage
And user_076 click on save button in beneficiary details at disbursment maker stage
Then user_076 verify record successfully saved alert message at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert at disbursment maker stage
@AT_AL_BD_DMC_03
Scenario: To test the beneficiary details scree with negative input at disbursment maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_76 click on beneficiary details tab at disbursment maker stage
And user_76 click on add button in beneficiary details disbursment maker stage
And user_076 get the test data for test case ID AT_AL_BD_DMC_03
And user_076 click on save button without entering the mandatory details in beneficiary details screen at disbursment maker stage
Then user_076 verify system should show the mandatory blank field validation in beneficiary details screen at app disbursment maker stage
And user_076 enter special character input in beneficiary name input field at disbursment maker stage
Then user_076 verify beneficiary name field should show the validation for special character input to beneficiary name field at disbursment maker
And user_076 enter special numeric input in beneficiary name input field at disbursment maker stage
Then user_076 verify beneficiary name field should show the validation for numeric input to beneficiary name field at disbursment maker
And user_076 enter character input in bank account number field in beneficiary details screen at disbursment maker stage
Then user_076 verify bank account number field should not accept the character input in beeficiary details at disbursment maker stage
And user_076 click on back button in beneficiary details screen at disbursment maker stage
Then user_076 verify system should get move backward in beneficiary details screen at disursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert at disbursment maker stage
@AT_AL_BD_DMC_04
Scenario: To test the beneficiary details scree with negative input at disbursment maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_76 click on beneficiary details tab at disbursment maker stage
And user_076 get the test data for test case ID AT_AL_BD_DMC_04
And user_076 click on search button in beneficiary details list view at disbursment maker stage
And user_076 search with valid search text in beneficiary details screen at disbursment maker stage
Then user_076 verify system should show the valid search result in beneficiary details list view at disbursment maker stage
And user_076 search with in valid search text in beneficiary details screen at disbursment maker stage
Then user_076 verify system should not show the valid search result in beneficiary details list view at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert at disbursment maker stage
@AT_AL_BD_DMC_05
Scenario: To test the beneficiary details list view export functionality at disbursment maker stage
Given navigate to ULS URL
And user_076 login with valid disbursment maker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_76 click on beneficiary details tab at disbursment maker stage
And user_076 click on export button in beneficiary details list view at disbursment maker stage
And user_076 click on pdf option in beneficiary details list view at disbursment maker stage
Then user_076 verify beneficiary details list view details are downloaded as a pdf format at disbursment maker stage
And user_076 click on export button in beneficiary details list view at disbursment maker stage
And user_076 click on xlsx option in beneficiary details list view at disbursment maker stage
Then user_076 verify beneficiary details list view details are downloaded at xlsx format at disbursment maker stage
Then logout from the ULS Application
And user_076 invoke soft assert at disbursment maker stage
@AT_AL_BD_DMC_06
Scenario: To verify beneficiary details field should be read only mode at field data should be matched with disbursment maker stage 
Given navigate to ULS URL
And user_076 login with valid disbursment checker user id for auto loan product
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan disbursment maker record reference number at mail box
And user_076 select the auto loan disbursment maker record in mail box
And user_76 click on beneficiary details tab at disbursment maker stage
And user_076 get the test data for test case ID AT_AL_BD_DMC_01_02
And user_076 click on view button of beneficiary details list view at disbursment checker stage
Then user_076 verify in beneficiary details fields rae in view only mode at disbursment checker stage
Then user_076 verify beneficiary details record values should get matched with disbursment maker record at disbursment checker stage
Then logout from the ULS Application
And user_076 invoke soft assert at disbursment maker stage
