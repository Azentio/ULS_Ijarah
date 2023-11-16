Feature: To check the Application details feature

@AT_ADC_07
Scenario: To verify that field validation of App data check_Application details
#This test case also cover the functionality of AT_ADC_08, AT_ADC_09
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_ADC_07
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Application details
And User click the Entitle button under inbox
#And Navigate to Application details section
And Validate that Spoke Location field is present in Application details
And Validate that ClosingStaff ServicingStaff field is present in Application details
And Validate that Topup type field is present in Application details
And Validate that Topup application No field is present in Application details
And Validate that Sourcing Type field is present in Application details
And Validate that Sourcing Office field is present in Application details
And Validate that Sourcing Entity field is present in Application details
And Validate that Sourcing Staff field is present in Application details
And Validate that Reference Type field is present in Application details
And Validate that Reference Code field is present in Application details
And Validate the back button functionality of Application details
