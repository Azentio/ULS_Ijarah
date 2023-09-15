Feature: Income Details List

  @AT_INC_01
  Scenario: Income Summary Details
  Given navigate the IJARA URL
  And login with valid credentials
  And User_607 Update testdata from AT_INC_01
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Search in the search box
  And User_607 Select record after search
  And User_607 Click Customer Finacials in the record
  And User_607 Click edit button customer personal information
  And User_607 Click Add button in income
  And User_607 Check Employment Type Field
  And User_607 Check saveButton
  And User_607 Check Lumpsum Amount field
  And User_607 Check Financial Year
  And User_607 Check Filing Date
  And User_607 Check Income field
  And User_607 Check Frequency field
  And User_607 Check Amount field
  And User_607 Check Defined field
  And User_607 Check Adjusted field
  And User_607 Check Amount Considered field
  
  
  @AT_INC_02
  Scenario: Income Summary Details
  Given navigate the IJARA URL
  And login with valid credentials
  And User_607 Update testdata from AT_INC_01
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Search in the search box
  And User_607 Select record after search
  And User_607 Click Customer Finacials in the record
  And User_607 Click edit button customer personal information
  And User_607 Click Add button in income
  And User_607 Check Employment Type Field
  And User_607 Check saveButton
  And User_607 Check Action field
  And User_607 Check Total Income field
  And User_607 Check Total Income Considered field
  And User_607 Check Salary Credited To Bank field
  And User_607 Check Deduction field
  And User_607 Check Frequency field
  And User_607 Check Deduction Amt field
  And User_607 Check Deduction Def field
  And User_607 Check Deduction Adj field
  And User_607 Check Deduction Considered field
  And User_607 Check Total Deduction field
  And User_607 Check Total Deduction Considered field
  And User_607 Check Currency field
  
  
   @AT_INC_03
  Scenario: Income Summary Details
  Given navigate the IJARA URL
  And login with valid credentials
  And User_607 Update testdata from AT_INC_01
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Search in the search box
  And User_607 Select record after search
  And User_607 Click Customer Finacials in the record
  And User_607 Click edit button customer personal information
  And User_607 Click Add button in income
  And User_607 Select days in Frequency
  And User_607 Enter Amount in Amount field
  And User_607 Click save button
  And User_607 Check record save successfully
  And User_607 Click back button 
  And User_607 Check go to previous page
  And User_607 check value auto populated
  
  @AT_INC_04
  Scenario: Income Summary Details
  Given navigate the IJARA URL
  And login with valid credentials
  And User_607 Update testdata from AT_INC_01
  And User_607 Click inbox in the home page
  And User_607 Click Search in inbox
  And User_607 Search in the search box
  And User_607 Select record after search
  And User_607 Click Customer Finacials in the record
  And User_607 Click edit button customer personal information
  And User_607 Click Add button in income
  And User_607 Click back button 
  And User_607 Check clicking on back button system should navigate to the previous screen
  
  