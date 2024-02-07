Feature: To verify AutoLoan-Disbursion maker-Margin Money
@AT_AL_DSB_MM_04
Scenario: To verify the buttons available on screen while modify the money margin

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
And User_6047 click edit icon
Then User_6047 to verify the save button in Margin money screen
Then User_6047 to verify the back button in Margin money screen
Then User_6047 to verify the Margin money money in Margin money screen
Then User_6047 to verify the Margin money section in Margin money screen
Then User_6047 to modify the data in Margin money
Then User_6047 click the save button and verify the data updated
And User_6047 click edit icon
Then User_6047 to modify the valid data in Margin money
Then User_6047 click the save button and verify the data updated
Then logout from the ULS Application

@AT_AL_DSB_MM_05
Scenario: To verify system should not allow user to do a modification with invalid data and 
save and back button functionality

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
And User_6047 click edit icon
Then User_6047 to modify and verify system should not allow user to do a modification with invalid data
Then User_6047 click the Save button
Then User_6047 verify the confirmation of save message 
And User_6047 click edit icon
And User_6047 to click the back button
Then User_6047 click verify the functionality of back button
Then logout from the ULS Application

# To do
@AT_AL_DSB_MM_06
Scenario: To verify the functionality of Activate/Deactivate button

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
And User_6047 click search button
And User_6047 search the record in list view
And User_6047 click edit icon
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
And User_6047 click search button
And User_6047 search the record in list view
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 click edit icon
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle
Then logout from the ijaraApplication
And User_6047 search the record
@AT_AL_DSB_MM_07
Scenario: To verify the Business Partner details List view

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
And User_6047 To verify Back button in listview screen
Then User_6047 To verify Add button in listview screen
Then User_6047 To verify edit button in listview screen
Then User_6047 To verify Search box in listview screen
Then User_6047 To verify the fields in list view of margin money
Then User_6047 Click the export button 
Then User_6047 To verify Export to PDF in listview screen
Then User_6047 To verify Export to Excel in listview screen
Then User_6047 To verify Export to Excel in listview screen
Then User_6047 To verify Export to Excel in listview screen
Then User_6047 To verify the system should display the records on the list view
Then User_6047 click the add button
Then User_6047 to verify Add button system should allow user to create new record in Margin money
And User_6047 to click the pre back button
Then User_6047 click verify the functionality of pre back button
Then logout from the ijaraApplication

@AT_AL_DSB_MM_08
Scenario: To verify the functionality of Search box with matching and mismatching data

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
And User_6047 click the Search button and search the matching record in listview
And User_6047 check the matching result data in list view
And User_6047 clear the search box in listview
And User_6047 click the Search button and search the mismatching record in listview
And User_6047 check the mismatching result in list view

@AT_AL_DSB_MM_09
Scenario: To verify the functionality of Search box with matching and mismatching data

Given Navigate the IJARA URL
And User_6047 Login with valid credentials-AutoLoan-Disbursion maker-Margin Money
And User_6047 Get the test data for test case ID AT_AL_DSB_MM_04 
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 search the refer id under Inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 Click the Margin money screen
Then User_6047 Click the export button
Then User_6047 click on export to excel button
Then User_6047 verify the system is downloading the excel file
Then User_6047 Click the export button
Then User_6047 click on export to pdf button
Then User_6047 verify the system is downloading the pdf file
