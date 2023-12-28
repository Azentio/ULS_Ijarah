Feature: AutoLoan AppData Entry documents details

  @AT_Al_DOC_01
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials15
    And User_610 get the test data set id for DS_AT_Al_CD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Documents Details screen in Autoloan
    And User_610 Click Add button under documents details AL
    #
    And User_610 verify the Customer Name field in Al
    And User_610 verify the Document Name field in Al
    And User_610 verify the Required At Stage field in Al
    And User_610 verify the Document Status field in Al
    And User_610 verify the Mandatory Optional field in Al
    And User_610 verify the Document Category field in Al
    And User_610 verify the Upload Date field in Al
    And User_610 verify the Expected Date Of Receipt field in Al
    And User_610 verify the Deferral Stage field in Al
    And User_610 verify the Def Approved By field in Al
    And User_610 verify the Change In Nature Approved By field in Al
    And User_610 verify the Document From field in Al
    And User_610 verify the Document Quality field in Al
    And User_610 verify the Document Reference Number field in Al
    And User_610 verify the Document Approved By field in Al
    And User_610 verify the Document Details Location Where Received field in Al
    And User_610 verify the Rack No field in Al
    And User_610 verify the Shelf No field in Al
    And User_610 verify the Box No field in Al
    And User_610 verify the Date Of Expiry field in Al
    And User_610 verify the Lodgement Amount field in Al
    And User_610 verify the Remark field in Al
    Then logout from the ijaraApplication

  @AT_Al_DOC_02
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials15
    And User_610 get the test data set id for DS_AT_Al_CD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Documents Details screen in Autoloan
    And User_610 Click Add button under documents details AL
    #
    #And User_610 select document name in documents details screen
    #And User_610 select document status in documents details screen
    #And User_610 select Mandatory optional in documents details screen
    #And User_610 select document category in documents details screen
    And User_610 select document quality in documents details screen
    And User_610 select remark in documents details screen
    And User_610 click save and verify in documents details screen
    Then logout from the ijaraApplication
