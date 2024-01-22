Feature: Tawarruq AppData Entry Facility Details

  @AT_TW_AD_FD_007
  Scenario: Title of your scenario
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_01
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 Click the Facility info tab
And User_607 click the Entitle button under facility list
Then User_607 check the Classification field under the Facility info
Then User_607 check the Product field under the Facility info
Then User_607 check the Scheme field under the Facility info
Then User_607 check the Program Code field under the Facility info
Then User_607 check the Pricing Indicator field under the Facility info
Then User_607 check the Requested Amount field under the Facility info
    #Then User_607 check the Declared Down Payment Amount field under the Facility info
Then User_607 check the Currency field under the Facility info
Then User_607 check the Loan Tenure field under the Facility info
Then User_607 check the Servicing Branch field under the Facility info
Then logout from the ULS Application

  @AT_TW_AD_FD_008
  Scenario: Title of your scenario
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_01
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 Click the Facility info tab
And User_607 click the Entitle button under facility list
Then User_607 clear the Loan Tenure field under facility
Then User_607 modify the Loan Tenure field under facility info
    #And User_607 to check same record saved inLoan Tenure field under facility info
Then User_607 click the save button under the facility info
And User_607 Search the Ref Id under inbox Tawarruq AppData Entry Facility Details
And User_607 click the Entitle button under facility list
And User_607 to check same record saved inLoan Tenure field under facility info
Then logout from the ULS Application

  @AT_TW_AD_FD_009
  Scenario: Title of your scenario
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And click on module dropdown in Tawarruq
And User_607 get the test data for test case AT_TW_AD_INC_01
And user_0482 click on LOS option in module dropdown
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_607 Click the Facility info tab
And User_607 click the Entitle button under facility list
And User_607 modify the declared downpayment amount
    #not allow invalid data
And User_607 check the invalid data in the declared downpayment amount
And User_607 modify the correct data for declared downpayment amount
Then User_607 click the save button under the facility info
And User_607 validate the confirmation message as success
And User_607 Click the back button in facility list
And User_607 verify the the back button function using inbox label in facility list
Then logout from the ULS Application