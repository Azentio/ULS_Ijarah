Feature: AutoLoan AppData Offering Facility Details

  @AT_Al_OFF_FD_01
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials18
    And User_610 get the test data set id for DS_AT_Al_OFF_FD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen Al 
    And User_610 click view button
    And User_610 verify the Classification field under Facility Details
    And User_610 verify the Product field under Facility Details
    And User_610 verify the Scheme field under Facility Details
    And User_610 verify the Program Code field under Facility Details
    And User_610 verify the Facility Type field under Facility Details
    And User_610 verify the Pricing Indicator field under Facility Details
    And User_610 verify the Requested Amount field under Facility Details
    And User_610 verify the Declared Property Value Amount field under Facility Details
    And User_610 verify the Declared Down Payment Amolunt field under Facility Details
    And User_610 verify the Currency field under Facility Details
    And User_610 verify the Loan Tenure field under Facility Details
    And User_610 verify the Servicing Branch field under Facility Details
    And User_610 verify the Back button field under Facility Details
    And User_610 verify the Save button field under Facility Details
    Then logout from the ijaraApplication
    
    @AT_Al_OFF_FD_02
  Scenario: verify the field Mandatory Non Editable Select
    Given navigate the IJARA URL
    And login with valid credentials18
    And User_610 get the test data set id for DS_AT_Al_OFF_FD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen Al 
    And User_610 click view button
    And User_610 verify the Classification field Mandatory Non Editable Select Al
    And User_610 verify the Product field Mandatory Non Editable Select Al
    And User_610 verify the Scheme field Mandatory Non Editable Select Al
    And User_610 verify the Program Code field Non Mandatory Editable Select Al
    And User_610 verify the Facility Details field Non Mandatory Editable Select Al
    Then logout from the ijaraApplication
    
    @AT_Al_OFF_FD_03
  Scenario: verify the field Mandatory Non Editable Select
    Given navigate the IJARA URL
    And login with valid credentials18
    And User_610 get the test data set id for DS_AT_Al_OFF_FD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen Al 
    And User_610 click view button
    And User_610 verify the Servicing Branch field Non Mandatory Non Editable Select Al
    And User_610 verify the Pricing Indicator field Non Mandatory Non Editable Select Al
		#And User_610 verify the Declared Property Value field Mandatory Non Editable Select Al      NA
		And User_610 verify the Declared Downpayment Amount field Mandatory Non Editable numberic Al
    And User_610 verify the Requested Amount field Mandatory Non Editable numberic Al
    Then logout from the ijaraApplication
    
     @AT_Al_OFF_FD_04
  Scenario: verify the field Mandatory Non Editable Select
    Given navigate the IJARA URL
    And login with valid credentials18
    And User_610 get the test data set id for DS_AT_Al_OFF_FD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen Al 
    And User_610 click view button
    And User_610 verify the currency field Mandatory Non Editable Select Al
    And User_610 verify the Loan Tenure field Mandatory Non Editable numberic Al
    #And User_610 verify the moratorium period NA 
    #And User_610 verify the future rental flat  NA
    And User_610 verify the status field Non mandatory Non editable toggle Al
    Then logout from the ijaraApplication
    