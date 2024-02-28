Feature: To check the Consumer Durable - App Data Entry -> Additional Customer info tab -> Customer Reference Details screen

@AT_CD_ADE_CR_01
Scenario: Creation of Reference Details record - Customer Reference details screen should get open with below mentioned Fields and buttons 

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under References List View section in Additional Customer Info tab
And User_608 verify Back button available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Save button available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Relationship Type field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Salutaion field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify First Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Middle Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Last Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Customer Full Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Identification Type field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Identification Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Residence Address field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Office Address field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Contact Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Office Phone Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Primary Mobile Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Alternative Mobile Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Email ID field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify No of Years Known field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify CIF Number field available in Customer Reference screen under Additional Customer Info tab
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_02
Scenario: Creation of Reference Details record - To verify the functionality of save button post entering all valid details & system display the confirmation message post clicking on save button  

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under References List View section in Additional Customer Info tab
And User_608 select Relationship Type from dropdown in Customer Reference screen under Additional Customer Info tab
And User_608 select Salutaion from dropdown in Customer Reference screen under Additional Customer Info tab
And User_608 enter the First Name value in Customer Reference screen under Additional Customer Info tab
And User_608 enter the Last Name value in Customer Reference screen under Additional Customer Info tab
And User_608 select the Identification Type from dropdown in Customer Reference screen under Additional Customer Info tab
And User_608 enter the Identification Number in Customer Reference screen under Additional Customer Info tab
And User_608 enter the Primary Mobile Number in Customer Reference screen under Additional Customer Info tab
And User_608 enter the Email ID in Customer Reference screen under Additional Customer Info tab
And User_608 enter No of Years Known value in Customer Reference screen under Additional Customer Info tab
And User_608 click the Save button under Customer Reference Details screen
And User_608 verify the Confimation message post clicking on save button in Customer Reference Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_03
Scenario: Creation of Reference Details record - Verify the below fields should Mandatory/non-mandatory, editable and LOV/textbox in Reference Details screen  

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under References List View section in Additional Customer Info tab
And User_608 verify Relationship Type field should be Mandatory, Editable and Dropdown in Customer Reference screen
And User_608 verify Salutaion field should be Mandatory, Editable and Dropdown in Customer Reference screen
And User_608 verify First Name field should be Mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Middle Name field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Last Name field should be Mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Customer Full Name field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Identification Type field should be Non-mandatory, Editable and Dropdown in Customer Reference screen
And User_608 verify Identification Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Residence Address field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Office Address field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Contact Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Office Phone Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Primary Mobile Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Alternative Mobile Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify Email ID field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify No of Years Known field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 verify CIF Number field should be Non-mandatory, Editable and textbox in Customer Reference screen
And User_608 click the Help button under Customer Reference screen
And User_608 verify post clicking on help button system should display the description of all the fields in Customer Reference screen
And User_608 click the Back button under Customer Reference screen
And User_608 verify post clicking on Back button in Customer Reference screen system should navigate to the previous screen
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_04
Scenario: Creation of Reference Details record - Impact when user enters Characters in Numeric field, enters special characters & keep any mandatory field blank in Reference Details screen  

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click Add button under References List View section in Additional Customer Info tab
And User_608 click the Save button user keep any mandatory field blank in Customer Reference Details screen
And User_608 to verify the impact when user keep any mandatory field blank in Customer Reference Details screen
And User_608 enters the Special Character values in any field under Customer Reference Details screen
And User_608 to verify the impact when user enters special characters value in Customer Reference Details screen
And User_608 enter the Characters values in numeric field under Customer Reference Details screen
And User_608 to verify the impact when user enter characters value in numeric field under Customer Reference Details screen
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_05
Scenario: Modification of Customer Reference record - While modification verfiy the below fields are available & user enters invalid data & keep any mandatory field blank in Customer Reference screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Reference Details record Edit button under References List View section in Additional Customer Info tab
And User_608 verify Back button available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Save button available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Help button available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Relationship Type field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Salutaion field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify First Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Middle Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Last Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Customer Full Name field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Identification Type field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Identification Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Residence Address field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Office Address field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Contact Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Office Phone Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Primary Mobile Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Alternative Mobile Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify Email ID field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify No of Years Known field available in Customer Reference screen under Additional Customer Info tab
And User_608 verify CIF Number field available in Customer Reference screen under Additional Customer Info tab
And User_608 verfiy Status field available in Customer Reference screen under Additional Customer Info tab
And User_608 click the Update button while modification when user keep any mandatory field blank in Customer Reference screen
And User_608 verify validation message for while modification when user keep any mandatory field blank in Customer Reference screen
And User_608 while modification system enters the invalid data in Customer Reference screen
And User_608 verify system should not allow user to do a modification with invalid data in Customer Reference screen
And User_608 to verify system allow user to modify the record with valid data in Customer Reference screen
And User_608 to verify while modification system allow user to Update the record with valid data in Customer Reference screen
And User_608 to verify the Confimation message post clicking on Update button in Customer Reference screen
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_06
Scenario: Modification of Customer Reference record - To verify the functionality of Activate/Deactivate button  

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Active records Edit button in References List View section under Additional Customer Info tab
And User_608 click the Status toggle button in Customer Reference Details screen
And User_608 click the Update button under Customer Reference Details screen
And User_608 get the updated record ID for Customer Reference Details record
And User_608 get the test data for test case AT_CD_ADE_CR_06
And User_608 click the Search button under References List View section in Additional Customer Info tab
And User_608 search the record ID under References List View section
And User_608 to verify if Status is Active then click Status toggle button system should show Deactivate in References List View section
And User_608 click the Deactivate record Edit button in References List View section under Additional Customer Info tab
And User_608 click the Status toggle button in Customer Reference Details screen
And User_608 click the Update button under Customer Reference Details screen
And User_608 get the updated record ID for Customer Reference Details record
And User_608 get the test data for test case AT_CD_ADE_CR_06
And User_608 search the record ID under References List View section
And User_608 verify if Status is Deactivate post clicking on toggle button system should show Active in References List View section
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_07
Scenario: Modification of Customer Reference record - To verify the functionality of Back button in Customer Reference screen

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Reference Details record Edit button under References List View section in Additional Customer Info tab
And User_608 click the Back button in in Customer Reference Details screen
And User_608 verify post clicking on Back button system should navigate to the previous screen in Additional Customer Info tab
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_08
Scenario: Listview of Customer Reference - System should display the below mention fields on List view of Customer Reference & values should not editable

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 verify Add button available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Search button available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Export PDF button available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Export Excel button available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Salutation field available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Name field available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Mobile Number field available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Years Known field available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify Status field available under Customer Reference section listview in Additional Customer Info tab
And User_608 verify values in listview should be non-editable and must be populated correctly under Customer Reference section
And User_608 to verify the functionality of Add button under Customer Reference section in Additional Customer Info tab
And User_608 verify post clicking on Add button system should navigate user to create a new record of Customer Reference details
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage

@AT_CD_ADE_CR_09
Scenario: Listview of Customer Reference - To verify the functionality of Export to PDF & XLS and functionality of Search box with matching data & Mismatching data

Given navigate the IJARA URL
And login with valid credentials - Consumer Durable - App Data Entry
And User_608 get the test data for test case AT_CD_ADE_CR_09
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference ID for Consumer Durable
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Export button under References List View section in Additional Customer Info tab
And User_608 to verify the functionality of Export to PDF button under References List View section
And User_608 verify post clicking on PDF button system should download PDF file of that records in References List View section
And User_608 click the Export button under References List View section in Additional Customer Info tab
And User_608 to verify the functionality of Export to Excel button under References List View section
And User_608 verify post clicking on XLS button system should download Excel file of that records in References List View section
And User_608 click the Search button under References List View section in Additional Customer Info tab
And User_608 to verify functionality of Search box with matching data under References List View section
And User_608 verify system should display all the possible matching records under References List View section
And User_608 to verify functionality of Search box with mismatch data under References List View section
And User_608 verify system should not display any records or system should display the message as No data found under References List View section
Then logout from the ULS Application
And User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage