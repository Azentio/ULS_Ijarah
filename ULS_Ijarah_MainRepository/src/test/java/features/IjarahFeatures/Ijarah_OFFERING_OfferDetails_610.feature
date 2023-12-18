Feature: Offer Details
@AT_OFL_01
Scenario: Fields Check
    Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    
    #And User_610 verify the Customer Decline button field available on offer details screen 
    #And User_610 verify the Print button field available on offer details screen 
    And User_610 verify the Back button field available on offer details screen 
    And User_610 verify the Accept Offer field available on offer details screen 
    And User_610 verify the Offer Details Section field available on offer details screen 
    And User_610 verify the Finance Details Section field available on offer details screen 
    And User_610 verify the Credit Risk Factor Sectioin field available on offer details screen 
    And User_610 verify the Credit Score Details Section field available on offer details screen 
    And User_610 verify the Eligibility Details Screen field available on offer details screen 
    And User_610 verify the Interest Rate Structure Section field available on offer details screen 
    And User_610 verify the Installments Section field available on offer details screen 
    And User_610 verify the Appeal Request Section field available on offer details screen 
    #
    And User_610 verify Product data should be read only 
    And User_610 verify Sub Product data should be read only 
    And User_610 verify Scheme data should be read only 
    And User_610 verify Princing Indicator data should be read only 
    
    
  @AT_OFL_02
Scenario: Post Click Customer Decline Button
Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the Back button field 
    
    
    @AT_OFL_03
Scenario: available fields in offer details section
Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the Product field available in offer details 
    And User_610 verify the Sub Product field available in offer details 
    And User_610 verify the Scheme field available in offer details 
    And User_610 verify the Pricing Indicator field available in offer details 
    And User_610 verify the Product Offer Amount available in offer details 
    And User_610 verify the Tenure field available in offer details 
    And User_610 verify the Nature Of Finance field available in offer details 
    And User_610 verify the Currency field available in offer details 
    
    @AT_OFL_04
Scenario: available fields in Finance details screen
Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the Amount Request field available in Finance details screen
    And User_610 verify the Down Payment Amount field available in Finance details screen
    And User_610 verify the Total Down Payment Amount field available in Finance details screen
    And User_610 verify the Total Profit Amount field available in Finance details screen
    And User_610 verify the Total Contract Value field available in Finance details screen
    And User_610 verify the Total Income field available in Finance details screen
    And User_610 verify the Total Net Income field available in Finance details screen
    And User_610 verify the Installment Fraquency field available in Finance details screen
    And User_610 verify the IRR field available in Finance details screen
    And User_610 verify the Tenure field available in Finance details screen
    And User_610 verify the Additional Down Payment field available in Finance details screen
    And User_610 verify the Down Payment Percentage field available in Finance details screen
    And User_610 verify the Total Fees field available in Finance details screen
    And User_610 verify the Total Obligations field available in Finance details screen
    And User_610 verify the No Of Installment field available in Finance details screen
    And User_610 verify the Last Installment Amount field available in Finance details screen
    And User_610 verify the APR field available in Finance details screen
    
    @AT_OFL_05
Scenario: available fields lookup read and Logic in offer details
Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the Offer Details Section Screen Under All field Should read only
    And User_610 verify the Total Down Payment Amount field read only
    And User_610 verify the Profit Amount field read only
    And User_610 verify the Total Contract Value field read only
    And User_610 verify the Additional Down Payment field read only
    And User_610 verify the Down Payment Percentage field read only
    
    
    @AT_OFL_06
Scenario: available fields in credit rise factor
Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the Total Score field under credit rise factor 
    And User_610 verify the Rise Level field under credit rise factor 
    
    @AT_OFL_07
Scenario: available fields in credit Score details
    Given navigate the IJARA URL
    And login with valid credentials-Offering
    And User_610 get the test data set id for DS_AT_OF_OFD_001
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click edit button under inbox screen02
    #
    And User_610 verify the SR NO field under credit Score details
    And User_610 verify the Customer Name field under credit Score details
    And User_610 verify the Credit Bureau Score field under credit Score details
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    