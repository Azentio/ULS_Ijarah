Feature: To verify the Document Details screen in offering

@AT_DOC_01

Scenario: To verify the fields should be available,display only and bach button functionality on Document Details screen 

#todo- all the data at this stage correctly same as data entry stage.

Given Navigate the IJARA URL
And User_6047 Login with valid credentials - murabha-DocumentDetails
And User_6047 Get the test data for test case ID AT_DOC_01 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click the Document Details tab 
And User_6047 click the Eye button
And User_6047 To verify the Document Name field
Then User_6047 To verify the Completion Stage field
Then User_6047 To verify the Status field
Then User_6047 To verify the Quality field
Then User_6047 To verify the Date field
Then User_6047 To verify the Deferred Stage field
Then User_6047 To verify the Location field
Then User_6047 To verify the Rack No field
Then User_6047 To verify the Shelf No field
Then User_6047 To verify the Box No field
Then User_6047 To verify the Document Category field
Then User_6047 To verify the Document Form field
Then User_6047 To verify the Expected Date of Receipt field
Then User_6047 To verify the Waiver/Defferral Approved By field
Then User_6047 To verify the Change in Nature of Document Approved By field
Then User_6047 To verify the Document Number field
Then User_6047 To verify the Rack No field
Then User_6047 To verify the Shelf No field
Then User_6047 To verify the Box No field
Then User_6047 To verify the Branch Remarks field
Then User_6047 To verify the Upload field
Then User_6047 To verify the View field
Then User_6047 To verify the Help Button field
Then User_6047 To verify the Back Button field
And User_6047 to click the back button
Then User_6047 verify the functionality of Back Button
Then logout from the ULS Application

@AT_DOC_04
Scenario: To verify the functionality of Search box with matching data and mismatching data on Document Details screen 

Given Navigate the IJARA URL
And User_6047 Login with valid credentials - murabha-DocumentDetails
And User_6047 Get the test data for test case ID AT_DOC_04
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
Then User_6047 search the Refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click the Document Details tab 
And User_6047 click the Search button and search the matching data in listview
And User_6047 check the match result data in list view
And User_6047 clear the search box 
And User_6047 click the Search button and search the mismatching data in listview
And User_6047 check the mismatch result in list view
Then logout from the ULS Application


