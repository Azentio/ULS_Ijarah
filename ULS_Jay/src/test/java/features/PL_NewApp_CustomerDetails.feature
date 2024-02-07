Feature: To verify the Personal Loan Application --> New App --> Customer Details

  @AT_PL_NEWAPP_CD_01
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 verify the add button
    #
    And User_610 verify the customer type field
    And User_610 To select Customer type as Individual Type
    And User_610 verify the Cif Id field
    And User_610 verify the Application number field
    And User_610 verify the customer name field
    And User_610 verify the Id type field
    And User_610 verify the Id number field
    #And User_610 verify the mobile number field
    And User_610 verify the Date of birth field
    And User_610 verify the email field
    And User_610 verify the search field
    And User_610 click search button Pl
    And User_610 verify the create new reqest field
    #And User_610 verify the clear field
    Then logout from the ijaraApplication

  @AT_PL_NEWAPP_CD_02
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    And User_610 verify the add button
    And User_610 To select Customer type as Individual Type
    And User_610 verify the field customer type mandatory select
    And User_610 verify the field Cif Id editable numberic text
    And User_610 verify the field Id type select
    And User_610 verify the field Id Number text editable
    And User_610 verify the field Application Number  non mandatory editable text
    Then logout from the ijaraApplication

  @AT_PL_NEWAPP_CD_03
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 verify the add button
    #
    And User_610 verify the customer type field
    And User_610 To select Customer type as Individual Type
    And User_610 verify the Cif Id field
    And User_610 verify the Application number field
    And User_610 verify the customer name field
    And User_610 verify the Id type field
    And User_610 verify the Id number field
    #And User_610 verify the mobile number field
    And User_610 verify the Date of birth field
    And User_610 verify the email field
    And User_610 verify the search field
    And User_610 verify the field customer name editable text
    And User_610 verify the field mobile number non mandatory text editable
    And User_610 verify the field data of birth non mandatory date editable
    And User_610 verify the field email non mandatory editable
    And User_610 click search button Pl
    #And User_610 verify the functionality of create new request button
    Then logout from the ijaraApplication

  @AT_PL_NEWAPP_CD_04
  Scenario: verify the all the field in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click Edit button
    #
    And User_610 verify the Back button field on Customer details screen
    And User_610 verify the Save button field on Customer details screen
    And User_610 verify the Customer Type field on Customer details screen
    And User_610 verify the Applicant Type field on Customer details screen
    And User_610 verify the Salutation field on Customer details screen
    And User_610 verify the First Name field on Customer details screen
    And User_610 verify the Middle Name field on Customer details screen
    And User_610 verify the Last Name field on Customer details screen
    And User_610 verify the Fathers First Name field on Customer details screen
    And User_610 verify the Fathers Middle Name field on Customer details screen
    And User_610 verify the Fathers Last Name field on Customer details screen
    And User_610 verify the Spouse First Name field on Customer details screen
    And User_610 verify the Spouse Middle Name field on Customer details screen
    And User_610 verify the Spouse Last Name field on Customer details screen
    And User_610 verify the No Of Children field on Customer details screen
    And User_610 verify the Spouse Status field on Customer details screen
    And User_610 verify the Data Of Birth field on Customer details screen
    And User_610 verify the Gender field on Customer details screen
    And User_610 verify the Education level field on Customer details screen
    And User_610 verify the Marital Status field on Customer details screen
    And User_610 verify the Nationality field on Customer details screen
    And User_610 verify the Category field on Customer details screen
    And User_610 verify the Religion field on Customer details screen
    And User_610 verify the Residential Status field on Customer details screen
    And User_610 verify the Language field on Customer details screen
    And User_610 verify the No Of Department field on Customer details screen
    #
    And User_610 verify the Mother Maiden Name field on Customer details screen
    And User_610 verify the Types Of Residence field on Customer details screen
    And User_610 verify the Industry Segmentation field on Customer details screen
    And User_610 verify the Is Income Consider field on Customer details screen
    And User_610 verify the Customer Profile field on Customer details screen
    And User_610 verify the Relationship field on Customer details screen
    And User_610 verify the political Exposed field on Customer details screen
    And User_610 verify the Block List field on Customer details screen
    And User_610 verify the Remark field on Customer details screen
    Then logout from the ijaraApplication

  @AT_PL_NEWAPP_CD_05
  Scenario: verify the field and check mandatory editable dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click Edit button
    #
    And User_610 verify the Phone Number field on Customer details screen
    And User_610 verify the Mobile Number Primary field on Customer details screen
    And User_610 verify the Mobile Number Secondary field on Customer details screen
    And User_610 verify the Emali field on Customer details screen
    And User_610 verify the Preferred Contact Method field on Customer details screen
    And User_610 verify the Preferred Time For Contract field on Customer details screen
    And User_610 verify the Customer Type field mandatory editable dropdown
    And User_610 verify the Applicant Type field mandatory editable textbox
    And User_610 verify the KYC status field non-mandatory non-editable textbox
    And User_610 verify the salutation field mandatory editable dropdown
    And User_610 verify the First name field mandatory editable textbox
    Then logout from the ijaraApplication

    
    @AT_PL_NEWAPP_CD_06
  Scenario: verify the field and check mandatory editable dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click Edit button
    #
    And User_610 verify the Middle Name field non mandatory editable textbox
    And User_610 verify the Last Name field mandatory editable textbox
    And User_610 verify the fathers First Name field mandatory editable textbox
    And User_610 verify the fathers Middle Name field non mandatory editable textbox
    And User_610 verify the fathers Last Name field mandatory editable textbox
    And User_610 verify the Spouse first name field non mandatory editable textbox
    Then logout from the ijaraApplication
    
    @AT_PL_NEWAPP_CD_07
  Scenario: verify the field and check mandatory editable dropdown in Customer Details
    Given navigate the IJARA URL
    And login with valid credentials04
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_01
    And User_610 get the test data set id for DS_AT_PL_NEWAPP_CD_001
    And User_610 click the module name
    And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click Edit button
    #
    And User_610 verify the Spouse Middle Name non mandatory editable textbox
    And User_610 verify the Spouse last Name non mandatory editable textbox
    And User_610 verify the No of children field non mandatory editable number
    And User_610 verify the spouse Status field non mandatory editable dropdown
    And User_610 verify the Date of birth field mandatory editable calendar
    And User_610 verify the Gender mandatory editable dropdown
    Then logout from the ijaraApplication
    
    
    