Feature: To verify user is able to view Application Details tab at Contract signing

@AT_ADO_01
Scenario: To verify the availability of Application Details tab  under Contract signing stage
Given navigate the IJARA URL
And login with valid credentials2
And User get the test data for test case AT_ADC_01
And User click the module name dropdown in ULS application for Application Details at Contract Signing Stage
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application for Application Details at Contract Signing Stage
And User click the Mail box in ULS application for Application Details at Contract Signing Stage
And User click the Search button under inbox for Application Details at Contract Signing Stage
And User search the Ref id under inbox for Application Details at Contract Signing Stage
And User click the Entitle button under inbox for Application Details at Contract Signing Stage
And User verify the buttons present on the Application Details page


@AT_ADO_02
Scenario: To verify already added details at App data entry stage is visible at Contract signing stage
Given navigate the IJARA URL
And login with valid credentials2
And User get the test data for test case AT_ADC_02
And User click the module name dropdown in ULS application for Application Details at Contract Signing Stage
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application for Application Details at Contract Signing Stage
And User click the Mail box in ULS application for Application Details at Contract Signing Stage
And User click the Search button under inbox for Application Details at Contract Signing Stage
And User search the Ref id under inbox for Application Details at Contract Signing Stage
And User click the Entitle button under inbox for Application Details at Contract Signing Stage
And User Verify the App Data Entry Stage details with Contract Signing Stage

