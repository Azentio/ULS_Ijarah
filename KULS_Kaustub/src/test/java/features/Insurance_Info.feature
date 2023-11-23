Feature: To verify user is able to add new Insurance info   record in the system by entering valid data

@AT_INS_01
Scenario: To verify post clicking on Add button, the Insurance Info screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INS_01
And User click the module name dropdown in ULS application for Insurance Info
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application for Insurance Info
And User click the Mail box in ULS application for insurance info
And User click the Search button under inbox for insurance info
And User search the Ref id under inbox for insurance info
And User click the Entitle button under inbox for insurance info
And user click the Next button to click on Insurance info tab
And user click on the Insurance Tab
And user click on the Add button
And verify the fields in ULS application


@AT_INS_03
Scenario: To verify the functionality of Back button
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_INS_03
And User click the module name dropdown in ULS application for Insurance Info
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application for Insurance Info
And User click the Mail box in ULS application for insurance info
And User click the Search button under inbox for insurance info
And User search the Ref id under inbox for insurance info
And User click the Entitle button under inbox for insurance info
And user click the Next button to click on Insurance info tab
And user click on the Insurance Tab
And user click on the Add button
And user click on the back button
And verify the previous page
