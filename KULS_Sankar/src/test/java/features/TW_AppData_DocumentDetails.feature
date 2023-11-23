Feature: To check the Tawarruq --> App Data Entry stage --> Document details screen

# DOC_01_19 --> DOC_01_23
@AT_TW_AD_DOC_05
Scenario: To verify the below fields are Dropdown, Textbox, Mandatory/Non-Mandatory and Editable

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_AD_DOC_05
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Document Details tab
And User_608 click the Add button under Document Details tab
And User_608 verify Document Category field should be Mandatory and LOV Under Document Details tab
And User_608 verify Expected Receipt Date field should be Non-mandatory and Date Under Document Details tab
And User_608 verify Def Approved By field should be Non-mandatory and LOV Under Document Details tab
And User_608 verify Change In Nature Approved By field should be Non-mandatory and LOV Under Document Details tab
And User_608 verify Document Form field should be Non-mandatory, Editable and LOV Under Document Details tab
Then logout from the ijaraApplication
And User_608 invoke soft assert in Document details screen under Document Details tab at Tawarruq App Data Entry stage