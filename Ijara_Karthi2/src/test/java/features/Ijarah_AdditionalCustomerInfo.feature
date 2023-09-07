Feature: To verify the Funcnality of AdditionalCustomerInfo

 @AT_IDA_01
  Scenario: Creation of Identification Details record with valid data
Given navigate the IJARA URL
And user update test data set id for AT_IDA_01
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton for AdditionalCustomerInfo
And user click the ExpenseType on Action
And user click the Additional customer Info tab
And user click the FirstAddButton in additional customer info tab
And user click the SecondAddButton in additional customer info tab
And user verify the BackButton in additional customer info tab
And user verify the SaveButton in additional customer info tab
And user click and enter the value IdType in additional customer info tab
And user click and enter the value IdNumber in additional customer info tab
And user click the IssueDateCalender in additional customer info tab
And user click the IssueDateToday in additional customer info tab
And user click the ExpiryDateCalender in additional customer info tab
And user click the ExpireDateToday in additional customer info tab
And user click and enter the value IssueingAuthority in additional customer info tab
And user click and enter the value CountryOfIssue in additional customer info tab
And user verify IdTypeMandatory in additional customer info tab
And user verify IdNumberMandatory in additional customer info tab
And user verify IssueingAuthorityMandatory in additional customer info tab
And user verify CountryOfIssueMandatory in additional customer info tab
And user click the SaveButton in additional customer info tab




  @AT_IDA_02
  Scenario: Creation of Identification Details record with valid data
Given navigate the IJARA URL
And user update test data set id for AT_LEA_001
And login with valid credentials
#And user click the module in select field
#And user click the LOS in select field
And user click the messagebox under LOS field
And user click the search button under messagebox
And user Enter the clientname under searchButton for AdditionalCustomerInfo
And user click the ExpenseType on Action
And user click the Additional customer Info tab
And user click the FirstAddButton in additional customer info tab
And user click the EditButton in additional customer info tab
And user verify the IdType in additional customer info tab
And user verify the IdNumber in additional customer info tab
And user verify the IssueDateCalender in additional customer info tab
And user verify the ExpiryDateCalender in additional customer info tab
And user verify the IssueingAuthority in additional customer info tab
And user verify the CountryOfIssue in additional customer info tab


