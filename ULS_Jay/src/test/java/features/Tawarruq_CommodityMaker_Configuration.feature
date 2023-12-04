Feature: Tawarruq Commodity Maker Configuration

  @AT_TW_CSM_06
  Scenario: Verify the fields in Configuration
        
    Given navigate the IJARA URL
    And login with valid credentials10
    And User_610 get the test data set id for DS_AT_TW_CSM_06
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the Configuration Screen 
    And User_610 verify the Loan Tenure field in Financial Details
    And User_610 verify the Number Of Instalment field in Financial Details
    And User_610 verify the Repay Frequency field in Financial Details
    And User_610 verify the Instalment Rate Of Return field in Financial Details
    And User_610 verify the Total Loan Amount Financed field in Financial Details
    And User_610 verify the Average Account balance field in Financial Details
    #
    And User_610 verify the Classification field in Facility Details
    And User_610 verify the Product field in Facility Details
    And User_610 verify the Scheme field in Facility Details
    And User_610 verify the Total Loan Amount Financed field in Facility Details
    And User_610 verify the Loan Tenure field Total loan amount in Facility Details
    And User_610 verify the Currency ID field in Facility Details
    And User_610 verify the Eligible Income field in Facility Details
    And User_610 verify the Insurance Amount field in Facility Details
    And User_610 verify the Pre Retirement Emi field in Facility Details
    And User_610 verify the Post Retirement Emi field in Facility Details
    And User_610 verify the Previous Emi field in Facility Details
    And User_610 verify the Previous Outstanding field in Facility Details
    And User_610 verify the Previous Net Realizable field in Facility Details
    And User_610 verify the Pre Retirement Tenure field in Facility Details
    And User_610 verify the Total Offer Amount field in Facility Details
    And User_610 verify the Average Account Balance field in Facility Details
    And User_610 verify the Application Ltv1 field in Facility Details
    And User_610 verify the Application Ltv2 field in Facility Details
    Then logout from the ijaraApplication