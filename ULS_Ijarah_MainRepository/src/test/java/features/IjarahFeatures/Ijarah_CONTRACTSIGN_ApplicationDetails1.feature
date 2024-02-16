Feature: To check the Contract Signing Stage - Application Details feature

@AT_CSAD_01
Scenario: To verify the availability of Application Details tab  under Contract signing stage

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CSAD_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Back button available under Application details screen
And User_608 verify the Submit button available under Application details screen
And User_608 verify the Return button available under Application details screen
And User_608 verify the View Summary button available under Application details screen
And User_608 validate the Classification value displayed correctly under Application details screen
And User_608 validate the Product value displayed correctly under Application details screen
And User_608 validate the Total Finance Amount Requested value displayed correctly under Application details screen
And User_608 validate the Declared Net Monthly Income value displayed correctly under Application details screen
And User_608 validate Declared Monthly Obligations value displayed correctly under Application details screen
And User_608 validate Special Promotion value displayed correctly under Application details screen
And User_608 validate the Sourcing Channel value displayed correctly under Application details screen
And User_608 validate the Business Center Code value displayed correctly under Application details screen
And User_608 validate the Servicing Type value displayed correctly under Application details screen
And User_608 validate the Region value displayed correctly under Application details screen
And User_608 validate the Servicing Branch value displayed correctly under Application details screen
And User_608 validate Spoke Location value displayed correctly under Application details screen
And User_608 validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen under at Ijarah Contract signing stage

@AT_CSAD_02
Scenario: To verify post clicking on Application Detail tab system opens Application Details section.

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CSAD_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
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
And User_608 verify the Topup Type field available under Application details screen
And User_608 verify the Topup Application No field available under Application details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen under at Ijarah Contract signing stage

@AT_CSAD_03
Scenario: To verify post clicking on Application Detail tab system opens Referral/Sourcing Details section.

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CSAD_03
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Sourcing Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Office field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Staff field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Code field available in Referral\Sourcing Details section under Application Details tab
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen under at Ijarah Contract signing stage

@AT_CSAD_04
Scenario: To Validate the below field values are populated correct data & Data should not editable under Application Details tab

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CSAD_04
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 validate the Classification Dropdown field under Application details screen
And User_608 validate the Product Dropdown field under Application details screen
And User_608 validate the Total Finance Amount Requested input field under Application details screen
And User_608 validate the Declared Net Monthly Income input field under Application details screen
And User_608 validate the Declared Current Obligations input field under Application details screen
And User_608 validate the Special Promotion Dropdown field under Application details screen
And User_608 validate the Sourcing Channel Dropdown field under Application details screen
And User_608 validate the Business Center Code Dropdown field under Application details screen
And User_608 validate the Servicing Type Dropdown field under Application details screen
And User_608 validate the Region Dropdown field under Application details screen
And User_608 validate the Servicing Branch Dropdown field under Application details screen
And User_608 validate the Spoke Location Dropdown field under Application details screen
And User_608 validate the Closing Staff Dropdown field under Application details screen
And User_608 validate the Topup Type Dropdown field under Application details screen
And User_608 validate the Topup Application field under Application details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen under at Ijarah Contract signing stage

# Mandatory, display correct data, non-editable, lookup data
@AT_CSAD_05
Scenario: To Validate the below fields in Referral/Sourcing Details section under Application Details tab

Given navigate the IJARA URL
And login with valid credentials-Contract Signing
And User_608 get the test data for test case AT_CSAD_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 validate the Sourcing Type field under Referral\Sourcing Details section
And User_608 validate the Sourcing Office field under Referral\Sourcing Details section
And User_608 validate the Sourcing Entity field under Referral\Sourcing Details section
And User_608 validate the Sourcing Staff field under Referral\Sourcing Details section
And User_608 validate the Reference Type field under Referral\Sourcing Details section
And User_608 validate the Reference Entity field under Referral\Sourcing Details section
And User_608 validate the Reference Code field under Referral\Sourcing Details section
Then logout from the ULS Application
And User_608 invoke soft assert in Application details screen under at Ijarah Contract signing stage