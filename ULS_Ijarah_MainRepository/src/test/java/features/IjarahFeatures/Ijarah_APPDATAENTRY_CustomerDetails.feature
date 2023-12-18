Feature: Testing the functionalities of Customer details App data entry ijarah
@AT_CD_01
Scenario: To verify user is able to view Customer Information tab at New App Stage
Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_01
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click the add button under customer details tab
And user verify the back button
And user verify the save button
And user verify all the details under personal details for AT_CD_01


@AT_CD_02
Scenario: To verify user is able to view Customer Information tab at New App Stage

Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_01
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click the add button under customer details tab
And user click on the back button in personal details


@AT_CD_03
Scenario: To verify user is able to add new Customer Information record in the system by entering invalid data

Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_03
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click the add button under customer details tab
And user click the save button under cusomer details
And user verify the popup post clicking save button
And user click on the first name textfield
And user verify the invalid message of first name textfield
And user click on the no of dependents field
And user verify error message of no of dependents field
And user click the save button under cusomer details
And user verify the popup post clicking save button

@AT_CD_04
Scenario: To verify user is able to modify Customer Information record in the system 

Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_01
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click on the first record edit button under customer details
And user verify all the details under personal details



@AT_CD_05
Scenario: To verify user is able to modify Customer Information record in the system

Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_05
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click on the first record edit button under customer details
And user clear the first name textfield
And user enter the name in first name textfield
And user click on the update button
And user capture the text of post update popup

#CD_42
Given navigate the IJARA URL
And login with valid credentials for new application stage
And User get the test data for test case AT_CD_05
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the customer details tab
And user click on the first record edit button under customer details
And user clear the first name textfield
And user click on the update button
And user capture the text of post update popup

#CD_44
#And user clear the first name textfield
#And user enter the name in first name textfield
#And user click on the update button
