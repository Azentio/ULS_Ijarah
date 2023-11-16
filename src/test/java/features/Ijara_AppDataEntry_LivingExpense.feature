Feature: Verify the functionalities for LivingExoenses
@AT_LEA_007
Scenario: Updation of Living expense with invalid data
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_LEA_007
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Living expenses
And User click the Entitle button under inbox
And Navigate to Living expenses section
And Click on Edit icon of existing living expense record
And Update required field as blank in living expense tab
And Click on Save icon in Living expense tab
And Validate the required field popup is showing in Living expense tab


@AT_LEA_010
Scenario: Validation of Living expense view list
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_LEA_010
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Living expenses
And User click the Entitle button under inbox
And Navigate to Living expenses section
And Click on Edit icon of existing living expense record
And Update the status to Inactive in living expense
And Click on Save icon in Living expense tab















