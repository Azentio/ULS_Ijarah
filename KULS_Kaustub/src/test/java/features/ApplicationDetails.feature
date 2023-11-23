Feature: To verify user is able to add new Application Detail record in the system by entering valid data

  @AT_APP_01
  Scenario: To verify post clicking on Add button, the Application Detail screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_001
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And Verify the fields present on the page
#And User click the Customer Application Detail tab
And User click the product name dropdown in ULS application
And User select the Product name as HomeLoan in ULS application
And User click the subproduct name dropdown in ULS application
And User select the SubProduct name as Home Loan-Ready to move or Under construction Property from Builder or Society in ULS application
And User click the Total Finance Amount Requested name textfield and enter amount in ULS application
#Then scroll the Page2
#And enter amount in ULS application
And User click the Declared Net Monthly Income name textfield and enter income in ULS application
And User click the Declared Current Obligations name textfield and enter income in ULS application
And User click the Sourcing Channel dropdown and Select the Branch in ULS application
And User click the Business Center Code dropdown and Select the Business Center-Retail Banking in ULS application
Then scroll the Page2
#And Select the Business Center-Retail Banking in ULS application
And User click the Servicing Type dropdown and Select the Financier in ULS application
And User click the Region dropdown and Select the Azentio Vs in ULS application
And User click the Servicing Branch dropdown and Select the NAGPUR in ULS application
And User click the Spoke Location dropdown in ULS application
And User click the Closing Staff or Servicing Staff or RM dropdown and Select the Renu Purohit in ULS application





@AT_APP_02_01
  Scenario: To verify post clicking on Add button, the Application Detail screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_001
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox

And User click the product name dropdown in ULS application
And User select the Product name as HomeLoan in ULS application
And User click the subproduct name dropdown in ULS application
And User select the SubProduct name as Home Loan-Ready to move or Under construction Property from Builder or Society in ULS application
And User click the Total Finance Amount Requested name textfield and enter amount in ULS application
And User click the Declared Net Monthly Income name textfield and enter income in ULS application
And User click the Declared Current Obligations name textfield and enter income in ULS application
And User click the Sourcing Channel dropdown and Select the Branch in ULS application
And User click the Business Center Code dropdown and Select the Business Center-Retail Banking in ULS application

Then scroll the Page2
And User click the Servicing Type dropdown and Select the Financier in ULS application
And User click the Region dropdown and Select the Azentio Vs in ULS application
And User click the Servicing Branch dropdown and Select the NAGPUR in ULS application
And User click the Spoke Location dropdown in ULS application
And User click the Closing Staff or Servicing Staff or RM dropdown and Select the Renu Purohit in ULS application

Then scroll the Page1
And User click the Sourcing Type dropdown and Select the Financier in ULS application
And User click the Sourcing Office dropdown and Select the NAGPUR in ULS application
And User click the Sourcing Entity dropdown and Select the Azentio Vs in ULS application
And User click the Sourcing Staff dropdown and Select the Renu Purohit in ULS application
And User click the Reference Type dropdown and Select the Agency in ULS application
And User click the Reference Entity dropdown and Select the Azentio Vs in ULS application
And User click the Reference Code textfield and enter code in ULS application
#Then scroll the Page
#And User click on the status toggle button
And User click on the status toggle button2

@AT_APP_02_03
  Scenario: To verify post clicking on Add button, the Application Detail screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_001
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click on the Cancel button
And Verify the page after clicking Cancel button


@AT_APP_03
  Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_002
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
#And Verify the fields present on the page
#And User click the Customer Application Detail tab
And User click the product name dropdown in ULS application
And User select the Product name as HomeLoan in ULS application
And User click the subproduct name dropdown in ULS application
And User select the SubProduct name as Home Loan-Ready to move or Under construction Property from Builder or Society in ULS application
And User click the Total Finance Amount Requested name textfield
And User keep any mandatory field blank and click on save button
And user verify the popup post clicking save button

@AT_APP_03_01Test
  Scenario: To verify the impact when user enter negative value in numeric field
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_001
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And user click on the hamburger menu
And user click on the transactions module
And user click on the appication manager option
And user click on the application details icon
And user click on the add button


@AT_APP_09
  Scenario: To verify post clicking on Add button, the Application Detail screen is getting open with all valid fields
Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_APP_001
And User click the module name dropdown in ULS application
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And User click on the Back button
And Verify the page after clicking Back button
  
