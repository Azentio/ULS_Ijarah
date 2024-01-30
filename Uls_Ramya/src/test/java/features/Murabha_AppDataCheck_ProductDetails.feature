Feature: Murabha-App DataCheck-Product details or Facility Details 

@AT_DC_PD_002
Scenario: To verify the availability of Product details record with all valid fields 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
Then User_6047 verify the Product field 
Then User_6047 verify the Scheme field 
Then User_6047 verify the Request Amount field 
Then User_6047 verify the Tenure (Months) field 
Then logout from the ijaraApplication 

@AT_DC_PD_003
Scenario: To verify already added details at App data entry stage is visible at data check stage 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
And User_6047 verify the Data under product field
And User_6047 verify the Data under subproduct field
And User_6047 verify the Data under Scheme field
And User_6047 verify the Data under product field
And User_6047 verify the Data under Request Amount field
And User_6047 verify the Data under Loan Tenure field
And User_6047 verify the Data under currency field
Then logout from the ijaraApplication

@AT_DC_PD_005
Scenario: To verify the availability of Product details field should be mandatory Display and field should text 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
And User_6047 verify the Product field should be mandatory Display and field should text
And User_6047 verify the subProduct field should be mandatory Display and field should text
And User_6047 verify the Request Type field should be mandatory Display and field should text
Then logout from the ijaraApplication

@AT_DC_PD_006
Scenario: To verify the availability of Product details field should be mandatory Display and field should text 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
And User_6047 verify the Scheme field should be mandatory Display and field should text
And User_6047 verify the Request Amount field should be Non mandatory Display and field should text
Then logout from the ijaraApplication

@AT_DC_PD_007
Scenario: To verify the availability of Product details field should be mandatory Display and field should text 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
And User_6047 verify the Tenure Months field should be mandatory Display and field should text
Then logout from the ijaraApplication

@AT_DC_PD_008
Scenario: To verify the availability of Product details field should be mandatory Display 
Given Navigate the IJARA URL
And User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails
And User_6047 get the test data for test case ID AT_DC_PD_002
And User_6047 click the Mail box in ULS application
And User_6047 click the Search button under inbox
And User_6047 Search the Referen Id Under inbox 
And User_6047 click the Entitle button under inbox
And User_6047 Click the Facility info tab
And User_6047 click EyeButton 
And User_6047 verify the pricing indicator field should be mandatory Display 
Then logout from the ijaraApplication