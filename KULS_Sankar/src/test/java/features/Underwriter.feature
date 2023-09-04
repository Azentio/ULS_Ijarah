Feature: To check the underwriter feature

@AT_UNW_001
Scenario: To verify user is able to add under underwriter

Given navigate the IJARA URL1
And login with valid credentials1
And User get the test data for test case AT_UNW_001
And User click the Mail box in ULS application
And User click the Search button under inbox
And User enter the Ref id under inbox searchbox
And User click the Entitle button under inbox

And User verify the Offer Decision tab is displayed in Underwriter
And User verify the Application Details tab is displayed in Underwriter
And User verify the Customer details tab is displayed in Underwriter
And User verify the Additional Customer info tab is displayed in Underwriter
And User verify the Customer Financials tab is displayed in Underwriter
And User verify the Living Expenses tab is displayed in Underwriter
And User verify the Facility Info tab is displayed in Underwriter
And User verify the Asset Details tab is displayed in Underwriter
And User verify the Quotation Info tab is displayed in Underwriter
And User verify the Insurance Info tab is displayed in Underwriter
And User verify the Policy Check tab is displayed in Underwriter
And User verify the Document Details tab is displayed in Underwriter







Then logout from the ijaraApplication