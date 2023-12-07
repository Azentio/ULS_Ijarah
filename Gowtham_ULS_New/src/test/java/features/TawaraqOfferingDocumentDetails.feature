Feature: Tawaraq Offering Document Details

  @TW_OF_DOC_01
  Scenario: To verify valid fields
    Given navigate the IJARA URL
    And login with valid credentials5
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawaraq Offering Document Details
    And User_607 Select record after search
    And User_607 click the Document Details section
    And User_607 Click View button in Tawaraq Offering Document Details
    Then User_607 verify the Customer Name field
    Then User_607 verify the Document Name field
    Then User_607 verify the Required Stage field
    Then User_607 verify the Document Staus field
    Then User_607 verify the Mandatory/optional field
    Then User_607 verify the Document Category field
    Then User_607 verify the Upload date field
    Then User_607 verify the Expected receipt date Stage field
    Then User_607 verify the Deferral Stage field
    Then User_607 verify the Def Approved By Stage field
    Then User_607 verify the Change In Nature Approved By field
    Then User_607 verify the Document Form field
    Then User_607 verify the Document Quality field
    Then User_607 verify the Document Reference Number field
    Then User_607 verify the Document Received By field
    Then User_607 verify the Location Where Received field
    Then User_607 verify the Rack No field
    Then User_607 verify the  Shelf No field
    Then User_607 verify the Box No field
    Then User_607 verify the Date Of Expiry field
    Then User_607 verify the Lodgement Amount field
    Then User_607 verify the Remarks field
    Then logout from the ULSApplication
    
    @TW_OF_DOC_02
    Scenario: To verify valid fields
    Given navigate the IJARA URL
    And login with valid credentials5
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawaraq Offering Document Details
    And User_607 Select record after search
    And User_607 click the Document Details section
    And User_607 Click View button in Tawaraq Offering Document Details
    And User_607 To verify the field Customer Name should be non-mandatory
    And User_607 To verify the field Document Name should be mandatory
    And User_607 To verify the field Required at stage should be non-mandatory
    And User_607 To verify the field Document Status should be mandatory
    And User_607 To verify the field Mandatory/Optional should be mandatory
    Then logout from the ULSApplication
    
    @TW_OF_DOC_03
    Scenario: To verify valid fields
    Given navigate the IJARA URL
    And login with valid credentials5
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawaraq Offering Document Details
    And User_607 Select record after search
    And User_607 click the Document Details section
    And User_607 Click View button in Tawaraq Offering Document Details
    And User_607 To verify the field documentCategory should be mandatory
    And User_607 To verify the field upload Date should be non mandatory
    And User_607 To verify the field expected Receipt Date should be non mandatory
    And User_607 To verify the field deferral Stage should be non mandatory
    And User_607 To verify the field def Approved By should be non mandatory
    Then logout from the ULSApplication
    
    @TW_OF_DOC_04
    Scenario: To verify valid fields
    Given navigate the IJARA URL
    And login with valid credentials5
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawaraq Offering Document Details
    And User_607 Select record after search
    And User_607 click the Document Details section
    And User_607 Click View button in Tawaraq Offering Document Details
    And User_607 To verify the field change In Nature Approved By should be non mandatory
    And User_607 To verify the field document Form By should be non mandatory
    And User_607 To verify the field document Quality should be mandatory
    And User_607 To verify the field document Referrence Number should be non mandatory
    And User_607 To verify the field document Received By should be non mandatory
    Then logout from the ULSApplication
    
     @TW_OF_DOC_05
    Scenario: To verify valid fields
    Given navigate the IJARA URL
    And login with valid credentials5
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search the Ref Id under inbox Tawaraq Offering Document Details
    And User_607 Select record after search
    And User_607 click the Document Details section
    And User_607 Click View button in Tawaraq Offering Document Details
    And User_607 To verify the field Location Where Received should be non mandatory
    And User_607 To verify the field Rack should be non mandatory
    And User_607 To verify the field Shelf No should be non mandatory
    And User_607 To verify the field Box No should be non mandatory
    And User_607 To verify the field Date Of Expiry should be non mandatory
    And User_607 To verify the field Lodgement Amount should be non mandatory
    And User_607 To verify the Remark should be mandatory
    Then logout from the ULSApplication
    
    
    
    
    
