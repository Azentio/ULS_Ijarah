Feature: To verify the Tawarruq Application --> App Data Entry stage --> Customer Financials --> Income details screen

  # INC_01_01, INC_01_03
  @AT_TW_AD_INC_06
  Scenario: System should display the list of below mention fields for Income List
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_FU_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials tab
    And User_610 click the pencil icon under Customer Financials tab
    And User_610 verify the Back button available in Income list view under Customer Financials tab
    And User_610 verify Add button available under Income section list view in Customer Financials tab
    And User_610 verify Nature of Employement field available under Income section list view in Customer Financials tab
    And User_610 verify Net Income field available under Income section list view in Customer Financials tab
    And User_610 verify Net Deduction field available under Income section list view in Customer Financials tab
    And User_610 verify Considered Income field available under Income section list view in Customer Financials tab
    And User_610 verify Currency field available under Income section list view in Customer Financials tab
    And User_610 verify Status field available under Income section list view in Customer Financials tab
    And User_610 verify on clicks of list view record, details should be populated in the fields under Income screen
    And User_610 click the Back button under Income details screen
    And User_610 verify the functionality of Add button under Income section in Customer Financials tab
    And User_610 post clicking on Add button system should navigate to new Income details screen
    Then logout from the ijaraApplication

  @AT_TW_AD_INC_07
  Scenario: System should display the list of below mention fields for Income List
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_FU_01
    And User_610 get the test data for test case AT_MU_INC_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials tab
    And User_610 click the pencil icon under Customer Financials tab
    And User_610 click Search button in Income section under Customer Financials tab
    And User_610 verify the functionality of Search box with matching data in Income section
    And User_610 verify entering any matching value system should display all the possible matching records under Income section
    And User_610 verify the functionality of Search box with mismatch data in Income section
    And User_610 verify system should not display any records or system should display the message as No data found under Income section
    Then logout from the ijaraApplication

  @AT_TW_AD_INC_08
  Scenario: System should display the list of below mention fields for Income List
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_FU_01
    And User_610 get the test data for test case AT_MU_INC_07
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click the Customer Financials tab
    And User_610 click the pencil icon under Customer Financials tab
    And User_610 verify the functionality of Export to PDF button
    And User_610 post clicking on Export to PDF button system should download the PDF file of that records
    And User_610 verify the functionality of Export to Excel button
    And User_610 post clicking on Export to Excel button system should download the Excel file of that records
    And User_610 to verify the functionality of Back button under Customer Financials tab
    And User_610 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen
    Then logout from the ijaraApplication
