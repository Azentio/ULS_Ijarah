Feature: murabha App Data Entery Employement Details

  @AT_TW_AD_EMPD_07
  Scenario: To verify the Confirmation message
    Given navigate the IJARA URL
    And login with valid credentials09
    And User_610 get the test data set id for DS_AT_TW_AD_EMPD_07
    And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials Screen
    And User_610 click Edit button 
    And User_610 click the add button under Customer Employment Details
    And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 select nature of employment
    And User_610 select nature of period
    And User_610 enter employer name 
    And User_610 enter employee ID
    And User_610 select the Data Of Joining
    And User_610 select Employment type
    #And User_610 select Share Holder Percentage
    #And User_610 enter the Total Experience
    And User_610 scroll up and view customer employment 
    And User_610 verify the confirmation message
    Then logout from the ijaraApplication
    
    @AT_TW_AD_EMPD_08
  Scenario: blank field validation message
    Given navigate the IJARA URL
    And login with valid credentials09
    And User_610 get the test data set id for DS_AT_TW_AD_EMPD_07
    And User_610 get the test data set id for DS_AT_MU_EMPD_08
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials Screen
    And User_610 click Edit button 
    And User_610 click the add button under Customer Employment Details
    And User_610 blank validation message
    #And User_610 verify the enter numeric value in character field proper validation message   NA
    #And User_610 verify the enter character value in numeric field proper validation message   NA
    And User_610 verify the enter special characters value proper validation message 
    Then logout from the ijaraApplication
    
    @AT_TW_AD_EMPD_09
  Scenario: blank field validation message
    Given navigate the IJARA URL
    And login with valid credentials09
    And User_610 get the test data set id for DS_AT_TW_AD_EMPD_07
    #And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials Screen
    And User_610 click Edit button 
    And User_610 click the add button under Customer Employment Details
    
    @AT_TW_AD_EMPD_10
  Scenario: blank field validation message
    Given navigate the IJARA URL
    And login with valid credentials09
    And User_610 get the test data set id for DS_AT_TW_AD_EMPD_07
    #And User_610 get the test data set id for DS_AT_MU_EMPD_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials Screen
    And User_610 click Edit button 
    #And User_610 click the add button under Customer Employment Details
    And User_610 verify the Employer name should be seen
    And User_610 verify the Status should be seen active
    Then logout from the ijaraApplication
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    