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
    And User_610 select document name in documents details screen
    And User_610 select document status in documents details screen
    And User_610 select Mandatory optional in documents details screen
    And User_610 select document category in documents details screen
    And User_610 select document quality in documents details screen
    And User_610 select remark in documents details screen
    And User_610 click save and verify in documents details screen
    Then logout from the ijaraApplication

    @AT_Al_DOC_03
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
    And User_610 verify the customer name field mandatory dropdown al
    And User_610 verify the  document name field mandatory dropdown al
    And User_610 verify the required at stage field mandatory al
    And User_610 verify the document status field mandatory editable dropdown al
    And User_610 verify the mandatory optional field mandatory editable dropdown al
    Then logout from the ijaraApplication
    
    @AT_Al_DOC_04
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
    And User_610 verify the documents quality field mandatory al
    And User_610 verify the  deferred stage field non mandatory select al
    And User_610 verify the location where received field non mandatory select al
    And User_610 verify the rack number field non mandatory textbox al
    And User_610 verify the shelf number field non mandatory textbox al
    Then logout from the ijaraApplication
    
    @AT_Al_DOC_05
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
    And User_610 verify the  box number field non mandatory text al
    And User_610 verify the document upload date field non mandatory date al
    And User_610 verify the document category field mandatory select al
    And User_610 verify the document form field non mandatory select al
    Then logout from the ijaraApplication
    
    @AT_Al_DOC_06
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
    And User_610 verify the  expected date of receipt non mandatory date al
    And User_610 verify the defferral approved by field non mandatory select al
    And User_610 verify the change in natural of approved by field non mandatory select al
    And User_610 verify the document reference number field non mandatory text al
    And User_610 verify the  document received by field non mandatory select al
    And User_610 verify the remark date field mandatory text al
    Then logout from the ijaraApplication
    
    @AT_Al_DOC_07
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
    #And User_610 verify the blank field which is mandatory and should not allow user to save the record
    And User_610 verify the user enter numeric value in character field should not allow user to save the record
    #And User_610 verify the user enter character value in numeric field should not allow user to save the record
    Then logout from the ijaraApplication
    
    @AT_Al_DOC_08
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
    And User_610 click edit button under documents details
    #And User_610 Click Add button under documents details AL
    #
    And User_610 verify the system should get open with already filled data
    And User_610 verify the System should allow user to modify the record
    #And User_610  verify the to do modification and same record should get saved
    And User_610 verify the any mandatory field blank and save system should not allow user to save the record al
    #And User_610 verify the  system should not allow user to do a modification with invalid data                      NA
    #And User_610 verify the save button and back button
    Then logout from the ijaraApplication
    