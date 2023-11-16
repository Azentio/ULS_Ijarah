Feature: To create a step definition for the features

Scenario: Feature file steps.

And User_608 click the Search button under Customer Employment section in Customer Financials tab
And User_608 verify the functionality of Search box with matching data under Customer Employment section
And User_608 verify system should display all the possible matching records under Customer Employment section

And User_608 verify the functionality of Search box with mismatch data under Customer Employment section
And User_608 verify system should not display any records or system should display the message as No data found under Customer Employment section