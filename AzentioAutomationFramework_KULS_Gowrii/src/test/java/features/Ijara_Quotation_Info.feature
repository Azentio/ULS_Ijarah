Feature: To verify the functionality of Quotation info
#QIA_01_01,QIA_01_02,QIA_01_03,QIA_01_04
@AT_QIA_001
Scenario: To verify user is able to add new Quotation Info  record in the system by entering valid data
Given navigate the IJARA URL
And login with valid credentials
And user_615 update test data set id for AT_QIA_001
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And user_615 click entitle button
Then user_615 click quotation info tab
And user_615 click edit icon 
Then user_615 verify the insurance company field
And user_615 verify the base premium field
And user_615 verify the VAT on Base Premium field
And user_615 verify the Net Base Premium field
Then user_615 verify the Total Discount field
And user_615 verify the Expiry Date field
Then user_615 verify the Quotation Reference Number field
And user_615 click save button
#Then user_615 validate the success message popup with close button
Then user_615 click back button

#QIA_01_05,QIA_01_06,QIA_01_07,QIA_01_08,QIA_01_09,QIA_01_10,QIA_01_11,QIA_01_12
@AT_QIA_002
Scenario: To verify all the fields are mandatory and editable in quotation info tab
Given navigate the IJARA URL
And login with valid credentials
And user_615 update test data set id for AT_QIA_002
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And user_615 click entitle button
Then user_615 click quotation info tab
And user_615 click edit icon 
And user_615 verify insurance company field is mandatory
Then user_615 verify insurance company field is editable
And user_615 verify the base premium field is mandatory
Then user_615 verify the base premium field is editable
And user_615 verify the VAT on Base Premium field is mandatory
And user_615 verify the VAT on Base Premium is editable 
Then user_615 verify the VAT on Base Premium field only accept the numeric values 
And user_615 verify the Net Base Premium field is mandatory
Then user_615 verify the Net Base Premium field is editable
And user_615 verify the Net Base Premium field only accept the numeric values 
Then user_615 verify the Total Discount field is mandatory
And user_615 verify the Total Discount field is editable
And user_615 verify Total Discount field is only accept the numeric values 
Then user_615 verify the Expiry Date field is mandatory 
And user_615 verify the Expiry Date field is editable 
And user_615 verify the Expiry Date field should be in date format
Then user_615 verify the Quotation Reference Number field is mandatory
And user_615 verify the Quotation Reference Number field is editable
And user_615 verify Quotation Reference Number field is only accept the numeric values
Then user_615 verify Quotation Reference Number field should be in textbox
Then user_615 click back button

#QIA_02_01,QIA_02_02,QIA_02_03,QIA_02_04
@AT_QIA_003
Scenario: To verify user is able to add new Quotation Info record in the system by entering invalid data
Given navigate the IJARA URL
And login with valid credentials
And user_615 update test data set id for AT_QIA_003
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And user_615 click entitle button
Then user_615 click quotation info tab
And user_615 click edit icon 
And user_615 click base premium amount field
And user_615 click save button 
Then user_615 verify the please fill the details popup
And user_615 click VAt on base premium amount field
And user_615 enter the negative value in VAt on base premium amount field
And user_615 click save button
#Then user_615 verify the invalid data entry popup
And user_615 click quotation reference no field
And user_615 enter the character values in quotation reference field 
And user_615 click save button
#Then user_615 validate the invalid data entry popup
And user_615 click quotation reference no field
And user_615 enter the special character value in quotation reference field
And user_615 click save button
#Then user_615 validate the popup for invalid data

#QIA_03_01,QIA_03_02,QIA_03_03,QIA_03_04,QIA_03_05,QIA_03_06,QIA_03_07,QIA_03_08,QIA_03_09,QIA_03_10
@AT_QIA_004
Scenario: To verify user is able to modify Quotation Info record in the system 
Given navigate the IJARA URL
And login with valid credentials
And user_615 update test data set id for AT_QIA_004
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And user_615 click entitle button
Then user_615 click quotation info tab
And user_615 click edit icon 
Then user_615 verify the save button under quotation info tab
And user_615 verify the back button under quotation info tab
And user_615 click edit icon 
And user_615 click quotation reference no field
And user_615 enter the value in quotation reference no field
And user_615 click save button
And user_615 click edit icon 
And user_615 click save button
And user_615 click base premium amount field
And user_615 click save button 
And user_615 click edit icon
And user_615 click VAt on base premium amount field
And user_615 enter the negative value in VAt on base premium amount field
And user_615 click save button
#And user_615 verify the ok button
Then user_615 validate the success message popup with close button
And user_615 click edit icon
And user_615 click to enable the status button
Then user_615 verify the status active 
And user_615 click to disable the status button
Then user_615 verify the status in-active
And user_615 verify the status is in-active when activate the button
Then user_615 verify the status is active when deactivate the button
Then user_615 click back button 

#QIA_04_01,QIA_04_02,QIA_04_03,QIA_04_04,QIA_04_05,QIA_04_06,QIA_04_07
@AT_QIA_005
Scenario: To verify the Quotation Info  List view of records
Given navigate the IJARA URL
And login with valid credentials
And user_615 update test data set id for AT_QIA_005
And user_615 select the module name
And user_615 click the LOS module name
And user_615 click inbox button 
And user_615 click search icon
And user_615 click entitle button
Then user_615 click quotation info tab
And user_615 click edit icon 









