Feature: Murabha App Data Entry Customer details

 @AT_MU_ADE_CD_01
  Scenario: To verify that all fields are present in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Back button field on Customer details screen
    And User_610 verify the Save button field on Customer details screen
    And User_610 verify the Customer Type field on Customer details screen
    And User_610 verify the Applicant Type field on Customer details screen
    And User_610 verify the Salutation field on Customer details screen
    And User_610 verify the First Name field on Customer details screen
    And User_610 verify the Middle Name field on Customer details screen
    And User_610 verify the Last Name field on Customer details screen
    And User_610 verify the Data Of Birth field on Customer details screen
    And User_610 verify the Gender field on Customer details screen
    And User_610 verify the Education level field on Customer details screen
    And User_610 verify the Marital Status field on Customer details screen
    And User_610 verify the Nationality field on Customer details screen
    And User_610 verify the Residential Status field on Customer details screen
    And User_610 verify the Language field on Customer details screen
    And User_610 verify the No Of Department field on Customer details screen
    And User_610 verify the Industry Segmentation field on Customer details screen
    And User_610 verify the Block List field on Customer details screen
    And User_610 verify the Remark field on Customer details screen
    Then logout from the ijaraApplication
    
    @AT_MU_ADE_CD_02
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Customer Type field mandatory editable dropdown
    And User_610 verify the Applicant Type field mandatory editable textbox
    And User_610 verify the salutation field mandatory editable dropdown
    And User_610 verify the First name field mandatory editable textbox
    And User_610 verify the Middle Name field non mandatory editable textbox
    Then logout from the ijaraApplication
    
    @AT_MU_ADE_CD_03
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info  
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Last Name field mandatory editable textbox  
    And User_610 verify the First Name Arabic field mandatory editable textbox
    And User_610 verify the middle Name Arabic field non mandatory editable textbox
    And User_610 verify the Last Name Arabic field mandatory editable textbox
    And User_610 verify the Family Name Arabic field non mandatory editable textbox
    Then logout from the ijaraApplication
         
         
    @AT_MU_ADE_CD_04
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info 
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Family Name field non mandatory editable text
    #customer full name arabic    NA
    And User_610 verify the Date of birth field mandatory editable calendar
    And User_610 verify the Age field non mandatory non editable text
    And User_610 verify the Gender mandatory editable dropdown  
    Then logout from the ijaraApplication   
    
    @AT_MU_ADE_CD_05
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info 
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Education level mandatory editable dropdown
    And User_610 verify the marital Status field mandatory editable dropdown
    And User_610 verify the Nationality field mandatory editable dropdown
    And User_610 verify the Residential Status mandatory editable dropdown
    And User_610 verify the Language field mandatory editable dropdown
    Then logout from the ijaraApplication  
    
    @AT_MU_ADE_CD_06
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info 
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the No Of Dependents field mandatory editable textbox
    And User_610 verify the industry segmentation mandatory editable dropdown
    And User_610 verify the Blacklisted field non mandatory editable toggle button
    And User_610 verify the Remarks field non mandatory editable textbox
    #phone number NA
    Then logout from the ijaraApplication
    
    @AT_MU_ADE_CD_07
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info 
    And User_610 verify the Add button should allow create new record 
    #
    #
    #
    
    Then logout from the ijaraApplication
    
     @AT_MU_ADE_CD_08
  Scenario: To verify  fields Mandatory Editable Dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials06
    And User_610 get the test data set id for DS_AT_MU_ADE_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    #And User_610 click edit button under additional customer info 
    # NA And User_610 verify the Prefered Time For Contact field HH MM format Editable  
    And User_610 verify the Add button should allow create new record 
    And User_610 verify the Back button should navigate to previous screen
    And User_610 verify the impact when user keep any mandatory field blank 
    #And User_610 verify the  impact when user enters negative numeric value
    #And User_610 verify the  impact when user enters character in numeric value
    #And User_610 verify the impact when user enters only special characters value
    Then logout from the ijaraApplication
    
    
    