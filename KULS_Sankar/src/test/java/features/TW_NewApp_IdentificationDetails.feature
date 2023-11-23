Feature: To check the Tawarruq -- New Application Stage -- Addition customer info --> Identification Details screen

@AT_TW_NEWAPP_IDA_01
Scenario: Identification Details screen should get open with all valid fields & To verify the functionality of save button

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Add button in Customer Identification under Additional Customer Info tab
And User_608 verify Back button available under Identification Details screen in Additional Customer Info tab
And User_608 verify Save button available under Identification Details screen in Additional Customer Info tab
And User_608 verify Help button available under Identification Details screen in Additional Customer Info tab
And User_608 select the ID Type in Customer Identification screen
And User_608 enter the ID number in Customer Identification screen
And User_608 enter the Issue Date in Customer Identification screen
And User_608 enter the Expiry Date in Customer Identification screen
And User_608 select the Issuing Authority in Customer Identification screen
And User_608 select the Country of Issue in Customer Identification screen
And User_608 click the Save button under Customer Identification screen
And User_608 to verify system display the confirmation message post clicking on save button
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage


@AT_TW_NEWAPP_IDA_02
Scenario: Identification Details details screen get open with below mentioned Fields & field should be Mandatory/Non-mandatory, Editable and Lookup/textbox/calendar

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Add button in Customer Identification under Additional Customer Info tab
And User_608 verify ID Type field is available under Customer Identification screen
And User_608 verify ID Type field should be Mandatory, Editable and Lookup under Customer Identification screen
And User_608 verify ID number field is available under Customer Identification screen
And User_608 verify ID number field should be Mandatory, Editable and Textbox under Customer Identification screen
And User_608 verify Issue Date field is available under Customer Identification screen
And User_608 verify Issue Date field should be Non-mandatory, Editable and Calendar under Customer Identification screen
And User_608 verify Expiry Date field is available under Customer Identification screen
And User_608 verify Expiry Date field should be Non-mandatory, Editable and Calendar under Customer Identification screen
And User_608 verify Issuing Authority field is available under Customer Identification screen
And User_608 verify Issuing Authority field should be Mandatory, Editable and Lookup under Customer Identification screen
And User_608 verify Country of Issue field is available under Customer Identification screen
And User_608 verify Country of Issue field should be Mandatory, Editable and Lookup under Customer Identification screen
And User_608 to verify the functionality of Help button under Customer Identification screen
And User_608 post clicking on Help button, system should display the description of all the fields in details
And User_608 to verify the functionality of Back button under Customer Identification screen
And User_608 post clicking on Back button, system should navigate to the previous screen in Additional Customer Info
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage


@AT_TW_NEWAPP_IDA_03
Scenario: To verify user is able to add New Identification Details record in the system by entering invalid data

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Add button in Customer Identification under Additional Customer Info tab
And User_608 select the ID Type in Customer Identification screen
And User_608 enter the Issue Date in Customer Identification screen
And User_608 enter the Expiry Date in Customer Identification screen
And User_608 select the Issuing Authority in Customer Identification screen
And User_608 select the Country of Issue in Customer Identification screen
And User_608 click the save button with mandatory field blank in Customer Identification screen
And User_608 verify the Validation error msg in Customer Identification screen
And User_608 enter the special characters in ID number under Customer Identification screen
And User_608 verify the Special character validation in Customer Identification screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage


@AT_TW_NEWAPP_IDA_04
Scenario: To verify user is able to modify Identification Details record in the system 

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the any record under Customer Identification section in Additional Customer Info tab
And User_608 verify Back button available under Identification Details screen in Additional Customer Info tab
And User_608 verify Update button available under Identification Details screen in Additional Customer Info tab
And User_608 verify Help button available under Identification Details screen in Additional Customer Info tab
And User_608 to verify while modification, when user keep any mandatory field blank and click on save button under Identification Details screen
And User_608 to verify System should show the proper validation message for blank field which is mandatory under Identification Details screen
And User_608 to verify while modification system enters the invalid data under Customer Identification screen
And User_608 to verify system should not allow user to do a modification with invalid data in Customer Identification screen
And User_608 to verify system allow user to modify the Identification details under Customer Identification screen
And User_608 to verify while modification system allow user to save the record with valid data under Customer Identification screen
And User_608 select the Issuing Authority in Customer Identification screen
And User_608 select the Country of Issue in Customer Identification screen
And User_608 click the Update button under Customer Identification screen
And User_608 to verify system display the confirmation message post clicking on save button
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage


@AT_TW_NEWAPP_IDA_05
Scenario: To verify the functionality of Activate/Deactivate button 

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab

And User_608 click the lable on button if the status of record is Active under Customer Identification section
And User_608 to verify the functionality of Activate\Deactivate button under Customer Identification screen
And User_608 click the Update button under Customer Identification screen
And User_608 get the updated record ID under Customer Identification section
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_05
And User_608 to verify if Status is Active then click the button system should show Deactivate under Customer Identification section

And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the lable on button if the status of record is Deactive under Customer Identification section
And User_608 change the status Deactive to Active under Customer Identification section
And User_608 click the Update button under Customer Identification screen
And User_608 get the updated record ID under Customer Identification section
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_05
And User_608 to verify if Status is Deactive then click the button system should show Active under Customer Identification section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage


@AT_TW_NEWAPP_IDA_06
Scenario: To verify user is able to modify Identification Details record in the system 

Given navigate the IJARA URL
And login with valid credentials-Tawarruq New App
And User_608 get the test data for test case AT_TW_NEWAPP_IDA_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the any record under Customer Identification section in Additional Customer Info tab
And User_608 click the View Summary button in Tawarruq application
And User_608 post clicking on View Summary button system should display the workflow of the record
And User_608 to verify the functionality of Back button under Customer Identification screen
And User_608 post clicking on Back button, system should navigate to the previous screen in Additional Customer Info
Then logout from the ijaraApplication
And User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage




