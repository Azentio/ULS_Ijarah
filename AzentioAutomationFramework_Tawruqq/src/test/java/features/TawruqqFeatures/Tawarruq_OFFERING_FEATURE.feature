Feature: To Test the offering feature for tawruqq product
@AT_TW_OFO_07
Scenario: To verify offerdetails sections should have all the fields
Given navigate the IJARA URL
And user_076 login with valid offering stage user credentials
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq offering stage record reference number
And user_076 select the tawruqq offering stage record
And user_076 click on offering tab in tawruqq offering tab
And user_076 select the tawruqq offering list view record
And user_076 verify product field should field should be visible in tawruqq offering
And user_076 verify sub product field should field should be visible in tawruqq offering
And user_076 verify scheme field should field should be visible in tawruqq offering
And user_076 verify Pricing Indicator field should field should be visible in tawruqq offering
And user_076 verify Offered Amount field should field should be visible in tawruqq offering
And user_076 verify Tenure field should field should be visible in tawruqq offering
And user_076 verify Nature of Finance field should field should be visible in tawruqq offering
And user_076 verify Currency field should field should be visible in tawruqq offering
And user_076 click on back button in tawruqq ofeering screen
Then user_076 verify offering screen should get move backward while clicking on back button
Then logout from the ULS Application
And user_076 invoke soft assert in tawruqq offering screen

@AT_TW_OFO_08
Scenario: To verify offer details ssection should be read only mode
Given navigate the IJARA URL
And user_076 login with valid offering stage user credentials
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq offering stage record reference number
And user_076 select the tawruqq offering stage record
And user_076 click on offering tab in tawruqq offering tab
And user_076 select the tawruqq offering list view record
And user_076 verify product field should field should be read only mode in tawruqq offering
And user_076 verify sub product field should field should be read only mode in tawruqq offering
And user_076 verify scheme field should field should be read only mode in tawruqq offering
And user_076 verify Pricing Indicator field should field should be read only mode in tawruqq offering
And user_076 verify Offered Amount field should field should be read only mode in tawruqq offering
And user_076 verify Tenure field should field should be read only mode in tawruqq offering
And user_076 verify Nature of Finance field should field should be read only mode in tawruqq offering
And user_076 verify Currency field should field should be read only mode in tawruqq offering
Then user_076 verify offering screen should get move backward while clicking on back button
Then logout from the ULS Application
And user_076 invoke soft assert in tawruqq offering screen



@AT_TW_OFO_09_10
Scenario: To verify financing details fields are non editable and field values data are populating as per the calculation
Given navigate the IJARA URL
And user_076 login with valid offering stage user credentials
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq offering stage record reference number
And user_076 select the tawruqq offering stage record
And user_076 click on offering tab in tawruqq offering tab
And user_076 select the tawruqq offering list view record
Then user_076 verify total downpayment percentage field should be readonly and data should populate as per the calculation
Then user_076 verify profit amount field should be readonly and data should populate as per the calculation
Then user_076 verify total contract value field should be readonly and data should populate as per the calculation
Then user_076 verify additional down payment field should be readonly and data should populate as per the calculation
Then user_076 verify downpayment percentage field should be readonly and data should populate as per the calculation
Then logout from the ULS Application
And user_076 invoke soft assert in tawruqq offering screen

@AT_TW_OFO_11
Scenario: To verify credit risk factor and credit score details field should not be editable in offering stage
Given navigate the IJARA URL
And user_076 login with valid offering stage user credentials
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_076 search for tawruqq offering stage record reference number
And user_076 select the tawruqq offering stage record
And user_076 click on offering tab in tawruqq offering tab
And user_076 select the tawruqq offering list view record
And user_076 verify credit risk factor field should have mentioned field
And user_076 verify credit risk factor field should not be editable
And user_076 verify credit score details field should have mentioned field
And user_076 verify credit score details field should not be editable
Then logout from the ULS Application
And user_076 invoke soft assert in tawruqq offering screen