Feature: AutoLoan AppData Entry Customer Details

  @AT_Al_CD_01
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
    #
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click edit button under additional customer info
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

  @AT_Al_CD_02
  Scenario: verify the field under Contact details
    Given navigate the IJARA URL
    And login with valid credentials15
    And User_610 get the test data set id for DS_AT_Al_CD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click edit button under additional customer info
    And User_610 verify the Phone Number field on Customer details screen
    And User_610 verify the Mobile Number Primary field on Customer details screen
    And User_610 verify the Mobile Number Secondary field on Customer details screen
    And User_610 verify the Emali field on Customer details screen
    And User_610 verify the Preferred Contact Method field on Customer details screen
    And User_610 verify the Preferred Time For Contract field on Customer details screen
    Then logout from the ijaraApplication
    
    @AT_Al_CD_03
  Scenario: verify the fields mandatory editable select
    Given navigate the IJARA URL
    And login with valid credentials15
    And User_610 get the test data set id for DS_AT_Al_CD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module name
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click edit button under additional customer info
    And User_610 verify the Customer Type field mandatory editable dropdown
    #And User_610 verify the Applicant Type field mandatory editable textbox
    #And User_610 verify the KYC status field non-mandatory non-editable textbox
    #And User_610 verify the salutation field mandatory editable dropdown
    #And User_610 verify the First name field mandatory editable textbox
    Then logout from the ijaraApplication
