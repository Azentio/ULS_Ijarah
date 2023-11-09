Feature: Murabha_Appdataentry_Insuranceinfo

  @AT_MU_INS_01
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user Enter the value in insuranceQuotationId field
    And user Enter the value in insuranceYear field
    And user Enter the value in depriciation field
    And user Enter the value in AssetPrice field
    And user Enter the value in RatePerAsset field
    And user Enter the value in minimumInsurancePremium field
    And user Enter the value in BaseInsurancePremium field
    And user Enter the value in VATPremium field
    And user Enter the value in NetPremium field

  @AT_MU_INS_02
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user check the insurancequotation field is mandatory or not
    And user Enter the value in insuranceQuotationId field
    And user check the insuranceYear field is mandatory or not
    And user Enter the value in insuranceYear field
    And user check the depriciation field is mandatory or not
    And user Enter the value in depriciation field

  @AT_MU_INS_03
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user check the AssetPrice field is mandatory or not
    And user Enter the value in AssetPrice field
    And user check the RatePerAsset field is mandatory or not
    And user Enter the value in RatePerAsset field

  @AT_MU_INS_04
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user check the minimumInsurancePremium field is mandatory or not
    And user Enter the value in minimumInsurancePremium field
    And user check the BaseInsurancePremium field is mandatory or not
    And user Enter the value in BaseInsurancePremium field
    And user check the VATPremium field is mandatory or not
    And user Enter the value in VATPremium field

  @AT_MU_INS_05
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user check the NetPremium field is mandatory or not
    And user Enter the value in NetPremium field
    And user click the saveButton under insurance info screen

  @AT_MU_INS_06
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the IJARA URL
    And login with valid credentials
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And user Enter the clientname under searchButton for insuranceInfo
    And user click the ExpenseType on Action
    And user click the insurance Info Screen
    And user click the Add button under insurance Info screen
    And user Enter the value in insuranceQuotationId field
    And user Enter the value in insuranceYear field
    And user Enter the value in depriciation field
    And user Enter the value in AssetPrice field
    And user Enter the value in RatePerAsset field
    And user Enter the value in minimumInsurancePremium field
    And user Enter the value in BaseInsurancePremium field
    And user Enter the value in VATPremium field
    And user Enter the value in NetPremium field
    And user click the saveButton under insurance info screen
    And user verify the success pop up
