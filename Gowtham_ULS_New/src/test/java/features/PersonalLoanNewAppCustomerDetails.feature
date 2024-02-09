Feature: Personal Loan NewApp Customer Details

  @AT_PL_NEWAPP_CD_07
  Scenario: Verify the below fields are Mandatory/Non-Mandatory,Editable/Non-Editable,Dropdown/Input
    Given navigate the IJARA URL
    And login with valid credentials12
    And User_607 get the test data for test case AT_PL_NEWAPP_CD_07
    And User_607 Select LOS in module name
    And User_607 Click inbox in the home page
    And User_607 Click Search in inbox
    And User_607 Search in the search Field Personal Loan NewApp Customer Details
    And User_607 Select record after search
    And user_607 click on Customer Details tab
    And User_607 click the pencil icon under Customer Financials tab
    Then user_607 verify spouse middle name field should be non mandatory editable textbox at new app
		Then user_607 verify spouse last name field should be non mandatory editable textbox at new app
		Then user_607 verify no of children field should be non mandatory editable textbox
		Then user_607 verify spouse status field should be non mandatory editable dropdown at new app
		Then user_607 verify date of birth field should be mandatory editable calendar at new app
		Then user_607 verify gender field should be mandatory editable dropdown at new app
		Then user_607 verify education level field should be mandatory editable dropdown at new app
		Then user_607 verify maritail status field should be mandatory editable dropdown at new app
		Then user_607 verify nationality field should be mandatory editable dropdown at new app
		Then user_607 verify category field should be mandatory editable dropdown at new app
		Then user_607 verify religion field should be mandatory editable dropdown at new app
		Then user_607 verify residential status field should be mandatory editable dropdown at new app
		Then user_607 verify language field should be mandatory editable dropdown at new app
		Then user_607 verify no of dependents field should be mandatory editable textbox at new app
		Then user_607 verify mothers maiden name field should be mandatory editable textbox at new app
		Then user_607 verify residence field should be mandatory editable textbox at new app
		Then user_607 verify industry segmentation field should be mandatory editable textbox at new app
		Then user_607 verify income considered field should be non mandatory editable dropdown at new app
		Then user_607 verify costomer profile field should be non mandatory editable dropdown at new app
		Then user_607 verify relationship field should be mandatory editable dropdown at new app
		Then user_607 verify existing bank relationship field should be non mandatory editable toggle at new app
		Then user_607 verify blacklisted field should be non mandatory editable toggle at new app
		Then user_607 verify politically exposed field should be non mandatory editable dropdown at new app
		Then logout from the ULSApplication
		
		    
