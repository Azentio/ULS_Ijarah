Feature: Murabha_Appdataentry_QuotationInfo

  @AT_MU_QIA_001
  Scenario: To verify user is able to add new Quotation Info  record in the system by entering valid data
     Given navigate the IJARA URL
    And login with valid credentials2
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And user click the ExpenseType on Action
    Then user_615 click quotation info tab
    And user click the Add button under Quotation Info screen
    Then user_615 verify the insurance company field
    And user_615 verify the base premium field
    And user_615 verify the VAT on Base Premium field
    And user_615 verify the Net Base Premium field
    Then user_615 verify the Total Discount field
    And user_615 verify the Expiry Date field
    Then user_615 verify the Quotation Reference Number field
    And user click the saveButton under insurance info screen
    #Then user_615 validate the success message popup with close button
    Then user_615 click back button

  @AT_MU_QIA_002
  Scenario: To verify all the fields are mandatory and editable in quotation info tab
   Given navigate the IJARA URL
    And login with valid credentials2
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And user click the ExpenseType on Action
    Then user_615 click quotation info tab
    And user click the Add button under Quotation Info screen
    And user_615 verify insurance company field is mandatory
    Then user_615 verify insurance company field is editable
    And user_615 verify the base premium field is mandatory
    Then user_615 verify the base premium field is editable
    And user_615 verify the VAT on Base Premium field is mandatory
    And user_615 verify the VAT on Base Premium is editable
    Then user_615 verify the VAT on Base Premium field only accept the numeric values
    And user_615 verify the Net Base Premium field is mandatory
    Then user_615 verify the Net Base Premium field is editable
    And user_615 verify the Net Base Premium field only accept the numeric values
    Then user_615 verify the Total Discount field is mandatory
    And user_615 verify the Total Discount field is editable
    And user_615 verify Total Discount field is only accept the numeric values
    Then user_615 verify the Expiry Date field is mandatory
    And user_615 verify the Expiry Date field is editable
    And user_615 verify the Expiry Date field should be in date format
    Then user_615 verify the Quotation Reference Number field is mandatory
    And user_615 verify the Quotation Reference Number field is editable
    #And user_615 verify Quotation Reference Number field is only accept the numeric values
    Then user_615 verify Quotation Reference Number field should be in textbox
    Then user_615 click back button
    And user click the Add button under Quotation Info screen

  @AT_MU_QIA_003
  Scenario: To verify user is able to add new Quotation Info record in the system by entering invalid data
   Given navigate the IJARA URL
    And login with valid credentials2
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And user click the ExpenseType on Action
    Then user_615 click quotation info tab
    And user click the Add button under Quotation Info screen
    And user_615 click base premium amount field
    And User_607 Save the record
    And User_607 Check Please Fill Details Popup showing or not
    And user_615 click VAt on base premium amount field
    And user_615 enter the negative value in VAt on base premium amount field
    And user click the saveButton under insurance info screen
    #Then user_615 verify the invalid data entry popup
    And user_615 click quotation reference no field
    And user_615 enter the character values in quotation reference field
    And user click the saveButton under insurance info screen
    #Then user_615 validate the invalid data entry popup
    And user_615 click quotation reference no field
    And user_615 enter the special character value in quotation reference field
    And user click the saveButton under insurance info screen

  
  @AT_MU_QIA_004
  Scenario: To verify user is able to modify Quotation Info record in the system
    Given navigate the IJARA URL
    And login with valid credentials2
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And user click the ExpenseType on Action
    Then user_615 click quotation info tab
    And User_607 Click edit button in QuationInnfo tab
    And User_607 Check back button and save button present in the screen
    And User_607 to modify the Quotation Info
    And User_607 Save the record 
    And User_607 Click edit button in QuationInnfo tab
    And User_607 Clear Vat On Base Premium Amount value
    And User_607 Save the record 
    And User_607 Check Please Fill Details Popup showing or not
    And User_607 Enter invalid data in Vat On Base Premium Amount value
    And User_607 Save the record
    And User_607 Check Please Fill Details Popup showing or not
    Then user_615 click back button
    And User_607 Check the Status should be active in list view
    And User_607 Click edit button in QuationInnfo tab
    And User_607 Deactive the status
    And User_607 Save the record
    And User_607 Check the Status should be Deactive in list view
    And User_607 Click edit button in QuationInnfo tab
    And User_607 active the status
    And User_607 Save the record
    And User_607 Check Base premium Amount field in list view
    And User_607 Check VAT on Base Premium field in list view
    And User_607 Check Net Base Premium field in list view
    And User_607 Check Quotation Reference Number field in list view
    And User_607 Check Status field in list view
    And User_607 verify the values in List view
    And User_607 To verify the functionality of Export to PDF dropdown
    And User_607 To verify the functionality of Export to Excel dropdown
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
