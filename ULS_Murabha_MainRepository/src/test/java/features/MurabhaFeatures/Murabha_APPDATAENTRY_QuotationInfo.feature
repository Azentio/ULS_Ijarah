Feature: Murabha_Appdataentry_QuotationInfo

  @AT_MU_QIA_001
  Scenario: To verify user is able to add new Quotation Info  record in the system by entering valid data
    Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Select record after search
    Then User_607 click quotation info tab
    And User_607 click the Add button under Quotation Info screen
    Then User_607 verify the insurance company field
    And User_607 verify the base premium field
    And User_607 verify the VAT on Base Premium field
    And User_607 verify the Net Base Premium field
    Then User_607 verify the Total Discount field
    And User_607 verify the Expiry Date field
    Then User_607 verify the Quotation Reference Number field
    And User_607 click the saveButton under insurance info screen
    #Then User_607 validate the success message popup with close button
    Then User_607 click back button

  @AT_MU_QIA_002
  Scenario: To verify all the fields are mandatory and editable in quotation info tab
  Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And User_607 Select record after search
    Then User_607 click quotation info tab
    And User_607 click the Add button under Quotation Info screen
    And User_607 verify insurance company field is mandatory
    Then User_607 verify insurance company field is editable
    And User_607 verify the base premium field is mandatory
    Then User_607 verify the base premium field is editable
    And User_607 verify the VAT on Base Premium field is mandatory
    And User_607 verify the VAT on Base Premium is editable
    Then User_607 verify the VAT on Base Premium field only accept the numeric values
    And User_607 verify the Net Base Premium field is mandatory
    Then User_607 verify the Net Base Premium field is editable
    And User_607 verify the Net Base Premium field only accept the numeric values
    Then User_607 verify the Total Discount field is mandatory
    And User_607 verify the Total Discount field is editable
    And User_607 verify Total Discount field is only accept the numeric values
    Then User_607 verify the Expiry Date field is mandatory
    And User_607 verify the Expiry Date field is editable
    And User_607 verify the Expiry Date field should be in date format
    Then User_607 verify the Quotation Reference Number field is mandatory
    And User_607 verify the Quotation Reference Number field is editable
    #And User_607 verify Quotation Reference Number field is only accept the numeric values
    Then User_607 verify Quotation Reference Number field should be in textbox
    Then User_607 click back button
    And User_607 click the Add button under Quotation Info screen

  @AT_MU_QIA_003
  Scenario: To verify user is able to add new Quotation Info record in the system by entering invalid data
  Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And User_607 Select record after search
    Then User_607 click quotation info tab
    And User_607 click the Add button under Quotation Info screen
    And User_607 click base premium amount field
    And User_607 Save the record
    And User_607 Check Please Fill Details Popup showing or not
    And User_607 click VAt on base premium amount field
    And User_607 enter the negative value in VAt on base premium amount field
    And User_607 click the saveButton under insurance info screen
    #Then User_607 verify the invalid data entry popup
    And User_607 click quotation reference no field
    And User_607 enter the character values in quotation reference field
    And User_607 click the saveButton under insurance info screen
    #Then User_607 validate the invalid data entry popup
    And User_607 click quotation reference no field
    And User_607 enter the special character value in quotation reference field
    And User_607 click the saveButton under insurance info screen

  
  @AT_MU_QIA_004
  Scenario: To verify user is able to modify Quotation Info record in the system
   Given navigate the MURABHA URL
    And login with valid credentials-Murabaha App Data Entry
    And User_607 Update testdata from AT_MU_INS_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Enter the clientname under searchButton for Appdata entry QuationInfo
    And User_607 Update testdata from AT_MU_QIA_002
    And User_607 Select record after search
    Then User_607 click quotation info tab
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
    Then User_607 click back button
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
