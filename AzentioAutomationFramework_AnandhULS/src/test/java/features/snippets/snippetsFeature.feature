Feature: Create snippets
Scenario: To create feature codes
And user_076 click on export button in facility info screen at app data entry stage
And user_076 choose pdf option in facility info at app data entry
Then user_076 verify facility info list view record should downloaded in pdf format
And user_076 click on export button in facility info screen at app data entry stage
And user_076 choose xlsx option in facility info at app data entry
Then user_076 verify facility info list view record should downloaded in xlsx format