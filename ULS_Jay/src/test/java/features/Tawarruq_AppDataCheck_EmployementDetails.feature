Feature: To verify the Tawarruq Application --> Data check stage --> Customer Financials --> Employment details screen

  # Business
  @AT_TW_ADC_EDC_01
  Scenario: verify the fielda
    Given navigate the IJARA URL
    And login with valid credentials19
    And User_610 get the test data set id for DS_AT_TW_ADC_EDC_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the Customer Financials tab
    And User_610 click view button
    And User_610 click and enter Business  in search button
    And User_610 click view button Customer Financials tab Al
    And User_610 verify Primary Employment field available under Employment details screen
    And User_610 verify Employment Period field available under Employment details screen
    #And User_610 verify Employment Period value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Nature of Employment field available under Employment details screen
    #And User_610 verify Nature of Employment value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Company Type field available under Employment details screen
    And User_610 verify Profession field available under Employment details screen
    And User_610 verify Profession Type field available under Employment details screen
    And User_610 verify Statutory Authority field available under Employment details screen
    And User_610 verify Employer Name field available under Employment details screen
    And User_610 verify Employer Name if Others field available under Employment details screen
    #And User_610 verify Employer Name if Others value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Employee ID field available under Employment details screen
    #And User_610 verify Employee ID value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Date of Joining field available under Employment details screen
    #And User_610 verify Date of Joining value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Employment End Date field available under Employment details screen
    And User_610 verify Department field available under Employment details screen
    And User_610 verify Designation field available under Employment details screen
    And User_610 verify Employment Type field available under Employment details screen
    #And User_610 verify Employment Type value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify Direct Manager Contact Number Extension field available under Employment details screen
    And User_610 verify Direct Manager Telephone field available under Employment details screen
    And User_610 verify Income Paymode field available under Employment details screen
    And User_610 verify Employer Phone Extension field available under Employment details screen
    And User_610 verify Employer Phone Number field available under Employment details screen
    And User_610 verify State field available under Employment details screen
    And User_610 verify City field available under Employment details screen
    And User_610 verify Pincode field available under Employment details screen
    And User_610 verify Sector field available under Employment details screen
    And User_610 verify Industry Sub Sector field available under Employment details screen
    And User_610 verify No Of Partners field available under Employment details screen
    And User_610 verify Nature of Business field available under Employment details screen
    And User_610 verify Registered Business Name field available under Employment details screen
    And User_610 verify Registered Business Number field available under Employment details screen
    And User_610 verify Business Registration Date field available under Employment details screen
    And User_610 verify Office Premises Type field available under Employment details screen
    And User_610 verify Share Holder Percentage field available under Employment details screen
    #And User_610 verify Share Holder Percentage value should populate correctly same as App data entry stage under Employment details screen
    And User_610 verify No of Employees field available under Employment details screen
    And User_610 verify Experience At Current Employment field available under Employment details screen
    And User_610 verify Direct Manager Name field available under Employment details screen
    And User_610 verify Employer City Code field available under Employment details screen
    And User_610 verify Retirement Age field available under Employment details screen
    And User_610 verify Remarks field available under Employment details screen
    Then logout from the ijaraApplication
    And User_610 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage

  @AT_TW_ADC_EDC_02
  Scenario: verify the fielda
    #Pensioner
    Given navigate the IJARA URL
    And login with valid credentials19
    And User_610 get the test data set id for DS_AT_TW_ADC_EDC_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the Customer Financials tab
    And User_610 click view button
    And User_610 click and enter pensioner in search button
    And User_610 click view button Customer Financials tab Al
    #
    And User_610 verify Back button available under Employment details screen
    And User_610 verify Employment Period field available under Employment details screen
    And User_610 verify Nature of Employment field available under Employment details screen
    And User_610 verify Company Type field available under Employment details screen
    And User_610 verify Profession field available under Employment details screen
    And User_610 verify Profession Type field available under Employment details screen
    And User_610 verify Statutory Authority field available under Employment details screen
    And User_610 verify Employer Name field available under Employment details screen
    And User_610 verify Employer Name if Others field available under Employment details screen
    And User_610 verify Employee ID field available under Employment details screen
    And User_610 verify Date of Joining field available under Employment details screen
    And User_610 verify Employment End Date field available under Employment details screen
    And User_610 verify Department field available under Employment details screen
    And User_610 verify Designation field available under Employment details screen
    And User_610 verify Employment Type field available under Employment details screen
    And User_610 verify Direct Manager Contact Number Extension field available under Employment details screen
    And User_610 verify Direct Manager Telephone field available under Employment details screen
    And User_610 verify Income Paymode field available under Employment details screen
    And User_610 verify Employer Phone Extension field available under Employment details screen
    And User_610 verify Employer Phone Number field available under Employment details screen
    And User_610 verify State field available under Employment details screen
    And User_610 verify City field available under Employment details screen
    And User_610 verify Pincode field available under Employment details screen
    And User_610 verify Sector field available under Employment details screen
    And User_610 verify Industry Sub Sector field available under Employment details screen
    And User_610 verify No Of Partners field available under Employment details screen
    And User_610 verify Nature of Business field available under Employment details screen
    And User_610 verify Registered Business Name field available under Employment details screen
    And User_610 verify Registered Business Number field available under Employment details screen
    And User_610 verify Business Registration Date field available under Employment details screen
    And User_610 verify Office Premises Type field available under Employment details screen
    And User_610 verify Share Holder Percentage field available under Employment details screen
    And User_610 verify No of Employees field available under Employment details screen
    And User_610 verify Experience At Current Employment field available under Employment details screen
    And User_610 verify Direct Manager Name field available under Employment details screen
    And User_610 verify Employer City Code field available under Employment details screen
    And User_610 verify Retirement Age field available under Employment details screen
    And User_610 verify Remarks field available under Employment details screen
    Then logout from the ijaraApplication

  @AT_TW_ADC_EDC_03
  Scenario: verify the fielda
    #Company\Firm
    Given navigate the IJARA URL
    And login with valid credentials19
    And User_610 get the test data set id for DS_AT_TW_ADC_EDC_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click the Customer Financials tab
    And User_610 click view button
    And User_610 click and enter Company Firm  in search button
    And User_610 click view button Customer Financials tab Al
    #
    And User_610 verify Back button available under Employment details screen
    And User_610 verify Nature of Employment field available under Employment details screen
    And User_610 verify Company Type field available under Employment details screen
    And User_610 verify Profession field available under Employment details screen
    And User_610 verify Profession Type field available under Employment details screen
    And User_610 verify Statutory Authority field available under Employment details screen
    And User_610 verify Employment End Date field available under Employment details screen
    And User_610 verify Employer Phone Extension field available under Employment details screen
    And User_610 verify No Of Partners field available under Employment details screen
    And User_610 verify Nature of Business field available under Employment details screen
    And User_610 verify Registered Business Name field available under Employment details screen
    And User_610 verify Registered Business Number field available under Employment details screen
    And User_610 verify Business Registration Date field available under Employment details screen
    And User_610 verify Office Premises Type field available under Employment details screen
    And User_610 verify Share Holder Percentage field available under Employment details screen
    And User_610 verify No of Employees field available under Employment details screen
    And User_610 verify Remarks field available under Employment details screen
    Then logout from the ijaraApplication
