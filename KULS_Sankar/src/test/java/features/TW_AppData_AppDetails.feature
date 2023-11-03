Feature: To check the Tawarruq --> App Data Entry stage --> Application Details screen

@AT_TW_AD_06
Scenario: System should display the below mention fields on List view of Application Detail

Given navigate the IJARA URL
And login with valid credentials-Tawarruq App Data Entry
And User_608 get the test data for test case AT_TW_AD_06
And User_608 click the Mail box in ULS application
And User_608 click the Search button under inbox
And User_608 search the Reference id under inbox in ULS Application
And User_608 click the Entitle button under inbox
And User_608 click the Update button under Application Details screen
And User_608 verify Action field available in list view under Application Details screen
And User_608 verify Client Name field available in list view under Application Details screen
And User_608 verify Client Name(Alternate Lanuguage) field available in list view under Application Details screen
And User_608 verify Product field available in list view under Application Details screen
And User_608 verify Sub Product field available in list view under Application Details screen
And User_608 verify Current Stage field available in list view under Application Details screen
And User_608 verify Location field available in list view under Application Details screen
And User_608 verify Allocated To field available in list view under Application Details screen
And User_608 verify Service field available in list view under Application Details screen
And User_608 verify Status field available in list view under Application Details screen
And User_608 click the Search button under Application Details screen
And User_608 search mismatch value system should not display any records under Application Details screen
And User_608 verify the system is should not displayed any records under Application Details screen
And User_608 search matching value system should display all the possible matching records under Application Details screen
And User_608 verify the all the possible matching records are displayed under Application Details screen
And User_608 click the Export button under Application Details screen
And User_608 click the PDF and verify under Application Details screen
And User_608 click the Export button under Application Details screen
And User_608 click the XLS and verify under Application Details screen
And User_608 click the Add button under Application Details screen
And User_608 verfiy the new record creation page under Application Details screen
Then logout from the ijaraApplication









