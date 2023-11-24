Feature: To check the App Data Check - Application Details feature

# **************** userType05 **********************

# Defect ID: AZ1LN-6679
# ADC_01_01, ADC_01_02
@AT_ADC_01
Scenario: To verify the availability of Application Details tab & verify already added details at App data entry stage is visible at data check stage

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_ADC_01
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
And User_608 validate the Sourcing Channel value displayed correctly under Application details screen
And User_608 validate the Business Center Code value displayed correctly under Application details screen
And User_608 validate the Servicing Type value displayed correctly under Application details screen
And User_608 validate the Region value displayed correctly under Application details screen
And User_608 validate the Servicing Branch value displayed correctly under Application details screen
And User_608 validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen
Then logout from the ijaraApplication


# ADC_01_03
@AT_ADC_02
Scenario: To verify post clicking on Application Detail tab system opens Application Details section.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_ADC_02
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
Then logout from the ijaraApplication


# ADC_01_04
@AT_ADC_03
Scenario: To verify post clicking on Application Detail tab system opens Referral/Sourcing Details section.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_ADC_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Sourcing Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Office field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Entity field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Sourcing Staff field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Type field available in Referral\Sourcing Details section under Application Details tab
And User_608 verify the Reference Code field available in Referral\Sourcing Details section under Application Details tab
Then logout from the ijaraApplication

#ADC_01_07, ADC_01_08, ADC_01_09, ADC_01_10, ADC_01_11
@AT_ADC_05
Scenario: To verify the field.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_ADC_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Classification Dropdown field available under Application details screen
And User_608 verify the Product Dropdown field available under Application details screen
And User_608 verify the Total Finance Amount Requested input field available under Application details screen
And User_608 verify the Declared Net Monthly Income input field available under Application details screen
And User_608 verify the Declared Current Obligations input field available under Application details screen
Then logout from the ijaraApplication

#ADC_01_12, ADC_01_13, ADC_01_14, ADC_01_15, ADC_01_16, ADC_01_17
@AT_ADC_06
Scenario: To verify the field.

Given navigate the IJARA URL
And login with valid credentials-Data Check
And User_608 get the test data for test case AT_ADC_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox
And User_608 click the Entitle button under inbox
And User_608 verify the Special Promotion Dropdown field available under Application details screen
And User_608 verify the Sourcing Channel Dropdown field available under Application details screen
And User_608 verify the Business Center Code Dropdown field available under Application details screen
And User_608 verify the Servicing Type Dropdown field available under Application details screen
And User_608 verify the Region Dropdown field available under Application details screen
And User_608 verify the Servicing Branch Dropdown field available under Application details screen
Then logout from the ijaraApplication



