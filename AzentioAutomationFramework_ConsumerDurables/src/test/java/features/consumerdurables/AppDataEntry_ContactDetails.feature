Feature: To check the Consumer Durable - App Data Entry -> Additional Customer info tab -> Contact Details screen

@AT_CD_ADE_CD_01
Scenario: Creation of Contact Details record - Contact Details details screen should get open with Phone details & Email details section with below mentioned Fields 

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under Contact Details section in Additional Customer Info tab
And User_608 verify Back button available in Contact Details screen under Additional Customer Info tab
And User_608 verify Save button available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Details section available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email Details section available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Number field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Consent for Phone contact field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Prefered Phone Cotact Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Prefered Time for Contact field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email ID field available in Contact Details screen under Additional Customer Info tab
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_02
Scenario: Creation of Contact Details record - To verify the functionality of save button & verify system display the confirmation message

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under Contact Details section in Additional Customer Info tab
And User_608 select Phone Type value from dropdown in Contact Details screen
And User_608 enter the Phone Number in Contact Details screen
And User_608 select Consent for Phone contact value from dropdown in Contact Details screen
And User_608 select Prefered Phone Cotact Type value from dropdown in Contact Details screen
And User_608 select Email Type value from dropdown in Contact Details screen
And User_608 enter the Email ID in Contact Details screen
And User_608 click the Save button under Contact Details screen
And User_608 verify the Confimation message post clicking on save button in Contact Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_03
Scenario: Creation of Contact Details record - Verify the below fields should Mandatory/non-mandatory, editable and LOV/textbox

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under Contact Details section in Additional Customer Info tab
And User_608 verify Phone Type field as Mandatory, Editable and Dropdown in Contact Details screen
And User_608 verify Phone Number field as Mandatory, Editable and Numeric in Contact Details screen
And User_608 verify Consent for Phone contact field as Non-mandatory, Editable and Dropdown in Contact Details screen
And User_608 verify Prefered Phone Cotact Type field as Non-mandatory, Editable and Dropdown in Contact Details screen
And User_608 verify Prefered Time for Contact field as Non-mandatory, Editable and Textbox with HH:MM format in Contact Details screen
And User_608 verify Email Type field as Non-mandatory, Editable and Dropdown in Contact Details screen
And User_608 verify Email ID field as Non-mandatory, Editable and textbox with valid email id format in Contact Details screen
And User_608 click the Help button under Contact Details screen
And User_608 verify post clicking on help button system should display the description of all the fields in Contact Details screen
And User_608 click the Back button under Contact Details screen
And User_608 verify post clicking on Back button system should navigate to the previous screen under Additional Customer Info tab
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_04
Scenario: Creation of Contact Details record - Impact when user enters special characters & keep any mandatory field blank in Contact Details screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under Contact Details section in Additional Customer Info tab
And User_608 enter the Special Character value in any field under Contact Details screen
#And User_608 to verify the impact when user enters special characters value in Contact Details screen
And User_608 enter the Characters values in numeric field under Contact Details screen
And User_608 to verify the impact when user enter characters value in numeric field under Contact Details screen
And User_608 click the Save button user keep any mandatory field blank in Contact Details screen
And User_608 to verify the impact when user keep any mandatory field blank in Contact Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_05
Scenario: Modification of Contact Details record - While modification verfiy the below fields are available & user enters invalid data & keep any mandatory field blank in Contact details screen 

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Contact Details record Edit button under Contact Details section in Additional Customer Info tab
And User_608 verify Back button available in Contact Details screen under Additional Customer Info tab
And User_608 verify Update button available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Details section available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email Details section available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Phone Number field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Consent for Phone contact field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Prefered Phone Cotact Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Prefered Time for Contact field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email Type field available in Contact Details screen under Additional Customer Info tab
And User_608 verify Email ID field available in Contact Details screen under Additional Customer Info tab
And User_608 click the Update button while modification when user keep any mandatory field blank in Contact Details screen
And User_608 verify validation message for while modification when user keep any mandatory field blank in Contact Details screen
And User_608 while modification system enters the invalid data in Contact Details screen
And User_608 verify system should not allow user to do a modification with invalid data in Contact Details screen
And User_608 to verify system allow user to modify the record with valid data in Contact Details screen
And User_608 to verify while modification system allow user to Update the record with valid data in Contact Details screen
And User_608 to verify the Confimation message post clicking on Update button in Contact Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_06
Scenario: Modification of Contact Details record - To verify Active/In-active functionality

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Active record Edit button in Contact Details section under Additional Customer Info tab
And User_608 click the Status toggle button in Contact Details screen
And User_608 click the Update button under Contact Details screen
And User_608 verify if Status is Active post clicking on toggle button system should show Deactivate in Contact Details screen
And User_608 click the Deactivate record Edit button in Contact Details section under Additional Customer Info tab
And User_608 click the Status toggle button in Contact Details screen
And User_608 click the Update button under Contact Details screen
And User_608 verify if Status is Deactivate post clicking on toggle button system should show Active in Contact Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_07
Scenario: Modification of Contact Details record - To verify the functionality of Back button in Contact details screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Contact Details record Edit button under Contact Details section in Additional Customer Info tab
And User_608 click the Back button under Contact Details screen
And User_608 verify post clicking on Back button system should navigate to the previous screen under Additional Customer Info tab
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_08
Scenario: Listview of Contact Details record - To verify the Contact Details List view below field are available

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 verify Add button available under Contact details section in Additional Customer Info tab
And User_608 verify Search button available under Contact details section in Additional Customer Info tab
And User_608 verify Export PDF button available under Contact details section in Additional Customer Info tab
And User_608 verify Export Excel button available under Contact details section in Additional Customer Info tab
And User_608 verify Phone Type field available under Contact Details section listview in Additional Customer Info tab
And User_608 verify Phone Number field available under Contact Details section listview in Additional Customer Info tab
And User_608 verify Email Type field available under Contact Details section listview in Additional Customer Info tab
And User_608 verify Email ID field available under Contact Details section listview in Additional Customer Info tab
And User_608 verify Status field available under Contact Details section listview in Additional Customer Info tab
And User_608 verify values in listview should be non-editable and must be populated correctly under Contact Details section
And User_608 to verify the functionality of Add button under Contact Details section in Additional Customer Info tab
And User_608 verify post clicking on Add button system should allow user to create new record of Contact Details
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CD_09
Scenario: Listview of Contact Details record - To verify the Contact Details List view below field are available

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CD_09
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Export button under Contact Details section in Additional Customer Info tab
And User_608 to verify the functionality of Export to PDF button under Contact Details section
And User_608 verify post clicking on PDF button system should download PDF file of that records in Contact Details section
And User_608 click the Export button under Contact Details section in Additional Customer Info tab
And User_608 to verify the functionality of Export to Excel button under Contact Details section
And User_608 verify post clicking on XLS button system should download Excel file of that records in Contact Details section
And User_608 click the Search button under Contact Details section in Additional Customer Info tab
And User_608 to verify functionality of Search box with matching data under Contact Details section
And User_608 verify system should display all the possible matching records under Contact Details section
And User_608 to verify functionality of Search box with mismatch data under Contact Details section
And User_608 verify system should not display any records or system should display the message as No data found under Contact Details section
Then logout from the ULS Application
And User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage