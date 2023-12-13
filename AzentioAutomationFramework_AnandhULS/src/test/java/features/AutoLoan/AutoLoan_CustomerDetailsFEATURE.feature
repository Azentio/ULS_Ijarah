Feature: To Test the customer details screen with auto loan product

@AT_AL_CUSDETAILS_01
Scenario: To verify customer details field and user can able to create customer details record with valid input for auto loan product
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
And user_076 get the test data for test case ID AT_AL_CUSDETAILS_01
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
Then user_076 verify customer details field should have save and back button
Then user_076 verify customer type field should be mandatory editable dropdown at new app
Then user_076 verify applicant type field should be mandatory editable dropdown at new app
Then user_076 verify salutation field should be mandatory editable dropdown at new app
Then user_076 verify first name field should be mandatory editable textbox at new app
Then user_076 verify middle name field should be non mandatory editable textbox at new app
Then user_076 verify last name field should be mandatory editable textbox at new app
Then user_076 verify father first name field should be mandatory editable textbox at new app
Then user_076 verify father middle name field should be non mandatory editable textbox at new app
Then user_076 verify father last name field should be mandatory editable textbox at new app
Then user_076 verify spouse first name field should be mandatory editable textbox at new app
Then user_076 verify spouse middle name field should be non mandatory editable textbox at new app
Then user_076 verify spouse last name field should be mandatory editable textbox at new app
Then user_076 verify no of children field should be non mandatory editable textbox
Then user_076 verify no of children field should be non mandatory editable textbox
Then user_076 verify spouse status field should be non mandatory editable dropdown at new app
Then user_076 verify date of birth field should be mandatory editable calendar at new app
Then user_076 verify date of birth field should be mandatory editable calendar at new app
Then user_076 verify gender field should be mandatory editable dropdown at new app
Then user_076 verify education level field should be mandatory editable dropdown at new app
Then user_076 verify maritail status field should be mandatory editable dropdown at new app
Then user_076 verify nationality field should be mandatory editable dropdown at new app
Then user_076 verify category field should be mandatory editable dropdown at new app
Then user_076 verify religion field should be mandatory editable dropdown at new app
Then user_076 verify residential status field should be mandatory editable dropdown at new app
Then user_076 verify language field should be mandatory editable dropdown at new app
Then user_076 verify no of dependents field should be mandatory editable textbox at new app
Then user_076 verify mothers maiden name field should be mandatory editable textbox at new app
Then user_076 verify residence field should be mandatory editable textbox at new app
Then user_076 verify industry segmentation field should be mandatory editable textbox at new app
Then user_076 verify income considered field should be mandatory editable textbox at new app
Then user_076 verify costomer profile field should be mandatory editable textbox at new app
Then user_076 verify relationship field should be mandatory editable textbox at new app
Then user_076 verify existing bank relationship field should be mandatory editable textbox at new app
Then user_076 verify blacklisted field should be mandatory editable textbox at new app
Then user_076 verify politically exposed field should be mandatory editable textbox at new app
Then user_076 verify remarks field should be mandatory editable textbox at new app
Then user_076 verify phone number field should be mandatory editable textbox at new app
Then user_076 verify phone number primary field should be mandatory editable textbox at new app
Then user_076 verify phone number secondary field should be editable number at new app
Then user_076 verify email id field should be editable number at new app
Then user_076 verify prefered contact method field should be editable number at new app
Then user_076 verify prefered time for contact field should be editable HH MM format at new app






@AT_AL_CUSDETAILS_02
Scenario: To verify user can not able to create the cusmtomer details with invalid input
Given navigate to uls url
And login with valid credentials for new application stage
And click on module dropdown in IJRARAH
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search the auto loan new app record in mail box
And user_076 select the auto loan new app record from mail box
And user_076 click on customer details tab in new app stage
And user_076 click on add button in customer details screen
And user_076 get the test data for test case ID AT_AL_CUSDETAILS_02
And user_076 in customer search screen select the customer type at customer details
And user_076 in customer search screen enter customer name at customer details
And user_076 in custommer search screen select ID type at customer details
And user_076 in customer search screen enter id number at customer details
And user_076 in customer search screen enter date of birth of the customer at customer details
And user_076 in customer search screen enter customer mobile number at customer details
And user_076 click on the search button in customer search screen
And user_076 click on create new request buttton
And user_076 click on save button in customer details with blank fields
Then user_076 verify system should show the validation for blank field in customer details screen at new app stage
And user_076 enter special character in first name in customer details screen at new app
Then user_076 verify first name field should show the validation for special character input in customer details screen at new app
And user_076 enter numeric input in first name in customer details screen at new app
Then user_076 verify first name field should show the validation for numeric input in customer details screen at new app
And user_076 enter character input in no of children in customer details screen at new app
Then user_076 verify no of children field dont accept the character input in customer details screen at new app
Then logout from the ULS Application
And user_076 invoke softAssert in auto loan new app customer details screen