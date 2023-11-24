Feature: new Application Customer Reference

  @AT_IJ_NewApp_CR_01
  Scenario: Validate the Fields in Customer Reference
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_NEWAPP_CR_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Addition Customer Info Under New Application
    And User_610 click edit button Info Under New Application
    And User_610 click Add button Info in Reference List View Under New Application
    #And User_610 verify the Add and Save button field in Reference List View Under New Application 
    And User_610 verify the Relationship Type field in Reference List View Under New Application 
    And User_610 verify the Salutation field in Reference List View Under New Application 
    And User_610 verify the First Name field in Reference List View Under New Application 
    And User_610 verify the Middle Name field in Reference List View Under New Application 
    And User_610 verify the Last Name field in Reference List View Under New Application 
    And User_610 verify the Customer Full Name field in Reference List View Under New Application 
    And User_610 verify the Identification Type field in Reference List View Under New Application 
    And User_610 verify the Identification Number field in Reference List View Under New Application 
    And User_610 verify the Residence Address field in Reference List View Under New Application 
    And User_610 verify the Office Address field in Reference List View Under New Application 
    And User_610 verify the Contact Number field in Reference List View Under New Application 
    And User_610 verify the Office Phone Number field in Reference List View Under New Application 
    And User_610 verify the Primary Mobile Number Number field in Reference List View Under New Application 
    And User_610 verify the Alternative Mobile field in Reference List View Under New Application 
    And User_610 verify the Email ID field in Reference List View Under New Application 
    And User_610 verify the No Of Year Known field in Reference List View Under New Application 
    And User_610 verify the Cif NUmber field in Reference List View Under New Application 
    Then logout from the ijaraApplication
    
    
    @AT_IJ_NewApp_CR_02
  Scenario: Validate the Fields in Customer Reference
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_NEWAPP_CR_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 click Addition Customer Info Under New Application
    And User_610 click edit button Info Under New Application
    And User_610 click Add button Info in Reference List View Under New Application
    And User_610 verify the any mandatory field blank and save system should not allow user to save the record
    #And User_610 verify enter numeric value in character field system should not allow user to save the record
    #And User_610 verfiy enter character value in numeric field system should not allow user to save the record
    And User_610 verify enters only special characters value in any field system should not allow user to save the record
    Then logout from the ijaraApplication
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
