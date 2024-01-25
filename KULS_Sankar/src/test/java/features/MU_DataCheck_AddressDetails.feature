Feature: To check Murabaha -- App data check -- Address Details screen

@AT_MU_DATACHECK_ADC_01
Scenario: Address details screen should be available with valid fields in proper format with below mentioned fields

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_DATACHECK_ADC_01
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Eye button under Customer Personal Info section in Additional Customer Info tab
And User_608 click the Eye button under Address Details section in Additional Customer Info tab
And User_608 verify Back button available in Address Details screen under Additional Customer info tab
And User_608 verify Address Type field available in Address Details screen under Additional Customer info tab
And User_608 verify Address Status field available in Address Details screen under Additional Customer info tab
And User_608 verify Residential Status field available in Address Details screen under Additional Customer info tab
And User_608 verify Communication Address field available in Address Details screen under Additional Customer info tab
And User_608 verify Location Category field available in Address Details screen under Additional Customer info tab
And User_608 verify Address Line1 field available in Address Details screen under Additional Customer info tab
And User_608 verify Address Line2 field available in Address Details screen under Additional Customer info tab
And User_608 verify Country field available in Address Details screen under Additional Customer info tab
And User_608 verify Province ID field available in Address Details screen under Additional Customer info tab
And User_608 verify District Name field available in Address Details screen under Additional Customer info tab
And User_608 verify City field available in Address Details screen under Additional Customer info tab
And User_608 verify Zip Code field available in Address Details screen under Additional Customer info tab
And User_608 verify PO Box Number field available in Address Details screen under Additional Customer info tab
And User_608 verify Mobile Number field available in Address Details screen under Additional Customer info tab
And User_608 verify Duration of Stay field available in Address Details screen under Additional Customer info tab
And User_608 verify Latitude Details field available in Address Details screen under Additional Customer info tab
And User_608 verify Longitude Details field available in Address Details screen under Additional Customer info tab
And User_608 verify Landmark field available in Address Details screen under Additional Customer info tab
And User_608 verify Occupancy Date field available in Address Details screen under Additional Customer info tab
And User_608 verify Landlord Name field available in Address Details screen under Additional Customer info tab
And User_608 verify Landlord Mobile Number field available in Address Details screen under Additional Customer info tab
And User_608 verify Rent Amount field available in Address Details screen under Additional Customer info tab
And User_608 verify Frequency of Rent field available in Address Details screen under Additional Customer info tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Address Details screen at Murabaha App Data Check stage

@AT_MU_DATACHECK_ADC_02
Scenario: To verify the below field are mandatory, display only and Dropdown/Textbox in Address Details screen

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_DATACHECK_ADC_02
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Eye button under Customer Personal Info section in Additional Customer Info tab
And User_608 click the Eye button under Address Details section in Additional Customer Info tab
And User_608 verify Address Type field as Mandatory, display only and Dropdown in Address Details screen
And User_608 verify Address status field as Mandatory, display only and Dropdown in Address Details screen
And User_608 verify Residential Status field as Mandatory, display only and Dropdown in Address Details screen
And User_608 verify Communication Address field as display only and Toggle button in Address Details screen
And User_608 verify Location Category field as display only and Dropdown in Address Details screen
And User_608 verify Address line1 field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify Address line2 field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify Country field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify Province Id field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify District Name field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify City field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify Zip code field as Mandatory, display only and Textbox in Address Details screen
And User_608 verify PO Box Number field as Editable and Textbox in Address Details screen
And User_608 verify Mobile number field as Editable and Textbox in Address Details screen
And User_608 verify Duration Of Stay field as display only and Textbox in Address Details screen
And User_608 verify Latitude Details Of the Address field as display only and Textbox in Address Details screen
And User_608 verify Longitude Details Of the Address field as display only and Textbox in Address Details screen
And User_608 verify Land Mark field as display only and Textbox in Address Details screen
And User_608 verify Occupancy Date field as Mandatory, display only and Date in Address Details screen
And User_608 verify Landlord Name field as display only and Textbox in Address Details screen
And User_608 verify Landlord Mobile number field as display only and Textbox in Address Details screen
And User_608 verify Rent Amount field as display only and Textbox in Address Details screen
And User_608 verify Frequency Of Rent field as display only and Dropdown in Address Details screen
And User_608 verify Status field as toggle button in Address Detais screen
And User_608 verify the functionality of Back button in Address Detais screen
And User_608 verify post clicking on back button system should navigate to the previous screen
Then logout from the ijaraApplication
And User_608 invoke soft assert in Address Details screen at Murabaha App Data Check stage

@AT_MU_DATACHECK_ADC_03
Scenario: Address Detail List view - System should display the below mention fields on List view of Address Details section

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_DATACHECK_ADC_03
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Eye button under Customer Personal Info section in Additional Customer Info tab
And User_608 verify Search button available in listview under Address Details section
And User_608 click the Export button under Address Details section in Additional Customer Info tab
And User_608 verify PDF button available in listview under Address Details section
And User_608 verify Excel button available in listview under Address Details section
And User_608 verify Address Type field available in listview under Address Details section
And User_608 verify Country field available in listview under Address Details section
And User_608 verify Occupancy Status field available in listview under Address Details section
And User_608 verify Occupance Since field available in listview under Address Details section
And User_608 verify Contact Address field available in listview under Address Details section
And User_608 verify Status field available in listview under Address Details section
And User_608 verify values in List view should be non editable under Address Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Address Details screen at Murabaha App Data Check stage

@AT_MU_DATACHECK_ADC_04
Scenario: Address Detail List view - To verify the functionality of Search box with matching & mismatched data

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_DATACHECK_ADC_04
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Eye button under Customer Personal Info section in Additional Customer Info tab
And User_608 click the Search button under Address Details section in Additional Customer Info tab
And User_608 to verify the functionality of Search box with matching data under Address Details section
And User_608 to verify post entering any matching value system display all the possible matching records in Address Details section
And User_608 to verify the functionality of Search box with mismatch data under Address Details section
And User_608 to verify post entering any mismatch value system should not display any records in Address Details section
Then logout from the ijaraApplication
And User_608 invoke soft assert in Address Details screen at Murabaha App Data Check stage

@AT_MU_DATACHECK_ADC_05
Scenario: Address Detail List view - To verify the functionality of Export to PDF and Excel button

Given navigate the IJARA URL
And login with valid credentials-Murabaha Data Check stage
And User_608 get the test data for test case AT_MU_DATACHECK_ADC_05
And User_608 click the module name dropdown in ULS application
And User_608 select the module name as LOS in ULS application
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Ref id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Eye button under Customer Personal Info section in Additional Customer Info tab
And User_608 click the Export button under Address Details section in Additional Customer Info tab
And User_608 to verify the functionality of Export to PDF button under Address Details section
And User_608 to verify post clicking on PDF button system should download the PDF file of that records in Address Details
And User_608 click the Export button under Address Details section in Additional Customer Info tab
And User_608 to verify the functionality of Export to Excel button under Address Details section
And User_608 to verify post clicking XLS button system should download the xls file of that records in Address Details
Then logout from the ijaraApplication
And User_608 invoke soft assert in Address Details screen at Murabaha App Data Check stage