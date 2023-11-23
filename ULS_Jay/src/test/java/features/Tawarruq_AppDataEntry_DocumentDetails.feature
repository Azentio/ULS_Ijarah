Feature: Tawarruq App Data Entry Document Details 

 @AT_TW_AD_DOC_06
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
   
    
   @AT_TW_AD_DOC_07
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
   
   @AT_TW_AD_DOC_08
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
   
   
   @AT_TW_AD_DOC_09
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