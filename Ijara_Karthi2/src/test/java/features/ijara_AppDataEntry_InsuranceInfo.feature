Feature: Verify the functionalities for AppDataEntry(Insurance Info)
  @AT_INS_001
  Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
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

@AT_INS_002
 Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
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


@AT_INS_003
 Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton for insuranceInfo
And user click the ExpenseType on Action
And user click the insurance Info Screen
And user click the Add button under insurance Info screen
And user check the AssetPrice field is mandatory or not
And user Enter the value in AssetPrice field
And user check the RatePerAsset field is mandatory or not
And user Enter the value in RatePerAsset field


@AT_INS_004
 Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
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

@AT_INS_005
 Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton for insuranceInfo
And user click the ExpenseType on Action
And user click the insurance Info Screen
And user click the Add button under insurance Info screen
And user check the NetPremium field is mandatory or not
And user Enter the value in NetPremium field
And user click the saveButton under insurance info screen



  @AT_INS_006
  Scenario: Creation of Insurance Info record with valid data
  Given navigate the IJARA URL
And login with valid credentials
And user update test data set id for AT_INS_001
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
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


