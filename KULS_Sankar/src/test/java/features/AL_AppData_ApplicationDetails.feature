Feature: To check the Auto Loan -- App Data Entry stage -> Application Details screen

@AT_AL_APP_01
Scenario: Creation of Application- Add --> To verify post clicking on Application Detail tab system opens 
Application Details section & Referral/Sourcing Details section

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 select the Customer Type under Application Details screen
And User_608 Enter the Customer Name under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 select the ID Type under Application Details screen
And User_608 Enter the ID Number under Application Details screen
And User_608 Enter the Date of Birth under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 click the Create New Request button under Application Details screen
#And User_608 verify the Back button available under Application details screen
And User_608 verify the Save button available under Application details screen

And User_608 verify the Classification field available under Application details screen
And User_608 verify the Product field available under Application details screen
And User_608 verify the Total Finance Amount Requested field available under Application details screen
And User_608 verify the Declared Net Monthly Income field available under Application details screen
And User_608 verify the Declared Current Obligations field available under Application details screen
And User_608 verify the Special Promotion field available under Application details screen
And User_608 verify the Sourcing Channel field available under Application details screen
And User_608 verify the Business Center Code field available under Application details screen
And User_608 verify the Servicing Type field available under Application details screen
And User_608 verify the Region field available under Application details screen
And User_608 verify the Servicing Branch field available under Application details screen
And User_608 verify the Spoke Location field available under Application details screen
And User_608 verify the Closing Staff or Servicing Staff or RM field available under Application details screen

And User_608 verify the Sourcing Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Office field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Staff field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Code field available in Referral\Sourcing Details section under Application Details tab
Then logout from the ijaraApplication


@AT_AL_APP_02
Scenario: Creation of Application- Add --> To verify the functionality of save button, post entering all valid details and clicking on save button

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 select the Customer Type under Application Details screen
And User_608 Enter the Customer Name under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 select the ID Type under Application Details screen
And User_608 Enter the ID Number under Application Details screen
And User_608 Enter the Date of Birth under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 click the Create New Request button under Application Details screen
And User_608 select the Product in Application details screen
And User_608 select the Sub-Product in Application details screen
And User_608 enter the Total Finance Amount Requested in Application details screen
And User_608 enter the Declared Net Monthly Income in Application details screen
And User_608 select the Sourcing Channel in Application details screen
And User_608 select the Business Center Code in Application details screen
And User_608 select the Servicing Type in Application details screen
And User_608 select the Region in Application details screen
And User_608 select the Servicing Branch in Application details screen
And User_608 select the Closing Staff or Servicing Staff or RM in Application details screen
And User_608 select the Sourcing Type under Referral\Sourcing Details section in Application Details screen
And User_608 select the Sourcing Office under Referral\Sourcing Details section in Application Details screen
And User_608 select the Sourcing Entity under Referral\Sourcing Details section in Application Details screen
And User_608 select the Sourcing Staff under Referral\Sourcing Details section in Application Details screen
And User_608 post entering all valid details, clicking on save button in Application Details screen
And User_608 to verify system display the confirmation message post clicking on save button
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage


@AT_AL_APP_03
Scenario: Creation of Application- Add --> To verify the below fields Mandatory/Non-mandatory, Editable, Dropdown or Accept only numeric values

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 select the Customer Type under Application Details screen
And User_608 Enter the Customer Name under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 select the ID Type under Application Details screen
And User_608 Enter the ID Number under Application Details screen
And User_608 Enter the Date of Birth under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 click the Create New Request button under Application Details screen
And User_608 verify Classification field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Product field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Total Finance Amount Requested field as Mandatory, Editable and accept only numeric values in Application details screen
And User_608 verify Declared Net Monthly Income field as Mandatory, Editable and accept only numeric values in Application details screen
And User_608 verify Declared Current Obligations field as Non-mandatory, Editable and accept only numeric values in Application details screen
And User_608 verify Special Promotion field as Non-mandatory, Editable and Dropdown in Application details screen
And User_608 verify Sourcing Channel field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Business Center Code field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Servicing Type field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Region field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Servicing Branch field as Mandatory, Editable and Dropdown in Application details screen
And User_608 verify Spoke Location field as Non-mandatory, Editable and Dropdown in Application details screen
And User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Editable and Dropdown in Application details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage


@AT_AL_APP_04
Scenario: Creation of Application- Add --> To verify the below fields Mandatory/Non-mandatory, Editable, Lookup values or textbox

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 select the Customer Type under Application Details screen
And User_608 Enter the Customer Name under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 select the ID Type under Application Details screen
And User_608 Enter the ID Number under Application Details screen
And User_608 Enter the Date of Birth under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 click the Create New Request button under Application Details screen
And User_608 verify Sourcing Type field as Mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Sourcing Office field as Mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Sourcing Entity field as Mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Sourcing Staff field as Mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Reference Type field as Non_mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Reference Entity field as Non_mandatory, Editable and Lookup in Referral\Sourcing Details section
And User_608 verify Reference Code field as Non_mandatory, Editable and Textbox in Referral\Sourcing Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage


@AT_AL_APP_05
Scenario: Creation of Application- Add --> To verify the impact when user keep any mandatory field blank and click on save button

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 select the Customer Type under Application Details screen
And User_608 Enter the Customer Name under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 select the ID Type under Application Details screen
And User_608 Enter the ID Number under Application Details screen
And User_608 Enter the Date of Birth under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 click the Create New Request button under Application Details screen
And User_608 select the Product in Application details screen
And User_608 select the Sub-Product in Application details screen
And User_608 enter the Total Finance Amount Requested in Application details screen
And User_608 enter the Declared Net Monthly Income in Application details screen
And User_608 select the Sourcing Channel in Application details screen
And User_608 select the Business Center Code in Application details screen
And User_608 select the Servicing Type in Application details screen
And User_608 select the Region in Application details screen
And User_608 select the Servicing Branch in Application details screen
And User_608 to verify the impact when user keep any mandatory field blank and click on save button
And User_608 system should show the proper validation message for blank field in Application details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage


@AT_AL_APP_06
Scenario: Modification of Application Detail record --> Application Detail screen should get open with all valid fields
in proper format with below mention buttons

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 verify Update button available in Application details screen
And User_608 verify Approve button available in Application details screen
And User_608 verify Eligiblity Check button available in Application details screen
And User_608 verify Back button available in Application details screen
And User_608 verify View summary button available in Application details screen
And User_608 verify Status field available in Application details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage



@AT_AL_APP_07
Scenario: Modification of Application Details record -> To verify system allow user to modify the Application Detail

Given navigate the IJARA URL
And login with valid credentials - Auto Loan - App Data Entry
And User_608 get the test data for test case AT_AL_APP_07
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Auto Loan
And User_608 click the Entitle button under inbox
And User_608 to verify system allow user to modify the Application Detail record
And User_608 to verify while modification, when user keep any mandatory field blank and click on Update button in Application Detail screen
And User_608 system should show the proper validation message for blank field in Application details screen

And User_608 to verify while modification system allow user to update the record with valid data in Application Detail screen
And User_608 to verify system display the confirmation message post clicking on Update button
Then logout from the ijaraApplication
And User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage








