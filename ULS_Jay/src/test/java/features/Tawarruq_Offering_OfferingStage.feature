Feature: tawarruq Offering - offering Stage - Interest Rate Structure

  @AT_TW_OFO_13
  Scenario: verify the fields
    Given navigate the IJARA URL
    And login with valid credentials11
    And User_610 get the test data set id for DS_AT_TW_OFO_13
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Offering Screen
    And User_610 click edit button in Interest Rate Structure
    And User_610 verify the Product field in Interest Rate Structure
    And User_610 verify the Rate Definition field in Interest Rate Structure
    And User_610 verify the Interest Rate field in Interest Rate Structure
    And User_610 verify the Effective Rate field in Interest Rate Structure
    And User_610 verify the Base Rate field in Interest Rate Structure
    And User_610 verify the Spread Rate field in Interest Rate Structure
    And User_610 verify the Cap Rate field in Interest Rate Structure
    And User_610 verify the Floor Rate field in Interest Rate Structure
    And User_610 verify the RBP Adjuster field in Interest Rate Structure
    And User_610 verify the Penalty Rate field in Interest Rate Structure
    And User_610 verify the Penalty Fee field in Interest Rate Structure
    
    Then logout from the ijaraApplication
    
    #installments 
    
    @AT_TW_OFO_14
    Scenario: verify the fields
    Given navigate the IJARA URL
    And login with valid credentials11
    And User_610 get the test data set id for DS_AT_TW_OFO_13
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 click Offering Screen
    And User_610 click edit button in Interest Rate Structure
    And User_610 verify the installment Period field in installments 
    And User_610 verify Installment Amount the field in installments 
		Then logout from the ijaraApplication