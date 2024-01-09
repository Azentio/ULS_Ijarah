Feature: To Test the functionality of Contract signing stage in Murabha
@AT_MU_CNS_01
Scenario: To Verify the fields in contract signing screen in Murabha Contract signing stage
Given navigate the Murabha URL
And login with valid credentials for Murabha contract signing stage
And click on module dropdown in Murabha
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_0482 get the test data for test case id AT_MU_CS_01
And user_0482 search the contract signing stage record reference number in Murabha
And user_0482 select the contract signing stage record from mail box in Murabha
And user_0482 Verify the contract signing tab is visible and click
And user_0482 Verify the contract signing Authority field should be dropdwon mandatory and editable
And user_0482 Verify the offered amount field should be number mandatory and editable
And user_0482 Verify the contract signing date field should be date mandatory and editable
And user_0482 Verify the contract Validity date field should be date mandatory and editable
And user_0482 Verify functionality of Save button in contract signing screen
Then logout from the ULS Application

@AT_MU_CNS_02
Scenario: To Verify the fields in Promissory screen in Murabha Contract signing stage
Given navigate the Murabha URL
And login with valid credentials for Murabha contract signing stage
And click on module dropdown in Murabha
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_0482 get the test data for test case id AT_MU_CS_02
And user_0482 search the contract signing stage record reference number in Murabha
And user_0482 select the contract signing stage record from mail box in Murabha
And user_0482 Verify the promissory tab is visible and click
And user_0482 click add button in promissory notes screen
And user_0482 Verify the functionality of back button in promissory notes screen
And user_0482 click add button in promissory notes screen
And user_0482 Verify the promissory note frequency field
And user_0482 Verify the Number of promissory note field
And user_0482 Verify functionality of Save button in contract signing screen
Then logout from the ULS Application

@AT_MU_CNS_03
Scenario: To Verify the fields in Promissory screen in Murabha Contract signing stage accepts invalid input
Given navigate the Murabha URL
And login with valid credentials for Murabha contract signing stage
And click on module dropdown in Murabha
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_0482 get the test data for test case id AT_MU_CS_03
And user_0482 search the contract signing stage record reference number in Murabha
And user_0482 select the contract signing stage record from mail box in Murabha
And user_0482 Verify the promissory tab is visible and click
And user_0482 click add button in promissory notes screen
And user_0482 click save button in promissory notes screen
And user_0482 Verify blank filed validation in promissory notes screen
And user_0482 Verify the number of promissory note does not allow character value
And user_0482 Verify the number of promissory note does not allow special character
Then logout from the ULS Application

@AT_MU_CNS_04
Scenario: To Verify the fields in List view promissory note 
Given navigate the Murabha URL
And login with valid credentials for Murabha contract signing stage
And click on module dropdown in Murabha
And click on LOS option in module dropdown
And click on mail box
And click on search box upon click on the mail box
And click on search text box upon click the search button
And user_0482 get the test data for test case id AT_MU_CS_03
And user_0482 search the contract signing stage record reference number in Murabha
And user_0482 select the contract signing stage record from mail box in Murabha
And user_0482 Verify the promissory tab is visible and click
And user_0482 Verify the promissory note frequency field in promissory details list view
And user_0482 Verify the number of promissory note field in promissory details list view
And user_0482 Verify the promissory status field in promissory details list view
And user_0482 click first view icon in promissory details list  view
And user_0482 Verify the promissory Note Percentage field in promissory note details list view
And user_0482 Verify the promissory Note Amount field in promissory note details list view
And user_0482 Verify the promissory Note Date field in promissory note details list view
And user_0482 Verify the Is promissory Note signed field in promissory note details list view
Then logout from the ULS Application

 @AT_MU_CNS_06
  Scenario: verify the fields
    Given navigate the Murabha URL
    And login with valid credentials for Murabha contract signing stage
    And User_610 get the test data set id for DS_AT_MU_CS_05
   #And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And click on mail box
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Contract Singing Screen in Murabha
    And User_610 verify the Contract Singing Authority field under Contract Singing Screen in Murabha
    And User_610 verify the Offered Amount field under Contract Singing Screen in Murabha
    And User_610 verify the Contract Singin Date field under Contract Singing Screen in Murabha
    And User_610 verify the Contract Validity field under Contract Singing Screen in Murabha
    Then logout from the ULS Application

