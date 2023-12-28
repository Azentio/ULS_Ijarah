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
    And User_610 verify the Applicant Type field mandatory editable textbox
    And User_610 verify the KYC status field non-mandatory non-editable textbox
    And User_610 verify the salutation field mandatory editable dropdown
    And User_610 verify the First name field mandatory editable textbox
    Then logout from the ijaraApplication

    
    @AT_Al_CD_04
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
    And User_610 verify the Middle Name field non mandatory editable textbox
    And User_610 verify the Last Name field mandatory editable textbox
    And User_610 verify the fathers First Name field mandatory editable textbox
    And User_610 verify the fathers Middle Name field non mandatory editable textbox
    And User_610 verify the fathers Last Name field mandatory editable textbox
    Then logout from the ijaraApplication
    
    @AT_Al_CD_05
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
    And User_610 verify the Spouse first name field non mandatory editable textbox
    And User_610 verify the Spouse Middle Name non mandatory editable textbox
    And User_610 verify the Spouse last Name non mandatory editable textbox
    And User_610 verify the No of children field non mandatory editable number
    And User_610 verify the spouse Status field non mandatory editable dropdown
    Then logout from the ijaraApplication
    
    @AT_Al_CD_06
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
    And User_610 verify the Date of birth field mandatory editable calendar
    And User_610 verify the Gender mandatory editable dropdown
    And User_610 verify the Education level mandatory editable dropdown
    And User_610 verify the marital Status field mandatory editable dropdown
    And User_610 verify the Nationality field mandatory editable dropdown
    Then logout from the ijaraApplication
    
     @AT_Al_CD_07
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
    And User_610 verify the Category field mandatory editable dropdown
    And User_610 verify the Religion mandatory editable dropdown
    And User_610 verify the Residential Status mandatory editable dropdown
    And User_610 verify the Language field mandatory editable dropdown
    And User_610 verify the No Of Dependents field mandatory editable textbox
    Then logout from the ijaraApplication
    
    
    @AT_Al_CD_08
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
    And User_610 verify the mothers maiden name field mandatory editable textbox
    And User_610 verify the type of residence mandatory editable dropdown
    And User_610 verify the industry segmentation mandatory editable dropdown
    And User_610 verify the is income considered field non mandatory editable dropdown
    And User_610 verify the customer profile field non mandatory editable dropdown
    Then logout from the ijaraApplication
    
     @AT_Al_CD_09
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
    And User_610 verify the Relationship field mandatory editable dropdown
    And User_610 verify the Existing bank relationship field non mandatory editable toggle button
    And User_610 verify the Blacklisted field non mandatory editable toggle button
    And User_610 verify the politically exposed field non mandatory editable dropdown
    And User_610 verify the Remarks field non mandatory editable textbox
    Then logout from the ijaraApplication
    
      #bug  format issue number to text
    @AT_Al_CD_10          
  Scenario: verify the fields number editable
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
    #And User_610 verify the phone number field number editable
    #And User_610 verify the Mobile number primary field number editable
    #And User_610 verify the mobile number secondary field number editable
    #And User_610 verify the email field email format
    #And User_610 verify the prefered contact method field number editable 
    #And User_610 verify the prefered time for contact field HH MM format editable 
    Then logout from the ijaraApplication
    
     @AT_Al_CD_11           
  Scenario: verify the fields mandatory editable select
    Given navigate the IJARA URL
    And login with valid credentials15
    And User_610 get the test data set id for DS_AT_Al_CD_01
    #And User_610 click the module name
    #And User_610 select the LOS in module namez
    And User_610 click Inbox
    And User_610 click search button
    And User_610 enter the value in search button
    And User_610 click edit button under inbox screen
    #
    And User_610 Click Customer Details screen in Autoloan
    And User_610 click edit button under additional customer info
    And User_610 verify the add button Autoloan
    And User_610 verify the back button Autoloan
    And User_610 verify the any mandatory field blank and save system should not allow user to save the record Autoloan
    And User_610 verfiy enter negative value system should not allow user to save the record Autoloan
    And User_610 verfiy enter character value in numeric field system should not allow user to save the record Autoloan
    And User_610 verify enters only special characters value in any field system should not allow user to save the record Autoloan
    