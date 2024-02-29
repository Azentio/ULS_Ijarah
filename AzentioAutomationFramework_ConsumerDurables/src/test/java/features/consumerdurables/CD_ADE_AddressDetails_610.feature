Feature: Consumer Durable AppData Entry Address Details

  @DS_AT_CON_DUR_ADE_AD_01
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_AD_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under Address Details section in Additional Customer Info tab
    And User_610 verify Back button available in Address Details screen under Additional Customer info tab
    And User_610 verify Address Type field available in Address Details screen under Additional Customer info tab
    And User_610 modify the Address Type in Address Details Screen Under Additional Customer info tab
    And User_610 proper validation message for blank field which is mandatory
    And User_610 to do a modification with invalid data in Zip Code Field
    And User_610 select dropdown value in address type
    And User_610 validate the save button and confirmation message
    Then logout from the ULS Application

  @DS_AT_CON_DUR_ADE_AD_02
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_AD_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under Address Details section in Additional Customer Info tab
    And User_610 change the status of the record as active or deactive
    And User_610 label should toggle based on the status if status is active
    And User_610 change the status active under Address Details section in Additional Customer Info tab
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Edit button under Address Details section in Additional Customer Info tab
    And User_610 label should toggle based on the status if status is deactive
    And User_610 change the status INactive under Address Details section in Additional Customer Info tab
    Then logout from the ULS Application

    
     @DS_AT_CON_DUR_ADE_AD_03
  Scenario: verify the field
    Given navigate the IJARA URL
    And login with valid credentials - Consumer Durable - App Data Entry
    And User_610 get the test data set id for DS_AT_CON_DUR_ADE_AD_01
    And User_610 click the module name dropdown in ULS application
    And User_610 select the module name as LOS in ULS application
    And User_610 click the Mail box in ULS application
    And User_610 click the Search button under inbox
    And User_610 search the Reference ID for Consumer Durable
    And User_610 click the Entitle button under inbox
    And User_610 click Addition Customer Info Under New Application RD
    And User_610 click the Eye button under Customer Personal Info section in Additional Customer Info tab
    And User_610 click the Export button under Address Details section in Additional Customer Info tab
    And User_610 verify PDF button available in listview under Address Details section
    And User_610 verify Excel button available in listview under Address Details section
    And User_610 verify Address Type field available in listview under Address Details section
    And User_610 verify Country field available in listview under Address Details section
    And User_610 verify Occupancy Status field available in listview under Address Details section
    And User_610 verify Occupance Since field available in listview under Address Details section
    And User_610 verify Contact Address field available in listview under Address Details section
    And User_610 verify Status field available in listview under Address Details section
    And User_610 verify values in List view should be non editable under Address Details section
    And User_610 click the Search button under Address Details section in Additional Customer Info tab
    And User_610 to verify the functionality of Search box with matching data under Address Details section
    And User_610 to verify post entering any matching value system display all the possible matching records in Address Details section
    And User_610 to verify the functionality of Search box with mismatch data under Address Details section
    And User_610 to verify post entering any mismatch value system should not display any records in Address Details section