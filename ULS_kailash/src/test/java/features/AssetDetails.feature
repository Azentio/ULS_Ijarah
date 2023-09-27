Feature: To Test All Datas in Asset Details In App Data Check Stage 
@AT_ASD_ADC_01
Scenario: To verify Asset Details at App data entry stage is visible at data check stage
Given navigate the IJARA URL
And login with valid credentials
#And click on module dropdown in IJRARAH
#And click on LOS option in module dropdown
And get the test data for test case ID AT_ASD_ADC_001
And click on mail box
And click on search box upon click on the mail box
And search the record reference number in search text box
And Select record after search
And click on Asset Details tab
And click on the Action View button Below the Asset Details
Then verify Asset Details Section should visible in Asset details screen
Then verify Dealer Deatils Section should visible in Asset details screen
Then verify  Registration Details Section should visible in Asset details screen
Then verify Asset Price and Down Payment Details should visible in Asset details screen
#AssetDetailsVerification
Then verify Asset Manufacture Field should visible in Asset details screen
Then verify Asset Model Field should visible in Asset details screen
Then verify Asset Model Type Field should visible in Asset details screen
Then verify Year of Manufacture Field should visible in Asset details screen
Then verify Asset Condition Field should visible in Asset details screen
Then verify Asset Color Field should visible in Asset details screen
Then verify Driver Train Field should visible in Asset details screen
Then verify No Of Cylinder Field should visible in Asset details screen
Then verify Volume Of Engine Field should visible in Asset details screen
Then verify No of Units Field should visible in Asset details screen
Then verify Chasis Number Field should visible in Asset details screen
Then verify Plate NumberField should visible in Asset details screen
Then verify Plate Number Arabic Field should visible in Asset details screen
Then verify Asset Dealer Field should visible in Asset details screen
Then verify Deposit Account No Field should visible in Asset details screen
Then verify Dealer Email Id Field should visible in Asset details screen
Then verify Dealer Contact Number Field should visible in Asset details screen
Then verify Dealer Location Field should visible in Asset details screen
Then verify Sales Person Name Field should visible in Asset details screen
Then verify Agent Name Field should visible in Asset details screen
Then verify Agent Email IdField should visible in Asset details screen
Then verify Agent Mobile Number Field should visible in Asset details screen
Then verify Asset Price Field should visible in Asset details screen
Then verify Down Payment Field should visible in Asset details screen
Then verify Down Payment Percentage Field should visible in Asset details screen
Then verify Green Issue Date Field should visible in Asset details screen
Then verify Residual Value Field should visible in Asset details screen
Then verify Green Card No Field should visible in Asset details screen
Then verify Weight in Tons Field should visible in Asset details screen
Then verify Asset FulFill Field should visible in Asset details screen
Then verify Location of Sign in Field should visible in Asset details screen
Then verify Received Location Field should visible in Asset details screen
Then verify Remarks Field should visible in Asset details screen
Then verify Status Field should visible in Asset details screen
#verify the saved data
And verify Asset Manufacture Data should visible As Data Entry stage screen
And verify Asset model Data should visible As Data Entry stage screen
And verify Asset type Data should visible As Data Entry stage screen
And verify Asset Condition Data should visible As Data Entry stage screen
And verify Asset Color Data should visible As Data Entry stage screen
And verify Chasis number Data should visible As Data Entry stage screen
And verify Plate Number Data should visible As Data Entry stage screen
And verify Asset dealer Data should visible As Data Entry stage screen
And verify Asset Price Data should visible As Data Entry stage screen
And verify Asset Fulfil Data should visible As Data Entry stage screen
And verify Location of signin Data should visible As Data Entry stage screen
And verify Asset Received Data should visible As Data Entry stage screen
And verify remarks Data should visible As Data Entry stage screen
#displayOnly
Then User_626 verify Asset Manufacture Field should visible in Display Only
Then User_626 verify Asset Model Field should visible in Display Only
Then User_626 verify Asset Model Type Field should visible in Display Only
Then User_626 verify Year of Manufacture Field should visible in Display Only
Then User_626 verify Asset Condition Field should visible in Display Only
Then User_626 verify Asset Color Field should visible in Display Only
Then User_626 verify Driver Train Field should visible in Display Only
Then User_626 verify No Of Cylinder Field should visible in Display Only
Then User_626 verify Volume Of Engine Field should visible in Display Only
Then User_626 verify No of Units Field should visible in Display Only
Then User_626 verify Chasis Number Field should visible in Display Only
Then User_626 verify Plate NumberField should visible in Display Only
Then User_626 verify Plate Number Arabic Field should visible in Display Only
Then User_626 verify Asset Dealer Field should visible in Display Only
Then User_626 verify Deposit Account No Field should visible in Display Only
Then User_626 verify Dealer Email Id Field should visible in Display Only
Then User_626 verify Dealer Contact Number Field should visible in Display Only
Then User_626 verify Dealer Location Field should visible in Display Only
Then User_626 verify Sales Person Name Field should visible in Display Only
Then User_626 verify Agent Name Field should visible in Display Only
Then User_626 verify Agent Email IdField should visible in Display Only
Then User_626 verify Agent Mobile Number Field should visible in Display Only
Then User_626 verify Asset Price Field should visible in Display Only
Then User_626 verify Down Payment Field should visible in Display Only
Then User_626 verify Down Payment Percentage Field should visible in Display Only
Then User_626 verify Green Issue Date Field should visible in Display Only
Then User_626 verify Residual Value Field should visible in Display Only
Then User_626 verify Green Card No Field should visible in Display Only
Then User_626 verify Weight in Tons Field should visible in Display Only
Then User_626 verify Asset FulFill Field should visible in Display Only
Then User_626 verify Location of Sign in Field should visible in Display Only
Then User_626 verify Received Location Field should visible in Display Only
Then User_626 verify Remarks Field should visible in Display Only
Then User_626 verify Status Field should visible in Display Only
Then User_626 clicking on back button system should navigate to the previous screen From Asset Details
Then User_626 logout from the ijaraApplication