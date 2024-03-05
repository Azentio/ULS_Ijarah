Feature: To check the Murabaha --> Data Check stage, Application Details screen

#AD_01,AD_02
@AT_MU_AD_01
Scenario: Application Detail details screen should get open with below mentioned Field

Given navigate the MURABHA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_AD_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 verify the Back button available under Application details screen
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
And User_608 invoke soft assert in Application Details screen at Murabaha App Data Check stage

#AD_03
@AT_MU_AD_02
Scenario: Referral/Sourcing Details section should get open with below mentioned fields and buttons

Given navigate the MURABHA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_AD_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 verify the Back button available under Application details screen
And User_608 verify the Sourcing Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Office field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Staff field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Code field available in Referral\Sourcing Details section under Application Details tab
Then logout from the ULS Application
And User_608 invoke soft assert in Application Details screen at Murabaha App Data Check stage

@AT_MU_AD_03
Scenario: To verify the fields are Mandatory,Non-editable and Dropdown or Input.

Given navigate the MURABHA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_AD_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 verify Classification field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Product field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Total Finance Amount Requested field as Mandatory, Non-editable and Numeric under Application details screen
And User_608 verify Declared Net Monthly Income field as Mandatory, Non-editable and Numeric under Application details screen
And User_608 verify Declared Current Obligations field as Non-mandatory, Non-editable and Numeric under Application details screen
And User_608 verify Special Promotion field as Non-mandatory, Non-editable and Dropdown under Application details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application Details screen at Murabaha App Data Check stage

@AT_MU_AD_04
Scenario: To verify the fields are Mandatory,Non-editable and Dropdown or Input.

Given navigate the MURABHA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_AD_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 verify Sourcing Channel field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Business Center Code field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Servicing Type field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Region field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Servicing Branch field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Spoke Location field as Non-mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Topup Type field as Non_mandatory, Non-editable and Dropdown under Application details screen
And User_608 verify Topup Application No field as Non_mandatory, Non-editable and Numeric under Application details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Application Details screen at Murabaha App Data Check stage

 #Mandatory, display correct data, non-editable, lookup data
@AT_MU_AD_05
Scenario: To Validate the below fields in Referral/Sourcing Details section under Application Details tab

Given navigate the MURABHA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_AD_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 verify Sourcing Type field as Mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Sourcing Office field as Mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Sourcing Entity field as Mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Sourcing Staff field as Mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Reference Type field as Non_mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Reference Entity field as Non_mandatory, Non-editable and Dropdown under Referral\Sourcing Details section
And User_608 verify Reference Code field as Non_mandatory, Non-editable and Textbox under Referral\Sourcing Details section
Then logout from the ULS Application
And User_608 invoke soft assert in Application Details screen at Murabaha App Data Check stage