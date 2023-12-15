Feature: Title of your feature
  I want to use this template for my feature file

  @AT_TW_CSM_11
  Scenario: Personal Details screen should get open with Customer Information screen and below mentioned Fields
    Given navigate the IJARA URL
    And login with valid credentials3
    And User_604 get the test data for test case AT_TW_CSM_11
		And click on module dropdown in IJRARAH
		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And user_604 search the record Tawarruq Commodity Purchase Maker Customer Details
    And User_604 click the Entitle button under inbox
		And User_604 click the Customer Details tab  
		And User_604 click the View button under Customer Details tab
    And User_604 verify Applicant Type field available under Customer Information screen
    And User_604 verify Customer Type field available under Customer Information screen
    And User_604 verify Title field available under Customer Information screen
    And User_604 verify First Name field available under Customer Information screen
    And User_604 verify Middle Name field available under Customer Information screen
    And User_604 verify Last Name field available under Customer Information screen
    And User_604 verify Family Name	field available under Customer Information screen
    And User_604 verify First Name(Arabic) field available under Customer Information screen
    And User_604 verify Middle Name(Arabic) field available under Customer Information screen
    And User_604 verify Last Name(Arabic) field available under Customer Information screen
    And User_604 verify Family Name(Arabic)	field available under Customer Information screen
    And User_604 verify Date of Birth field available under Customer Information screen
    And User_604 verify Age field available under Customer Information screen
    And User_604 verify Gender field available under Customer Information screen
    And User_604 verify Marital Status field available under Customer Information screen
    And User_604 verify Education Level field available under Customer Information screen
    And User_604 verify Nationality field available under Customer Information screen
    And User_604 verify Residential Status field available under Customer Information screen
    And User_604 verify Language field available under Customer Information screen
    And User_604 verify No of Dependents field available under Customer Information screen
    And User_604 verify Client Category field available under Customer Information screen
    And User_604 verify Blocklisted field available under Customer Information screen
    And User_604 verify Credit Bureau field available under Customer Information screen
    And User_604 verify Remarks field available under Customer Information screen
    Then logout from the ULS Application
