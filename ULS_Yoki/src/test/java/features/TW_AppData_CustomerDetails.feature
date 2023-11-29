Feature: To check the Tawarruq --> App Data Entry stage --> Customer details screen


@AT_TW_CD_01_01
Scenario: Personal Details screen should get open with Customer Information screen and below mentioned Fields

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_CD_01_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Details tab
And User_608 click the Add button under Customer Details tab
And User_608 verify Back button is available under Customer Information screen
And User_608 verify Save button is available under Customer Information screen
And User_608 verify Applicant Type field available under Customer Information screen
And User_608 verify Customer Type field available under Customer Information screen
And User_608 verify Title field available under Customer Information screen
And User_608 verify First Name field available under Customer Information screen
And User_608 verify Middle Name field available under Customer Information screen
And User_608 verify Last Name field available under Customer Information screen
And User_608 verify Family Name	field available under Customer Information screen
And User_608 verify First Name(Arabic) field available under Customer Information screen
And User_608 verify Middle Name(Arabic) field available under Customer Information screen
And User_608 verify Last Name(Arabic) field available under Customer Information screen
And User_608 verify Family Name(Arabic)	field available under Customer Information screen
And User_608 verify Date of Birth field available under Customer Information screen
And User_608 verify Age field available under Customer Information screen
And User_608 verify Gender field available under Customer Information screen
And User_608 verify Marital Status field available under Customer Information screen
And User_608 verify Education Level field available under Customer Information screen
And User_608 verify Nationality field available under Customer Information screen
And User_608 verify Residential Status field available under Customer Information screen
And User_608 verify Language field available under Customer Information screen
And User_608 verify No of Dependents field available under Customer Information screen
And User_608 verify Client Category field available under Customer Information screen
And User_608 verify Blocklisted field available under Customer Information screen
And User_608 verify Credit Bureau field available under Customer Information screen
And User_608 verify Remarks field available under Customer Information screen
Then logout from the ijaraApplication


@AT_TW_CD_01
@AT_TW_CD_01_01
Scenario: Verify the below fields are Mandatory/Non-Mandatory,Editable/Non-Editable,Dropdown/Input

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_CD_01_01
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Details tab
And User_608 click the Pencil icon button under Customer Details tab
And User_608 verify Applicant Type field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Customer Type field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Title field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify First Name field as Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Middle Name field as Non-Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Last Name field as Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Family Name field as Non-Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify First Name(Arabic) field as Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Middle Name(Arabic) field as Non-Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Last Name(Arabic) field as Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Family Name(Arabic) field as Non-Mandatory, Editable and Textbox under Customer Information screen
And User_608 verify Date of Birth field as Mandatory, Editable and Calender under Customer Information screen
And User_608 verify age field as Non-Mandatory, Non-Editable and Texbox under Customer Information screen
And User_608 verify Gender field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Marital Status field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Education Level field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Nationality field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Residential Status field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Language field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify No of Dependents field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Client Category field as Mandatory, Editable and Dropdown under Customer Information screen
And User_608 verify Blocklisted field as Non-Mandatory, Editable and Toggle button under Customer Information screen
And User_608 verify Remarks field as Non-Mandatory, Editable and Texbox under Customer Information screen
And User_608 click the Back button under Customer Information screen
And User_608 verify post clicking on Back button system should navigate to the previous screen under Customer Details tab
Then logout from the ijaraApplication



@AT_TW_CD_01_02
Scenario: Contact Details screen should get open with Customer Information screen and below mentioned Fields.

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_CD_01_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Additional Customer Info tab
And User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab
And User_608 click the Add button under Contact details section in Additional Customer info tab
And User_608 verfiy Back button is available under Contact details screen
And User_608 verfiy Save button is available under Contact details screen
And User_608 verify Phone Type is available and field should be LOV, editable under Contact details screen
And User_608 verify Phone Number is available and field should be number, editable under Contact details screen
And User_608 verify Consent For Phone Contact is available and field should be LOV, editable under Contact details screen
And User_608 verify Prefered Phone Contact Type is available and field should be LOV, editable under Contact details screen
And User_608 verify Prefered Time For Contact is available and field should be HH:MM format, editable under Contact details screen
And User_608 verify Email Type is available and field should be LOV, editable under Contact details screen
And User_608 verify Email ID is available and field should be Email format, editable under Contact details screen
Then logout from the ijaraApplication



@AT_TW_CD_02
Scenario: Personal Details screen should get open with Customer Information screen and below mentioned Fields

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_CD_02
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Customer Details tab
And User_608 click the Add button under Customer Details tab

And User_608 select the Salutation Title in Customer Information screen
And User_608 enter the First Name in Customer Information screen
And User_608 enter the Last Name in Customer Information screen
And User_608 click the Save button with mandatory field is blank in Customer Information screen
And User_608 verify Mandatory blank field validation message in Customer Information screen

And User_608 enter the Special charater in any field and verify the validation message in Customer Information screen
And User_608 enter the Negative number in numberic field and verify the validation message in Customer Information screen

Then logout from the ijaraApplication


