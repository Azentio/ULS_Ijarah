Feature: To verify user is able to add new Employment Details record in the system by entering valid data

@AT_EMP_01_01
Scenario: To verify post clicking on Add button, the Employment Details screen is getting open with all valid fields
Given navigate the TAWARUQ URL
And login with valid credentials for Tawaruq
And User get the test data for test case AT_EMP_01_01
And User click the module name dropdown in ULS application for Customer Financial at App Data Entry Stage
And User select the module name as LOS1 in ULS application for Customer Financial at App Data Entry Stage
And User click the Mail box in ULS application for Customer Financial at App Data Entry Stage
And User click the Search button under inbox for Customer Financial at App Data Entry Stage
And User search the Ref id under inbox for Customer Financial at App Data Entry Stage
And User click the Entitle button under inbox for Customer Financial at App Data Entry Stage
And User click the Customer Financial Tab
And User click the add button under Customer Personal Information
Then User click the add button under Customer Employement List
And Verify the Add and Back button present
And Verify the toggle button is present
And Verify the Fields on the Customer Employement page

@AT_EMP_01_02
Scenario: To verify post clicking on Add button, the Employment Details screen is getting open with all valid fields
Given navigate the TAWARUQ URL
And login with valid credentials for Tawaruq
And User get the test data for test case AT_EMP_01_02
And User click the module name dropdown in ULS application for Customer Financial at App Data Entry Stage
And User select the module name as LOS1 in ULS application for Customer Financial at App Data Entry Stage
And User click the Mail box in ULS application for Customer Financial at App Data Entry Stage
And User click the Search button under inbox for Customer Financial at App Data Entry Stage
And User search the Ref id under inbox for Customer Financial at App Data Entry Stage
And User click the Entitle button under inbox for Customer Financial at App Data Entry Stage
And User click the Customer Financial Tab
And User click the add button under Customer Personal Information
Then User click the add button under Customer Employement List
And User check the Primary Employement toggle button default status active 