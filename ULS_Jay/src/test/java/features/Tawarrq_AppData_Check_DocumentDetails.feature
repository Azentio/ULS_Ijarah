Feature: Tawarrq AppData Check Document Details 

  @AT_TW_ADC_DOC_001
  Scenario: To verify that all fields are present in Document Details
    Given navigate the IJARA URL
    And login with valid credentials16
    And User_610 get the test data set id for DS_AT_TW_ADC_DOC_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And Navigate to Document details section
    And click on Eye icon of exsting record in document details
    And Validate the Customer name field is displayed in document details
    And Validate the Document name field is displayed in document details
    And Validate the Required at stage field is displayed in document details
    And Validate the Document status field is displayed in document details
    And Validate the Mandatory optional field is displayed in document details
    And Validate the Document category field is displayed in document details
    And Validate the Upload date field is displayed in document details
    And Validate the Expected receipt date field is displayed in document details
    And Validate the Deferred stage field is displayed in document details
    And Validate the Def approved by field is displayed in document details
    And Validate the Change in nature approved by field is displayed in document details
    And Validate the Document form field is displayed in document details
    And Validate the Document quality field is displayed in document details
    And Validate the Document reference number field is displayed in document details
    And Validate the Document received by field is displayed in document details
    And Validate the Location field is displayed in document details
    And Validate the Rack No field is displayed in document details
    And Validate the Shelf No field is displayed in document details
    And Validate the Box No is displayed in document details
    And Validate the Date of Expiry field is displayed in document details
    And Validate the Lodgement amount field is displayed in document details
    And Validate the Remarks field is displayed in document details
    And Validate Back button functionality in document details
		Then logout from the ijaraApplication
		
   @AT_TW_ADC_DOC_002
  Scenario: To verify that all fields are present in Document Details view list
    #This test case also cover the functionality of  AT_TW_ADC_DOC_003
    Given navigate the IJARA URL
    And login with valid credentials16
    And User_610 get the test data set id for DS_AT_TW_ADC_DOC_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And Navigate to Document details section
    And Validate Document name field is present in Document details view list
    And Validate Required at stage field is present in Document details view list
    And Validate Document Status field is present in Document details view list
    And Validate MandatoryOptional field is present in Document details view list
    And Validate Document Category field is present in Document details view list
    And Validate DMS Upload status field is present in Document details view list
    And Click on Search icon in Document details
    And Search the murabha document details value with valid data
    And Click on Search icon in Document details
    And Search the murabha document details value with Invalid data
		Then logout from the ijaraApplication