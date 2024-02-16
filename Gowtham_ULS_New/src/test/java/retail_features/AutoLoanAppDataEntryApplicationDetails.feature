Feature: Application_Detail_Customer_Search

  @AT_RD_ADE_AD_01
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Save button Field in AutoLoan Application details
    And User_607 Check able to enter characters value in numeric field
    And User_607 Check able to enter special characters in any field
    And User_607 Check Product Field should be editable
    And User_607 Check Sub Product Field should be editable
    And User_607 Check Negative Total Finance Amount Requested should be editable
    And User_607 Check Declared Net Monthly Income should be editable
    And User_607 Check Declared Current Obligations should be editable
    And User_607 Check Special Promotion Campaign should be editable
    And User_607 Check Sourcing Channel should be editable
    And User_607 Check Business Center Code should be editable
    And User_607 Check Servicing Type should be editable
    And User_607 Check Region should be editable
    And User_607 Check Servicing Branch should be editable
    And User_607 Check Spoke Location should be editable
    And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
    And User_607 Check Sourcing Type should be editable
    And User_607 Check Sourcing Office should be editable
    And User_607 Check Sourcing Entity should be editable
    And User_607 Check Sourcing Staff should be editable
    And User_607 Check Reference Type should be editable
    And User_607 Check Reference Entity should be editable
    And User_607 Check Reference Code should be editable
    And User_607 Save the record in Application Details screen
    And User_607 Click okay in the confirm save popup
    And User_607 Click Add button in application details

  @AT_RD_ADE_AD_02
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Product field should be mandatory
    And User_607 Check Product Field should be editable
    And User_607 Check Sub Product field should be mandatory
    And User_607 Check Sub Product Field should be editable
    And User_607 Check Total Finance Amount Requested should be mandatory
    And User_607 Check Total Finance Amount Requested should be editable
    And User_607 Check Declared Net Monthly Income should be mandatory
    And User_607 Check Declared Net Monthly Income should be editable
    And User_607 Check Declared Current Obligations should be non mandatory
    And User_607 Check Declared Current Obligations should be editable
    And logout from the ULSApplication

  @AT_RD_ADE_AD_03
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Special Promotion Campaign should be non mandatory
    And User_607 Check Special Promotion Campaign should be editable
    And User_607 Check Sourcing Channel should be mandatory
    And User_607 Check Sourcing Channel should be editable
    And User_607 Check Business Center Code should be mandatory
    And User_607 Check Business Center Code should be editable
    And User_607 Check Servicing Type should be mandatory
    And User_607 Check Servicing Type should be editable
    And User_607 Check Region should be mandatory
    And User_607 Check Region should be editable
    And User_607 Check Servicing Branch should be mandatory
    And User_607 Check Servicing Branch should be editable
    And logout from the ULSApplication

  @AT_RD_ADE_AD_04
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Servicing Branch should be editable
    And User_607 Check Spoke Location should be editable
    And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
    And User_607 Check Topup Type should be Non mandatory
    And User_607 Check Topup Type should be editable
    And User_607 Check Topup Application No should be Non mandatory
    And User_607 Check Topup Application No should be editable
    And logout from the ULSApplication

  @AT_RD_ADE_AD_05
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Sourcing Type should be mandatory
    And User_607 Check Sourcing Type should be editable
    And User_607 Check Sourcing Office should be mandatory in application Details
    And User_607 Check Sourcing Office should be editable
    And User_607 Check Sourcing Entity should be mandatory
    And User_607 Check Sourcing Entity should be editable
    And User_607 Check Sourcing Staff should be mandatory
    And User_607 Check Sourcing Staff should be editable
    And logout from the ULSApplication

  @AT_RD_ADE_AD_06
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And User_607 Check Reference Type should be non mandatory
    And User_607 Check Reference Type should be editable
    And User_607 Check Reference Entity should be non mandatory
    And User_607 Check Reference Entity should be editable
    And User_607 Check Reference Code should be non mandatory
    And User_607 Check Reference Code should be editable
    And logout from the ULSApplication

  @AT_RD_ADE_AD_07
  Scenario: To test the functionality of Application Details with valid data
    Given navigate the IJARA URL
    And login with valid credentials7
    And User_607 Update testdata from AT_RD_ADE_AD_01
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Auto Loan App Data Entry
    And User_607 Select record after search
    And user_607 click on Application details tab
    And user_607 Delete the value in Declared Net Monthly Income field
    And User_607 Save the record in Application Details screen
    And User_607 Check Please Fill Details toast Popup showing or not
    And User_607 User Check negative value accepct or not in the numaric field
    #And User_607 Check able to enter characters value in numeric field
    And User_607 Check Product Field should be editable
    And User_607 Check Sub Product Field should be editable
    And User_607 Enter characters in Total Finance Amount Requested
    And User_607 Enter characters in Declared Net Monthly Income
    And User_607 Enter characters in characters in Declared Current Obligations
    And User_607 Check Special Promotion Campaign should be editable
    And User_607 Check Sourcing Channel should be editable
    And User_607 Check Business Center Code should be editable
    And User_607 Check Servicing Type should be editable
    And User_607 Check Region should be editable
    And User_607 Check Servicing Branch should be editable
    And User_607 Check Spoke Location should be editable
    And User_607 Check Closing Staff Or Servicing Staff Or RM should be editable
    And User_607 Check Sourcing Type should be editable
    And User_607 Check Sourcing Office should be editable
    And User_607 Check Sourcing Entity should be editable
    And User_607 Check Sourcing Staff should be editable
    And User_607 Check Reference Type should be editable
    And User_607 Check Reference Entity should be editable
    And User_607 Enter characters in Reference Code
    And User_607 Save the record in Application Details screen
	  And  User_607 Check Please Fill Details toast Popup showing or not
    And logout from the ULSApplication
