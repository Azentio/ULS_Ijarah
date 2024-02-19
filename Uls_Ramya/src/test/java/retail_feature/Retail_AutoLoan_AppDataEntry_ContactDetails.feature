Feature: AutoLoan-AppDataEntry-ContactDetails
@AT_AL_CD_01
Scenario: To verify the availability of back and save button and functionality of save button in contact deatails

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_01
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Contact details tab
And User_6047 Verify the save button in contact detail screen
Then User_6047 verify the field Back button in contact detail screen
And User_6047 give the input for Phone Type
And User_6047 give the input for Phone number
And User_6047 click the Save button 
Then User_6047 verify the successfully saved message popup
Then logout from the ijaraApplication

@AT_AL_CD_02
Scenario: To verify the fields in contact deatails

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_02
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Contact details tab

Then User_6047 verify the field Phone Type in contact details
Then User_6047 verify the field Phone number in contact details
Then User_6047 verify the field consent for phone contact in contact details
Then User_6047 verify the field Prefered contact method in contact details
Then User_6047 verify the field Prefered Time for contact in contact details
Then User_6047 verify the field Email Type in contact details
Then User_6047 verify the field Email id in contact details
Then logout from the ijaraApplication

@AT_AL_CD_03
Scenario: To verify the fields type and editable in contact deatails

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_03
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Contact details tab

Then User_6047 verify the field Phone Type should be dropdown,editable
Then User_6047 verify the field Phone number should be number,editable
Then User_6047 verify the field consent for phone contact should be dropdown,editable in contact details
Then User_6047 verify the field Prefered contact method should be dropdown,editable
Then User_6047 verify the field Prefered Time for contact  should be HH:MM format,editable in contact details
Then User_6047 verify the field Email Type should be dropdown,editable in contact details
Then User_6047 verify the field Email id should be text,editable in contact details
Then logout from the ijaraApplication

@AT_AL_CD_04
Scenario: To verify the fields type and editable in contact deatails

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_04
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Contact details tab
And User_6047 To verify System should allow user to add new record of contact deatails
And User_6047 Click the back button of customer details
And User_6047 To verify the functionality of Back button 
Then logout from the ijaraApplication

@AT_AL_CD_05
Scenario: To verify the Creation of contact details record with invalid data

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_05
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the Add button under the Contact details tab
Then User_6047 click the Save button
Then User_6047 To verify the validation message for blank field 
Then User_6047 Enter the negative numeric value in numeric field(phone number)
Then User_6047 Verify the validation message for negative numeric value in numeric field
Then User_6047 Enter the charecter value in numeric field(Prefered time for contact)
Then User_6047 Verify the validation message for character value in numeric field
Then User_6047 Enter the special character value in any field(phone number)
Then User_6047 Verify the validation message for special character value in any field
Then logout from the ijaraApplication

@AT_AL_CD_06
Scenario: To verify the buttons available on screen while modify the contact details

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_06
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the edit button under the Contact details tab
And User_6047 Verify the save button in contact detail screen
Then User_6047 verify the field Back button in contact detail screen
Then User_6047 verify the field Phone Type in contact details
Then User_6047 verify the field Phone number in contact details
Then User_6047 verify the field consent for phone contact in contact details
Then User_6047 verify the field Prefered contact method in contact details
Then User_6047 verify the field Prefered Time for contact in contact details
Then User_6047 verify the field Email Type in contact details
Then User_6047 verify the field Email id in contact details
Then logout from the ijaraApplication

@AT_AL_CD_07
Scenario: To verify system allow user to modify the details,save record with valid,invalid data,mandatory field blank 
and save with conformation msg in the contact details modification screen

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_07
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the edit button under the Contact details tab
And User_6047 Delete the phone number in contact detail
And User_6047 click the Save button 
Then User_6047 verify the popup of fill all field
And User_6047 give the invalid input for Phone number
And User_6047 click the Save button 
Then User_6047 validate the invalid input popup
And User_6047 give the input for Phone number
Then User_6047 verify the successfully saved message popup
Then logout from the ijaraApplication

@AT_AL_CD_08
Scenario: To verify the functionality of Activate/Deactivate button in contact details

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_08
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
And User_6047 clict the edit button under the Contact details tab
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 clict the edit button under the Contact details tab
And User_6047 change the address details status to active to inactive or inactive to active
Then User_6047 click the Save button
Then User_6047 verify system should show the record status as active or inactive based on toggle
And User_6047 clict the edit button under the Contact details tab
And User_6047 Click the back button of customer details
And User_6047 To verify the functionality of Back button 
Then logout from the ijaraApplication

@AT_AL_CD_09
Scenario: To verify the fields on list view of contact details and search the matching and mismatching data in list view

Given Navigate the IJARA URL
And User_6047 Login With valid credentials-AutoLoan_AppDataEntry_ContactDetails
And User_6047 Get the test data for test case ID AT_AL_CD_09
And User_6047 Click the module name dropdown in ULS application
And User_6047 Select the module name as LOS in ULS application
And User_6047 Click the Mail box in ULS application
And User_6047 Click the Search button under inbox
And User_6047 Search the Ref record(id) under inbox
And User_6047 Click the Entitle button under inbox 
And User_6047 click on additional customer info tab
And User_6047 Click edit icon
Then User_6047 To verify the search button in list view of contact details
Then User_6047 To verify the add button in list view of contact details
Then User_6047 Click the export button in list view of contact details
Then User_6047 To verify Export to PDF in listview screen
Then User_6047 To verify Export to Excel in listview screen
Then User_6047 To verify the fields in list view of contact details
Then User_6047 To verify the values in list view should be in read only mode
And User_6047 clict the Add button under the Contact details tab
Then User_6047 give the input for Phone Type
And User_6047 Click the back button of customer details
Then User_6047 To search the matching data in list view of contact details
Then User_6047 To verify the matching result in list view of contact details
Then User_6047 To search the mismatching data in list view of contact details
Then User_6047 To verify the mismatching result in list view of contact details
Then logout from the ijaraApplication

