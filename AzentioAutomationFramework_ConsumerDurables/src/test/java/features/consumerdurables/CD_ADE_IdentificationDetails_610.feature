Feature: Consumer Durable AppData Entry Identification Details

  @AT_CON_DUR_ADE_ID_01
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Add button under Identification Details section in Additional Customer Info tab
    And User_610 verify the Id Type field in identification details Screen
    And User_610 Select drop down value in Id Type in identification details Screen
    And User_610 verify the Id Number field in identification details Screen
    And User_610 Enter the value in Id Number field under identification details Screen
    And User_610 verify the field in Issue Date under identification details Screen
    And User_610 verify the field in Expiry Date under identification details Screen
    And User_610 verify the field in Issuing Authority under identification details Screen
    And User_610 Select drop down value in Issuing Authority in under identification details Screen
    And User_610 verify the field in Country Of Issue under identification details Screen
    And User_610 Select drop down value in Country Of Issue in identification details Screen
    And User_610 verify the field in primary Id Flag under identification details Screen
    And User_610 validate the save button and confirmation message
    Then logout from the ULS Application

  @AT_CON_DUR_ADE_ID_02
  Scenario: verify the field mandatory type editable
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Add button under Identification Details section in Additional Customer Info tab
    And User_610 verify ID Type field should be mandatory display and text box
    And User_610 verify ID Type number should be mandatory display and numberic
    And User_610 verify Issue Date field should be non mandatory display and calender
    And User_610 verify Expiry Date field should be non mandatory display and text box
    And User_610 verify Issuing Authority number should be mandatory display and numberic
    And User_610 verify Country of Issue field should be mandatory display and calender
    Then logout from the ULS Application

  @AT_CON_DUR_ADE_ID_03
  Scenario: verify the field mandatory type editable
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Add button under Identification Details section in Additional Customer Info tab
    And User_610 proper validation message for blank field which is mandatory ID
    And User_610 To verify the impact when user enters only special characters in Id Number
    Then logout from the ULS Application

  @AT_CON_DUR_ADE_ID_04
  Scenario: validation message for blank field
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under identification Details section in Additional Customer Info tab
    And User_610 verify save button
    And User_610 verify back button
    And User_610 Select drop down value in Id Type in identification details Screen
    And User_610 UnSelect drop down value in Id Type in identification details Screen
    And User_610 proper validation message for blank field which is mandatory
    And User_610 Select drop down value in Id Type in identification details Screen
    And User_610 validate the save button and confirmation message
    Then logout from the ULS Application

  @AT_CON_DUR_ADE_ID_05
  Scenario: validation active and deactive button
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under identification Details section in Additional Customer Info tab
    And User_610 change the status of the record as active or deactive
    And User_610 label should toggle based on the status if status is active
    And User_610 validate the status active under Address Details section in Additional Customer Info tab
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under identification Details section in Additional Customer Info tab
    And User_610 label should toggle based on the status if status is deactive
    And User_610 validate the status Inactive under Address Details section in Additional Customer Info tab
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 To verify the functionality of Back button in Identification details Screen
    Then logout from the ULS Application

  @AT_CON_DUR_ADE_ID_06
  Scenario: verify the list view
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable in Identification Details
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 Scroll the Edit button under identification Details section in Additional Customer Info tab
    And User_610 To Verify Id Type fields on List view of Identification details
    And User_610 To Verify Id Number fields on List view of Identification details
    And User_610 To Verify Date of Issue fields on List view of Identification details
    And User_610 To Verify Place of Issue fields on List view of Identification details
    And User_610 To Verify Date of Expiry fields on List view of Identification details
    And User_610 To Verify Primary Id Flag fields on List view of Identification details
    And User_610 To Verify Status fields on List view of Identification details
    And User_610 To Verify fields List view should be non editable.
		And User_610 click the Search button under Address Details section in Customer Identification Info tab
    And User_610 to verify the functionality of Search box with matching data under Customer Identification section
    And User_610 to verify post entering any matching value system display all the possible matching records in Customer Identification section
    And User_610 to verify the functionality of Search box with mismatch data under Customer Identification section
    And User_610 to verify post entering any mismatch value system should not display any records in Customer Identification section