Feature: Morabha App Data Entery 
@AT_MU_DOC_01
Scenario: verify fields 
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 

#		And User_610 validate customer name field enabled or not under document details 
    #And User_610 validate document name field enabled or not under document details 
    And User_610 verify the Required At Stage field is displayed in document details screen
    And User_610 verify the Documents Status field is displayed in document details screen
    And User_610 verify the Mandatory Optional field is displayed in document details screen
    And User_610 verify the Document categeroy field is displayed in document details screen
    And User_610 verify the Defferral Stage field is displayed in document details screen
    And User_610 verify the Def Approved By field is displayed in document details screen
    And User_610 verify the Change In Natural By field is displayed in document details screen
    And User_610 verify the Documents Form field is displayed in document details screen
    
    And User_610 verify the Documents Quality field is displayed in document details screen
    And User_610 verify the Documents Recevied By field is displayed in document details screen
    And User_610 verify the Upload BY field is displayed in document details screen
    And User_610 verify the Expected Recepited Date field is displayed in document details screen
    And User_610 verify the Data of Expiry field is displayed in document details screen
    And User_610 verify the Documents Reference Number field is displayed in document details screen
    And User_610 verify the Rack No field is displayed in document details screen
    And User_610 verify the Shall No field is displayed in document details screen
    And User_610 verify the Box No field is displayed in document details screen
    
    @AT_MU_DOC_02
Scenario: verify fields 
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 

		And User_610 select the optional in Mandatory Optional field
		And User_610 select the Pan Card in Document Name
    And User_610 select the Not Received in Documents Status
    And User_610 select the KYC Document in Document Categery
    And User_610 select the optional in Document Quality
    And User_610 enter the value in Remarks
    And User_610 save button and verify the success message
    
    
     @AT_MU_DOC_03
Scenario: verify fields should be mandatory editable
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 

		And User_610 verify the Documents Name field should be mandatory
		And User_610 verify the status field should be mandator editable dropdown
    And User_610 verify the quality field should be mandatory editable drpodown
    And User_610 verify the date field should be non mandatory and date
    
     @AT_MU_DOC_04
Scenario: verify fields should be non mandatory TextBox
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 
    
    And User_610 verify the Location field should non be mandatory Select
		And User_610 verify the Rack No field should be non mandator TextBox
    And User_610 verify the Self No field should be non mandatory TextBox
    And User_610 verify the Box No field should be non mandatory TextBox
    
    @AT_MU_DOC_05
Scenario: verify fields should be non mandatory TextBox
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 
    
    And User_610 verify the Documents Category field should be mandatory Select
		And User_610 verify the Document From field should be non mandator select
    And User_610 verify the Expected date Of Receipt field should be non mandatory date
    And User_610 verify the Waiver Defferral Approved By field should be non mandatory TextBox
    And User_610 verify the Change in Nature of Document Approved By field should be non mandatory TextBox
   
   @AT_MU_DOC_06
Scenario: verify fields should be non mandatory TextBox
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    #second eidt btn
    And User_610 click edit button under documents details 
    #
    And User_610 verify the Documents Reference Number field should be non mandatory Text
		And User_610 verify the Remarks field should be mandator Text 
		And User_610 verify the upload document
   
    
   @AT_MU_DOC_07
Scenario: verify Any mandatory field blank and save
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click add button under document details 
    #
    And User_610 verify the any mandatory field blank and save system should not allow user to save the record
    #And User_610 verify the enter numeric value in character field 
    #And User_610 verify the enter character value in numeric field
   
   @AT_MU_DOC_08
Scenario: verify Any mandatory field blank and save
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
    And User_610 click edit button under documents details 
    #
    And User_610 verify the Document Name Screen should get open with already filled data
    And User_610 verify the Document Category Screen should get open with already filled data
    And User_610 verify the any mandatory field blank and save system should not allow user to save the record
    #edit value nd save
    And User_610 select the Not Received in Documents Status
    And User_610 click save button
   
   
   @AT_MU_DOC_09
Scenario: verify Any mandatory field blank and save
    Given navigate the IJARA URL
    And login with valid credentials05
		And User_610 get the test data set id for DS_AT_MU_DOC_01
		And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click document details in murabha
   #And User_610 click edit button under documents details 
    #
    #And User_610 veriy the Add Back and Search button or not editable
    And User_610 verify the Matching and Mismatching data of Search 
    And User_610 verify the functionality of Add button
    And User_610 verify the functionality of back button
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
    
