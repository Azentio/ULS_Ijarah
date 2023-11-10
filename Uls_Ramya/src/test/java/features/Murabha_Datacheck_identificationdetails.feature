Feature: Customer Additional info -Data Check-Identifications Details under Data Check Stage

 @AT_DC_MU_ID_001
 Scenario: To verify the availability of Customer Information tab is getting open with all valid button under Data check stage
 
Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify the Help button
Then User_6047 verify the Back button

@AT_DC_MU_ID_002 
Scenario: Identification Details details screen should get open with all valid Fields

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify the ID Type
Then User_6047 verify the ID Number
Then User_6047 verify the ID Issue Date
Then User_6047 verify the ID Expiry Date
Then User_6047 verify the Issuing Authority 
Then User_6047 verify the Country of Issue

@AT_DC_MU_ID_003
Scenario: to verify the Identification Details

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify the Data in ID Type under identification details
Then User_6047 verify the Data in ID Number under identification details
Then User_6047 verify the Data in ID Issue Date under identification details
Then User_6047 verify the Data in ID Expiry Date under identification details
Then User_6047 verify the Data in Issuing Authority under identification details
Then User_6047 verify the Data in Country of Issue identification details

@AT_DC_MU_ID_005
Scenario: to verify the Identification Details field

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify ID Type field should be mandatory display only and text box
Then User_6047 verify ID number should be mandatory display only and numberic
Then User_6047 verify ID Issue Date field should be non mandatory display and calender

@AT_DC_MU_ID_006
Scenario: to verify the Identification Details field

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
Then User_6047 verify ID Expiry Date field should be non mandatory display and calender
Then User_6047 verify Issuing Authority number should be non mandatory display and lookup
Then User_6047 verify Country of Issue field should be non mandatory display and lookup
    
@AT_DC_MU_ID_007
Scenario: to verify the functionality of Back and Help Button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials
And User_6047 Get the test data for test case ID AT_DC_MU_ID_001
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 Search the Ref Id Under Inbox 
And User_6047 Click the Entitle button under inbox
And User_6047 click additional customer info
And User_6047 Click view button under customer personal information
And User_6047 Click view button under customer identification
And User_6047 verify Post clicking on Help button, system should display the description of all the fields in details
And User_6047 verify Post clicking on Back button, system should navigate to the previous screen



