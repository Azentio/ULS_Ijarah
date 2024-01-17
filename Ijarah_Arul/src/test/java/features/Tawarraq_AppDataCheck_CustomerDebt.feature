Feature: Verify the functionality of Customer Debt Module in Tawarraq URL
@AT_TW_ADC_CD_001
Scenario: To verify the Customer Debt record is available in the system 
#002 003 included
Given navigate the IJARA URL
Given navigate the IJARA URL
And login with valid credentials for Tawarraq_App data check_Customer Debt
And User get the test data for test case AT_TW_ADC_CD_001
And User click the module name dropdown in ULS application
And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox for Tawarraq_App data check_Customer Debt
And User click the Entitle button under inbox
And User Navigate to Customer financials section
And user_626 click On the Action button below Customer Financials
And user_626 click On the Action button below Financial Commitments
And Validate Finance type field is displayed in Commodity maker_Customer Debt details section
And Validate Finance Institution field is displayed in Commodity maker_Customer Debt details section
And Validate Account number field is displayed in Commodity maker_Customer Debt details section
And Validate Sanction date field is displayed in Commodity maker_Customer Debt details section
And Validate Sanction amount field is displayed in Commodity maker_Customer Debt details section
And Validate Interest rate field is displayed in Commodity maker_Customer Debt details section
And Validate Current principle balance field is displayed in Commodity maker_Customer Debt details section
And Validate Tenure month field is displayed in Commodity maker_Customer Debt details section
And Validate Maturity date field is displayed in Commodity maker_Customer Debt details section
And Validate Installment amount field is displayed in Commodity maker_Customer Debt details section
And Validate Amount considered field is displayed in Commodity maker_Customer Debt details section
#And Validate Include in Eligibility calculation  field is displayed in Commodity maker_Customer Debt details section
And Validate Amount considered field is displayed in Commodity maker_Customer Debt details section
And Validate Currency field is displayed in Commodity maker_Customer Debt details section
And Validate Remarks field is displayed in Commodity maker_Customer Debt details section
And Validate Next due date field is displayed in Commodity maker_Customer Debt details section
And Validate Collateral type field is displayed in Commodity maker_Customer Debt details section
And Validate Closed date field is displayed in Commodity maker_Customer Debt details section
And Validate Frequency field is displayed in Commodity maker_Customer Debt details section
And Validate Last payment amount field is displayed in Commodity maker_Customer Debt details section
And Validate Last payment date field is displayed in Commodity maker_Customer Debt details section
And Validate Product name field is displayed in Commodity maker_Customer Debt details section
And Validate Last 24 cycle field is displayed in Commodity maker_Customer Debt details section
And Validate Facility status field is displayed in Commodity maker_Customer Debt details section
And Validate Remaining tenure field is displayed in Commodity maker_Customer Debt details section
And Validate Disbursement date field is displayed in Commodity maker_Customer Debt details section
And Validate Request for balance takeover field is displayed in Commodity maker_Customer Debt details section
And Validate NPA Classification field is displayed in Commodity maker_Customer Debt details section
