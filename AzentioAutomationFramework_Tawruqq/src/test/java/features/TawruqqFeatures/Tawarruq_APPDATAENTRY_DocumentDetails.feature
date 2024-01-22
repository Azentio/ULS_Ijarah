Feature: To verify the Document Details screen in Tawarooq
@AT_TW_AD_DOC_01

Scenario: To verify post clicking on Add asset button, the Repayment Mode screen should be open with all valid fields
Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And User_6047 Get the test data for test case ID AT_TW_AD_DOC_01 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_6047 click the Document Details section
And User_6047 Click Add icon
Then User_6047 verify the Customer Name field
Then User_6047 verify the Document Name field
Then User_6047 verify the Required Stage field
Then User_6047 verify the Document Staus field
Then User_6047 verify the Mandatory/optional field
Then User_6047 verify the Document Category field
Then User_6047 verify the Upload date field
Then User_6047 verify the Expected receipt date Stage field
Then User_6047 verify the Deferral Stage field
Then User_6047 verify the Def Approved By Stage field
Then User_6047 verify the Change In Nature Approved By field
Then User_6047 verify the Document Form field
Then User_6047 verify the Document Quality field
Then User_6047 verify the Document Reference Number field
Then User_6047 verify the Document Received By field
Then User_6047 verify the Location Where Received field
Then User_6047 verify the Rack No field
Then User_6047 verify the  Shelf No field
Then User_6047 verify the Box No field
Then User_6047 verify the Date Of Expiry field
Then User_6047 verify the Lodgement Amount field
Then User_6047 verify the Remarks field
Then logout from the ULS Application

 @AT_TW_AD_DOC_02
Scenario: To verify post clicking on Add asset button, the Repayment Mode screen should be open with all valid fields

Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And User_6047 Get the test data for test case ID AT_TW_AD_DOC_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_6047 click the Document Details section
And User_6047 Click Add icon
And User_6047 Give the input for Document Name 
Then User_6047 Give the input for Required Stage 
Then User_6047 Give the input for Document Staus 
Then User_6047 Give the input for Mandatory/optional 
Then User_6047 Give the input for Document Category
Then User_6047 Give the input for Document Quality field
Then User_6047 Give the input for Remarks
And User_6047 click the Save Button
Then User_6047 verify the successfully saved message popup
And User_6047 click edit icon
Then User_6047 to verify the same record should get saved in Document details
And User_6047 to click the back button
And User_6047 verify the functionality of back button
Then logout from the ULS Application

@AT_TW_AD_DOC_03
Scenario: To verifythe Document Details fields

Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And User_6047 Get the test data for test case ID AT_TW_AD_DOC_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_6047 click the Document Details section
And User_6047 Click Add icon
And User_6047 to verify the Document Name field should be mandatory,Dropdown
#And User_6047 to verify the Completion Stage field should be mandatory
And User_6047 to verify the Status field should be mandatory,Editable,dropdown
And User_6047 to verify the Quality field should be mandatory,Editable,dropdown
And User_6047 to verify the Date field should be nonmandatory,Date
And User_6047 to verify the Deferred stage field should be nonmandatory,Dropdown
Then logout from the ULS Application

@AT_TW_AD_DOC_04
Scenario: To verifythe Document Details fields

Given navigate the Tawarruq URL
And login with valid credentials for app data entry stage
And User_6047 Get the test data for test case ID AT_TW_AD_DOC_02 
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And user_0482 click on mail box
And user_0482 click on search box upon click on the mail box
And user_0482 click on search text box upon click the search button
And user_0482 search the new app data entry stage record reference number
And user_0482 select the new app data entry stage record from mail box
And User_6047 click the Document Details section
And User_6047 Click Add icon
And User_6047 to verify the Location field should be nonmandatory,Dropdown
And User_6047 to verify the Rack Number field should be nonmandatory,Text box
And User_6047 to verify the Shelf Number field should be nonmandatory,Text box
And User_6047 to verify the Box Number field should be nonmandatory,Text box
And User_6047 to verify the Document with field should be nonmandatory,dropdown
Then logout from the ULS Application

#2068-user
#629
#0181
#3722--ref id