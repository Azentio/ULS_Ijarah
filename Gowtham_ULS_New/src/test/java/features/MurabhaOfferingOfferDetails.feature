Feature: Murabha Offering Offer Details

  @AT_MU_OFL_01
  Scenario: Fields Check
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    #And User_607 verify the Customer Decline button field available on offer details screen
    #And User_607 verify the Print button field available on offer details screen
    And User_607 verify the Back button field available on offer details screen
    And User_607 verify the Accept Offer field available on offer details screen
    And User_607 verify the Offer Details Section field available on offer details screen
    And User_607 verify the Finance Details Section field available on offer details screen
    And User_607 verify the Credit Risk Factor Sectioin field available on offer details screen
    And User_607 verify the Credit Score Details Section field available on offer details screen
    And User_607 verify the Eligibility Details Screen field available on offer details screen
    And User_607 verify the Interest Rate Structure Section field available on offer details screen
    And User_607 verify the Installments Section field available on offer details screen
    And User_607 verify the Appeal Request Section field available on offer details screen
    And User_607 verify Product data should be read only
    And User_607 verify Sub Product data should be read only
    And User_607 verify Scheme data should be read only
    And User_607 verify Princing Indicator data should be read only
    Then logout from the ULSApplication

  @AT_MU_OFL_02
  Scenario: Post Click Customer Decline Button
    Given navigate the IJARA URL
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the Back button field
    Then logout from the ULSApplication

  @AT_MU_OFL_03
  Scenario: available fields in offer details section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the Product field available in offer details
    And User_607 verify the Sub Product field available in offer details
    And User_607 verify the Scheme field available in offer details
    And User_607 verify the Pricing Indicator field available in offer details
    And User_607 verify the Product Offer Amount available in offer details
    And User_607 verify the Tenure field available in offer details
    And User_607 verify the Nature Of Finance field available in offer details
    And User_607 verify the Currency field available in offer details
    Then logout from the ULSApplication

  @AT_MU_OFL_04
  Scenario: available fields in Finance details screen
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the Amount Request field available in Finance details screen
    And User_607 verify the Down Payment Amount field available in Finance details screen
    And User_607 verify the Total Down Payment Amount field available in Finance details screen
    And User_607 verify the Total Profit Amount field available in Finance details screen
    And User_607 verify the Total Contract Value field available in Finance details screen
    And User_607 verify the Total Income field available in Finance details screen
    And User_607 verify the Total Net Income field available in Finance details screen
    And User_607 verify the Installment Fraquency field available in Finance details screen
    And User_607 verify the IRR field available in Finance details screen
    And User_607 verify the Tenure field available in Finance details screen
    And User_607 verify the Additional Down Payment field available in Finance details screen
    And User_607 verify the Down Payment Percentage field available in Finance details screen
    And User_607 verify the Total Fees field available in Finance details screen
    And User_607 verify the Total Obligations field available in Finance details screen
    And User_607 verify the No Of Installment field available in Finance details screen
    And User_607 verify the Last Installment Amount field available in Finance details screen
    And User_607 verify the APR field available in Finance details screen
    Then logout from the ULSApplication

  @AT_MU_OFL_05
  Scenario: available fields lookup read and Logic in offer details
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the Offer Details Section Screen Under All field Should read only
    And User_607 verify the Total Down Payment Amount field read only
    And User_607 verify the Profit Amount field read only
    And User_607 verify the Total Contract Value field read only
    And User_607 verify the Additional Down Payment field read only
    And User_607 verify the Down Payment Percentage field read only
    Then logout from the ULSApplication

  @AT_MU_OFL_06
  Scenario: available fields in credit rise factor
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the Total Score field under credit rise factor
    And User_607 verify the Rise Level field under credit rise factor
    Then logout from the ULSApplication

  @AT_MU_OFL_07
  Scenario: available fields in credit Score details
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And User_607 verify the SR NO field under credit Score details
    And User_607 verify the Customer Name field under credit Score details
    And User_607 verify the Credit Bureau Score field under credit Score details
    Then logout from the ULSApplication

  @AT_MU_OFL_08
  Scenario: To verify that all fields are present in Eligibility details section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Eligibility type field is displayed in Eligibility details section
    And Validate the Eligibility amount field is displayed in Eligibility details section
    And Validate the Eligibility percentage field is displayed in Eligibility details section
    And Validate the Currency field is displayed in Eligibility details section
    And Validate the Actual Percentage field is displayed in Eligibility details section
    And Validate the Deviation level field is displayed in Eligibility details section
    Then logout from the ULSApplication

  @AT_MU_OFL_09
  Scenario: To verify that all fields are present in Interest rate Structure section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Period field is displayed in Interest rate structure section
    And Validate the Rate definition field is displayed in Interest rate structure section
    And Validate the Effective Rate field is displayed in Interest rate structure section
    And Validate the Base Rate is displayed in Interest rate structure section
    And Validate the Spread rate field is displayed in Interest rate structure section
    And Validate the Cap rate is displayed in Interest rate structure section
    And Validate the Floor rate field is displayed in Interest rate structure section
    And Validate the RBP Adjuster field is displayed in Interest rate structure section
    And Validate the Penalty rate is displayed in Interest rate structure section
    And Validate the Penalty Fee field is displayed in Interest rate structure section
    Then logout from the ULSApplication

  @AT_MU_OFL_10
  Scenario: To verify that all fields are present in Installment section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Instalment Period field is displayed in Interest rate structure section
    And Validate the Installment Amount field is displayed in Interest rate structure section
    And Validate the Accept offer button is present in Offering page
    Then logout from the ULSApplication

  @AT_MU_OFL_11
  Scenario: To verify that all fields are present in Installment section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Click on Accept offer button in offering page
    Then logout from the ULSApplication

  @AT_MU_OFL_12
  Scenario: To verify that all fields are present in Appeal request section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Original requested amount field is displayed in Appeal request section
    And Validate the Original requested tenure field is displayed in Appeal request section
    And Validate the New requested amount field in Appeal request section
    And Validate the New requested tenure field in Appeal request section
    Then logout from the ULSApplication

  @AT_MU_OFL_13
  Scenario: To verify that all fields are present in Appeal request section
    #This test case also cover the functionality of AT_MU_OFL_14
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Original requested amount field is displayed in Appeal request section
    And Validate the Original requested tenure field is displayed in Appeal request section
    And Enter the value in New requested amount field in Appeal request section
    And Enter the value in New requested tenure field in Appeal request section
    And Click on Save button in Appeal request section
    And Click on Appeal button in Appeal request section
    Then logout from the ULSApplication

  @AT_MU_OFL_15
  Scenario: To verify that all links are present in Appeal request section
    Given navigate the IJARA URL
    And login with valid credentials6
    #And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_607 Select record after search
    And User_607 click edit button under inbox screen02
    And Validate the Recommendations sanction Conditions link is displayed in Appeal request section
    And Validate the Approval History link is displayed in Appeal request section
    Then logout from the ULSApplication
