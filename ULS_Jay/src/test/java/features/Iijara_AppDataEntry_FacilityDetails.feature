Feature: Ijara App Data Entry Facility details

 @AT_FAC_DET_01
  Scenario: To verify that all fields are present in Facility Details
    Given navigate the IJARA URL
    And login with valid credentials17
    And User_610 get the test data set id for DS_AT_FAC_DET_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen
    And User_610 click add button
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
    
    
    @AT_FAC_DET_02
  Scenario: To verify fields Mandatory Editable Type in Document Details
    Given navigate the IJARA URL
    And login with valid credentials17
    And User_610 get the test data set id for DS_AT_FAC_DET_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen
    And User_610 click add button
    And User_610 verify the Classification field Mandatory Editable Select
    And User_610 verify the Product field Mandatory Editable Select 
    And User_610 verify the Scheme field Mandatory Editable Select
    And User_610 verify the Program Code field Mandatory Editable Select
    And User_610 verify the Servicing Branch field Mandatory Editable Select
    Then logout from the ijaraApplication
    
    @AT_FAC_DET_03
  Scenario: To verify fields Mandatory Editable Type in Document Details
    Given navigate the IJARA URL
    And login with valid credentials17
    And User_610 get the test data set id for DS_AT_FAC_DET_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen
    And User_610 click add button
    And User_610 verify the Pricing Indicator field Mandatory Editable Select
    And User_610 verify the Requested Amount field Mandatory Editable numberic
    And User_610 verify the Declared Downpayment Amount field Mandatory Editable numberic
    And User_610 verify the currency field Mandatory Editable Select
    And User_610 verify the Loan Tenure field Mandatory Editable numberic
    Then logout from the ijaraApplication
    
    @AT_FAC_DET_08
  Scenario: To verify fields in Document Details
    Given navigate the IJARA URL
    And login with valid credentials17
    And User_610 get the test data set id for DS_AT_FAC_DET_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen
    And User_610 verify the Classification field in list view
    And User_610 verify the Product field in list view
    And User_610 verify the Tenure field in list view
    And User_610 verify the Requested Amount field in list view
    And User_610 verify the Status field in list view
    And User_610 verify the Add button field in list view
    And User_610 verify the Export Pdf button field in list view
    And User_610 verify the Export Xsl button field in list view
    And User_610 verify the search button field in list view
    And User_610 verify Post entering any matching value system should display 
    And User_610 verify Post entering any mis matching value system should display 
    Then logout from the ijaraApplication
    
    @AT_FAC_DET_09
  Scenario: To verify export button in Document Details
    Given navigate the IJARA URL
    And login with valid credentials17
    And User_610 get the test data set id for DS_AT_FAC_DET_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click facility Details screen
    And User_610 click export button
    And User_610 verify the PDF button should download the PDF file of that records 
    And User_610 click export button
    And User_610 verify the Excel button should download the PDF file of that records 
    And User_610 verify the back button FD
    Then logout from the ijaraApplication
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    