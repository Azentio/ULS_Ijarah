Feature: Auto Loan Appdata Entry Contact Details

  @AT_AL_APD_CD_06
  Scenario: To verify user can able to update the contact details record with valid input
    Given navigate the IJARA URL
    And login with valid credentials5
    And user_604 get the test data for the test case ID AT_AL_APD_CD_03
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Auto Loan Appdata Entry Contact Details
    And User_604 click the Entitle button under inbox
    And user_604 click on additional customer info tab in new application stage
    And user_604 click on edit button customer personal information screen at new app stage
    And user_604 click on edit button in list view record of contact details in new app stage
    And user_604 update the phone number in contact details list view record in new app stage
    And user_604 click on save button after update the contact details in new app stage
    Then user_604 verify system should show the update successful popup while update the contact details record in new app stage
    Then logout from the ULS Application
    And user_604 invoke softAssert in contac details new new app stage

  	@AT_AL_APD_CD_07
  	Scenario: To verify user can able to activate and de activate the contact details list view record
   Given navigate the IJARA URL
    And login with valid credentials5
    And user_604 get the test data for the test case ID AT_AL_APD_CD_04
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Auto Loan Appdata Entry Contact Details
    And User_604 click the Entitle button under inbox
    And user_604 click on additional customer info tab in new application stage
		And user_604 click on edit button customer personal information screen at new app stage
		And user_604 verify contact details list view record should be read only not editable at new app stage
		And user_604 click on edit button in list view record of contact details in new app stage
		And user_604 click on toggle button and capture the status of cutact details record at new app stage
		And user_604 click on save button after update the contact details in new app stage
		Then user_604 verify system should show the update successful popup while update the contact details record in new app stage
		Then user_604 verify contact details record status in list view at new app stage
		And user_604 click on edit button in contact details list view at new app stage
		And user_604 click on toggle button and capture the status of cutact details record at new app stage
		And user_604 click on save button after update the contact details in new app stage
		Then user_604 verify system should show the update successful popup while update the contact details record in new app stage
		Then user_604 verify contact details record status in list view at new app stage
    Then logout from the ULS Application
    And user_604 invoke softAssert in contac details new new app stage

  @AT_AL_APD_CD_08
  Scenario: To verify user can able to update the contact details record with invalid input
    Given navigate the IJARA URL
    And login with valid credentials5
    And user_604 get the test data for the test case ID AT_AL_APD_CD_05
		And click on mail box
		And click on search box upon click on the mail box
    And User_604 Search the Ref Id under inbox Auto Loan Appdata Entry Contact Details
    And User_604 click the Entitle button under inbox
    And user_604 click on additional customer info tab in new application stage
    And user_604 click on edit button customer personal information screen at new app stage
    And user_604 click on edit button in list view record of contact details in new app stage
    And user_604 make phone number field as blank in contact details at new app stage
    And user_604 click on save button without enter the details in contact details screen in new app stage
    Then user_604 verify contact details should show the mandatory field validation in new app stage
    #And user_604 enter the character input in phone numver field in contact details screen in new app stage
    #Then user_604 verify phone number field should show the validation for character input in new app stage
    And user_604 enter the negative input in phone number field in contact details screen in new app stage
    Then user_604 verify phone number field should show the validation for negative input in new app stage
    And user_604 enter the special character input in phone numver field in contact details screen in new app stage
    Then user_604 verify phone number field should show the validation for special character input in new app stage
    And user_604 clear the email id field in contact details at new app stage
    And user_604 enter the invaid mail id input inemail id field in contact details screen in new app stage
    Then user_604 verify email id field should show the validation for invalid mail id input in new app stage
    Then logout from the ULS Application
    And user_604 invoke softAssert in contac details new new app stage