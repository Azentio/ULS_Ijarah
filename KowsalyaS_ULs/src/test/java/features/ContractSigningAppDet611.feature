Feature: To test the Application details under Contarct signing

  #@ADC_01_01
  @AT_ADC_001
  Scenario: To verify the availability of Application Details tab  under Contract signing stage
    Given navigate the IJARA URL
    And login with valid credentials
    And User_611 Get the dataSetId for DS_AT_ADC_001
    And User_611 Clicks the modue name in Kuls application
    And User_611 Clicks the Los in Kuls application
    And User_611 Clicks the Mail box in Kuls application
    And User_611 Clicks the search box in Kuls application
    And User_611 Search the duplicate in Kuls application
    And User_611 Clicks the Entitle button in Kuls application
    And User_611 Validate the Back button in Application details under contract signing
    And User_611 Validate the Save button in Application details under contract signing
    And User_611 Validate the Approved button in Application details under contract signing
    And User_611 Validate the Reject button in Application details under contract signing
    And User_611 Validate the return button in Application details under contract signing
    And User_611 Validate the view summary button in Application details under contract signing
    #@ADC_01_02
    And User_611 Validate the product value is inbuiltly entered
    And User_611 Validate the sub product value is inbuiltly entered
    And User_611 Validate the Total finance amount requested value is inbuiltly entered
    And User_611 Validate the declared net monthly income value is inbuiltlt entered
    And User_611 Validate the declared current obligations value is inbuiltly entered
    And User_611 Validate the Sourcing channel value is inbuiltly entered
    And User_611 Validate the Business central code value is inbuiltly entered
    And User_611 Validate the servicing type value is inbuiltly entered
    And User_611 Validate the Region value is inbuiltly entered
    And User_611 Validate the Servicing Branch value is inbuiltly entered
    And User_611 Validate the closing and servicing staff value is inbuiltly entered
    #@ADC_01_03
    And User_611 Validate the product label
    And User_611 Valiadte the sub product label
    And User_611 Validate the Total finance amount requested label
    And User_611 Validate the Declared net  monthly income label
    And User_611 Validate the Declared current obligations label
    And User_611 Validate the Special promotional /campaign label
    And User_611 Validate the sourcing channel label
    And User_611 Validate the Bussiness center code label
    And User_611 Validate the servicing type label
    And User_611 Validate the Region label
    And User_611 Validate the Servicing branch label
    And User_611 Validate the Spoke location label
    And User_611 Validate the Closing staff or servicing staff or RM label
    #@ADC_01_04
    And User_611 Validate the Sourcing Type label
    And User_611 Validate the Sourcing Office label
    And User_611 Validate the Sourcing Entity label
    And User_611 Validate the Sourcing Staff label
    And User_611 Validate the Reference Type label
    And User_611 Validate the Reference Entity label
    And User_611 Validate the Reference Code label
    #@ADC_01_05
    And User_611 Click the save button after validating all the value
    And User_611 Validate the confirmation message while saving the data
    And User_611 Validate the close button for confirmation message while saving the data
    And User_611 Validate the product dropdown value is editable
    And User_611 Validate the Total finance amount requested is editable
    And User_611 Validate the Declared net  monthly income is editable
    And User_611 Validate the Declared current obligations is editable
    And User_611 Validate the Special promotional /campaign is editable
    And User_611 Validate the sourcing channel is editable
    And User_611 Validate the Bussiness center code is editable
    #And User_611 Validate the servicing type is editable
    And User_611 Validate the Region is editable
    And User_611 Validate the Servicing branch is editable
    And User_611 Validate the Closing staff or servicing staff or RM is editable
    
    
    And User_611 Validate the Sourcing Type is editable
    And User_611 Validate the Sourcing Office is editable
    And User_611 Validate the Sourcing Entity is editable
    And User_611 Validate the Sourcing Staff is editable
    And User_611 Validate the Reference Typeis editable
    And User_611 Validate the Reference Entity is editable
    And User_611 Validate the Reference Code  is editable
    And User_611 Click the save button after validating all the value
    And User_611 Validate the confirmation message while saving the data
    And User_611 Validate the close button for confirmation message while saving the data
    
    And User_611 Validate the Sourcing type is mandatory
    And User_611 Validate the Sourcing office is mandatory
    And User_611 Validate the Sourcing entity is mandatory
    And User_611 Validate the Sourcing staff is mandatory
    And User_611 Validate the Reference type is non mandatory
    And User_611 Validate the Reference entity is non mandatory
    And User_611 Validate the Reference code is non mandatory
    
 
