Feature: Searching of customer with valid data
Scenario: to test the functionality of customer search with valid data
Given navigate the IJARA URL
And login with valid credentials
Then user click the menu icon in after loginscreen
And user navigate to the Transactions flag
Then user navigate to the Application manager flag
Then user click the Application details flag
And user click the add icon to add the customer details
Then Check the Search field is available or not
And Check the Clear field is available or not
Then Check the customer type field is available or not
And Check the Cif id field is available or not
Then Check the id type field is available or not
And Check the id number field is available or not
Then Select the customer type as individual
And Check the application numbers field is available or not
Then Check the Customer name field is available or not
And Check the Mobile number field is available or not
Then Check the Date of birth field is available or not
And Check the Email ID field is available or not
Then Enter the mandetory fields
And Check the Create new request fiels is available or not
Then Check the clear field final is available or not
And Check Customer field type is mandatory or not
And Check Customer field type is List of View
Then Check CIF ID field is editable
#Then logout from the ijaraApplication