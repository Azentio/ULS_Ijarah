Feature: To check the Murabaha --> App Data Entry stage --> Asset Details screen

@AT_MU_ADE_IAD_01
Scenario: Creation of Asset Details record - Asset Details should get open with all valid fields and buttons & Post clicking on save button system should display the confirmation message

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Add button under Asset Details tab
And User_608 verify Back button availble in Asset Details screen
And User_608 verify Save button availble in Asset Details screen
And User_608 select the Asset Category under Asset Details section in Asset Details screen
And User_608 select the Asset Type under Asset Details section in Asset Details screen
And User_608 select the Asset Manufacture under Asset Details section in Asset Details screen
And User_608 select the Asset Model under Asset Details section in Asset Details screen
And User_608 select the Asset Model Type under Asset Details section in Asset Details screen
And User_608 select the Asset Condition under Asset Details section in Asset Details screen
And User_608 enter Chasis Number under Asset Details section in Asset Details screen
And User_608 enter Plate Number under Asset Details section in Asset Details screen
And User_608 enter Plate Number Arabic under Asset Details section in Asset Details screen
And User_608 to verify the impact when user keep any mandatory field and click on save button in Asset Details screen
And User_608 to verify system should show the proper validation message for blank field in Asset Details screen
And User_608 select the Asset Dealer under Dealer Details section in Asset Details screen
And User_608 enter Asset Price under Asset Price & Down Payment Details section in Asset Details screen
And User_608 select the Asset Fulfilment Location under Asset Price & Down Payment Details section
And User_608 select the Location of Signing under Asset Price & Down Payment Details section
And User_608 enter Remarks under Asset Price & Down Payment Details section in Asset Details screen
And User_608 clicks on the Save button under Asset Details screen
And User_608 verify post clicking on save button system should display the confirmation message
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_02
Scenario: Creation of Asset Details record - Asset Details should get open with all valid fields and buttons under Asset Details sections: 

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Add button under Asset Details tab
And User_608 verify Asset Category field available under Asset Details section in Asset Details screen
And User_608 verify Asset Type field available under Asset Details section in Asset Details screen
And User_608 verify Asset Manufacture field available under Asset Details section in Asset Details screen
And User_608 verify Asset Model under field available under Details section in Asset Details screen
And User_608 verify Asset Model Type field available under Asset Details section in Asset Details screen
And User_608 verify Year Of Manufacture field available under Asset Details section in Asset Details screen
And User_608 verify Asset Condition field available under Asset Details section in Asset Details screen
And User_608 verify Asset Color field available under Asset Details section in Asset Details screen
And User_608 verify Drivetrine field available under Asset Details section in Asset Details screen
And User_608 verify Number of Cylinder field available under Asset Details section in Asset Details screen
And User_608 verify Volume Of Engine field available under Asset Details section in Asset Details screen
And User_608 verify Number Of Units field available under Asset Details section in Asset Details screen
And User_608 verify Chasis Number field available under Asset Details section in Asset Details screen
And User_608 verify Plate Number field available under Asset Details section in Asset Details screen
And User_608 verify Plate Number Arabic field available under Asset Details section in Asset Details screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_03
Scenario: Creation of Asset Details record - To verfiy the below fields funcionality in Asset Detils section

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Add button under Asset Details tab
And User_608 verify Asset Category field as Mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Asset Type field as Mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Asset Manufacture field as Mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Asset Model under field as Mandatory, Editable and Lookup value in Details section
And User_608 verify Asset Model Type field as Mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Year Of Manufacture field as Non-mandatory, Editable and Calendar in Asset Details section
And User_608 verify Asset Condition field as Mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Asset Color field as Non-mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Drivetrine field as Non-mandatory, Editable and Lookup value in Asset Details section
And User_608 verify Number of Cylinder field as Non-mandatory, Editable and Numeric in Asset Details section
And User_608 verify Volume Of Engine field as Non-mandatory, Editable and Numeric in Asset Details section
And User_608 verify Number Of Units field as Non-mandatory, Editable and Numeric in Asset Details section
And User_608 verify Chasis Number field as Mandatory, Editable and Textbox in Asset Details section
And User_608 verify Plate Number field as Mandatory, Editable and Textbox in Asset Details section
And User_608 verify Plate Number Arabic field as Mandatory, Editable and Textbox in Asset Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_05
Scenario: Creation of Asset Details record - Asset Price and Down Payment Details section should get open with all valid fields in proper format

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Add button under Asset Details tab
And User_608 verify Asset Price field available under Asset Price and Down Payment Details section
And User_608 verify Down Payment field available under Asset Price and Down Payment Details section
And User_608 verify Down Payment Percentage field available under Asset Price and Down Payment Details section
And User_608 verify Green Card Issue Date field available under Asset Price and Down Payment Details section
And User_608 verify Residual Value field available under Asset Price and Down Payment Details section
And User_608 verify Green Card No field available under Asset Price and Down Payment Details section
And User_608 verify Weight field available under Asset Price and Down Payment Details section
And User_608 verify Mileage field available under Asset Price and Down Payment Details section
And User_608 verify Country Of Manufacturing field available under Asset Price and Down Payment Details section
And User_608 verify Asset Fulfilment Location field available under Asset Price and Down Payment Details section
And User_608 verify Location of Signing field available under Asset Price and Down Payment Details section
And User_608 verify Asset Receive Location field available under Asset Price and Down Payment Details section
And User_608 verify Remarks field available under Asset Price and Down Payment Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_06
Scenario: Creation of Asset Details record - Asset Price and Down Payment Details section should get open with all valid fields in proper format

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_06
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Add button under Asset Details tab
And User_608 verify Asset Price field as Mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Down Payment field as Non-mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Down Payment Percentage field as Non-mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Green Card Issue Date field as Non-mandatory, Editable and Date Asset Price and Down Payment Details section
And User_608 verify Residual Value field as Non-mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Green Card No field as Non-mandatory, Editable and Textbox in Asset Price and Down Payment Details section
And User_608 verify Weight field as Non-mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Mileage field as Non-mandatory, Editable and Numeric in Asset Price and Down Payment Details section
And User_608 verify Country Of Manufacturing field as Non-mandatory, Editable and Lookup in Asset Price and Down Payment Details section
And User_608 verify Asset Fulfilment Location field as Mandatory, Editable and Lookup in Asset Price and Down Payment Details section
And User_608 verify Location of Signing field as Mandatory, Editable and Lookup in Asset Price and Down Payment Details section
And User_608 verify Asset Receive Location field as Non-mandatory, Editable and Lookup in Asset Price and Down Payment Details section
And User_608 verify Remarks field as Mandatory, Editable and Textbox in Asset Price and Down Payment Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_07
Scenario: Modification of Asset Details record - To verify below sections,button are available & while modification system allow user to save the record with valid data

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_07
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the record Edit button under Asset Details tab
And User_608 to verify Update button available in Asset Details screen
And User_608 to verify Asset Details section available in Asset Details screen
And User_608 to verify Dealer Details section available in Asset Details screen
And User_608 to verify Registration Details section available in Asset Details screen
And User_608 to verify Asset Price and Down Payment Details section available in Asset Details screen
And User_608 verify system allow user modify the record in Asset Details screen
And User_608 to verify while modification, keep any mandatory field blank and click on update button in Asset Details screen
And User_608 to verify system should show the proper validation message for blank field in Asset Details screen
And User_608 to verify while modification system allow user to update the record with valid data in Asset Details screen
And User_608 clicks on the Update button under Asset Details screen
And User_608 to verify system display the confirmation message post clicking on update button
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_08
Scenario: List view of of Asset Details - System display the below mention fields on List view in Asset Details & verify functionality of Add and Edit button

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_08
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 verify Add button is available in list view under Asset Details tab
And User_608 verify Edit button is available in list view under Asset Details tab
And User_608 verify Search button is available in list view under Asset Details tab
And User_608 verify Export to PDF button is available in list view under Asset Details tab
And User_608 verify Export to Excel button is available in list view under Asset Details tab
And User_608 verify Showing records entries field available in list view under Asset Details tab
And User_608 verify Asset Manufacture field available in list view under Asset Details tab
And User_608 verify Asset Model field available in list view under Asset Details tab
And User_608 verify Asset Model Type field available in list view under Asset Details tab
And User_608 verify Year of Manufacture field available in list view under Asset Details tab
And User_608 verify Asset Price field available in list view under Asset Details tab
And User_608 verify Status field available in list view under Asset Details tab
And User_608 verify values in List view should be non editable under Asset Details tab
And User_608 verify the functionality of Add button under Asset Details tab
And User_608 click the Back button in Asset Details screen
And User_608 verify the functionality of Edit button under Asset Details tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_09
Scenario: List view of of Asset Details - To verify the functionality of Search box with matching data & mismatch data

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_09
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Search button under Asset Details tab
And User_608 to verify the functionality of Search box with matching data under Asset Details tab
And User_608 to verify post entering any matching value system should display all the possible matching records
And User_608 to verify the functionality of Search box with mismatch data under Asset Details tab
And User_608 to verify post entering any mismatch value system should not display any records
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage

@AT_MU_ADE_IAD_10
Scenario: List view of of Asset Details - To verify the functionality of Export to PDF & Excel button

Given navigate the IJARA URL
And login with valid credentials-Murabaha App Data Entry
And User_608 get the test data for test case AT_MU_ADE_IAD_10
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 clicks on the Asset Details tab
And User_608 click the Export button under Asset Details Tab
And User_608 to verify the functionality of Export to PDF button under Asset Details Tab
And User_608 to verify post clicking on PDF button system should download the PDF file of that records in Asset Details
And User_608 click the Export button under Asset Details Tab
And User_608 to verify the functionality of Export to Excel button under Asset Details Tab
And User_608 to verify post clicking XLS button system should download the xls file of that records in Asset Details
Then logout from the ijaraApplication
And User_608 invoke soft assert in Asset Details screen at Murabaha App Data Entry stage