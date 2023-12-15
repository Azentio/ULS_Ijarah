Feature: Murabha Offering Offer Details

    @AT_MU_OFL_01
  Scenario: Fields Check
    Given navigate the IJARA URL
    And login with valid credentials4
#		And click on module dropdown in IJRARAH
#		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_604 click the Entitle button under inbox
    And User_604 click edit button under inbox screen02
    #And User_604 verify the Customer Decline button field available on offer details screen
    #And User_604 verify the Print button field available on offer details screen
    And User_604 verify the Back button field available on offer details screen
    And User_604 verify the Accept Offer field available on offer details screen
    And User_604 verify the Offer Details Section field available on offer details screen
    And User_604 verify the Finance Details Section field available on offer details screen
    And User_604 verify the Credit Risk Factor Sectioin field available on offer details screen
    And User_604 verify the Credit Score Details Section field available on offer details screen
    And User_604 verify the Eligibility Details Screen field available on offer details screen
    And User_604 verify the Interest Rate Structure Section field available on offer details screen
    And User_604 verify the Installments Section field available on offer details screen
    And User_604 verify the Appeal Request Section field available on offer details screen
    And User_604 verify Product data should be read only
    And User_604 verify Sub Product data should be read only
    And User_604 verify Scheme data should be read only
    And User_604 verify Princing Indicator data should be read only
    Then logout from the ijaraApplication

  @AT_MU_OFL_02
  Scenario: Post Click Customer Decline Button
     Given navigate the IJARA URL
    And login with valid credentials4
#		And click on module dropdown in IJRARAH
#		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_604 click the Entitle button under inbox
    And User_604 click edit button under inbox screen02
    And User_604 verify the Back button field
    Then logout from the ijaraApplication

  @AT_MU_OFL_03
  Scenario: available fields in offer details section
     Given navigate the IJARA URL
    And login with valid credentials4
#		And click on module dropdown in IJRARAH
#		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_604 click the Entitle button under inbox
    And User_604 click edit button under inbox screen02
    And User_604 verify the Product field available in offer details
    And User_604 verify the Sub Product field available in offer details
    And User_604 verify the Scheme field available in offer details
    And User_604 verify the Pricing Indicator field available in offer details
    And User_604 verify the Product Offer Amount available in offer details
    And User_604 verify the Tenure field available in offer details
    And User_604 verify the Nature Of Finance field available in offer details
    And User_604 verify the Currency field available in offer details
    Then logout from the ijaraApplication

  @AT_MU_OFL_04
  Scenario: available fields in Finance details screen
    Given navigate the IJARA URL
    And login with valid credentials4
#		And click on module dropdown in IJRARAH
#		And click on LOS option in module dropdown
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Murabha Offering Offer Details
    And User_604 click the Entitle button under inbox
    And User_604 click edit button under inbox screen02
    And User_604 verify the Amount Request field available in Finance details screen
    And User_604 verify the Down Payment Amount field available in Finance details screen
    And User_604 verify the Total Down Payment Amount field available in Finance details screen
    And User_604 verify the Total Profit Amount field available in Finance details screen
    And User_604 verify the Total Contract Value field available in Finance details screen
    And User_604 verify the Total Income field available in Finance details screen
    And User_604 verify the Total Net Income field available in Finance details screen
    And User_604 verify the Installment Fraquency field available in Finance details screen
    And User_604 verify the IRR field available in Finance details screen
    And User_604 verify the Tenure field available in Finance details screen
    And User_604 verify the Additional Down Payment field available in Finance details screen
    And User_604 verify the Down Payment Percentage field available in Finance details screen
    And User_604 verify the Total Fees field available in Finance details screen
    And User_604 verify the Total Obligations field available in Finance details screen
    And User_604 verify the No Of Installment field available in Finance details screen
    And User_604 verify the Last Installment Amount field available in Finance details screen
    And User_604 verify the APR field available in Finance details screen
    Then logout from the ijaraApplication
