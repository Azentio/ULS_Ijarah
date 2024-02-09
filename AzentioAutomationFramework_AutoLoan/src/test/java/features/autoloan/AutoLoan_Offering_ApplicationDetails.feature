Feature: To check the Application details feature

@AT_AL_AD_01
Scenario: To verify that field validation of App data check_Application details
#This test case also covers the functionality of AT_AL_AD_02
Given navigate the IJARA URL
And login with valid credentials for Auto loan_Offering_Application details
And User get the test data for test case AT_AL_AD_01
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Auto loan_Offering_Application details
And User click the Entitle button under inbox
And Navigate to Application details section for Auto loan_Offering_Application details
And Validate that Product field is present in Application details
And Validate that Sub product field is present in Application details
And Validate that Total Finance amount requested field is present in Application details
And Validate that Declared net monthly income field is present in Application details
And Validate that Declared current obligations field is present in Application details
And Validate that Special promotion campaign field is present in Application details
And Validate that Sourcing channel field is present in Application details
And Validate that Business center code field is present in Application details
And Validate that Servicing type field is present in Application details
And Validate that Region field is present in Application details
And Validate that Servicing branch field is present in Application details
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