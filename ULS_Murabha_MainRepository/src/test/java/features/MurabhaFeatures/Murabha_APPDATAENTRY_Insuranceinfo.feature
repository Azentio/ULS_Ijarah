Feature: Murabha_Appdataentry_Insuranceinfo

  @AT_MU_INS_01
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 Enter the value in insuranceQuotationId field
    And User_607 Enter the value in insuranceYear field
    And User_607 Enter the value in depriciation field
    And User_607 Enter the value in AssetPrice field
    And User_607 Enter the value in RatePerAsset field
    And User_607 Enter the value in minimumInsurancePremium field
    And User_607 Enter the value in BaseInsurancePremium field
    And User_607 Enter the value in VATPremium field
    And User_607 Enter the value in NetPremium field
    Then logout from the ULS Application

  @AT_MU_INS_02
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 check the insurancequotation field is mandatory or not
    And User_607 Enter the value in insuranceQuotationId field
    And User_607 check the insuranceYear field is mandatory or not
    And User_607 Enter the value in insuranceYear field
    And User_607 check the depriciation field is mandatory or not
    And User_607 Enter the value in depriciation field
    Then logout from the ULS Application

  @AT_MU_INS_03
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 check the AssetPrice field is mandatory or not
    And User_607 Enter the value in AssetPrice field
    And User_607 check the RatePerAsset field is mandatory or not
    And User_607 Enter the value in RatePerAsset field
    Then logout from the ULS Application

  @AT_MU_INS_04
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 check the minimumInsurancePremium field is mandatory or not
    And User_607 Enter the value in minimumInsurancePremium field
    And User_607 check the BaseInsurancePremium field is mandatory or not
    And User_607 Enter the value in BaseInsurancePremium field
    And User_607 check the VATPremium field is mandatory or not
    And User_607 Enter the value in VATPremium field
    Then logout from the ULS Application

  @AT_MU_INS_05
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 check the NetPremium field is mandatory or not
    And User_607 Enter the value in NetPremium field
    And User_607 click the saveButton under insurance info screen
    Then logout from the ULS Application

  @AT_MU_INS_06
  Scenario: Creation of Insurance Info record with valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for insuranceInfo
    And User_607 Select record after search
    And User_607 click the insurance Info Screen
    And User_607 click the Add button under insurance Info screen
    And User_607 Enter the value in insuranceQuotationId field
    And User_607 Enter the value in insuranceYear field
    And User_607 Enter the value in depriciation field
    And User_607 Enter the value in AssetPrice field
    And User_607 Enter the value in RatePerAsset field
    And User_607 Enter the value in minimumInsurancePremium field
    And User_607 Enter the value in BaseInsurancePremium field
    And User_607 Enter the value in VATPremium field
    And User_607 Enter the value in NetPremium field
    And User_607 click the saveButton under insurance info screen
    And User_607 verify the success pop up
    Then logout from the ULS Application
